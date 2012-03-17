<html>
<head>
<meta name="Generator" content="GeneXus Java">
<meta name="Version" content="10_1_4-38483">
<meta name="Description" content="Cadastro de Usuários">
<meta http-equiv="Page-Enter" content="BlendTrans(Duration=0.1)">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Usuários</title>
<link rel="stylesheet" type="text/css"
	href="/microfate/static/calendar-system.css?1016580">
<link rel="stylesheet" type="text/css"
	href="/microfate/static/Resources/Portuguese/GeneXusX.css?8283842">
<script type="text/javascript" src="/microfate/static/gxgral.js?38483"></script>
<script type="text/javascript" src="/microfate/static/gxcfg.js?38483"></script>
<script type="text/javascript" src="/microfate/static/calendar.js?38483"></script>

<script type="text/javascript"
	src="/microfate/static/calendar-setup.js?38483"></script>
<script type="text/javascript"
	src="/microfate/static/calendar-pt.js?38483"></script>
</head>
<body class="Form" style="-moz-opacity: 0; opacity: 0;"
	onkeyup="gx.evt.onkeyup(event)"
	onkeypress="gx.evt.onkeypress(event,true,true)"
	onkeydown="gx.evt.onkeypress(null,true,true)">
	<form id="MAINFORM"
		onsubmit="try{return gx.csv.validForm()}catch(e){return true;}"
		name="MAINFORM" method="post" action="tdusrw" class="Form">
		<table id="TABLEMAIN" class="TableBorder100x100" cellpadding="1"
			cellspacing="2">
			<tbody>
				<tr>
					<td><table id="TABLETOOLBAR" class="ViewTable" cellpadding="1"
							cellspacing="2">
							<tbody>
								<tr>
									<td><div style="WHITE-SPACE: nowrap" class="ToolbarMain">
											<input type="image"
												src="/microfate/static/Resources/GeneXusX/First.gif"
												name="BTN_FIRST"
												onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('EFIRST.',this);return false;} else return false;"
												id="BTN_FIRST" title="Primeiro" class="ImageHandCenter"
												onfocus="gx.evt.onfocus(this, 8,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/toolbarseparator.gif"
												name="BTN_FIRST_SEPARATOR"
												onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('EFIRST.',this);return false;} else return false;"
												id="BTN_FIRST_SEPARATOR" class="ImageTop"
												onfocus="gx.evt.onfocus(this, 9,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/Previous.gif"
												name="BTN_PREVIOUS"
												onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('EPREVIOUS.',this);return false;} else return false;"
												id="BTN_PREVIOUS" title="Anterior" class="ImageHandCenter"
												onfocus="gx.evt.onfocus(this, 10,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/toolbarseparator.gif"
												name="BTN_PREVIOUS_SEPARATOR"
												onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('EPREVIOUS.',this);return false;} else return false;"
												id="BTN_PREVIOUS_SEPARATOR" class="ImageTop"
												onfocus="gx.evt.onfocus(this, 11,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/Next.gif"
												name="BTN_NEXT"
												onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('ENEXT.',this);return false;} else return false;"
												id="BTN_NEXT" title="Próximo" class="ImageHandCenter"
												onfocus="gx.evt.onfocus(this, 12,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/toolbarseparator.gif"
												name="BTN_NEXT_SEPARATOR"
												onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('ENEXT.',this);return false;} else return false;"
												id="BTN_NEXT_SEPARATOR" class="ImageTop"
												onfocus="gx.evt.onfocus(this, 13,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/Last.gif"
												name="BTN_LAST"
												onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('ELAST.',this);return false;} else return false;"
												id="BTN_LAST" title="Último" class="ImageHandCenter"
												onfocus="gx.evt.onfocus(this, 14,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/toolbarseparator.gif"
												name="BTN_LAST_SEPARATOR"
												onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('ELAST.',this);return false;} else return false;"
												id="BTN_LAST_SEPARATOR" class="ImageTop"
												onfocus="gx.evt.onfocus(this, 15,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/Select.gif"
												name="BTN_SELECT"
												onclick="if( gx.evt.jsEvent(this)) {gx.popup.openPrompt('gx0150',[{Ctrl:gx.dom.el('DUSRCOD'), id:'DUSRCOD',isOut:true,isKey:true,isLastKey:true}],null,'', false,true);return false;return false;} else return false;"
												id="BTN_SELECT" title="Selecionar" class="ImageHandCenter"
												onfocus="gx.evt.onfocus(this, 16,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/toolbarseparator.gif"
												name="BTN_SELECT_SEPARATOR"
												onclick="if( gx.evt.jsEvent(this)) {gx.popup.openPrompt('gx0150',[{Ctrl:gx.dom.el('DUSRCOD'), id:'DUSRCOD',isOut:true,isKey:true,isLastKey:true}],null,'', false,true);return false;return false;} else return false;"
												id="BTN_SELECT_SEPARATOR" class="ImageTop"
												onfocus="gx.evt.onfocus(this, 17,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/Save.gif"
												name="BTN_ENTER2"
												onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('EENTER.',this);return false;} else return false;"
												id="BTN_ENTER2" title="Confirmar" class="ImageHandCenter"
												onfocus="gx.evt.onfocus(this, 18,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/toolbarseparator.gif"
												name="BTN_ENTER2_SEPARATOR"
												onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('EENTER.',this);return false;} else return false;"
												id="BTN_ENTER2_SEPARATOR" class="ImageTop"
												onfocus="gx.evt.onfocus(this, 19,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/Cancel.gif"
												name="BTN_CANCEL2"
												onclick="if( gx.evt.jsEvent(this)) {gx.fn.closeWindow();return false;return false;} else return false;"
												id="BTN_CANCEL2" title="Fechar" class="ImageHandCenter"
												onfocus="gx.evt.onfocus(this, 20,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/toolbarseparator.gif"
												name="BTN_CANCEL2_SEPARATOR"
												onclick="if( gx.evt.jsEvent(this)) {gx.fn.closeWindow();return false;return false;} else return false;"
												id="BTN_CANCEL2_SEPARATOR" class="ImageTop"
												onfocus="gx.evt.onfocus(this, 21,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/ActionDelete.gif"
												name="BTN_DELETE2"
												onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('EDELETE.',this);return false;} else return false;"
												disabled="disabled" id="BTN_DELETE2" title="Eliminar"
												class="ImageHandCenter"
												onfocus="gx.evt.onfocus(this, 22,'',false,'',0)"><input
												type="image"
												src="/microfate/static/Resources/GeneXusX/toolbarseparator.gif"
												name="BTN_DELETE2_SEPARATOR"
												onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('EDELETE.',this);return false;} else return false;"
												id="BTN_DELETE2_SEPARATOR" class="ImageTop"
												onfocus="gx.evt.onfocus(this, 23,'',false,'',0)">
										</div></td>
								</tr>
								<tr>
									<td></td>
								</tr>
							</tbody>
						</table>
						<fieldset id="GROUPDATA" style="-moz-border-radius: 3pt;"
							class="Group">
							<legend class="GroupTitle">Cadastro de Usuários</legend>
							<table id="TABLE1" class="Table" cellpadding="1" cellspacing="2">
								<tbody>
									<tr>
										<td><div>
												<span class="ErrorViewer gx_ev" id="gxErrorViewer"></span>
											</div></td>
									</tr>
									<tr>
										<td><table id="TABLE2" class="Table" cellpadding="1"
												cellspacing="2">
												<tbody>
													<tr>
														<td valign="top" class="td5"><div class="TextBlock"
																style="display: inline" id="TEXTBLOCKDUSRCOD">Cod.Usuário</div>
															<script type="text/javascript">
																gx.dom
																		.setAttribute(
																				"TEXTBLOCKDUSRCOD",
																				"gxformat",
																				"1");
															</script></td>
														<td><input type="text" id="DUSRCOD" name="DUSRCOD"
															value="0" size="4" maxlength="4" class="Attribute"
															style="height: 1row; text-align: right"
															onfocus="gx.evt.onfocus(this, 38,'',false,'',0)"
															onchange="gx.evt.onchange(this)"
															onblur="gx.num.valid_integer( this,'.');;gx.evt.onblur(38);"></td>
													</tr>
													<tr>
														<td valign="top" class="td5"><div class="TextBlock"
																style="display: inline" id="TEXTBLOCKDUSRNOME">Nome
																do Usuário</div> <script type="text/javascript">
																gx.dom
																		.setAttribute(
																				"TEXTBLOCKDUSRNOME",
																				"gxformat",
																				"1");
															</script></td>
														<td><input type="text" id="DUSRNOME" name="DUSRNOME"
															value="" size="20" maxlength="20" class="Attribute"
															style="height: 1row; text-align: left"
															onfocus="gx.evt.onfocus(this, 43,'',false,'',0)"
															onchange="gx.evt.onchange(this)"
															onblur=";gx.evt.onblur(43);"></td>
													</tr>
													<tr>
														<td valign="top" class="td5"><div class="TextBlock"
																style="display: inline" id="TEXTBLOCKDUSRNOMEC">Nome
																Completo</div> <script type="text/javascript">
																gx.dom
																		.setAttribute(
																				"TEXTBLOCKDUSRNOMEC",
																				"gxformat",
																				"1");
															</script></td>
														<td><input type="text" id="DUSRNOMEC"
															name="DUSRNOMEC" value="" size="40" maxlength="40"
															class="Attribute" style="height: 1row; text-align: left"
															onfocus="gx.evt.onfocus(this, 48,'',false,'',0)"
															onchange="gx.evt.onchange(this)"
															onblur=";gx.evt.onblur(48);"></td>
													</tr>
													<tr>
														<td valign="top" class="td5"><div class="TextBlock"
																style="display: inline" id="TEXTBLOCKDUSRSENHA">Senha
																do Usuário</div> <script type="text/javascript">
																gx.dom
																		.setAttribute(
																				"TEXTBLOCKDUSRSENHA",
																				"gxformat",
																				"1");
															</script></td>
														<td><input type="text" id="DUSRSENHA"
															name="DUSRSENHA" value="" size="10" maxlength="10"
															class="Attribute" style="height: 1row; text-align: left"
															onfocus="gx.evt.onfocus(this, 53,'',false,'',0)"
															onchange="gx.evt.onchange(this)"
															onblur=";gx.evt.onblur(53);"></td>
													</tr>
													<tr>
														<td valign="top" class="td5"><div class="TextBlock"
																style="display: inline" id="TEXTBLOCKDUSRDTNAS">Dt.Nascimento</div>
															<script type="text/javascript">
																gx.dom
																		.setAttribute(
																				"TEXTBLOCKDUSRDTNAS",
																				"gxformat",
																				"1");
															</script></td>
														<td><table id="DUSRDTNAS_dp_container"
																cellpadding="0" cellspacing="0">
																<tr>
																	<td><input type="text" id="DUSRDTNAS"
																		name="DUSRDTNAS" value="  /  /    " size="10"
																		maxlength="10" class="Attribute"
																		style="height: 1row; text-align: right"
																		onfocus="gx.evt.onfocus(this, 58,'',false,'',0)"
																		onchange="gx.evt.onchange(this)"
																		onblur="gx.date.valid_date(this, 10,'DMY',0,24,'por',false,0);;gx.evt.onblur(58);"></td>
																	<td><img src="/microfate/static/calendar-img.gif"
																		id="DUSRDTNAS_dp_trigger" style="cursor: pointer;"
																		title="Date selector" alt="Date selector"></td>
																</tr>
															</table></td>
													</tr>
													<tr>
														<td valign="top" class="td5"><div class="TextBlock"
																style="display: inline" id="TEXTBLOCKDUSRSTABL">Status
																B=Bloqueado L=Liberado</div> <script type="text/javascript">
																gx.dom
																		.setAttribute(
																				"TEXTBLOCKDUSRSTABL",
																				"gxformat",
																				"1");
															</script></td>
														<td><select id="DUSRSTABL" name="DUSRSTABL"
															class="Attribute" style="width: 1chr"
															onfocus="gx.evt.onfocus(this, 63,'',false,'',0)"
															onchange="gx.evt.onchange(this)"
															onblur=";gx.evt.onblur(63);">
																<option value="L" selected="selected">Liberado

																
																<option value="B">Bloqueado
														</select> <script type="text/javascript">
															gx.dom
																	.setAttribute(
																			"DUSRSTABL",
																			"gxoch0",
																			"if(!(gx.evt.jsEvent(this))) return false;");
														</script></td>
													</tr>
													<tr>
														<td colspan="2"><br>
															<table id="TABLE3" class="Table95" cellpadding="1"
																cellspacing="2">
																<tbody>
																	<tr>
																		<td class="SubTitle"><div style="display: inline"
																				id="TITLELEVEL1">Level1</div> <script
																				type="text/javascript">
																				gx.dom
																						.setAttribute(
																								"TITLELEVEL1",
																								"gxformat",
																								"1");
																			</script></td>
																	</tr>
																</tbody>
															</table>
															<hr class="HRDefault">
															<div id="Gridtdusrw_level1itemContainerDiv"></div> <input
															type="hidden" name="Gridtdusrw_level1itemContainerDataV"
															value='&#091;&#091;&quot;&quot;&#044;&quot;&quot;&#093;&#044;&#091;&quot;&quot;&#044;&quot;&quot;&#093;&#044;&#091;&quot;&quot;&#044;&quot;&quot;&#093;&#044;&#091;&quot;&quot;&#044;&quot;&quot;&#093;&#044;&#091;&quot;&quot;&#044;&quot;&quot;&#093;&#093;'></td>
													</tr>
												</tbody>
											</table></td>
									</tr>
									<tr>
										<td><span onclick="gx.evt.doClick('BTN_ENTER', event)"
											class="BaseRBtn RBtnEnter"><span class="BtnLeft"><span
													class="BtnRight"><span class="BtnBackground"><input
															type="button" name="BTN_ENTER" value="Confirmar"
															title="Confirmar" class="BtnText"
															onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('EENTER.',this);} else return false;"
															onfocus="gx.evt.onfocus(this, 75,'',false,'',0)"></span></span></span></span><span
											onclick="gx.evt.doClick('BTN_CANCEL', event)"
											class="BaseRBtn RBtnCancel"><span class="BtnLeft"><span
													class="BtnRight"><span class="BtnBackground"><input
															type="button" name="BTN_CANCEL" value="Fechar"
															title="Fechar" class="BtnText"
															onclick="if( gx.evt.jsEvent(this)) {gx.fn.closeWindow();return false;} else return false;"
															onfocus="gx.evt.onfocus(this, 76,'',false,'',0)"></span></span></span></span><span
											onclick="gx.evt.doClick('BTN_DELETE', event)"
											class="BaseRBtn RBtnDelete"><span class="BtnLeft"><span
													class="BtnRight"><span class="BtnBackground"><input
															type="button" name="BTN_DELETE" value="Eliminar"
															title="Eliminar" class="BtnText"
															onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('EDELETE.',this);} else return false;"
															onfocus="gx.evt.onfocus(this, 77,'',false,'',0)"></span></span></span></span><span
											onclick="gx.evt.doClick('BUTTON1', event)"
											class="BaseRBtn RSpecialButtons"><span class="BtnLeft"><span
													class="BtnRight"><span class="BtnBackground">
															<input type="button" name="BUTTON1" value="teste"
															title="teste" class="BtnText"
															onclick="if( gx.evt.jsEvent(this)) {gx.evt.execEvt('E\'TESTE\'.',this);} else return false;"
															onfocus="gx.evt.onfocus(this, 78,'',false,'',0)">
													</span></span></span></span></td>
									</tr>
								</tbody>
							</table>
						</fieldset></td>
				</tr>
			</tbody>
		</table>
		<div>
			<input type="hidden" name="GXState"
				value="&#123;&quot;&#095;EventName&quot;&#058;&quot;&quot;&#044;&quot;&#095;EventGridId&quot;&#058;&quot;&quot;&#044;&quot;&#095;EventRowId&quot;&#058;&quot;&quot;&#044;&quot;Z7180dusrPref&#095;0001&quot;&#058;&quot;&quot;&#044;&quot;Z7181dusrPrefhis&#095;0001&quot;&#058;&quot;&quot;&#044;&quot;Z7182dusrPrefAtivo&#095;0001&quot;&#058;&quot;0&quot;&#044;&quot;Z7183dusrPrefpar1&#095;0001&quot;&#058;&quot;0&quot;&#044;&quot;Z7184dusrPrefpar2&#095;0001&quot;&#058;&quot;0&quot;&#044;&quot;Z7185dusrPrefpar3&#095;0001&quot;&#058;&quot;0&#044;00&quot;&#044;&quot;Z7186dusrPrefpar4&#095;0001&quot;&#058;&quot;    &#045;  &#045;  &quot;&#044;&quot;Z7187dusrPrefpar5&#095;0001&quot;&#058;&quot;0&quot;&#044;&quot;Z7188dusrPrefusr&#095;0001&quot;&#058;&quot;0&quot;&#044;&quot;Z7189dusrPrefDtAlt&#095;0001&quot;&#058;&quot;  &#047;  &#047;       &#058;  &#058;  &quot;&#044;&quot;nRcdDeleted&#095;512&#095;0001&quot;&#058;&quot;0&quot;&#044;&quot;nRcdExists&#095;512&#095;0001&quot;&#058;&quot;0&quot;&#044;&quot;nIsMod&#095;512&#095;0001&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPREF&#095;0001Forecolor&quot;&#058;&quot;255&quot;&#044;&quot;DUSRPREF&#095;0001Enabled&quot;&#058;&quot;1&quot;&#044;&quot;DUSRPREFHIS&#095;0001Enabled&quot;&#058;&quot;1&quot;&#044;&quot;Z7180dusrPref&#095;0002&quot;&#058;&quot;&quot;&#044;&quot;Z7181dusrPrefhis&#095;0002&quot;&#058;&quot;&quot;&#044;&quot;Z7182dusrPrefAtivo&#095;0002&quot;&#058;&quot;0&quot;&#044;&quot;Z7183dusrPrefpar1&#095;0002&quot;&#058;&quot;0&quot;&#044;&quot;Z7184dusrPrefpar2&#095;0002&quot;&#058;&quot;0&quot;&#044;&quot;Z7185dusrPrefpar3&#095;0002&quot;&#058;&quot;0&#044;00&quot;&#044;&quot;Z7186dusrPrefpar4&#095;0002&quot;&#058;&quot;    &#045;  &#045;  &quot;&#044;&quot;Z7187dusrPrefpar5&#095;0002&quot;&#058;&quot;0&quot;&#044;&quot;Z7188dusrPrefusr&#095;0002&quot;&#058;&quot;0&quot;&#044;&quot;Z7189dusrPrefDtAlt&#095;0002&quot;&#058;&quot;  &#047;  &#047;       &#058;  &#058;  &quot;&#044;&quot;nRcdDeleted&#095;512&#095;0002&quot;&#058;&quot;0&quot;&#044;&quot;nRcdExists&#095;512&#095;0002&quot;&#058;&quot;0&quot;&#044;&quot;nIsMod&#095;512&#095;0002&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPREF&#095;0002Forecolor&quot;&#058;&quot;255&quot;&#044;&quot;DUSRPREF&#095;0002Enabled&quot;&#058;&quot;1&quot;&#044;&quot;DUSRPREFHIS&#095;0002Enabled&quot;&#058;&quot;1&quot;&#044;&quot;Z7180dusrPref&#095;0003&quot;&#058;&quot;&quot;&#044;&quot;Z7181dusrPrefhis&#095;0003&quot;&#058;&quot;&quot;&#044;&quot;Z7182dusrPrefAtivo&#095;0003&quot;&#058;&quot;0&quot;&#044;&quot;Z7183dusrPrefpar1&#095;0003&quot;&#058;&quot;0&quot;&#044;&quot;Z7184dusrPrefpar2&#095;0003&quot;&#058;&quot;0&quot;&#044;&quot;Z7185dusrPrefpar3&#095;0003&quot;&#058;&quot;0&#044;00&quot;&#044;&quot;Z7186dusrPrefpar4&#095;0003&quot;&#058;&quot;    &#045;  &#045;  &quot;&#044;&quot;Z7187dusrPrefpar5&#095;0003&quot;&#058;&quot;0&quot;&#044;&quot;Z7188dusrPrefusr&#095;0003&quot;&#058;&quot;0&quot;&#044;&quot;Z7189dusrPrefDtAlt&#095;0003&quot;&#058;&quot;  &#047;  &#047;       &#058;  &#058;  &quot;&#044;&quot;nRcdDeleted&#095;512&#095;0003&quot;&#058;&quot;0&quot;&#044;&quot;nRcdExists&#095;512&#095;0003&quot;&#058;&quot;0&quot;&#044;&quot;nIsMod&#095;512&#095;0003&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPREF&#095;0003Forecolor&quot;&#058;&quot;255&quot;&#044;&quot;DUSRPREF&#095;0003Enabled&quot;&#058;&quot;1&quot;&#044;&quot;DUSRPREFHIS&#095;0003Enabled&quot;&#058;&quot;1&quot;&#044;&quot;Z7180dusrPref&#095;0004&quot;&#058;&quot;&quot;&#044;&quot;Z7181dusrPrefhis&#095;0004&quot;&#058;&quot;&quot;&#044;&quot;Z7182dusrPrefAtivo&#095;0004&quot;&#058;&quot;0&quot;&#044;&quot;Z7183dusrPrefpar1&#095;0004&quot;&#058;&quot;0&quot;&#044;&quot;Z7184dusrPrefpar2&#095;0004&quot;&#058;&quot;0&quot;&#044;&quot;Z7185dusrPrefpar3&#095;0004&quot;&#058;&quot;0&#044;00&quot;&#044;&quot;Z7186dusrPrefpar4&#095;0004&quot;&#058;&quot;    &#045;  &#045;  &quot;&#044;&quot;Z7187dusrPrefpar5&#095;0004&quot;&#058;&quot;0&quot;&#044;&quot;Z7188dusrPrefusr&#095;0004&quot;&#058;&quot;0&quot;&#044;&quot;Z7189dusrPrefDtAlt&#095;0004&quot;&#058;&quot;  &#047;  &#047;       &#058;  &#058;  &quot;&#044;&quot;nRcdDeleted&#095;512&#095;0004&quot;&#058;&quot;0&quot;&#044;&quot;nRcdExists&#095;512&#095;0004&quot;&#058;&quot;0&quot;&#044;&quot;nIsMod&#095;512&#095;0004&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPREF&#095;0004Forecolor&quot;&#058;&quot;255&quot;&#044;&quot;DUSRPREF&#095;0004Enabled&quot;&#058;&quot;1&quot;&#044;&quot;DUSRPREFHIS&#095;0004Enabled&quot;&#058;&quot;1&quot;&#044;&quot;Z7180dusrPref&#095;0005&quot;&#058;&quot;&quot;&#044;&quot;Z7181dusrPrefhis&#095;0005&quot;&#058;&quot;&quot;&#044;&quot;Z7182dusrPrefAtivo&#095;0005&quot;&#058;&quot;0&quot;&#044;&quot;Z7183dusrPrefpar1&#095;0005&quot;&#058;&quot;0&quot;&#044;&quot;Z7184dusrPrefpar2&#095;0005&quot;&#058;&quot;0&quot;&#044;&quot;Z7185dusrPrefpar3&#095;0005&quot;&#058;&quot;0&#044;00&quot;&#044;&quot;Z7186dusrPrefpar4&#095;0005&quot;&#058;&quot;    &#045;  &#045;  &quot;&#044;&quot;Z7187dusrPrefpar5&#095;0005&quot;&#058;&quot;0&quot;&#044;&quot;Z7188dusrPrefusr&#095;0005&quot;&#058;&quot;0&quot;&#044;&quot;Z7189dusrPrefDtAlt&#095;0005&quot;&#058;&quot;  &#047;  &#047;       &#058;  &#058;  &quot;&#044;&quot;nRcdDeleted&#095;512&#095;0005&quot;&#058;&quot;0&quot;&#044;&quot;nRcdExists&#095;512&#095;0005&quot;&#058;&quot;0&quot;&#044;&quot;nIsMod&#095;512&#095;0005&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPREF&#095;0005Forecolor&quot;&#058;&quot;255&quot;&#044;&quot;DUSRPREF&#095;0005Enabled&quot;&#058;&quot;1&quot;&#044;&quot;DUSRPREFHIS&#095;0005Enabled&quot;&#058;&quot;1&quot;&#044;&quot;Gridtdusrw&#095;level1itemContainerData&quot;&#058;&quot;&#123;&#092;&quot;GridName&#092;&quot;&#058;&#092;&quot;Gridtdusrw&#095;level1item&#092;&quot;&#044;&#092;&quot;Class&#092;&quot;&#058;&#092;&quot;Grid&#092;&quot;&#044;&#092;&quot;Cellpadding&#092;&quot;&#058;&#092;&quot;1&#092;&quot;&#044;&#092;&quot;Cellspacing&#092;&quot;&#058;&#092;&quot;2&#092;&quot;&#044;&#092;&quot;Backcolorstyle&#092;&quot;&#058;&#092;&quot;2&#092;&quot;&#044;&#092;&quot;CmpContext&#092;&quot;&#058;&#092;&quot;&#092;&quot;&#044;&#092;&quot;InMasterPage&#092;&quot;&#058;&#092;&quot;false&#092;&quot;&#044;&#092;&quot;Allowselection&#092;&quot;&#058;&#092;&quot;false&#092;&quot;&#044;&#092;&quot;Allowcollapsing&#092;&quot;&#058;&#092;&quot;false&#092;&quot;&#044;&#092;&quot;Collapsed&#092;&quot;&#058;&#092;&quot;0&#092;&quot;&#044;&#092;&quot;0&#092;&quot;&#058;&#123;&#092;&quot;Props&#092;&quot;&#058;&#091;&#091;&#092;&quot;DUSRPREF&#095;0001&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;px&#092;&quot;&#044;17&#044;&#092;&quot;&#092;&quot;&#044;15&#044;&#045;1&#044;1&#044;1&#044;0&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;color&#058;&#035;0000ff&#059;&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot; gxoch1&#061;&#092;&#092;&#092;&quot;gx&#046;fn&#046;setControlValue&#040;&#039;nIsMod&#095;512&#095;0001&#039;&#044;1&#041;&#059;&#092;&#092;&#092;&quot;  onfocus&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onfocus&#040;this&#044; 71&#044;&#039;&#039;&#044;false&#044;&#039;0001&#039;&#044;70&#041;&#092;&#092;&#092;&quot; onchange&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onchange&#040;this&#041;&#092;&#092;&#092;&quot;  onblur&#061;&#092;&#092;&#092;&quot;this&#046;value&#061;this&#046;value&#046;toUpperCase&#040;&#041;&#059;&#059;gx&#046;evt&#046;onblur&#040;71&#041;&#059;&#092;&#092;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;70&#044;1&#044;&#045;1&#044;true&#044;&#092;&quot;left&#092;&quot;&#093;&#044;&#091;&#092;&quot;DUSRPREFHIS&#095;0001&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;px&#092;&quot;&#044;17&#044;&#092;&quot;&#092;&quot;&#044;60&#044;&#045;1&#044;1&#044;0&#044;0&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot; gxoch1&#061;&#092;&#092;&#092;&quot;gx&#046;fn&#046;setControlValue&#040;&#039;nIsMod&#095;512&#095;0001&#039;&#044;1&#041;&#059;&#092;&#092;&#092;&quot;  onfocus&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onfocus&#040;this&#044; 72&#044;&#039;&#039;&#044;false&#044;&#039;0001&#039;&#044;70&#041;&#092;&#092;&#092;&quot; onchange&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onchange&#040;this&#041;&#092;&#092;&#092;&quot;  onblur&#061;&#092;&#092;&#092;&quot;&#059;gx&#046;evt&#046;onblur&#040;72&#041;&#059;&#092;&#092;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;70&#044;1&#044;&#045;1&#044;true&#044;&#092;&quot;left&#092;&quot;&#093;&#093;&#044;&#092;&quot;Grids&#092;&quot;&#058;&#123;&#125;&#044;&#092;&quot;Count&#092;&quot;&#058;2&#125;&#044;&#092;&quot;1&#092;&quot;&#058;&#123;&#092;&quot;Props&#092;&quot;&#058;&#091;&#091;&#092;&quot;DUSRPREF&#095;0002&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;px&#092;&quot;&#044;17&#044;&#092;&quot;&#092;&quot;&#044;15&#044;&#045;1&#044;1&#044;1&#044;0&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;color&#058;&#035;0000ff&#059;&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot; gxoch1&#061;&#092;&#092;&#092;&quot;gx&#046;fn&#046;setControlValue&#040;&#039;nIsMod&#095;512&#095;0002&#039;&#044;1&#041;&#059;&#092;&#092;&#092;&quot;  onfocus&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onfocus&#040;this&#044; 71&#044;&#039;&#039;&#044;false&#044;&#039;0002&#039;&#044;70&#041;&#092;&#092;&#092;&quot; onchange&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onchange&#040;this&#041;&#092;&#092;&#092;&quot;  onblur&#061;&#092;&#092;&#092;&quot;this&#046;value&#061;this&#046;value&#046;toUpperCase&#040;&#041;&#059;&#059;gx&#046;evt&#046;onblur&#040;71&#041;&#059;&#092;&#092;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;70&#044;1&#044;&#045;1&#044;true&#044;&#092;&quot;left&#092;&quot;&#093;&#044;&#091;&#092;&quot;DUSRPREFHIS&#095;0002&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;px&#092;&quot;&#044;17&#044;&#092;&quot;&#092;&quot;&#044;60&#044;&#045;1&#044;1&#044;0&#044;0&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot; gxoch1&#061;&#092;&#092;&#092;&quot;gx&#046;fn&#046;setControlValue&#040;&#039;nIsMod&#095;512&#095;0002&#039;&#044;1&#041;&#059;&#092;&#092;&#092;&quot;  onfocus&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onfocus&#040;this&#044; 72&#044;&#039;&#039;&#044;false&#044;&#039;0002&#039;&#044;70&#041;&#092;&#092;&#092;&quot; onchange&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onchange&#040;this&#041;&#092;&#092;&#092;&quot;  onblur&#061;&#092;&#092;&#092;&quot;&#059;gx&#046;evt&#046;onblur&#040;72&#041;&#059;&#092;&#092;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;70&#044;1&#044;&#045;1&#044;true&#044;&#092;&quot;left&#092;&quot;&#093;&#093;&#044;&#092;&quot;Grids&#092;&quot;&#058;&#123;&#125;&#044;&#092;&quot;Count&#092;&quot;&#058;2&#125;&#044;&#092;&quot;2&#092;&quot;&#058;&#123;&#092;&quot;Props&#092;&quot;&#058;&#091;&#091;&#092;&quot;DUSRPREF&#095;0003&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;px&#092;&quot;&#044;17&#044;&#092;&quot;&#092;&quot;&#044;15&#044;&#045;1&#044;1&#044;1&#044;0&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;color&#058;&#035;0000ff&#059;&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot; gxoch1&#061;&#092;&#092;&#092;&quot;gx&#046;fn&#046;setControlValue&#040;&#039;nIsMod&#095;512&#095;0003&#039;&#044;1&#041;&#059;&#092;&#092;&#092;&quot;  onfocus&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onfocus&#040;this&#044; 71&#044;&#039;&#039;&#044;false&#044;&#039;0003&#039;&#044;70&#041;&#092;&#092;&#092;&quot; onchange&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onchange&#040;this&#041;&#092;&#092;&#092;&quot;  onblur&#061;&#092;&#092;&#092;&quot;this&#046;value&#061;this&#046;value&#046;toUpperCase&#040;&#041;&#059;&#059;gx&#046;evt&#046;onblur&#040;71&#041;&#059;&#092;&#092;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;70&#044;1&#044;&#045;1&#044;true&#044;&#092;&quot;left&#092;&quot;&#093;&#044;&#091;&#092;&quot;DUSRPREFHIS&#095;0003&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;px&#092;&quot;&#044;17&#044;&#092;&quot;&#092;&quot;&#044;60&#044;&#045;1&#044;1&#044;0&#044;0&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot; gxoch1&#061;&#092;&#092;&#092;&quot;gx&#046;fn&#046;setControlValue&#040;&#039;nIsMod&#095;512&#095;0003&#039;&#044;1&#041;&#059;&#092;&#092;&#092;&quot;  onfocus&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onfocus&#040;this&#044; 72&#044;&#039;&#039;&#044;false&#044;&#039;0003&#039;&#044;70&#041;&#092;&#092;&#092;&quot; onchange&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onchange&#040;this&#041;&#092;&#092;&#092;&quot;  onblur&#061;&#092;&#092;&#092;&quot;&#059;gx&#046;evt&#046;onblur&#040;72&#041;&#059;&#092;&#092;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;70&#044;1&#044;&#045;1&#044;true&#044;&#092;&quot;left&#092;&quot;&#093;&#093;&#044;&#092;&quot;Grids&#092;&quot;&#058;&#123;&#125;&#044;&#092;&quot;Count&#092;&quot;&#058;2&#125;&#044;&#092;&quot;3&#092;&quot;&#058;&#123;&#092;&quot;Props&#092;&quot;&#058;&#091;&#091;&#092;&quot;DUSRPREF&#095;0004&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;px&#092;&quot;&#044;17&#044;&#092;&quot;&#092;&quot;&#044;15&#044;&#045;1&#044;1&#044;1&#044;0&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;color&#058;&#035;0000ff&#059;&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot; gxoch1&#061;&#092;&#092;&#092;&quot;gx&#046;fn&#046;setControlValue&#040;&#039;nIsMod&#095;512&#095;0004&#039;&#044;1&#041;&#059;&#092;&#092;&#092;&quot;  onfocus&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onfocus&#040;this&#044; 71&#044;&#039;&#039;&#044;false&#044;&#039;0004&#039;&#044;70&#041;&#092;&#092;&#092;&quot; onchange&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onchange&#040;this&#041;&#092;&#092;&#092;&quot;  onblur&#061;&#092;&#092;&#092;&quot;this&#046;value&#061;this&#046;value&#046;toUpperCase&#040;&#041;&#059;&#059;gx&#046;evt&#046;onblur&#040;71&#041;&#059;&#092;&#092;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;70&#044;1&#044;&#045;1&#044;true&#044;&#092;&quot;left&#092;&quot;&#093;&#044;&#091;&#092;&quot;DUSRPREFHIS&#095;0004&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;px&#092;&quot;&#044;17&#044;&#092;&quot;&#092;&quot;&#044;60&#044;&#045;1&#044;1&#044;0&#044;0&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot; gxoch1&#061;&#092;&#092;&#092;&quot;gx&#046;fn&#046;setControlValue&#040;&#039;nIsMod&#095;512&#095;0004&#039;&#044;1&#041;&#059;&#092;&#092;&#092;&quot;  onfocus&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onfocus&#040;this&#044; 72&#044;&#039;&#039;&#044;false&#044;&#039;0004&#039;&#044;70&#041;&#092;&#092;&#092;&quot; onchange&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onchange&#040;this&#041;&#092;&#092;&#092;&quot;  onblur&#061;&#092;&#092;&#092;&quot;&#059;gx&#046;evt&#046;onblur&#040;72&#041;&#059;&#092;&#092;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;70&#044;1&#044;&#045;1&#044;true&#044;&#092;&quot;left&#092;&quot;&#093;&#093;&#044;&#092;&quot;Grids&#092;&quot;&#058;&#123;&#125;&#044;&#092;&quot;Count&#092;&quot;&#058;2&#125;&#044;&#092;&quot;4&#092;&quot;&#058;&#123;&#092;&quot;Props&#092;&quot;&#058;&#091;&#091;&#092;&quot;DUSRPREF&#095;0005&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;px&#092;&quot;&#044;17&#044;&#092;&quot;&#092;&quot;&#044;15&#044;&#045;1&#044;1&#044;1&#044;0&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;color&#058;&#035;0000ff&#059;&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot; gxoch1&#061;&#092;&#092;&#092;&quot;gx&#046;fn&#046;setControlValue&#040;&#039;nIsMod&#095;512&#095;0005&#039;&#044;1&#041;&#059;&#092;&#092;&#092;&quot;  onfocus&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onfocus&#040;this&#044; 71&#044;&#039;&#039;&#044;false&#044;&#039;0005&#039;&#044;70&#041;&#092;&#092;&#092;&quot; onchange&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onchange&#040;this&#041;&#092;&#092;&#092;&quot;  onblur&#061;&#092;&#092;&#092;&quot;this&#046;value&#061;this&#046;value&#046;toUpperCase&#040;&#041;&#059;&#059;gx&#046;evt&#046;onblur&#040;71&#041;&#059;&#092;&#092;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;70&#044;1&#044;&#045;1&#044;true&#044;&#092;&quot;left&#092;&quot;&#093;&#044;&#091;&#092;&quot;DUSRPREFHIS&#095;0005&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;px&#092;&quot;&#044;17&#044;&#092;&quot;&#092;&quot;&#044;60&#044;&#045;1&#044;1&#044;0&#044;0&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;Attribute&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot; gxoch1&#061;&#092;&#092;&#092;&quot;gx&#046;fn&#046;setControlValue&#040;&#039;nIsMod&#095;512&#095;0005&#039;&#044;1&#041;&#059;&#092;&#092;&#092;&quot;  onfocus&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onfocus&#040;this&#044; 72&#044;&#039;&#039;&#044;false&#044;&#039;0005&#039;&#044;70&#041;&#092;&#092;&#092;&quot; onchange&#061;&#092;&#092;&#092;&quot;gx&#046;evt&#046;onchange&#040;this&#041;&#092;&#092;&#092;&quot;  onblur&#061;&#092;&#092;&#092;&quot;&#059;gx&#046;evt&#046;onblur&#040;72&#041;&#059;&#092;&#092;&#092;&quot;&#092;&quot;&#044;0&#044;&#092;&quot;&#092;&quot;&#044;&#092;&quot;&#092;&quot;&#044;70&#044;1&#044;&#045;1&#044;true&#044;&#092;&quot;left&#092;&quot;&#093;&#093;&#044;&#092;&quot;Grids&#092;&quot;&#058;&#123;&#125;&#044;&#092;&quot;Count&#092;&quot;&#058;2&#125;&#044;&#092;&quot;Wrapped&#092;&quot;&#058;false&#044;&#092;&quot;Columns&#092;&quot;&#058;&#091;&#123;&#092;&quot;Value&#092;&quot;&#058;&#092;&quot;&#092;&quot;&#044;&#092;&quot;Forecolor&#092;&quot;&#058;&#092;&quot;0&#092;&quot;&#044;&#092;&quot;Enabled&#092;&quot;&#058;&#092;&quot;1&#092;&quot;&#125;&#044;&#123;&#092;&quot;Value&#092;&quot;&#058;&#092;&quot;&#092;&quot;&#044;&#092;&quot;Enabled&#092;&quot;&#058;&#092;&quot;1&#092;&quot;&#125;&#093;&#044;&#092;&quot;Count&#092;&quot;&#058;5&#125;&quot;&#044;&quot;Z3dusrcod&quot;&#058;&quot;0&quot;&#044;&quot;Z4dusrnome&quot;&#058;&quot;&quot;&#044;&quot;Z2052dusrnomec&quot;&#058;&quot;&quot;&#044;&quot;Z1099dusrsenha&quot;&#058;&quot;&quot;&#044;&quot;Z1100dusrdtnas&quot;&#058;&quot;    &#045;  &#045;  &quot;&#044;&quot;Z1101dusrstabl&quot;&#058;&quot;&quot;&#044;&quot;Z1102dusrend&quot;&#058;&quot;&quot;&#044;&quot;Z6604dusrEndNr&quot;&#058;&quot;&quot;&#044;&quot;Z6605dusrEndCompl&quot;&#058;&quot;&quot;&#044;&quot;Z1103dusrbai&quot;&#058;&quot;&quot;&#044;&quot;Z1104dusrcid&quot;&#058;&quot;&quot;&#044;&quot;Z4749dusrUF&quot;&#058;&quot;&quot;&#044;&quot;Z1105dusrcep&quot;&#058;&quot;0&quot;&#044;&quot;Z1106dusrddd&quot;&#058;&quot;&quot;&#044;&quot;Z1107dusrtel&quot;&#058;&quot;0&quot;&#044;&quot;Z1108dusresp&quot;&#058;&quot;&quot;&#044;&quot;Z1109dusrobs&quot;&#058;&quot;&quot;&#044;&quot;Z1110dusrCPF&quot;&#058;&quot;&quot;&#044;&quot;Z1111dusrHab&quot;&#058;&quot;&quot;&#044;&quot;Z4750dusrHabVal&quot;&#058;&quot;    &#045;  &#045;  &quot;&#044;&quot;Z1112dusrRepB&quot;&#058;&quot;0&quot;&#044;&quot;Z2451dusrCaixa&quot;&#058;&quot;0&quot;&#044;&quot;Z2452dusrLocal&quot;&#058;&quot;0&quot;&#044;&quot;Z2973dusrPar1&quot;&#058;&quot;0&quot;&#044;&quot;Z2974dusrPar2&quot;&#058;&quot;0&quot;&#044;&quot;Z3169dusrPar3&quot;&#058;&quot;0&#044;00&quot;&#044;&quot;Z3816dusrpar4&quot;&#058;&quot;0&quot;&#044;&quot;Z3817dusrpar5&quot;&#058;&quot;&quot;&#044;&quot;Z2975dusrMsg&quot;&#058;&quot;&quot;&#044;&quot;Z2976dusrEspec&quot;&#058;&quot;&quot;&#044;&quot;Z3067dusrPdescto&quot;&#058;&quot;0&#044;0000&quot;&#044;&quot;Z3164dusrSerial&quot;&#058;&quot;0&quot;&#044;&quot;Z1113dusrEstB&quot;&#058;&quot;0&quot;&#044;&quot;Z3956dusrEstB2&quot;&#058;&quot;0&quot;&#044;&quot;Z3957dusrEstB3&quot;&#058;&quot;0&quot;&#044;&quot;Z3942dusrXestB&quot;&#058;&quot;0&quot;&#044;&quot;Z5012dusrXemp&quot;&#058;&quot;0&quot;&#044;&quot;Z4287dusrMtip&quot;&#058;&quot;&quot;&#044;&quot;Z4751dusrPDV&quot;&#058;&quot;0&quot;&#044;&quot;Z4919dusrnrECF&quot;&#058;&quot;0&quot;&#044;&quot;Z5271dusrFotoBext&quot;&#058;&quot;&quot;&#044;&quot;Z5257dusrGav01&quot;&#058;&quot;0&quot;&#044;&quot;Z5266dusrdtadm&quot;&#058;&quot;    &#045;  &#045;  &quot;&#044;&quot;Z5355dusrAEprof&quot;&#058;&quot;0&quot;&#044;&quot;Z4881dusrdtacessoU&quot;&#058;&quot;  &#047;  &#047;       &#058;  &#058;  &quot;&#044;&quot;Z5384dusrConect01&quot;&#058;&quot;0&quot;&#044;&quot;Z5515dusrAEacervoB&quot;&#058;&quot;0&quot;&#044;&quot;Z5516dusrXAEacervoB&quot;&#058;&quot;0&quot;&#044;&quot;Z5731dusrCcusto&quot;&#058;&quot;0&quot;&#044;&quot;Z5961dusrCdepto&quot;&#058;&quot;0&quot;&#044;&quot;Z5986dusrMTAB&quot;&#058;&quot;0&quot;&#044;&quot;Z5989dusrMatTransfEst&quot;&#058;&quot;0&quot;&#044;&quot;Z5990dusrMatTransfDep&quot;&#058;&quot;0&quot;&#044;&quot;Z5997dusrMatGer&quot;&#058;&quot;0&quot;&#044;&quot;Z6282dusrSACGer&quot;&#058;&quot;0&quot;&#044;&quot;Z3818dusrRPL&quot;&#058;&quot;0&quot;&#044;&quot;Z6056dusrRPLb&quot;&#058;&quot;0&quot;&#044;&quot;Z7389dusrDiasRetroativo&quot;&#058;&quot;0&quot;&#044;&quot;Z7390dusrDiasPosterior&quot;&#058;&quot;0&quot;&#044;&quot;Z7614dusrPerfil&quot;&#058;&quot;0&quot;&#044;&quot;Z1114dusrdtalt&quot;&#058;&quot;  &#047;  &#047;       &#058;  &#058;  &quot;&#044;&quot;Z1115dusrusr&quot;&#058;&quot;0&quot;&#044;&quot;IsConfirmed&quot;&#058;&quot;0&quot;&#044;&quot;IsModified&quot;&#058;&quot;0&quot;&#044;&quot;Mode&quot;&#058;&quot;INS&quot;&#044;&quot;nRC&#095;Gridtdusrw&#095;level1item&quot;&#058;&quot;5&quot;&#044;&quot;DUSREND&quot;&#058;&quot;&quot;&#044;&quot;DUSRENDNR&quot;&#058;&quot;&quot;&#044;&quot;DUSRENDCOMPL&quot;&#058;&quot;&quot;&#044;&quot;DUSRBAI&quot;&#058;&quot;&quot;&#044;&quot;DUSRCID&quot;&#058;&quot;&quot;&#044;&quot;DUSRUF&quot;&#058;&quot;&quot;&#044;&quot;DUSRCEP&quot;&#058;&quot;0&quot;&#044;&quot;DUSRDDD&quot;&#058;&quot;&quot;&#044;&quot;DUSRTEL&quot;&#058;&quot;0&quot;&#044;&quot;DUSRESP&quot;&#058;&quot;&quot;&#044;&quot;DUSROBS&quot;&#058;&quot;&quot;&#044;&quot;DUSRCPF&quot;&#058;&quot;&quot;&#044;&quot;DUSRHAB&quot;&#058;&quot;&quot;&#044;&quot;DUSRHABVAL&quot;&#058;&quot;    &#045;  &#045;  &quot;&#044;&quot;DUSRREPB&quot;&#058;&quot;0&quot;&#044;&quot;DUSRCAIXA&quot;&#058;&quot;0&quot;&#044;&quot;DUSRLOCAL&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPAR1&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPAR2&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPAR3&quot;&#058;&quot;0&#044;00&quot;&#044;&quot;DUSRPAR4&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPAR5&quot;&#058;&quot;&quot;&#044;&quot;DUSRMSG&quot;&#058;&quot;&quot;&#044;&quot;DUSRESPEC&quot;&#058;&quot;&quot;&#044;&quot;DUSRPDESCTO&quot;&#058;&quot;0&#044;0000&quot;&#044;&quot;DUSRSERIAL&quot;&#058;&quot;0&quot;&#044;&quot;DUSRESTB&quot;&#058;&quot;0&quot;&#044;&quot;DUSRESTB2&quot;&#058;&quot;0&quot;&#044;&quot;DUSRESTB3&quot;&#058;&quot;0&quot;&#044;&quot;DUSRXESTB&quot;&#058;&quot;0&quot;&#044;&quot;DUSRXEMP&quot;&#058;&quot;0&quot;&#044;&quot;DUSRMTIP&quot;&#058;&quot;&quot;&#044;&quot;DUSRPDV&quot;&#058;&quot;0&quot;&#044;&quot;DUSRNRECF&quot;&#058;&quot;0&quot;&#044;&quot;DUSRFOTOB&quot;&#058;&quot;&quot;&#044;&quot;DUSRFOTOBEXT&quot;&#058;&quot;&quot;&#044;&quot;DUSRGAV01&quot;&#058;&quot;0&quot;&#044;&quot;DUSRDTADM&quot;&#058;&quot;    &#045;  &#045;  &quot;&#044;&quot;DUSRAEPROF&quot;&#058;&quot;0&quot;&#044;&quot;DUSRDTACESSOU&quot;&#058;&quot;  &#047;  &#047;       &#058;  &#058;  &quot;&#044;&quot;DUSRCONECT01&quot;&#058;&quot;0&quot;&#044;&quot;DUSRAEACERVOB&quot;&#058;&quot;0&quot;&#044;&quot;DUSRXAEACERVOB&quot;&#058;&quot;0&quot;&#044;&quot;DUSRCCUSTO&quot;&#058;&quot;0&quot;&#044;&quot;DUSRCDEPTO&quot;&#058;&quot;0&quot;&#044;&quot;DUSRMTAB&quot;&#058;&quot;0&quot;&#044;&quot;DUSRMATTRANSFEST&quot;&#058;&quot;0&quot;&#044;&quot;DUSRMATTRANSFDEP&quot;&#058;&quot;0&quot;&#044;&quot;DUSRMATGER&quot;&#058;&quot;0&quot;&#044;&quot;DUSRSACGER&quot;&#058;&quot;0&quot;&#044;&quot;DUSRRPL&quot;&#058;&quot;0&quot;&#044;&quot;DUSRRPLB&quot;&#058;&quot;0&quot;&#044;&quot;DUSRDIASRETROATIVO&quot;&#058;&quot;0&quot;&#044;&quot;DUSRDIASPOSTERIOR&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPERFIL&quot;&#058;&quot;0&quot;&#044;&quot;DUSRDTALT&quot;&#058;&quot;  &#047;  &#047;       &#058;  &#058;  &quot;&#044;&quot;DUSRUSR&quot;&#058;&quot;0&quot;&#044;&quot;vMODE&quot;&#058;&quot;INS&quot;&#044;&quot;DUSRPREFATIVO&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPREFPAR1&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPREFPAR2&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPREFPAR3&quot;&#058;&quot;0&#044;00&quot;&#044;&quot;DUSRPREFPAR4&quot;&#058;&quot;    &#045;  &#045;  &quot;&#044;&quot;DUSRPREFPAR5&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPREFUSR&quot;&#058;&quot;0&quot;&#044;&quot;DUSRPREFDTALT&quot;&#058;&quot;  &#047;  &#047;       &#058;  &#058;  &quot;&#044;&quot;GX&#095;FocusControl&quot;&#058;&quot;DUSRCOD&quot;&#044;&quot;GX&#095;AJAX&#095;KEY&quot;&#058;&quot;1A7509FF05FF0E53690C03486BFFFF22&quot;&#044;&quot;AJAX&#095;SECURITY&#095;TOKEN&quot;&#058;&quot;8d847d5d381db727d33b20d47808ea0438a8b5f9b6dfb0638e472c33851fd342&quot;&#044;&quot;GX&#095;CMP&#095;OBJS&quot;&#058;&#123;&#125;&#044;&quot;sCallerURL&quot;&#058;&quot;&#047;microfate&#047;servlet&#047;hfatpedidos&quot;&#044;&quot;GX&#095;RES&#095;PROVIDER&quot;&#058;&quot;com&#046;genexus&#046;webpanels&#046;GXResourceProvider&quot;&#044;&quot;GX&#095;THEME&quot;&#058;&quot;GeneXusX&quot;&#125;">
		</div>
	</form>
	<script type="text/javascript"
		src="/microfate/static/messages.por.js?38483"></script>
	<script type="text/javascript"
		src="/microfate/static/tdusrw.js?14482350"></script>

</body>
</html>
