package Java;

public class DM_Moto {
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumero_de_plazas() {
		return numero_de_plazas;
	}
	public void setNumero_de_plazas(int numero_de_plazas) {
		this.numero_de_plazas = numero_de_plazas;
	}
	public double getVelocidad_media() {
		return velocidad_media;
	}
	public void setVelocidad_media(double velocidad_media) {
		this.velocidad_media = velocidad_media;
	}
	public String getTipo_combustible() {
		return tipo_combustible;
	}
	public void setTipo_combustible(String tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	private String matricula;
	@Override
	public String toString() {
		return "DM_Moto [matricula=" + matricula + ", modelo=" + modelo + ", numero_de_plazas=" + numero_de_plazas
				+ ", velocidad_media=" + velocidad_media + ", tipo_combustible=" + tipo_combustible + ", consumo="
				+ consumo + "]";
	}
	private String modelo;
	private int numero_de_plazas;
	private double velocidad_media;
	private String tipo_combustible;
	private double consumo;
}
