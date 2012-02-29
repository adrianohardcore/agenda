package model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import model.common.AbstractEntity;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

@Entity
@Table(name = "DUSR")
public class Dusr extends AbstractEntity { 
	private static final long serialVersionUID = 1L;
	
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrcod")
    private Short id;
    @Basic(optional = false)
    @NotNull
    @Length( max = 20)
    @Column(name = "dusrnome")
    private String dusrnome;
    @Basic(optional = false)
    @NotNull
    @Length( max = 10)
    @Column(name = "dusrsenha")
    private String dusrsenha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrdtnas")
    @Temporal(TemporalType.TIMESTAMP)    
    private Date dusrdtnas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrstabl")
    private char dusrstabl;
    @Basic(optional = false)
    @NotNull
    @Length( max = 40)
    @Column(name = "dusrend")
    private String dusrend;
    @Basic(optional = false)
    @NotNull
    @Length( max = 30)
    @Column(name = "dusrbai")
    private String dusrbai;
    @Basic(optional = false)
    @NotNull
    @Length( max = 30)
    @Column(name = "dusrcid")
    private String dusrcid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrcep")
    private int dusrcep;
    @Basic(optional = false)
    @NotNull
    @Length( max = 4)
    @Column(name = "dusrddd")
    private String dusrddd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrtel")
    private int dusrtel;
    @Basic(optional = false)
    @NotNull
    @Length( max = 60)
    @Column(name = "dusresp")
    private String dusresp;
    @Basic(optional = false)
    @NotNull
    @Length(max = 120)
    @Column(name = "dusrobs")
    private String dusrobs;
    @Basic(optional = false)
    @NotNull
    @Length( max = 14)
    @Column(name = "dusrCPF")
    private String dusrCPF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrHab")
    private char dusrHab;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrRepB")
    private int dusrRepB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrEstB")
    private short dusrEstB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrdtalt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dusrdtalt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrusr")
    private short dusrusr;
    @Basic(optional = false)
    @NotNull
    @Length( max = 40)
    @Column(name = "dusrnomec")
    private String dusrnomec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrCaixa")
    private short dusrCaixa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrLocal")
    private int dusrLocal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrPar1")
    private short dusrPar1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrPar2")
    private short dusrPar2;
    @Basic(optional = false)
    @NotNull
    @Length(max = 300)
    @Column(name = "dusrMsg")
    private String dusrMsg;
    @Basic(optional = false)
    @NotNull
    @Length( max = 20)
    @Column(name = "dusrEspec")
    private String dusrEspec;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrPdescto")
    private BigDecimal dusrPdescto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrSerial")
    private int dusrSerial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrPar3")
    private BigDecimal dusrPar3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrpar4")
    private short dusrpar4;
    @Basic(optional = false)
    @NotNull
    @Length( max = 20)
    @Column(name = "dusrpar5")
    private String dusrpar5;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrRPL")
    private short dusrRPL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrXestB")
    private short dusrXestB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrEstB2")
    private short dusrEstB2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrEstB3")
    private short dusrEstB3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrMtip")
    private char dusrMtip;
    @Basic(optional = false)
    @NotNull
    @Length( max = 2)
    @Column(name = "dusrUF")
    private String dusrUF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrHabVal")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dusrHabVal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrPDV")
    private short dusrPDV;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrdtacessoU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dusrdtacessoU;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrnrECF")
    private short dusrnrECF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrXemp")
    private short dusrXemp;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "dusrFotoB")
    private byte[] dusrFotoB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrGav01")
    private short dusrGav01;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrdtadm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dusrdtadm;
    @Basic(optional = false)
    @NotNull
    @Length( max = 4)
    @Column(name = "dusrFotoBext")
    private String dusrFotoBext;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrAEprof")
    private int dusrAEprof;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrConect01")
    private short dusrConect01;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrAEacervoB")
    private short dusrAEacervoB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrXAEacervoB")
    private short dusrXAEacervoB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrCcusto")
    private short dusrCcusto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrCdepto")
    private short dusrCdepto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrMTAB")
    private short dusrMTAB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrMatTransfEst")
    private short dusrMatTransfEst;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrMatTransfDep")
    private int dusrMatTransfDep;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrMatGer")
    private int dusrMatGer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrRPLb")
    private short dusrRPLb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrSACGer")
    private short dusrSACGer;
    @Basic(optional = false)
    @NotNull
    @Length(max = 10)
    @Column(name = "dusrEndNr")
    private String dusrEndNr;
    @Basic(optional = false)
    @NotNull
    @Length(max = 20)
    @Column(name = "dusrEndCompl")
    private String dusrEndCompl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrDiasRetroativo")
    private short dusrDiasRetroativo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrDiasPosterior")
    private short dusrDiasPosterior;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dusrPerfil")
    private short dusrPerfil;

    
    
    
    
	public Short getId() {
		return id;
	}
	
	public String getDusrnome() {
		return dusrnome.trim();
	}
	
	public String getDusrsenha() {
		return dusrsenha;
	}
	
	public Date getDusrdtnas() {		
		return dusrdtnas;
	}
	
	public char getDusrstabl() {
		return dusrstabl;
	}
	
	public String getDusrend() {
		return dusrend.trim();
	}
	
	public String getDusrbai() {
		return dusrbai.trim();
	}
	
	public String getDusrcid() {
		return dusrcid.trim();
	}
	
	public int getDusrcep() {
		return dusrcep;
	}
	
	public String getDusrddd() {
		return dusrddd.trim();
	}
	
	public int getDusrtel() {
		return dusrtel;
	}
	
	public String getDusresp() {
		return dusresp.trim();
	}
	
	public String getDusrobs() {
		return dusrobs.trim();
	}
	
	public String getDusrCPF() {
		return dusrCPF.trim();
	}
	
	public char getDusrHab() {
		return dusrHab;
	}
	
	public int getDusrRepB() {
		return dusrRepB;
	}
	
	public short getDusrEstB() {
		return dusrEstB;
	}
	
	public Date getDusrdtalt() {
		return dusrdtalt;
	}
	
	public short getDusrusr() {
		return dusrusr;
	}
	
	public String getDusrnomec() {
		return dusrnomec.trim();
	}
	
	public short getDusrCaixa() {
		return dusrCaixa;
	}
	
	public int getDusrLocal() {
		return dusrLocal;
	}
	
	public short getDusrPar1() {
		return dusrPar1;
	}
	
	public short getDusrPar2() {
		return dusrPar2;
	}
	
	public String getDusrMsg() {
		return dusrMsg.trim();
	}
	
	public String getDusrEspec() {
		return dusrEspec.trim();
	}
	
	public BigDecimal getDusrPdescto() {
		return dusrPdescto;
	}
	
	public int getDusrSerial() {
		return dusrSerial;
	}
	
	public BigDecimal getDusrPar3() {
		return dusrPar3;
	}
	
	public short getDusrpar4() {
		return dusrpar4;
	}
	
	public String getDusrpar5() {
		return dusrpar5.trim();
	}
	
	public short getDusrRPL() {
		return dusrRPL;
	}
	
	public short getDusrXestB() {
		return dusrXestB;
	}
	
	public short getDusrEstB2() {
		return dusrEstB2;
	}
	
	public short getDusrEstB3() {
		return dusrEstB3;
	}
	
	public char getDusrMtip() {
		return dusrMtip;
	}
	
	public String getDusrUF() {
		return dusrUF.trim();
	}
	
	public Date getDusrHabVal() {
		return dusrHabVal;
	}
	
	public short getDusrPDV() {
		return dusrPDV;
	}
	
	public Date getDusrdtacessoU() {
		return dusrdtacessoU;
	}
	
	public short getDusrnrECF() {
		return dusrnrECF;
	}
	
	public short getDusrXemp() {
		return dusrXemp;
	}
	public short getDusrGav01() {
		return dusrGav01;
	}	
	public Date getDusrdtadm() {
		return dusrdtadm;
	}	
	public String getDusrFotoBext() {
		return dusrFotoBext.trim();
	}
	
	public int getDusrAEprof() {
		return dusrAEprof;
	}
	
	public short getDusrConect01() {
		return dusrConect01;
	}
	
	public short getDusrAEacervoB() {
		return dusrAEacervoB;
	}
	
	public short getDusrXAEacervoB() {
		return dusrXAEacervoB;
	}
	
	public short getDusrCcusto() {
		return dusrCcusto;
	}
	
	public short getDusrCdepto() {
		return dusrCdepto;
	}	
	public short getDusrMTAB() {
		return dusrMTAB;
	}
	
	public short getDusrMatTransfEst() {
		return dusrMatTransfEst;
	}
	
	public int getDusrMatTransfDep() {
		return dusrMatTransfDep;
	}
	
	public int getDusrMatGer() {
		return dusrMatGer;
	}
	
	public short getDusrRPLb() {
		return dusrRPLb;
	}
	
	public short getDusrSACGer() {
		return dusrSACGer;
	}
	
	public String getDusrEndNr() {
		return dusrEndNr.trim();
	}
	
	public String getDusrEndCompl() {
		return dusrEndCompl.trim();  
	}
	
	public short getDusrDiasRetroativo() {
		return dusrDiasRetroativo;
	}
	
	public short getDusrDiasPosterior() {
		return dusrDiasPosterior;
	}
	
	public short getDusrPerfil() {
		return dusrPerfil;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public byte[] getDusrFotoB() {
		return dusrFotoB;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public void setDusrnome(String dusrnome) {
		this.dusrnome = dusrnome;
	}

	public void setDusrsenha(String dusrsenha) {
		this.dusrsenha = dusrsenha;
	}

	public void setDusrdtnas(Date dusrdtnas) {
		this.dusrdtnas = dusrdtnas;
	}

	public void setDusrstabl(char dusrstabl) {
		this.dusrstabl = dusrstabl;
	}

	public void setDusrend(String dusrend) {
		this.dusrend = dusrend;
	}

	public void setDusrbai(String dusrbai) {
		this.dusrbai = dusrbai;
	}

	public void setDusrcid(String dusrcid) {
		this.dusrcid = dusrcid;
	}

	public void setDusrcep(int dusrcep) {
		this.dusrcep = dusrcep;
	}

	public void setDusrddd(String dusrddd) {
		this.dusrddd = dusrddd;
	}

	public void setDusrtel(int dusrtel) {
		this.dusrtel = dusrtel;
	}

	public void setDusresp(String dusresp) {
		this.dusresp = dusresp;
	}

	public void setDusrobs(String dusrobs) {
		this.dusrobs = dusrobs;
	}

	public void setDusrCPF(String dusrCPF) {
		this.dusrCPF = dusrCPF;
	}

	public void setDusrHab(char dusrHab) {
		this.dusrHab = dusrHab;
	}

	public void setDusrRepB(int dusrRepB) {
		this.dusrRepB = dusrRepB;
	}

	public void setDusrEstB(short dusrEstB) {
		this.dusrEstB = dusrEstB;
	}

	public void setDusrdtalt(Date dusrdtalt) {
		this.dusrdtalt = dusrdtalt;
	}

	public void setDusrusr(short dusrusr) {
		this.dusrusr = dusrusr;
	}

	public void setDusrnomec(String dusrnomec) {
		this.dusrnomec = dusrnomec;
	}

	public void setDusrCaixa(short dusrCaixa) {
		this.dusrCaixa = dusrCaixa;
	}

	public void setDusrLocal(int dusrLocal) {
		this.dusrLocal = dusrLocal;
	}

	public void setDusrPar1(short dusrPar1) {
		this.dusrPar1 = dusrPar1;
	}

	public void setDusrPar2(short dusrPar2) {
		this.dusrPar2 = dusrPar2;
	}

	public void setDusrMsg(String dusrMsg) {
		this.dusrMsg = dusrMsg;
	}

	public void setDusrEspec(String dusrEspec) {
		this.dusrEspec = dusrEspec;
	}

	public void setDusrPdescto(BigDecimal dusrPdescto) {
		this.dusrPdescto = dusrPdescto;
	}

	public void setDusrSerial(int dusrSerial) {
		this.dusrSerial = dusrSerial;
	}

	public void setDusrPar3(BigDecimal dusrPar3) {
		this.dusrPar3 = dusrPar3;
	}

	public void setDusrpar4(short dusrpar4) {
		this.dusrpar4 = dusrpar4;
	}

	public void setDusrpar5(String dusrpar5) {
		this.dusrpar5 = dusrpar5;
	}

	public void setDusrRPL(short dusrRPL) {
		this.dusrRPL = dusrRPL;
	}

	public void setDusrXestB(short dusrXestB) {
		this.dusrXestB = dusrXestB;
	}

	public void setDusrEstB2(short dusrEstB2) {
		this.dusrEstB2 = dusrEstB2;
	}

	public void setDusrEstB3(short dusrEstB3) {
		this.dusrEstB3 = dusrEstB3;
	}

	public void setDusrMtip(char dusrMtip) {
		this.dusrMtip = dusrMtip;
	}

	public void setDusrUF(String dusrUF) {
		this.dusrUF = dusrUF;
	}

	public void setDusrHabVal(Date dusrHabVal) {
		this.dusrHabVal = dusrHabVal;
	}

	public void setDusrPDV(short dusrPDV) {
		this.dusrPDV = dusrPDV;
	}

	public void setDusrdtacessoU(Date dusrdtacessoU) {
		this.dusrdtacessoU = dusrdtacessoU;
	}

	public void setDusrnrECF(short dusrnrECF) {
		this.dusrnrECF = dusrnrECF;
	}

	public void setDusrXemp(short dusrXemp) {
		this.dusrXemp = dusrXemp;
	}

	public void setDusrFotoB(byte[] dusrFotoB) {
		this.dusrFotoB = dusrFotoB;
	}

	public void setDusrGav01(short dusrGav01) {
		this.dusrGav01 = dusrGav01;
	}

	public void setDusrdtadm(Date dusrdtadm) {
		this.dusrdtadm = dusrdtadm;
	}

	public void setDusrFotoBext(String dusrFotoBext) {
		this.dusrFotoBext = dusrFotoBext;
	}

	public void setDusrAEprof(int dusrAEprof) {
		this.dusrAEprof = dusrAEprof;
	}

	public void setDusrConect01(short dusrConect01) {
		this.dusrConect01 = dusrConect01;
	}

	public void setDusrAEacervoB(short dusrAEacervoB) {
		this.dusrAEacervoB = dusrAEacervoB;
	}

	public void setDusrXAEacervoB(short dusrXAEacervoB) {
		this.dusrXAEacervoB = dusrXAEacervoB;
	}

	public void setDusrCcusto(short dusrCcusto) {
		this.dusrCcusto = dusrCcusto;
	}

	public void setDusrCdepto(short dusrCdepto) {
		this.dusrCdepto = dusrCdepto;
	}

	public void setDusrMTAB(short dusrMTAB) {
		this.dusrMTAB = dusrMTAB;
	}

	public void setDusrMatTransfEst(short dusrMatTransfEst) {
		this.dusrMatTransfEst = dusrMatTransfEst;
	}

	public void setDusrMatTransfDep(int dusrMatTransfDep) {
		this.dusrMatTransfDep = dusrMatTransfDep;
	}

	public void setDusrMatGer(int dusrMatGer) {
		this.dusrMatGer = dusrMatGer;
	}

	public void setDusrRPLb(short dusrRPLb) {
		this.dusrRPLb = dusrRPLb;
	}

	public void setDusrSACGer(short dusrSACGer) {
		this.dusrSACGer = dusrSACGer;
	}

	public void setDusrEndNr(String dusrEndNr) {
		this.dusrEndNr = dusrEndNr;
	}

	public void setDusrEndCompl(String dusrEndCompl) {
		this.dusrEndCompl = dusrEndCompl;
	}

	public void setDusrDiasRetroativo(short dusrDiasRetroativo) {
		this.dusrDiasRetroativo = dusrDiasRetroativo;
	}

	public void setDusrDiasPosterior(short dusrDiasPosterior) {
		this.dusrDiasPosterior = dusrDiasPosterior;
	}

	public void setDusrPerfil(short dusrPerfil) {
		this.dusrPerfil = dusrPerfil;
	}
}
