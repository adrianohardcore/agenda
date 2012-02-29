package rules;

import java.math.BigDecimal;
import java.util.Date;

import component.UserSession;

import model.Dusr;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class DusrRules {	
	public Dusr novo() {
		Dusr dusr = new Dusr();		
		dusr.setId((short) 0);
		dusr.setDusrnome("");
		dusr.setDusrsenha("");
		dusr.setDusrdtnas(new Date());
		dusr.setDusrstabl(' ');
		dusr.setDusrend("");
		dusr.setDusrbai("");		
		dusr.setDusrcid("");
		dusr.setDusrcep(0);
		dusr.setDusrddd("");
		dusr.setDusrtel(0);
		dusr.setDusresp("");
		dusr.setDusrobs("");
		dusr.setDusrCPF("");
		dusr.setDusrHab(' ');
		dusr.setDusrRepB(0);
		dusr.setDusrEstB((short) 0);
		dusr.setDusrdtalt(new Date());
		dusr.setDusrusr((short) 0);
		dusr.setDusrnomec("");
		dusr.setDusrCaixa((short) 0);
		dusr.setDusrLocal(0);
		dusr.setDusrPar1((short) 0);
		dusr.setDusrPar2((short) 0);
		dusr.setDusrMsg("");
		dusr.setDusrEspec("");
		dusr.setDusrPdescto(new BigDecimal(0));
		dusr.setDusrSerial(0);
		dusr.setDusrPar3(new BigDecimal(0));
		dusr.setDusrpar4((short) 0);
		dusr.setDusrpar5("");
		dusr.setDusrRPL((short) 0);
		dusr.setDusrXestB((short) 0);
		dusr.setDusrEstB2((short) 0);
		dusr.setDusrEstB3((short) 0);
		dusr.setDusrMtip(' ');
		dusr.setDusrUF("");
		dusr.setDusrHabVal(new Date());
		dusr.setDusrPDV((short) 0);
		dusr.setDusrdtacessoU(new Date());
		dusr.setDusrnrECF((short) 0);
		dusr.setDusrXemp((short) 0);
		//dusr.setDusrFotoB(0);
		dusr.setDusrGav01((short) 0);
		dusr.setDusrdtadm(new Date());
		dusr.setDusrFotoBext("");
		dusr.setDusrAEprof(0);
		dusr.setDusrConect01((short) 0);
		dusr.setDusrAEacervoB((short) 0);
		dusr.setDusrXAEacervoB((short) 0);
		dusr.setDusrCcusto((short) 0);
		dusr.setDusrCdepto((short) 0);
		dusr.setDusrMTAB((short) 0);
		dusr.setDusrMatTransfEst((short) 0);
		dusr.setDusrMatTransfDep(0);
		dusr.setDusrMatGer(0);
		dusr.setDusrRPLb((short) 0);
		dusr.setDusrSACGer((short) 0);
		dusr.setDusrEndNr("");
		dusr.setDusrEndCompl("");
		dusr.setDusrDiasRetroativo((short) 0);
		dusr.setDusrDiasPosterior((short) 0);
		dusr.setDusrPerfil((short) 0);		
		return dusr;		
	}
	
	public Dusr atualizacao(Dusr dusr) {
		UserSession session = new UserSession();
		dusr.setDusrdtalt(new Date());
		//dusr.setDusrusr(session.getUser().getId());
		
		if(dusr.getDusrdtnas()== null){
			dusr.setDusrdtnas(new Date());
		}
		if(dusr.getDusrPdescto() == null){					
			dusr.setDusrPdescto(new BigDecimal(0));
		}
		if (dusr.getDusrPar3() == null){
			dusr.setDusrPar3(new BigDecimal(0));
		}		
		if (dusr.getDusrHabVal() == null ){
			dusr.setDusrHabVal(new Date());
		}
		if(dusr.getDusrdtacessoU ()== null){
			dusr.setDusrdtacessoU (new Date());
		}
		if(dusr.getDusrdtadm ()== null){
			dusr.setDusrdtadm (new Date()); 
		}
		if(dusr.getDusrstabl() == ' '){
			dusr.setDusrstabl('A');
			
		}
		
		
		
		return dusr;		
	}
	
	
	
}
