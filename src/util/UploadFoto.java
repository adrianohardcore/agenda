package util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class UploadFoto {
	public byte[] converter(UploadedFile file){
		try {			
			InputStream stream = file.getFile();
			ByteArrayOutputStream baos = new ByteArrayOutputStream();			  
			IOUtils.copy(stream, baos);
			byte[] foto = baos.toByteArray();			 
			return foto;
		}		
		catch (Exception e) {			
			return null;
		}			
	}
	public String extensao(UploadedFile file){
		try {
			String nome = file.getFileName();
			Integer tamanho = nome.length();
			return nome.substring(tamanho -3,tamanho).toUpperCase();   
		} catch (Exception e) {		
			return null;
		}
	}
}



