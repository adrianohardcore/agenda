package model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import model.common.AbstractEntity;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

@Entity
@Table(name = "DEST")
public class Dest extends AbstractEntity{
	private static final long serialVersionUID = 1L;
	
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "destcod")
    private Short id;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 40)
    @Column(name = "destnome")
    private String destnome;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 30)
    @Column(name = "destfan")
    private String destfan;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 30)
    @Column(name = "destfang")
    private String destfang;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destSIC")
    private char destSIC;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 1000)
    @Column(name = "destObs")
    private String destObs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destdtalt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date destdtalt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destusr")
    private short destusr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destImpFis")
    private short destImpFis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destImpRec")
    private short destImpRec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destbase")
    private short destbase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destdata")
    @Temporal(TemporalType.TIMESTAMP)
    private Date destdata;
    @Basic(optional = false)
    @NotNull
    @Column(name = "desthora")
    private int desthora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destdatah")
    @Temporal(TemporalType.TIMESTAMP)
    private Date destdatah;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destCCred")
    private short destCCred;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destCEstoq")
    private short destCEstoq;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "destFator")
    private BigDecimal destFator;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destFatMin")
    private long destFatMin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destImpPR01")
    private short destImpPR01;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destVP101")
    private short destVP101;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destImpCar")
    private short destImpCar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destPulaL")
    private short destPulaL;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 60)
    @Column(name = "destImpConf")
    private String destImpConf;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 60)
    @Column(name = "destImpPorta")
    private String destImpPorta;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 60)
    @Column(name = "destImpMsg")
    private String destImpMsg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destAPgch")
    private short destAPgch;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destIMP04")
    private short destIMP04;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destTPed")
    private short destTPed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destGdup")
    private short destGdup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destGfat")
    private short destGfat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destPmora")
    private BigDecimal destPmora;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 50)
    @Column(name = "destDirFotos")
    private String destDirFotos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destVrcarta")
    private BigDecimal destVrcarta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destAtraso")
    private short destAtraso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destJrsjr")
    private short destJrsjr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destcomVP")
    private char destcomVP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destDiasC")
    private short destDiasC;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 50)
    @Column(name = "destdom")
    private String destdom;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 50)
    @Column(name = "destEinfo")
    private String destEinfo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destVrHprod")
    private BigDecimal destVrHprod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destVrHrede")
    private BigDecimal destVrHrede;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destVrHcons")
    private BigDecimal destVrHcons;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 40)
    @Column(name = "destend")
    private String destend;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 30)
    @Column(name = "destbai")
    private String destbai;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 4)
    @Column(name = "destddd")
    private String destddd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "desttel")
    private int desttel;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 2)
    @Column(name = "destuf")
    private String destuf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destfax")
    private int destfax;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 9)
    @Column(name = "destcep")
    private String destcep;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 30)
    @Column(name = "destcid")
    private String destcid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destImpECF")
    private short destImpECF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destcodA")
    private int destcodA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destcodB")
    private int destcodB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destdtA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date destdtA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destdtB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date destdtB;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 10)
    @Column(name = "destAPcom")
    private String destAPcom;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 40)
    @Column(name = "destAPpar")
    private String destAPpar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destMdepcod")
    private int destMdepcod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destAltven")
    private short destAltven;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destMulta")
    private BigDecimal destMulta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destNFitens")
    private short destNFitens;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destmoeda")
    private short destmoeda;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 3)
    @Column(name = "destsmoeda")
    private String destsmoeda;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 60)
    @Column(name = "destNomeBib")
    private String destNomeBib;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destNBpreco")
    private short destNBpreco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destNBitens")
    private short destNBitens;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destPdescto")
    private BigDecimal destPdescto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destGav01")
    private short destGav01;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destTcobLaser")
    private short destTcobLaser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destGPdtcx")
    private short destGPdtcx;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 4)
    @Column(name = "destFotoExt")
    private String destFotoExt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destTxserv")
    private short destTxserv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destContGP")
    private short destContGP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destBibDres")
    private short destBibDres;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destIMPSDcli")
    private short destIMPSDcli;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destsomaDP")
    private short destsomaDP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destAEcent")
    private short destAEcent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destAEnotas")
    private short destAEnotas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destPrproVV")
    private short destPrproVV;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destTxVA")
    private short destTxVA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destVendExt")
    private short destVendExt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destIMPt01")
    private short destIMPt01;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destVestC")
    private short destVestC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destG112")
    private short destG112;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destAPpreco")
    private short destAPpreco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destAPdigCPF")
    private short destAPdigCPF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destAPdigDTv")
    private short destAPdigDTv;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 15)
    @Column(name = "destpalmS")
    private String destpalmS;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destPar26")
    private short destPar26;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 40)
    @Column(name = "destPar27")
    private String destPar27;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 40)
    @Column(name = "destMsgCab1")
    private String destMsgCab1;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 40)
    @Column(name = "destPar30")
    private String destPar30;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destMedidorPorta")
    private short destMedidorPorta;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 3)
    @Column(name = "destDAarq")
    private String destDAarq;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destPulaGP")
    private short destPulaGP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destAltDEP")
    private short destAltDEP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destBonusAP")
    private short destBonusAP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destTEF")
    private short destTEF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destLoteNF")
    private short destLoteNF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destDcliCPF")
    private short destDcliCPF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destEstNeg")
    private short destEstNeg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destDigQtde")
    private short destDigQtde;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destCOMatua")
    private short destCOMatua;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destTcusto")
    private short destTcusto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destDiasRec")
    private short destDiasRec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destRefazP")
    private short destRefazP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destPar38")
    private BigDecimal destPar38;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destRPL")
    private short destRPL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destLimVendas")
    private short destLimVendas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destPar40")
    private short destPar40;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destPar41")
    private short destPar41;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destPar42")
    private short destPar42;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destPar43")
    private short destPar43;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destGrupoEmp")
    private short destGrupoEmp;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 4)
    @Column(name = "destID")
    private String destID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destAtivo01")
    private short destAtivo01;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 10)
    @Column(name = "destEndNr")
    private String destEndNr;
    @Basic(optional = false)
    @NotNull
    @Length(min = 1, max = 20)
    @Column(name = "destEndCompl")
    private String destEndCompl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destMedidorTipo")
    private short destMedidorTipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destpar1")
    private short destpar1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destpar50")
    private short destpar50;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destpar51")
    private short destpar51;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destpar52")
    private short destpar52;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destpar53")
    private short destpar53;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destpar54")
    private short destpar54;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destpar55")
    private int destpar55;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destpar56")
    private BigDecimal destpar56;
    
    
	public Short getId() {
		return id;
	}
	public void setId(Short id) {
		this.id = id;
	}
	public String getDestnome() {
		return destnome;
	}
	public void setDestnome(String destnome) {
		this.destnome = destnome;
	}
	public String getDestfan() {
		return destfan;
	}
	public void setDestfan(String destfan) {
		this.destfan = destfan;
	}
	public String getDestfang() {
		return destfang;
	}
	public void setDestfang(String destfang) {
		this.destfang = destfang;
	}
	public char getDestSIC() {
		return destSIC;
	}
	public void setDestSIC(char destSIC) {
		this.destSIC = destSIC;
	}
	public String getDestObs() {
		return destObs;
	}
	public void setDestObs(String destObs) {
		this.destObs = destObs;
	}
	public Date getDestdtalt() {
		return destdtalt;
	}
	public void setDestdtalt(Date destdtalt) {
		this.destdtalt = destdtalt;
	}
	public short getDestusr() {
		return destusr;
	}
	public void setDestusr(short destusr) {
		this.destusr = destusr;
	}
	public short getDestImpFis() {		
		return destImpFis;
	}
	public void setDestImpFis(short destImpFis) {
		this.destImpFis = destImpFis;
	}
	public short getDestImpRec() {
		return destImpRec;
	}
	public void setDestImpRec(short destImpRec) {
		this.destImpRec = destImpRec;
	}
	public short getDestbase() {
		return destbase;
	}
	public void setDestbase(short destbase) {
		this.destbase = destbase;
	}
	public Date getDestdata() {
		return destdata;
	}
	public void setDestdata(Date destdata) {
		this.destdata = destdata;
	}
	public int getDesthora() {
		return desthora;
	}
	public void setDesthora(int desthora) {
		this.desthora = desthora;
	}
	public Date getDestdatah() {
		return destdatah;
	}
	public void setDestdatah(Date destdatah) {
		this.destdatah = destdatah;
	}
	public short getDestCCred() {
		return destCCred;
	}
	public void setDestCCred(short destCCred) {
		this.destCCred = destCCred;
	}
	public short getDestCEstoq() {
		return destCEstoq;
	}
	public void setDestCEstoq(short destCEstoq) {
		this.destCEstoq = destCEstoq;
	}
	public BigDecimal getDestFator() {
		return destFator;
	}
	public void setDestFator(BigDecimal destFator) {
		this.destFator = destFator;
	}
	public long getDestFatMin() {
		return destFatMin;
	}
	public void setDestFatMin(long destFatMin) {
		this.destFatMin = destFatMin;
	}
	public short getDestImpPR01() {
		return destImpPR01;
	}
	public void setDestImpPR01(short destImpPR01) {
		this.destImpPR01 = destImpPR01;
	}
	public short getDestVP101() {
		return destVP101;
	}
	public void setDestVP101(short destVP101) {
		this.destVP101 = destVP101;
	}
	public short getDestImpCar() {
		return destImpCar;
	}
	public void setDestImpCar(short destImpCar) {
		this.destImpCar = destImpCar;
	}
	public short getDestPulaL() {
		return destPulaL;
	}
	public void setDestPulaL(short destPulaL) {
		this.destPulaL = destPulaL;
	}
	public String getDestImpConf() {
		return destImpConf;
	}
	public void setDestImpConf(String destImpConf) {
		this.destImpConf = destImpConf;
	}
	public String getDestImpPorta() {
		return destImpPorta;
	}
	public void setDestImpPorta(String destImpPorta) {
		this.destImpPorta = destImpPorta;
	}
	public String getDestImpMsg() {
		return destImpMsg;
	}
	public void setDestImpMsg(String destImpMsg) {
		this.destImpMsg = destImpMsg;
	}
	public short getDestAPgch() {
		return destAPgch;
	}
	public void setDestAPgch(short destAPgch) {
		this.destAPgch = destAPgch;
	}
	public short getDestIMP04() {
		return destIMP04;
	}
	public void setDestIMP04(short destIMP04) {
		this.destIMP04 = destIMP04;
	}
	public short getDestTPed() {
		return destTPed;
	}
	public void setDestTPed(short destTPed) {
		this.destTPed = destTPed;
	}
	public short getDestGdup() {
		return destGdup;
	}
	public void setDestGdup(short destGdup) {
		this.destGdup = destGdup;
	}
	public short getDestGfat() {
		return destGfat;
	}
	public void setDestGfat(short destGfat) {
		this.destGfat = destGfat;
	}
	public BigDecimal getDestPmora() {
		return destPmora;
	}
	public void setDestPmora(BigDecimal destPmora) {
		this.destPmora = destPmora;
	}
	public String getDestDirFotos() {
		return destDirFotos;
	}
	public void setDestDirFotos(String destDirFotos) {
		this.destDirFotos = destDirFotos;
	}
	public BigDecimal getDestVrcarta() {
		return destVrcarta;
	}
	public void setDestVrcarta(BigDecimal destVrcarta) {
		this.destVrcarta = destVrcarta;
	}
	public short getDestAtraso() {
		return destAtraso;
	}
	public void setDestAtraso(short destAtraso) {
		this.destAtraso = destAtraso;
	}
	public short getDestJrsjr() {
		return destJrsjr;
	}
	public void setDestJrsjr(short destJrsjr) {
		this.destJrsjr = destJrsjr;
	}
	public char getDestcomVP() {
		return destcomVP;
	}
	public void setDestcomVP(char destcomVP) {
		this.destcomVP = destcomVP;
	}
	public short getDestDiasC() {
		return destDiasC;
	}
	public void setDestDiasC(short destDiasC) {
		this.destDiasC = destDiasC;
	}
	public String getDestdom() {
		return destdom;
	}
	public void setDestdom(String destdom) {
		this.destdom = destdom;
	}
	public String getDestEinfo() {
		return destEinfo;
	}
	public void setDestEinfo(String destEinfo) {
		this.destEinfo = destEinfo;
	}
	public BigDecimal getDestVrHprod() {
		return destVrHprod;
	}
	public void setDestVrHprod(BigDecimal destVrHprod) {
		this.destVrHprod = destVrHprod;
	}
	public BigDecimal getDestVrHrede() {
		return destVrHrede;
	}
	public void setDestVrHrede(BigDecimal destVrHrede) {
		this.destVrHrede = destVrHrede;
	}
	public BigDecimal getDestVrHcons() {
		return destVrHcons;
	}
	public void setDestVrHcons(BigDecimal destVrHcons) {
		this.destVrHcons = destVrHcons;
	}
	public String getDestend() {
		return destend;
	}
	public void setDestend(String destend) {
		this.destend = destend;
	}
	public String getDestbai() {
		return destbai;
	}
	public void setDestbai(String destbai) {
		this.destbai = destbai;
	}
	public String getDestddd() {
		return destddd;
	}
	public void setDestddd(String destddd) {
		this.destddd = destddd;
	}
	public int getDesttel() {
		return desttel;
	}
	public void setDesttel(int desttel) {
		this.desttel = desttel;
	}
	public String getDestuf() {
		return destuf;
	}
	public void setDestuf(String destuf) {
		this.destuf = destuf;
	}
	public int getDestfax() {
		return destfax;
	}
	public void setDestfax(int destfax) {
		this.destfax = destfax;
	}
	public String getDestcep() {
		return destcep;
	}
	public void setDestcep(String destcep) {
		this.destcep = destcep;
	}
	public String getDestcid() {
		return destcid;
	}
	public void setDestcid(String destcid) {
		this.destcid = destcid;
	}
	public short getDestImpECF() {
		return destImpECF;
	}
	public void setDestImpECF(short destImpECF) {
		this.destImpECF = destImpECF;
	}
	public int getDestcodA() {
		return destcodA;
	}
	public void setDestcodA(int destcodA) {
		this.destcodA = destcodA;
	}
	public int getDestcodB() {
		return destcodB;
	}
	public void setDestcodB(int destcodB) {
		this.destcodB = destcodB;
	}
	public Date getDestdtA() {
		return destdtA;
	}
	public void setDestdtA(Date destdtA) {
		this.destdtA = destdtA;
	}
	public Date getDestdtB() {
		return destdtB;
	}
	public void setDestdtB(Date destdtB) {
		this.destdtB = destdtB;
	}
	public String getDestAPcom() {
		return destAPcom;
	}
	public void setDestAPcom(String destAPcom) {
		this.destAPcom = destAPcom;
	}
	public String getDestAPpar() {
		return destAPpar;
	}
	public void setDestAPpar(String destAPpar) {
		this.destAPpar = destAPpar;
	}
	public int getDestMdepcod() {
		return destMdepcod;
	}
	public void setDestMdepcod(int destMdepcod) {
		this.destMdepcod = destMdepcod;
	}
	public short getDestAltven() {
		return destAltven;
	}
	public void setDestAltven(short destAltven) {
		this.destAltven = destAltven;
	}
	public BigDecimal getDestMulta() {
		return destMulta;
	}
	public void setDestMulta(BigDecimal destMulta) {
		this.destMulta = destMulta;
	}
	public short getDestNFitens() {
		return destNFitens;
	}
	public void setDestNFitens(short destNFitens) {
		this.destNFitens = destNFitens;
	}
	public short getDestmoeda() {
		return destmoeda;
	}
	public void setDestmoeda(short destmoeda) {
		this.destmoeda = destmoeda;
	}
	public String getDestsmoeda() {
		return destsmoeda;
	}
	public void setDestsmoeda(String destsmoeda) {
		this.destsmoeda = destsmoeda;
	}
	public String getDestNomeBib() {
		return destNomeBib;
	}
	public void setDestNomeBib(String destNomeBib) {
		this.destNomeBib = destNomeBib;
	}
	public short getDestNBpreco() {
		return destNBpreco;
	}
	public void setDestNBpreco(short destNBpreco) {
		this.destNBpreco = destNBpreco;
	}
	public short getDestNBitens() {
		return destNBitens;
	}
	public void setDestNBitens(short destNBitens) {
		this.destNBitens = destNBitens;
	}
	public BigDecimal getDestPdescto() {
		return destPdescto;
	}
	public void setDestPdescto(BigDecimal destPdescto) {
		this.destPdescto = destPdescto;
	}
	public short getDestGav01() {
		return destGav01;
	}
	public void setDestGav01(short destGav01) {
		this.destGav01 = destGav01;
	}
	public short getDestTcobLaser() {
		return destTcobLaser;
	}
	public void setDestTcobLaser(short destTcobLaser) {
		this.destTcobLaser = destTcobLaser;
	}
	public short getDestGPdtcx() {
		return destGPdtcx;
	}
	public void setDestGPdtcx(short destGPdtcx) {
		this.destGPdtcx = destGPdtcx;
	}
	public String getDestFotoExt() {
		return destFotoExt;
	}
	public void setDestFotoExt(String destFotoExt) {
		this.destFotoExt = destFotoExt;
	}
	public short getDestTxserv() {
		return destTxserv;
	}
	public void setDestTxserv(short destTxserv) {
		this.destTxserv = destTxserv;
	}
	public short getDestContGP() {
		return destContGP;
	}
	public void setDestContGP(short destContGP) {
		this.destContGP = destContGP;
	}
	public short getDestBibDres() {
		return destBibDres;
	}
	public void setDestBibDres(short destBibDres) {
		this.destBibDres = destBibDres;
	}
	public short getDestIMPSDcli() {
		return destIMPSDcli;
	}
	public void setDestIMPSDcli(short destIMPSDcli) {
		this.destIMPSDcli = destIMPSDcli;
	}
	public short getDestsomaDP() {
		return destsomaDP;
	}
	public void setDestsomaDP(short destsomaDP) {
		this.destsomaDP = destsomaDP;
	}
	public short getDestAEcent() {
		return destAEcent;
	}
	public void setDestAEcent(short destAEcent) {
		this.destAEcent = destAEcent;
	}
	public short getDestAEnotas() {
		return destAEnotas;
	}
	public void setDestAEnotas(short destAEnotas) {
		this.destAEnotas = destAEnotas;
	}
	public short getDestPrproVV() {
		return destPrproVV;
	}
	public void setDestPrproVV(short destPrproVV) {
		this.destPrproVV = destPrproVV;
	}
	public short getDestTxVA() {
		return destTxVA;
	}
	public void setDestTxVA(short destTxVA) {
		this.destTxVA = destTxVA;
	}
	public short getDestVendExt() {
		return destVendExt;
	}
	public void setDestVendExt(short destVendExt) {
		this.destVendExt = destVendExt;
	}
	public short getDestIMPt01() {
		return destIMPt01;
	}
	public void setDestIMPt01(short destIMPt01) {
		this.destIMPt01 = destIMPt01;
	}
	public short getDestVestC() {
		return destVestC;
	}
	public void setDestVestC(short destVestC) {
		this.destVestC = destVestC;
	}
	public short getDestG112() {
		return destG112;
	}
	public void setDestG112(short destG112) {
		this.destG112 = destG112;
	}
	public short getDestAPpreco() {
		return destAPpreco;
	}
	public void setDestAPpreco(short destAPpreco) {
		this.destAPpreco = destAPpreco;
	}
	public short getDestAPdigCPF() {
		return destAPdigCPF;
	}
	public void setDestAPdigCPF(short destAPdigCPF) {
		this.destAPdigCPF = destAPdigCPF;
	}
	public short getDestAPdigDTv() {
		return destAPdigDTv;
	}
	public void setDestAPdigDTv(short destAPdigDTv) {
		this.destAPdigDTv = destAPdigDTv;
	}
	public String getDestpalmS() {
		return destpalmS;
	}
	public void setDestpalmS(String destpalmS) {
		this.destpalmS = destpalmS;
	}
	public short getDestPar26() {
		return destPar26;
	}
	public void setDestPar26(short destPar26) {
		this.destPar26 = destPar26;
	}
	public String getDestPar27() {
		return destPar27;
	}
	public void setDestPar27(String destPar27) {
		this.destPar27 = destPar27;
	}
	public String getDestMsgCab1() {
		return destMsgCab1;
	}
	public void setDestMsgCab1(String destMsgCab1) {
		this.destMsgCab1 = destMsgCab1;
	}
	public String getDestPar30() {
		return destPar30;
	}
	public void setDestPar30(String destPar30) {
		this.destPar30 = destPar30;
	}
	public short getDestMedidorPorta() {
		return destMedidorPorta;
	}
	public void setDestMedidorPorta(short destMedidorPorta) {
		this.destMedidorPorta = destMedidorPorta;
	}
	public String getDestDAarq() {
		return destDAarq;
	}
	public void setDestDAarq(String destDAarq) {
		this.destDAarq = destDAarq;
	}
	public short getDestPulaGP() {
		return destPulaGP;
	}
	public void setDestPulaGP(short destPulaGP) {
		this.destPulaGP = destPulaGP;
	}
	public short getDestAltDEP() {
		return destAltDEP;
	}
	public void setDestAltDEP(short destAltDEP) {
		this.destAltDEP = destAltDEP;
	}
	public short getDestBonusAP() {
		return destBonusAP;
	}
	public void setDestBonusAP(short destBonusAP) {
		this.destBonusAP = destBonusAP;
	}
	public short getDestTEF() {
		return destTEF;
	}
	public void setDestTEF(short destTEF) {
		this.destTEF = destTEF;
	}
	public short getDestLoteNF() {
		return destLoteNF;
	}
	public void setDestLoteNF(short destLoteNF) {
		this.destLoteNF = destLoteNF;
	}
	public short getDestDcliCPF() {
		return destDcliCPF;
	}
	public void setDestDcliCPF(short destDcliCPF) {
		this.destDcliCPF = destDcliCPF;
	}
	public short getDestEstNeg() {
		return destEstNeg;
	}
	public void setDestEstNeg(short destEstNeg) {
		this.destEstNeg = destEstNeg;
	}
	public short getDestDigQtde() {
		return destDigQtde;
	}
	public void setDestDigQtde(short destDigQtde) {
		this.destDigQtde = destDigQtde;
	}
	public short getDestCOMatua() {
		return destCOMatua;
	}
	public void setDestCOMatua(short destCOMatua) {
		this.destCOMatua = destCOMatua;
	}
	public short getDestTcusto() {
		return destTcusto;
	}
	public void setDestTcusto(short destTcusto) {
		this.destTcusto = destTcusto;
	}
	public short getDestDiasRec() {
		return destDiasRec;
	}
	public void setDestDiasRec(short destDiasRec) {
		this.destDiasRec = destDiasRec;
	}
	public short getDestRefazP() {
		return destRefazP;
	}
	public void setDestRefazP(short destRefazP) {
		this.destRefazP = destRefazP;
	}
	public BigDecimal getDestPar38() {
		return destPar38;
	}
	public void setDestPar38(BigDecimal destPar38) {
		this.destPar38 = destPar38;
	}
	public short getDestRPL() {
		return destRPL;
	}
	public void setDestRPL(short destRPL) {
		this.destRPL = destRPL;
	}
	public short getDestLimVendas() {
		return destLimVendas;
	}
	public void setDestLimVendas(short destLimVendas) {
		this.destLimVendas = destLimVendas;
	}
	public short getDestPar40() {
		return destPar40;
	}
	public void setDestPar40(short destPar40) {
		this.destPar40 = destPar40;
	}
	public short getDestPar41() {
		return destPar41;
	}
	public void setDestPar41(short destPar41) {
		this.destPar41 = destPar41;
	}
	public short getDestPar42() {
		return destPar42;
	}
	public void setDestPar42(short destPar42) {
		this.destPar42 = destPar42;
	}
	public short getDestPar43() {
		return destPar43;
	}
	public void setDestPar43(short destPar43) {
		this.destPar43 = destPar43;
	}
	public short getDestGrupoEmp() {
		return destGrupoEmp;
	}
	public void setDestGrupoEmp(short destGrupoEmp) {
		this.destGrupoEmp = destGrupoEmp;
	}
	public String getDestID() {
		return destID;
	}
	public void setDestID(String destID) {
		this.destID = destID;
	}
	public short getDestAtivo01() {
		return destAtivo01;
	}
	public void setDestAtivo01(short destAtivo01) {
		this.destAtivo01 = destAtivo01;
	}
	public String getDestEndNr() {
		return destEndNr;
	}
	public void setDestEndNr(String destEndNr) {
		this.destEndNr = destEndNr;
	}
	public String getDestEndCompl() {
		return destEndCompl;
	}
	public void setDestEndCompl(String destEndCompl) {
		this.destEndCompl = destEndCompl;
	}
	public short getDestMedidorTipo() {
		return destMedidorTipo;
	}
	public void setDestMedidorTipo(short destMedidorTipo) {
		this.destMedidorTipo = destMedidorTipo;
	}
	public short getDestpar1() {
		return destpar1;
	}
	public void setDestpar1(short destpar1) {
		this.destpar1 = destpar1;
	}
	public short getDestpar50() {
		return destpar50;
	}
	public void setDestpar50(short destpar50) {
		this.destpar50 = destpar50;
	}
	public short getDestpar51() {
		return destpar51;
	}
	public void setDestpar51(short destpar51) {
		this.destpar51 = destpar51;
	}
	public short getDestpar52() {
		return destpar52;
	}
	public void setDestpar52(short destpar52) {
		this.destpar52 = destpar52;
	}
	public short getDestpar53() {
		return destpar53;
	}
	public void setDestpar53(short destpar53) {
		this.destpar53 = destpar53;
	}
	public short getDestpar54() {
		return destpar54;
	}
	public void setDestpar54(short destpar54) {
		this.destpar54 = destpar54;
	}
	public int getDestpar55() {
		return destpar55;
	}
	public void setDestpar55(int destpar55) {
		this.destpar55 = destpar55;
	}
	public BigDecimal getDestpar56() {
		return destpar56;
	}
	public void setDestpar56(BigDecimal destpar56) {
		this.destpar56 = destpar56;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
