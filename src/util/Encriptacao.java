package util;


public class Encriptacao {

	public String Encriptar(String senha){	
		String  vaux  = null;		
		String  chr   = null;
		String  senha2   = "";
		Integer asc   = 0;
		Integer fator = 0;
		Integer ascii = 0;
		senha = senha.toUpperCase();
		
		if (senha.length() < 10){
			for (int i = senha.length(); i < 10; i++) {
				senha += " ";				
			}
		}		
		for (int i = 1; i < 11; i++) {			
			vaux = senha.substring(i -1,i);			
			asc = Asc(vaux);			
			if (i == 1){
				fator = asc / 2 ;
			} 			 
			ascii = asc + fator;			
			
			if (ascii < 48){
				ascii = 55;				
			}else if (ascii > 57 && ascii < 65){
				ascii = 67;			
			}else if (ascii > 90 && ascii < 97){
			ascii = 89;				
			}else if (ascii > 90 && ascii < 97){
				ascii = 89;	
			}else if (ascii > 122){
				ascii = 119;
			}			
			chr = Chr(ascii);				
			senha2 = senha2 + chr;			 
			fator += 2;
		}
		return senha2;
	}

	public Integer Asc(String vaux){	
		Integer asc = 0;		
		char letra =  vaux.charAt (0);		
		switch (letra) {
		case 'A':	
			asc = 65;
			break;
		case 'B':	
			asc = 66;
			break;
		case 'C':	
			asc = 67;
			break;
		case 'D':	
			asc = 68;
			break;
		case 'E':	
			asc = 69;
			break;
		case 'F':	
			asc = 70;
			break;
		case 'G':	
			asc = 71;
			break;
		case 'H':	
			asc = 72;
			break;
		case 'I':	
			asc = 73;
			break;
		case 'J':	
			asc = 74;
			break;
		case 'K':	
			asc = 75;
			break;
		case 'L':	
			asc = 76;
			break;
		case 'M':	
			asc = 77;
			break;
		case 'N':	
			asc = 78;
			break;
		case 'O':	
			asc = 79;
			break;
		case 'P':	
			asc = 80;
			break;
		case 'Q':	
			asc = 81;
			break;
		case 'R':	
			asc = 82;
			break;
		case 'S':	
			asc = 83;
			break;
		case 'T':	
			asc = 84;
			break;
		case 'U':	
			asc = 85;
			break;
		case 'V':	
			asc = 86;
			break;
		case 'W':	
			asc = 87;
			break;
		case 'X':	
			asc = 88;
			break;
		case 'Y':	
			asc = 89;
			break;
		case 'Z':	
			asc = 90;
			break;
		case '0':	
			asc = 48;
			break;
		case '1':	
			asc = 49;
			break;
		case '2':	
			asc = 50;
			break;
		case '3':	
			asc = 51;
			break;
		case '4':	
			asc = 52;
			break;
		case '5':	
			asc = 53;
			break;
		case '6':	
			asc = 54;
			break;
		case '7':	
			asc = 55;
			break;
		case '8':	
			asc = 56;
			break;
		case '9':	
			asc = 57;
			break;
		case '!':	
			asc = 33;
			break;
		case '"':	
			asc = 34;
			break;
		case '#':	
			asc = 35;
			break;
		case '$':	
			asc = 36;
			break;
		case '%':	
			asc = 37;
			break;
		case '&':	
			asc = 38;
			break;
		case '\'':	
			asc = 39;
			break;
		case '(':	
			asc = 40;
			break;
		case ')':	
			asc = 41;
			break;
		case '*':	
			asc = 42;
			break;
		case '+':	
			asc = 43;
			break;
		case ',':	
			asc = 44;
			break;
		case '-':	
			asc = 45;
			break;
		case '.':	
			asc = 46;
			break;
		case '/':	
			asc = 47;
			break;
		case ':':	
			asc = 58;
			break;
		case ';':	
			asc = 59;
			break;
		case '<':	
			asc = 60;
			break;
		case '=':	
			asc = 61;
			break;
		case '>':	
			asc = 62;
			break;
		case '?':	
			asc = 63;
			break;
		case '@':	
			asc = 64;
			break;
		case '[':	
			asc = 91;
			break;
		case '\\':	
			asc = 92;
			break;
		case ']':	
			asc = 93;
			break;
		case '^':	
			asc = 94;
			break;
		case '_':	
			asc = 95;
			break;
		case '`':	
			asc = 96;
			break;
		case '{':	
			asc = 123;
			break;
		case '|':	
			asc = 124;
			break;
		case '}':	
			asc = 125;
			break;
		case '~':	
			asc = 126;
			break;
		case ' ':	
			asc = 32;
			break;
		default:
			break;
		}
		return asc;		
	}


