package Java;

import Java.DM_TipoDeCombustible.TipoCombustible;

public class Main {
static DM_Coche  coche1 = new DM_Coche("1234-MMM","BMW M5",4,155,TipoCombustible.GASOLINA,9.2);

static double velocidad = coche1.getVelocidad_media();
static double tiempo = 350/velocidad;

static double consumo = coche1.getConsumo();
static double precio = coche1.getTipo_de_combustible();
static double coste = consumo * 350 * 0.01 * precio;

static double rendimiento = coste/coche1.getPlazas();

public static void main(String[]args) {
System.out.println("Tiempo:" + tiempo + "horas");
System.out.println("Coste:" + coste + "euros");
System.out.println("Rendimiento:" + rendimiento + "euros/persona");
}
}
