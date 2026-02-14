import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {

	private List<Vehiculo> listaVehiculos = new ArrayList<>();

	/**
	 * 
	 * @param v
	 */
	public void registrarEntrada(Vehiculo v) {
		listaVehiculos.add(v);
		System.out.println("\nVehículo registrado con éxito.");
	}

	/**
	 *
	 * @param placa
	 */
	public void registrarSalida(String placa) {
		Vehiculo vehiculoEncontrado = null;
		for (Vehiculo v : listaVehiculos) {
			if (v.getPlaca().equalsIgnoreCase(placa)) {
				vehiculoEncontrado = v;
				break;
			}
		}

		if (vehiculoEncontrado != null) {
			LocalDateTime horaSalida = LocalDateTime.now();
			long minutos = Duration.between(vehiculoEncontrado.getHoraEntrada(), horaSalida).toMinutes();

			// Lógica: Fracción de hora cuenta como hora completa
			long horasACobrar = (long) Math.ceil(minutos / 60.0);
			if (horasACobrar == 0)
				horasACobrar = 1; // Mínimo una hora

			double total = horasACobrar * vehiculoEncontrado.getTarifaPorHora();

			System.out.println("\n---- RECIBO DE SALIDA ----");
			System.out.println("Placa: " + vehiculoEncontrado.getPlaca());
			System.out.println("Marca: " + vehiculoEncontrado.getMarca());
			System.out.println("Modelo: " + vehiculoEncontrado.getModelo());
			System.out.println("Tipo: " + vehiculoEncontrado.getClass().getSimpleName());
			System.out.println(vehiculoEncontrado instanceof Automovil
					? "Combustible: " + ((Automovil) vehiculoEncontrado).getCombustible()
					: vehiculoEncontrado instanceof Motocicleta
							? "Cilindraje: " + ((Motocicleta) vehiculoEncontrado).getCilindraje()
							: "Capacidad Carga: " + ((Camion) vehiculoEncontrado).getCapacidadCarga() + " tons");
			System.out.println("Horas transcurridas: " + horasACobrar);
			System.out.println("Total a pagar: $" + total);

			listaVehiculos.remove(vehiculoEncontrado);
		} else {
			System.out.println("\nError: Vehículo no encontrado.");
		}
	}

	public void consultarEstado() {
		if (listaVehiculos.isEmpty()) {
			System.out.println("\nEl parqueadero está vacío.");
		} else {
			System.out.println("\nVehículos en el parqueadero:");
			for (Vehiculo v : listaVehiculos) {
				System.out.println("- [" + v.getPlaca() + "] " + v.getMarca() + " " + v.getClass().getSimpleName());
			}
		}
	}

}