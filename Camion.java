class Camion extends Vehiculo {
	private double capacidadCarga;

	public Camion(String placa, String marca, String modelo, double capacidadCarga) {
		super(placa, marca, modelo);
		this.capacidadCarga = capacidadCarga;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	@Override
	public double getTarifaPorHora() {
		return 6000;
	} // Ejemplo: $6.000
}