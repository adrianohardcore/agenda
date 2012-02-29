package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.validator.NotNull;


@Embeddable
public class DserPK implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	@NotNull
	private Integer dserest;
	@Column
	@NotNull
	private String dserpar;
	public DserPK(){    	
	}

	public Integer getDserest() {
		return dserest;
	}

	public void setDserest(Integer dserest) {
		this.dserest = dserest;
	}

	public String getDserpar() {
		return dserpar.trim();
	}

	public void setDserpar(String dserpar) {
		this.dserpar = dserpar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dserest;
		result = prime * result + ((dserpar == null) ? 0 : dserpar.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DserPK other = (DserPK) obj;
		if (dserest != other.dserest)
			return false;
		if (dserpar == null) {
			if (other.dserpar != null)
				return false;
		} else if (!dserpar.equals(other.dserpar))
			return false;
		return true;
	}

}
