class Automovil extends Vehiculo {
	private String tipoCombustible;

	public Automovil(String placa, String marca, String modelo, String tipoCombustible) {
		super(placa, marca, modelo);
		this.tipoCombustible = tipoCombustible;
	}

	public String getCombustible() {
		return tipoCombustible;
	}

	@Override
	public double getTarifaPorHora() {
		return 3000;
	} // Ejemplo: $3.000
}