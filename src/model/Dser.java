package model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import model.common.AbstractEntity;

@Entity
@Table(name = "DSER")
public class Dser extends AbstractEntity  {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@EmbeddedId	
    private DserPK id;
	@Column(name = "DSERNOME")
	private String dsernome;
	@Column(name = "DSERSERIAL")
	private long dserserial;
	@Column(name = "DSERDTALT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dserdtalt;
	@Column(name = "DSERUSR")
	private Short dserusr;
	@Column(name = "DSERPAR1")
	private Long dserpar1;
	@Column(name = "DSERPAR2")
	private Long dserpar2;
	// @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	@Column(name = "DSERPAR3")
	private BigDecimal dserpar3;
	//@Size(max = 20)
	@Column(name = "DSERPAR4")
	private String dserpar4;
	//@Size(max = 60)
	@Column(name = "DSERHIS")
	private String dserhis;	
	public void setDsernome(String dsernome) {
		this.dsernome = dsernome;
	}
	public String getDsernome() {
		return dsernome.trim();
	}
	public void setDserserial(Long dserserial) {
		this.dserserial = dserserial;
	}
	public Long getDserserial() {	
		return dserserial;
	}
	public void setDserdtalt(Date dserdtalt) {
		this.dserdtalt = dserdtalt;
	}
	public Date getDserdtalt() {
		return dserdtalt;
	}
	public void setDserusr(Short dserusr) {
		this.dserusr = dserusr;
	}
	public Short getDserusr() {
		return dserusr;
	}
	public void setDserpar1(Long dserpar1) {
		this.dserpar1 = dserpar1;
	}
	public Long getDserpar1() {
		return dserpar1;
	}
	public void setDserpar2(Long dserpar2) {
		this.dserpar2 = dserpar2;
	}
	public Long getDserpar2() {
		return dserpar2;
	}
	public void setDserpar3(BigDecimal dserpar3) {
		this.dserpar3 = dserpar3;
	}
	public BigDecimal getDserpar3() {
		return dserpar3;
	}
	public void setDserpar4(String dserpar4) {
		this.dserpar4 = dserpar4;
	}
	public String getDserpar4() {
		return dserpar4.trim();
	}
	public void setDserhis(String dserhis) {
		this.dserhis = dserhis;
	}
	public String getDserhis() {
		return dserhis.trim();
	}
	public void setId(DserPK id) {
		this.id = id;
	}
	public DserPK getId() {
		return id;
	}


}