	public String Chr(Integer ascII){
		String chr = null;

		switch (ascII) {		
		case 55 :
			chr = "7" ;
			break;
		case 67 :
			chr = "C" ;
			break;
		case 89 :
			chr = "Y" ;
			break;		
		case 65 :
			chr = "A" ;
			break;
		case 66 :
			chr = "B" ;
			break;			
		case 68 :
			chr = "D" ;
			break;
		case 69 :
			chr = "E" ;
			break;
		case 70 :
			chr = "F" ;
			break;
		case 71 :
			chr = "G" ;
			break;
		case 72 :
			chr = "H" ;
			break;
		case 73 :
			chr = "I" ;
			break;
		case 74 :
			chr = "J" ;
			break;
		case 75 :
			chr = "K" ;
			break;
		case 76 :
			chr = "L" ;
			break;
		case 77 :
			chr = "M" ;
			break;
		case 78 :
			chr = "N" ;
			break;
		case 79 :
			chr = "O" ;
			break;
		case 80 :
			chr = "P" ;
			break;
		case 81 :
			chr = "Q" ;
			break;
		case 82 :
			chr = "R" ;
			break;
		case 83 :
			chr = "S" ;
			break;
		case 84 :
			chr = "T" ;
			break;
		case 85 :
			chr = "U" ;
			break;
		case 86 :
			chr = "V" ;
			break;
		case 87 :
			chr = "W" ;
			break;
		case 88 :
			chr = "X" ;
			break;			
		case 90 :
			chr = "Z" ;
			break;
		case 48 :
			chr = "0" ;
			break;
		case 49 :
			chr = "1" ;
			break;
		case 50 :
			chr = "2" ;
			break;
		case 51 :
			chr = "3" ;
			break;
		case 52 :
			chr = "4" ;
			break;
		case 53 :
			chr = "5" ;
			break;
		case 54 :
			chr = "6" ;
			break;

		case 56 :
			chr = "8" ;
			break;
		case 57 :
			chr = "9" ;
			break;
		case 33 :
			chr = "!" ;
			break;
		case 34 :
			chr = "\"" ;
			break;
		case 35 :
			chr = "#" ;
			break;
		case 36 :
			chr = "$" ;
			break;
		case 37 :
			chr = "%" ;
			break;
		case 38 :
			chr = "&" ;
			break;
		case 39 :
			chr = "'" ;
			break;
		case 40 :
			chr = "(" ;
			break;
		case 41 :
			chr = ")" ;
			break;
		case 42 :
			chr = "*" ;
			break;
		case 43 :
			chr = "+" ;
			break;
		case 44 :
			chr = "," ;
			break;
		case 45 :
			chr = "-" ;
			break;
		case 46 :
			chr = "." ;
			break;
		case 47 :
			chr = "/" ;
			break;
		case 58 :
			chr = ":" ;
			break;
		case 59 :
			chr = ";" ;
			break;
		case 60 :
			chr = "<" ;
			break;
		case 61 :
			chr = "=" ;
			break;
		case 62 :
			chr = ">" ;
			break;
		case 63 :
			chr = "?" ;
			break;
		case 64 :
			chr = "@" ;
			break;
		case 91 :
			chr = "[" ;
			break;
		case 92 :
			chr = "\\" ;
			break;
		case 93 :
			chr = "]" ;
			break;
		case 94 :
			chr = "^" ;
			break;
		case 95 :
			chr = "_" ;
			break;
		case 96 :
			chr = "`" ;
			break;
		case 123:
			chr = "{" ;
			break;
		case 124:
			chr = "|" ;
			break;
		case 125:
			chr = "}" ;
			break;
		case 126:
			chr = "~" ;
			break;
		case 32 :
			chr = " " ;
			break;
		case 97 :
			chr = "a" ;
			break;
		case 98 :
			chr = "b" ;
			break;
		case 99 :
			chr = "c" ;
			break;
		case 100:
			chr = "d" ;
			break;
		case 101:
			chr = "e" ;
			break;
		case 102:
			chr = "f" ;
			break;
		case 103:
			chr = "g" ;
			break;
		case 104:
			chr = "h" ;
			break;
		case 105:
			chr = "i" ;
			break;
		case 106:
			chr = "j" ;
			break;
		case 107:
			chr = "k" ;
			break;
		case 108:
			chr = "l" ;
			break;
		case 109:
			chr = "m" ;
			break;
		case 110:
			chr = "n" ;
			break;
		case 111:
			chr = "o" ;
			break;
		case 112:
			chr = "p" ;
			break;
		case 113:
			chr = "q" ;
			break;
		case 114:
			chr = "r" ;
			break;
		case 115:
			chr = "s" ;
			break;
		case 116:
			chr = "t" ;
			break;
		case 117:
			chr = "u" ;
			break;
		case 118:
			chr = "v" ;
			break;
		case 119:
			chr = "w" ;
			break;
		case 120:
			chr = "x" ;
			break;
		case 121:
			chr = "y" ;
			break;
		case 122:
			chr = "z" ;
			break;
		case 142:
			chr = "Ä" ;
			break;
		case 143:
			chr = "Å" ;
			break;
		case 128:
			chr = "Ç" ;
			break;
		case 144:
			chr = "É" ;
			break;
		case 165:
			chr = "Ñ" ;
			break;
		case 153:
			chr = "Ö" ;
			break;
		case 154:
			chr = "Ü" ;
			break;
		case 160:
			chr = "á" ;
			break;		
		default:
			break;
		}
		return chr;
	}

}	
