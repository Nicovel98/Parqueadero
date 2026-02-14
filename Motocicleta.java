class Motocicleta extends Vehiculo {
	private int cilindraje;

	public Motocicleta(String placa, String marca, String modelo, int cilindraje) {
		super(placa, marca, modelo);
		this.cilindraje = cilindraje;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	@Override
	public double getTarifaPorHora() {
		return 1500;
	} // Ejemplo: $1.500
}