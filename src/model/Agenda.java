package model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import model.common.AbstractEntity;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

@Entity
public class Agenda extends AbstractEntity {		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	@Id      
	@Basic(optional = false)
	@NotNull
	@Column(name = "agdcod")
	private Integer id;
	@Length(max = 40)	
	@NotNull	
	@Column(name = "agdnome")
	private String agdnome;	
	@Length(max = 40)
	@Column(name = "agdend")
	private String agdend;
	@Length(max = 30)
	@Column(name = "agdbai")
	private String agdbai;
	@Length(max = 30)
	@Column(name = "agdcid")
	private String agdcid;
	@Length(max = 2)
	@Column(name = "agduf")
	private String agduf;
	@Column(name = "agdcep")
	private Integer agdcep;
	@Length(max = 100)
	@Column(name = "agdemail")
	private String agdemail;
	@Length(max = 100)
	@Column(name = "agdsite")  
	private String agdsite;
	@Length(max = 30)	
	@Column(name = "agdativ")
	private String agdativ;
	@Length(max = 2)
	@Column(name = "agduf1")
	private String agduf1;
	@Length(max = 2)
	@Column(name = "agduf2")
	private String agduf2;
	@Length(max = 2)
	@Column(name = "agduf3")
	private String agduf3;
	@Column(name = "agdtel1")
	private Integer agdtel1;
	@Column(name = "agdtel2")
	private Integer agdtel2;
	@Column(name = "agdtel3")
	private Integer agdtel3;
	@Length(max = 4)
	@Column(name = "agdddd1")
	private String agdddd1;
	@Length(max = 4)
	@Column(name = "agdddd2")
	private String agdddd2;
	@Length(max = 4)
	@Column(name = "agdddd3")
	private String agdddd3;
	@Length(max = 100)
	@Column(name = "agdcont1")
	private String agdcont1;
	@Length(max = 100)
	@Column(name = "agdcont2")
	private String agdcont2;
	@Length(max = 100)
	@Column(name = "agdcont3")
	private String agdcont3;
	@Column(name = "dmdcod")
	private Integer dmdcod;
	@Length(max = 1000)
	@Column(name = "agdobs")
	private String agdobs;
	@Column(name = "agddtalt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date agddtalt;
	@Column(name = "agdusr")
	private Short agdusr;
	@Length(max = 2)
	@Column(name = "agduf4")
	private String agduf4;
	@Length(max = 2)
	@Column(name = "agduf5")
	private String agduf5;
	@Column(name = "agdtel4")
	private Integer agdtel4;
	@Column(name = "agdtel5")
	private Integer agdtel5;
	@Length(max = 4)
	@Column(name = "agdddd4")
	private String agdddd4;
	@Length(max = 4)
	@Column(name = "agdddd5")
	private String agdddd5;
	@Length(max = 100)
	@Column(name = "agdcont4")
	private String agdcont4;
	@Length(max = 100)
	@Column(name = "agdcont5")
	private String agdcont5;
	@Length(max = 200)
	@Column(name = "agdobs2")
	private String agdobs2;
	@Column(name = "agdRPL")
	private Short agdRPL;
	@Length(max = 10)
	@Column(name = "agdEndNr")
	private String agdEndNr;
	@Length(max = 20)
	@Column(name = "agdEndCompl")
	private String agdEndCompl;


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAgdnome() {
		return agdnome;
	}
	public void setAgdnome(String agdnome) {
		this.agdnome = agdnome;
	}
	public String getAgdend() {
		return agdend;
	}
	public void setAgdend(String agdend) {
		this.agdend = agdend;
	}
	public String getAgdbai() { 
		return agdbai;
	}
	public void setAgdbai(String agdbai) {
		this.agdbai = agdbai;
	}
	public String getAgdcid() {
		return agdcid;
	}
	public void setAgdcid(String agdcid) {
		this.agdcid = agdcid;
	}
	public String getAgduf() {
		return agduf;
	}
	public void setAgduf(String agduf) {
		this.agduf = agduf;
	}
	public Integer getAgdcep() {
		return agdcep;
	}
	public void setAgdcep(Integer agdcep) {
		this.agdcep = agdcep;
	}
	public String getAgdemail() {
		return agdemail;
	}
	public void setAgdemail(String agdemail) {
		this.agdemail = agdemail;
	}
	public String getAgdsite() {
		return agdsite;
	}
	public void setAgdsite(String agdsite) {
		this.agdsite = agdsite;
	}
	public String getAgdativ() {
		return agdativ;
	}
	public void setAgdativ(String agdativ) {
		this.agdativ = agdativ;
	}
	public String getAgduf1() {
		return agduf1;
	}
	public void setAgduf1(String agduf1) {
		this.agduf1 = agduf1;
	}
	public String getAgduf2() {
		return agduf2;
	}
	public void setAgduf2(String agduf2) {
		this.agduf2 = agduf2;
	}
	public String getAgduf3() {
		return agduf3;
	}
	public void setAgduf3(String agduf3) {
		this.agduf3 = agduf3;
	}
	public Integer getAgdtel1() { 
		return agdtel1;
	}
	public void setAgdtel1(Integer agdtel1) {
		this.agdtel1 = agdtel1;
	}
	public Integer getAgdtel2() {
		return agdtel2;
	}
	public void setAgdtel2(Integer agdtel2) {
		this.agdtel2 = agdtel2;
	}
	public Integer getAgdtel3() {
		return agdtel3;
	}
	public void setAgdtel3(Integer agdtel3) {
		this.agdtel3 = agdtel3;
	}
	public String getAgdddd1() {
		return agdddd1;
	}
	public void setAgdddd1(String agdddd1) {
		this.agdddd1 = agdddd1;
	}
	public String getAgdddd2() {
		return agdddd2;
	}
	public void setAgdddd2(String agdddd2) {
		this.agdddd2 = agdddd2;
	}
	public String getAgdddd3() {
		return agdddd3;
	}
	public void setAgdddd3(String agdddd3) {
		this.agdddd3 = agdddd3;
	}
	public String getAgdcont1() {
		return agdcont1;
	}
	public void setAgdcont1(String agdcont1) {
		this.agdcont1 = agdcont1;
	}
	public String getAgdcont2() {
		return agdcont2;
	}
	public void setAgdcont2(String agdcont2) {
		this.agdcont2 = agdcont2;
	}
	public String getAgdcont3() {
		return agdcont3;
	}
	public void setAgdcont3(String agdcont3) {
		this.agdcont3 = agdcont3;
	}
	public Integer getDmdcod() {
		return dmdcod;
	}
	public void setDmdcod(Integer dmdcod) {
		this.dmdcod = dmdcod;
	}
	public String getAgdobs() {
		return agdobs;
	}
	public void setAgdobs(String agdobs) {
		this.agdobs = agdobs;
	}
	public Date getAgddtalt() {
		return agddtalt;
	}
	public void setAgddtalt(Date agddtalt) {
		this.agddtalt = agddtalt;
	}
	public Short getAgdusr() {
		return agdusr;
	}
	public void setAgdusr(Short agdusr) {
		this.agdusr = agdusr;
	}
	public String getAgduf4() {
		return agduf4;
	}
	public void setAgduf4(String agduf4) {
		this.agduf4 = agduf4;
	}
	public String getAgduf5() {
		return agduf5;
	}
	public void setAgduf5(String agduf5) {
		this.agduf5 = agduf5;
	}
	public Integer getAgdtel4() {
		return agdtel4;
	}
	public void setAgdtel4(Integer agdtel4) {
		this.agdtel4 = agdtel4;
	}
	public Integer getAgdtel5() {
		return agdtel5;
	}
	public void setAgdtel5(Integer agdtel5) {
		this.agdtel5 = agdtel5;
	}
	public String getAgdddd4() {
		return agdddd4;
	}
	public void setAgdddd4(String agdddd4) {
		this.agdddd4 = agdddd4;
	}
	public String getAgdddd5() {
		return agdddd5;
	}
	public void setAgdddd5(String agdddd5) {
		this.agdddd5 = agdddd5;
	}
	public String getAgdcont4() {
		return agdcont4;
	}
	public void setAgdcont4(String agdcont4) {
		this.agdcont4 = agdcont4;
	}
	public String getAgdcont5() {
		return agdcont5;
	}
	public void setAgdcont5(String agdcont5) {
		this.agdcont5 = agdcont5;
	}
	public String getAgdobs2() {
		return agdobs2;
	}
	public void setAgdobs2(String agdobs2) {
		this.agdobs2 = agdobs2;
	}
	public Short getAgdRPL() {
		return agdRPL;
	}
	public void setAgdRPL(Short agdRPL) {
		this.agdRPL = agdRPL;
	}
	public String getAgdEndNr() {
		return agdEndNr;
	}
	public void setAgdEndNr(String agdEndNr) {
		this.agdEndNr = agdEndNr;
	}
	public String getAgdEndCompl() {
		return agdEndCompl;
	}
	public void setAgdEndCompl(String agdEndCompl) {
		this.agdEndCompl = agdEndCompl;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
