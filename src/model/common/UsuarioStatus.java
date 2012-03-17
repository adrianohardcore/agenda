package model.common;

public enum UsuarioStatus {

	L("Liberado"),
	B("Bloqueado");

	private String label;

	private UsuarioStatus(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}