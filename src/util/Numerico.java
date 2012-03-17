package util;

public class Numerico {
	public boolean ehInteiro( String s ) {  
		boolean d = true;    	  
		for ( int i = 0; i < s.length(); i++ ) {			    
			if ( !Character.isDigit( s.charAt(i) ) ) {    
				d = false;    
				break;    
			}    
		}    	  
		return d;    
	}    

}


