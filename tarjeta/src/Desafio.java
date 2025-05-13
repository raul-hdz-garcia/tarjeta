import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        int opcion = 0;

        System.out.println("********************************************");
        System.out.println("\nNombre del cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: $" + saldoDisponible);
        System.out.println("\n********************************************");

        String menu = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);

        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: $" + saldoDisponible + "\n");
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que deseas retirar?");
                    double saldoRetirar = teclado.nextDouble();
                    if (saldoDisponible >= saldoRetirar) {
                        saldoDisponible -= saldoRetirar;
                        System.out.println("Saldo restante: $" + saldoDisponible + "\n");
                    } else {
                        System.out.println("Saldo insuficiente\n");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que vas a depositar?");
                    double saldoDepositar = teclado.nextDouble();
                    saldoDisponible += saldoDepositar;
                    System.out.println("El saldo actualizado es: $" + saldoDisponible + "\n");
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
