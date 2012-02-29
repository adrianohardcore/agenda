/*!
 * jQuery Gridy - A Grid Plugin - http://wbotelhos.com/gridy
 * -----------------------------------------------------------------------------------
 *
 * jQuery Gridy is a plugin that generates a highly customizable grid using templates.
 *
 * Licensed under The MIT License
 *
 * @version        0.3.0
 * @since          2011.06.03
 * @author         Washington Botelho
 * @documentation  wbotelhos.com/gridy
 * @twitter        twitter.com/wbotelhos
 *
 * Usage with default values:
 * -----------------------------------------------------------------------------------
 * $('#grid').gridy({ url: '/gridy' });
 *
 * <div id="grid"></div>
 *
 * <script id="template" type="text/x-jquery-tmpl">
 *    <div>
 *       <div>${name}</div>
 *       <div>${email}</div>
 *    </div>
 * </script>
 *
 */

;(function($) {

	var methods = {
			init: function(settings) {

			}, getSize: function(size) {
				return (isNaN(parseInt(size, 10))) ? size : size + 'px';
			}, getNumber: function(number) {
				return (number < 10) ? '0' + number : number;
			}, getError: function(xhr) {
				return (xhr.responseText) ? xhr.responseText.substring(xhr.responseText.indexOf('(') + 1, xhr.responseText.indexOf(')')) : xhr.statusText;
			}, getNumber: function(number) {
				return (number < 10) ? '0' + number : number;
			}
	};

	$.fn.gridy = function(settings) {

		if (this.length == 0) {
			$.error('Selector invalid or missing!');
		} else if (this.length > 1) {
			return this.each(function() {
				$.fn.gridy.apply($(this), [settings]);
			});
		}

		var opt					= $.extend({}, $.fn.gridy.defaults, settings),
		id					= this.attr('id'),
		$this				= $(this).data('options', opt).empty().width(methods.getSize(opt.width)).wrap('<div id="' + id + '-wrapper">'),
		$wrapper			= $this.parent().width(methods.getSize(opt.width)),
		$currentPage		= $('<input type="hidden" name="page" value="' + opt.page + '"/>').insertBefore($this),
		$currentSortName	= $('<input type="hidden" name="sortName" value="' + opt.sortName + '"/>').insertBefore($this),
		$currentSortOrder	= $('<input type="hidden" name="sortOrder" value="' + opt.sortOrder + '"/>').insertBefore($this);

		if (id === undefined || id == '') {
			id = 'gridy-' + $('.' + $this.attr('class')).index(this);
			$this.attr('id', id); 
		}

		var isTable = opt.style == 'table';

		if (isTable) {
			$this.attr('cellspacing', 0).parent().addClass(opt.skin + '-table');
		} else {
			$this.parent().addClass(opt.skin);
		}

		var $search			= null,
		$searchField	= null,
		$searchButton	= null;

		if (opt.searchOption) {
			$search = $('<div class="gridy-search"><div class="gridy-search-content"></div></div>').insertBefore($this);

			if (opt.resize) {
				$search.width(methods.getSize(opt.width));
			}

			$searchField = $('<input type="text" name="search" value="' + ((opt.search == '') ? opt.searchText : opt.search) + '" title="' + opt.searchText + '" size="40" />').appendTo($search.children());

			$searchField.blur(function() {
				if ($searchField.val() == '') {
					$searchField.removeClass('gridy-typed').val(opt.searchText);
				}
			}).focus(function() {
				if ($searchField.val() == opt.searchText) {
					$searchField.addClass('gridy-typed').val('');
				}
			}).keypress(function(evt) {
				if ((evt.keyCode ? evt.keyCode : evt.which) == 13) {
					listGridy(1, $currentSortName.val(), $currentSortOrder.val(), $this);
				}
			});

			$searchButton = $('<input type="button" value="' + opt.searchButtonLabel + '" title="' + opt.searchButtonTitle + '"/>').appendTo($search.children());

			$searchButton.click(function() {
				listGridy(1, $currentSortName.val(), $currentSortOrder.val(), $this);
			});
		}

		var hasHeader = opt.headersName.length > 0;

		function changeSortIndicator(clickedLink, sortOrder, sortIcon, isResetIcon) {
			var $sortWrapper	= clickedLink.parent().parent(),
			isHeader		= hasHeader && $sortWrapper.attr('class') == 'gridy-header';

			if (isResetIcon) {
				var $sortedLink = $sortWrapper.find('a.gridy-sorted').attr('rel', 'desc').removeClass('gridy-sorted');

				$sortedLink = (isHeader) ? $sortedLink.next('div') : $sortedLink.prev('div');

				$sortedLink.removeClass().addClass(opt.arrowNone);
			}

			clickedLink.attr('rel', sortOrder).addClass('gridy-sorted');

			var $sortIcon = (isHeader) ? clickedLink.next('div') : clickedLink.prev('div');

			$sortIcon.removeClass().addClass(sortIcon);
		};

		var $sortBar		= null,
		$sorterItems	= null;

		if (opt.sortersName.length > 0) {
			var sorterContent	= '',
			sorterItem		= '',
			sorterLabel		= '';

			for (var i = 0; i < opt.sortersName.length; i++) {
				sorterItem = opt.sortersName[i][0];
				sorterLabel = opt.sortersName[i][1];

				sorterContent +=
					'<div class="gridy-sorter-item">' +
					'<div class="' + opt.arrowNone + '"></div>' +
					'<a id="sort-by-' + sorterItem + '" href="javascript:void(0);" name="' + sorterItem + '" rel="desc">' + sorterLabel + '</a>' +
					'</div>';
			}

			$sortBar = $('<div class="gridy-sorter-bar"/>').width(methods.getSize(opt.sorterWidth)).html(sorterContent).appendTo($this);

			$sorterItems = $sortBar.children().children('a').click(sortGridyFunction);

			var $sortInit = $sorterItems.find('a#sort-by-' + opt.sortName);

			if ($sortInit.length) {
				var sortIcon	= (opt.sortOrder == 'asc') ? opt.arrowUp : opt.arrowDown,
						isResetIcon	= false;

				changeSortIndicator($sortInit, opt.sortOrder, sortIcon, isResetIcon);
			}
		}

		function sortGridyFunction() {
			sortGridy($(this), $this);
		};

		function sortGridy(clickedLink, context) {
			var sortName		= clickedLink.attr('name'),
			sortOrder		= clickedLink.attr('rel'),
			nextSortOrder	= (sortOrder == 'desc') ? 'asc' : 'desc',
					sortIcon		= (sortOrder == 'desc') ? opt.arrowUp : opt.arrowDown,
							isResetIcon		= clickedLink.parent().parent().find('a.gridy-sorted').length > 0;

							changeSortIndicator(clickedLink, nextSortOrder, sortIcon, isResetIcon);

							listGridy($currentPage.val(), sortName, nextSortOrder, context);
		};

		var $status = null;

		if (opt.loadingOption || opt.resultOption) {
			$status = $('<div class="gridy-status"/>').insertBefore($this);

			if (opt.resize) {
				$status.width(methods.getSize(opt.width));
			}
		}

		var $loading = null;

		if (opt.loadingOption) {
			$loading = $('<div class="' + opt.loadingIcon + '"><div>' + opt.loadingText + '</div></div>').appendTo($status).children();
		}

		var $result = null;

		if (opt.resultOption) {
			$result = $('<div class="gridy-result"/>').appendTo($status);
		}

		var $header			= null,
		$headerItems	= null;

		if (hasHeader) {
			var $head		= null,
			$sortLink	= null,
			headName	= '',
			headLabel	= '';

			if (isTable) {
				$header = $('<thead class="gridy-header"/>').appendTo($this);
			} else {
				$header = $('<div class="gridy-header"/>').appendTo($this);

				if (opt.resize) {
					$header.width(methods.getSize(opt.width));
				}
			}

			if (opt.headersWidth.length <= 0) {
				if (opt.colsWidth.length > 0) {
					opt.headersWidth = opt.colsWidth;
				} else {
					$.error(id + ': headersWith and colsWidth options are invalid or missing!');
				}
			}

			for (var i = 0; i < opt.headersName.length; i++) {
				headName = opt.headersName[i][0];
				headLabel = opt.headersName[i][1];

				$sortLink = $('<a/>', { href: 'javascript:void(0);', html: headLabel });

				if (isTable) {
					$head = $('<th class="gridy-head-item"/>');
				} else {
					$head = $('<div class="gridy-head-item"/>');
				}

				if (headName) {
					$sortLink.attr({ id: 'sort-by-' + headName, name: headName });

					var $sortIcon = $('<div/>', { 'class': opt.arrowNone });

					$head.append($sortLink, $sortIcon);
				} else {
					$sortLink.attr('class', 'gridy-no-sort');
					$head.append($sortLink);
				}

				if (opt.headersName[i][2]) {
					$head.addClass(opt.headersName[i][2]);
				}

				if (isTable) {
					$head.attr('width', opt.headersWidth[i]);
				} else {
					$head.width(opt.headersWidth[i]);
				}

				$head.appendTo($header);
			}

			$headerItems = $header.children().children('a:not(".gridy-no-sort")').click(sortGridyFunction);

			var $sortInit = $header.find('#sort-by-' + opt.sortName);

			if ($sortInit.length) {
				var sortIcon	= (opt.sortOrder == 'asc') ? opt.arrowUp : opt.arrowDown,
						isResetIcon	= false;

				changeSortIndicator($sortInit, opt.sortOrder, sortIcon, isResetIcon);
			}
		}

		var $content = null;

		if (isTable) {
			$content = $('<tbody class="gridy-content"/>');
		} else {
			$content = $('<div class="gridy-content"/>').css({ 'height': methods.getSize(opt.height), 'width': methods.getSize(opt.width) });
		}

		$content.appendTo($this);

		function startLoading(isStart) {
			if (opt.loadingOption) {
				if (isStart) {
					$loading.fadeIn('fast');
					$content.addClass('gridy-fade');
				} else {
					$loading.fadeOut();
					$content.removeClass('gridy-fade');
				}
			}
		};

		function showNoResult() {
			if (opt.noResultOption) {
				$content.html('<p class="gridy-no-result">' + opt.noResultText + '</p>');

				if (opt.resultOption) {
					$result.html($result.html().replace(/\d+/g, '0'));
				}

				if (opt.searchOption) {
					$searchField.focus().select();
				}
			}
		};

		var $footer = undefined;

		if (opt.rowsNumber.length > 0  || opt.messageOption || (opt.findsName.length > 0 && !opt.searchOption)) {
			$footer = $('<div class="gridy-footer"/>').appendTo($wrapper);

			if (opt.resize) {
				$footer.width(methods.getSize(opt.width));
			}
		}

		var $findBox = undefined;

		if (opt.findsName.length > 0) {
			$findBox = $('<div class="gridy-find-option"><select></select></div>').appendTo((opt.searchOption) ? $search.children() : $footer).children();

			var hasItem		= false,
			options		= '',
			findItem	= '',
			findLabel	= '';

			for (var i = 0; i < opt.findsName.length; i++) {
				findItem = opt.findsName[i][0];
				findLabel = opt.findsName[i][1];

				options += '<option value="' + findItem + '">' + findLabel + '</option>';

				if (findItem == opt.find) {
					hasItem = true;
				}
			}

			if (!hasItem) {
				$findBox.html('<option value="' + opt.find + '" checked="checked">' + opt.find + '</option>');
			}

			$findBox.append(options).val(opt.find).change().change(function(index, value) {
				if (opt.searchOption && opt.searchFocus) {
					$searchField.focus();
				}
			})
			.children('option[value="' + opt.find +  '"]').attr('checked', 'checked');
		}

		var $rowsBox = null;

		if (opt.rowsNumber.length > 0 ) {
			$rowsBox = $('<div class="gridy-row-option"><select></select></div>').appendTo($footer).children();

			var rows		= (opt.rows < 1) ? 1 : opt.rows,
					hasNumber	= false,
					options		= '',
					number		= '';

			for (var i = 0; i < opt.rowsNumber.length; i++) {
				number = opt.rowsNumber[i];

				if (number == rows) {
					hasNumber = true;
				}

				options += '<option value="' + number + '">' + methods.getNumber(number) + '</option>';
			}

			if (!hasNumber) {
				$rowsBox.html('<option value="' + rows + '" checked="checked">' + methods.getNumber(rows) + '</option>');
			}

			$rowsBox.append(options).val(rows).change().change(function(index, value) {
				listGridy(1, $currentSortName.val(), $currentSortOrder.val(), $this);
			})
			.children('option[value="' + rows +  '"]').attr('checked', 'checked');
		}

		if (opt.searchTarget) {
			$search.appendTo(opt.searchTarget);
		}

		if (opt.findTarget) {
			if (opt.findsName.length <= 0) {
				$.error(id + ': you need set the \'findsName\' option for findOption box be created!');
			}

			$findBox.parent().appendTo(opt.findTarget);
		}

		if (opt.rowsTarget) {
			$rowsBox.parent().appendTo(opt.rowsTarget);
		}		

		var $buttons = undefined;

		if (opt.buttonOption) {
			$buttons = $('<div class="gridy-buttons"><div class="gridy-buttons-content"></div></div>').appendTo($wrapper);

			if (opt.resize) {
				$buttons.width(methods.getSize(opt.width));
			}

			$buttons = $buttons.children();
		}

		var $message = undefined;

		if (opt.messageOption) {
			$message = $('<div class="gridy-message"/>').appendTo($footer);
		}

		function showMessage(message) {
			if (opt.messageOption) {
				$message.html(message).show();

				setTimeout(function() {
					$message.fadeOut(function() {
						$message.empty().hide();
					});
				}, opt.messageTimer);
			}
		};

		listGridy(opt.page, opt.sortName, opt.sortOrder, $this);

		function enableGrid(isEnable) {
			if (isEnable) {
				if (opt.searchOption) {
					$searchField.removeAttr('readonly');
					$searchButton.removeAttr('disabled');
				}

				if (opt.sortersName.length > 0) {
					$sorterItems.children('a').click(sortGridyFunction);
					$headerItems.children('a:not(".gridy-no-sort")').click(sortGridyFunction);
				}

				if (opt.buttonOption) { $buttons.children(':not(".gridy-button-reticence")').removeAttr('disabled'); }
				if (opt.findsName.length > 0) { $findBox.removeAttr('disabled'); }
				if (opt.rowsNumber.length > 0 ) { $rowsBox.removeAttr('disabled'); }
			} else {
				if (opt.searchOption) {
					$searchField.attr('readonly', 'readonly');
					$searchButton.attr('disabled', 'disabled');
				}

				if (opt.sortersName.length > 0) {
					$sorterItems.children('a').die('click');
					$headerItems.children('a:not(".gridy-no-sort")').die('click');
				}

				if (opt.buttonOption) { $buttons.children().attr('disabled', 'disabled'); }
				if (opt.findsName.length > 0) { $findBox.attr('disabled', 'disabled'); }
				if (opt.rowsNumber.length > 0 ) { $rowsBox.attr('disabled', 'disabled'); }
			}
		};

		function processCallback(data, page, sortName, sortOrder, selectedRows) {
			if (typeof(data) == 'string') {
				data = $.parseJSON(data);
			}

			if (opt.before) {
				var callback = opt.before.call($this, data, page, sortName, sortOrder);

				if (callback) {
					data = callback;
				}
			}

			var total = eval('data.' + opt.totalPath);

			if (total == 0) {
				showNoResult();
				$buttons.empty();
				$rowsBox.hide();
				enableGrid(true);
				return;
			}

			if (opt.sortersName.length > 0) {
				$sortBar.show();
			}

			var entityList	= eval('data.' + opt.listPath),
			$rows		= null,
			$columns	= null;

			$content.html($('#' + opt.template).tmpl(entityList));

			if (opt.evenOdd) {
				$content
				.children(':even').addClass((opt.scroll) ? 'gridy-even-scroll' : 'gridy-even')
				.end()
				.children(':odd').addClass((opt.scroll) ? 'gridy-odd-scroll' : 'gridy-odd');
			}

			if (opt.colsWidth) {
				$rows = $content.children(); // div|tr

				if (!isTable) {
					$rows.addClass('gridy-row');
				}

				$rows.each(function() {
					$columns = $(this).children();

					if (!isTable) {
						$columns.addClass('gridy-column');
					}

					$columns.each(function(index) { // div|td
						if (isTable) {
							$(this).attr('width', opt.colsWidth[index]);
						} else {
							$(this).width(opt.colsWidth[index]);
						}
					});
				});
			}

			var rest		= total % selectedRows,
			totalPage	= (total - rest) / selectedRows;

			if (rest > 0) {
				totalPage++;
			}

			if (opt.resultOption) {
				var resultText = opt.resultText.replace('{from}', methods.getNumber(page)).replace('{to}', methods.getNumber(totalPage)).replace('{total}', methods.getNumber(total));

				$result.html(resultText);
			}

			if (opt.buttonOption) {
				if (total > selectedRows) {
					var buttonEmpty	= '<input type="button" value="..." disabled="disabled" class="gridy-button-reticence"/>&#160;',
					buttons		= '',
					number		= 0,
					rangePage	= null,
					start		= 1,
					buttonMax	= opt.buttonMax,
					isEven		= (opt.buttonMax % 2 == 0);

					if (opt.buttonMax > totalPage) {
						buttonMax = totalPage;
					} else {
						buttonMax = opt.buttonMax;
					}

					if (isEven) {
						rangePage	= Math.ceil(buttonMax / 2);
						start		= page - rangePage + 1;
					} else {
						rangePage	= Math.floor(buttonMax / 2);
						start		= page - rangePage;
					}

					var end = parseInt(page, 10) + rangePage;

					if (start == 0) {
						end++;
						start = 1;
					}

					if (start < 0) {
						end += Math.abs(start) + 1; // + 1 is the button 0.
						start = 1;
					}

					if (end > totalPage) {
						if (start > 1) {
							if (start === (end - totalPage)) {
								start = 1;
							} else {
								start -= (end - totalPage);
							}
						} 

						end = totalPage;
					}

					var	hasExceeded			= totalPage > buttonMax,
					hasBackNavigation	= hasExceeded && page > ((isEven) ? rangePage : rangePage + 1),
					hasNextNavigation	= hasExceeded && page < (totalPage - rangePage);

					if (hasBackNavigation) {
						buttons = '<input type="button" value="&lsaquo;" alt="' + opt.buttonBackTitle + '" title="' + opt.buttonBackTitle + '" class="gridy-back"/>&#160;';
						buttons += buttonEmpty;
					}

					for (var i = start; i <= end; i++) {
						number = methods.getNumber(i);
						buttons += '<input type="button" value="' + number + '" alt="' + number + '" title="' + opt.buttonTitle + ' ' + number + '"/>&#160;';
					}

					if (hasNextNavigation) {
						buttons += buttonEmpty;
						buttons += '<input type="button" value="&rsaquo;" alt="' + opt.buttonNextTitle + '" title="' + opt.buttonNextTitle + '" class="gridy-button-next"/>&#160;';
					}

					$buttons.html(buttons).children(':not(".gridy-button-reticence")').click(function() {
						listGridy(parseInt(this.alt, 10), $currentSortName.val(), $currentSortOrder.val(), $this);
					});

					if (hasBackNavigation) {
						$buttons.children('.gridy-back').click(function() {
							listGridy(page - 1, $currentSortName.val(), $currentSortOrder.val(), $this);
						});
					}

					if (hasNextNavigation) {
						$buttons.children('.gridy-button-next').click(function() {
							listGridy(page + 1, $currentSortName.val(), $currentSortOrder.val(), $this);
						});
					}
				} else {
					$buttons.empty();
				}

				$('input[value="' + methods.getNumber(page) + '"]').attr('disabled', 'disabled').addClass('gridy-button-active');
			}

			$currentPage.val(page);
			$currentSortName.val(sortName);
			$currentSortOrder.val(sortOrder);
		};

		function listGridy(page, sortName, sortOrder, context) {
			enableGrid(false);
			startLoading(true);

			var search			= opt.search,
			selectedRows	= (opt.rowsNumber.length > 0) ? $rowsBox.show().val() : opt.rows,
					selectedFind	= (opt.findsName.length > 0) ? $findBox.val() : opt.find;

					if (opt.searchOption) {
						search = ($searchField.val() == opt.searchText) ? '' : $searchField.val();

						if (opt.searchFocus) {
							$searchField.focus();
						}
					}

					if (opt.data) {
						processCallback(opt.data, page, sortName, sortOrder);
						return;
					}

					var data = {
							search:		search,
							page:		page,
							sortName: 	sortName,
							sortOrder:  sortOrder,
							find:		selectedFind,
							rows:		selectedRows
					};

					for (var prop in opt.params) {
						data[prop] = opt.params[prop];
					}

					var $paramElement;

					for (var prop in opt.paramsElements) {
						$paramElement = $(opt.paramsElements[prop]);

						data[$paramElement.attr('name')] = $paramElement.val();				
					}

					if (opt.debug) {
						var queryString = '[debug] query string:\n\n',
						propSpace	,
						i			;

						for (var prop in data) {
							propSpace = prop;

							for (i = 0; i < (20 - prop.length); i++) {
								propSpace += ' ';
							}

							queryString += propSpace + ': \'' + data[prop] + '\'\n';
						}

						if (window.console && window.console.log) {
							window.console.log(queryString);
						}
					}

					$.ajax({
						cache			: opt.cache,
						contentType		: opt.contentType,
						dataType		: opt.dataType,
						jsonp			: opt.jsonp,
						jsonpCallback	: opt.jsonpCallback,
						type			: opt.type,
						url				: opt.url,
						data			: data,
						success			: function(data, textStatus, jqXHR) {
							processCallback(data, page, sortName, sortOrder, selectedRows);

							var scrollSufix = (opt.scroll) ? '-scroll' : '';

							if (opt.hoverFx) {
								$content.children().mouseenter(function() {
									$(this).addClass('gridy-row-hovered' + scrollSufix);
								}).mouseleave(function() {
									$(this).removeClass('gridy-row-hovered' + scrollSufix);
								});
							}

							if (opt.clickFx) {
								$content.children().click(function(evt) {
									var $this = $(this);

									if (!evt.shiftKey) {
										$this.parent().children('.gridy-row-selected' + scrollSufix).removeClass('gridy-row-selected' + scrollSufix);
									}

									$this.toggleClass('gridy-row-selected' + scrollSufix);
								});
							}

							if (opt.success) {
								opt.success.call(context, data, textStatus, jqXHR);
							}
						}, error: function(jqXHR, textStatus, errorThrown) {
							showMessage(methods.getError(jqXHR));

							if (opt.error) {
								opt.error.call(context, jqXHR, textStatus, errorThrown);
							}
						}, complete: function(jqXHR, textStatus) {
							startLoading(false);
							enableGrid(true);

							if (opt.scroll) {
								if (opt.height == 'auto') {
									throw id + ': height attribute missing!';
								}

								if (isTable) {
									var $this	= $content.parent(),
									width	= methods.getSize(opt.width + 15);

									$this.wrap('<div id="' + id + '-wrapper" />')
									.parent().addClass('gridy-scroll-wrapper').css({ 'height': methods.getSize(opt.height), 'width': width })
									.end()
									.clone(true).removeAttr('id').width(width) 
									.find('tbody').remove()
									.end()
									.insertBefore($this.parent());

									$this.children('thead').remove();
								} else {
									$content.addClass('gridy-scroll-wrapper').children().addClass('gridy-scroll');
								}
							} else {
								if (opt.separate) {
									var $firstLine = $content.children(':first').not('p');

									if (isTable) {
										$firstLine = $firstLine.children();
									}

									$firstLine.addClass('gridy-separate');
								}
							}

							if (isTable) {
								$content.children(':last').children().addClass('gridy-last-line');
							}

							if (opt.complete) {
								opt.complete.call(context, jqXHR, textStatus);
							}
						}
					});
		};

		return $this;
	};

	$.fn.gridy.reload = function(id, settings) {
		var $context	= $(id),
		options		= $context.data('options');

		if (settings !== undefined) {
			$.each(settings, function(attribute, value) {
				if (options[attribute] === undefined) {
					$.error('\'' + attribute + '\' is an invalid option!');
				} else {
					options[attribute] = value;
				}
			});

			$context.data('options', options);
		}

		return $context.gridy(options);
	};

	$.fn.gridy.defaults = {
			arrowDown			: 'gridy-arrow-down',
			arrowNone			: 'gridy-arrow-none',
			arrowUp				: 'gridy-arrow-up',
			before					: undefined,
			buttonBackTitle			: '&lsaquo; Back',
			buttonMax				: 10,
			buttonNextTitle			: 'Next &rsaquo;',
			buttonOption			: true,
			buttonsWidth			: 'auto',
			buttonTitle			: 'p�gina',
			cache				: undefined,
			clickFx				: false,
			colsWidth			: ['auto'],
			complete			: undefined,
			contentType			: undefined,
			dataType			: 'json',
			debug				: false,
			error				: undefined,
			evenOdd				: false,
			find				: '',
			findsName			: [],
			findTarget			: undefined,
			headersName			: [],
			headersWidth		: [],
			height				: 'auto',
			hoverFx				: false,
			jsonp				: undefined,
			jsonpCallback		: 'callback',
			listPath			: 'entityList',
			loadingIcon			: 'gridy-loading',
			loadingOption		: true,
			loadingText			: 'Carregando...',
			messageOption		: true,
			messageTimer		: 4000,
			noResultOption		:true,
			noResultText		: 'Pesquisa sem resultados!',
			page				: 1,
			params				: {},
			paramsElements		: [],
			resize				: true,
			resultOption		: true,
			resultText			: 'Exibindo p�gina {from} de {to} de {total} registros',
			rows				: 10,
			rowsNumber			: [5, 10, 25, 50, 100],
			rowsTarget			: undefined,
			scroll					: false,
			search				: '',
			searchButtonLabel	: 'Pesquisar',
			searchButtonTitle	: 'Digite a sua pesquisa',
			searchFocus			: true,
			searchOption		: true,
			searchTarget		: undefined,
			searchText			: 'Digite a sua pesquisa',
			separate			: true,
			skin				: 'gridy-default',
			sortersName				: [],
			sorterWidth				: 'auto',
			sortName			: '',
			sortOrder			: 'asc',
			style				: 'table',
			success				: undefined,
			template			: 'template',
			totalPath			: 'total',
			type				: 'get',
			url					: '/gridy',
			width				: '100%'
	};

})(jQuery);
