import java.time.LocalDateTime;

public abstract class Vehiculo {
	private String placa;
	private String marca;
	private String modelo;
	private LocalDateTime horaEntrada;

	public Vehiculo(String placa, String marca, String modelo) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.horaEntrada = LocalDateTime.now();
	}

	// Getters y Setters
	public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}

	// Método abstracto para que cada hijo implemente su tarifa
	public abstract double getTarifaPorHora();
}