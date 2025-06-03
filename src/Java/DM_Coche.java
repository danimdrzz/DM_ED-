package Java;

import Java.DM_TipoDeCombustible.TipoCombustible;

public class DM_Coche {
	public int getNumero_de_plazas() {
		return numero_de_plazas;
	}
	public void setNumero_de_plazas(int numero_de_plazas) {
		this.numero_de_plazas = numero_de_plazas;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getVelocidad_media() {
		return velocidad_media;
	}
	public void setVelocidad_media(double velocidad_media) {
		this.velocidad_media = velocidad_media;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getTipo_de_combustible() {
		return tipo_de_combustible;
	}
	public void setTipo_de_combustible(double tipo_de_combustible) {
		this.tipo_de_combustible = tipo_de_combustible;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	private int numero_de_plazas;
	@Override
	public String toString() {
		return "DM_Coche [numero_de_plazas=" + numero_de_plazas + ", matricula=" + matricula + ", velocidad_media="
				+ velocidad_media + ", modelo=" + modelo + ", tipo_de_combustible=" + tipo_de_combustible + ", consumo="
				+ consumo + "]";
	}
	private String matricula;
	public DM_Coche(int numero_de_plazas, String matricula, double velocidad_media, String modelo,
			double tipo_de_combustible, double consumo) {
		super();
		this.numero_de_plazas = numero_de_plazas;
		this.matricula = matricula;
		this.velocidad_media = velocidad_media;
		this.modelo = modelo;
		this.tipo_de_combustible = tipo_de_combustible;
		this.consumo = consumo;
	}
	public DM_Coche(String string, String matricula2, int velocidad_media2, int i, TipoCombustible gasolina,
			double consumo2) {
		
	}
	private double velocidad_media;
	private String modelo;
	private double tipo_de_combustible;
	private double consumo;
	public double getPlazas() {
		
		return 0;
	}
}
