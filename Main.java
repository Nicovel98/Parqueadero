import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- GESTIÓN PARQUEADERO ---");
            System.out.println("1. Ingresar Vehículo");
            System.out.println("2. Registrar Salida");
            System.out.println("3. Consultar Estado");
            System.out.println("4. Salir");
            System.out.print("Seleccione: \n");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("\nTipo (1:Auto, 2:Moto, 3:Camion): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Placa: ");
                    String p = sc.nextLine();
                    System.out.print("Marca: ");
                    String m = sc.nextLine();
                    System.out.print("Modelo: ");
                    String mod = sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Combustible: ");
                        String c = sc.nextLine();
                        parqueadero.registrarEntrada(new Automovil(p, m, mod, c));
                    } else if (tipo == 2) {
                        System.out.print("Cilindraje: ");
                        int cil = sc.nextInt();
                        parqueadero.registrarEntrada(new Motocicleta(p, m, mod, cil));
                    } else if (tipo == 3) {
                        System.out.print("Capacidad Carga (tons): ");
                        double cap = sc.nextDouble();
                        parqueadero.registrarEntrada(new Camion(p, m, mod, cap));
                    }
                    break;
                case 2:
                    System.out.print("\nIngrese placa para salida: ");
                    String placaSalida = sc.nextLine();
                    parqueadero.registrarSalida(placaSalida);
                    break;
                case 3:
                    parqueadero.consultarEstado();
                    break;
            }
        } while (opcion != 4);
    }
}
