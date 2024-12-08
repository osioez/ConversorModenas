import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    private final Conversor conversor;

    // Constructor
    public Menu() {
        this.scanner = new Scanner(System.in);
        this.conversor = new Conversor();
    }

    // Método para mostrar el menú
    public void mostrarMenu() {
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("Bienvenido al conversor de monedas.");
            System.out.println("1. Dólar a Peso Argentino");
            System.out.println("2. Peso Argentino a Dólar");
            System.out.println("3. Dólar a Real Brasileño");
            System.out.println("4. Real Brasileño a Dólar");
            System.out.println("5. Dólar a Peso Colombiano");
            System.out.println("6. Peso Colombiano a Dólar");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción válida: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                double cantidad;
                double cantidadConvertida;
                switch (opcion) {
                    case 1:
                        // Dólar a Peso Argentino
                        System.out.print("Ingrese la cantidad en Dólares: ");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        cantidadConvertida = conversor.convertirMoneda("USD", "ARS", cantidad);
                        System.out.println(cantidad + " USD = " + cantidadConvertida + " ARS");
                        break;
                    case 2:
                        // Peso Argentino a Dólar
                        System.out.print("Ingrese la cantidad en Pesos Argentinos: ");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        cantidadConvertida = conversor.convertirMoneda("ARS", "USD", cantidad);
                        System.out.println(cantidad + " ARS = " + cantidadConvertida + " USD");
                        break;
                    case 3:
                        // Dólar a Real Brasileño
                        System.out.print("Ingrese la cantidad en Dólares: ");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        cantidadConvertida = conversor.convertirMoneda("USD", "BRL", cantidad);
                        System.out.println(cantidad + " USD = " + cantidadConvertida + " BRL");
                        break;
                    case 4:
                        // Real Brasileño a Dólar
                        System.out.print("Ingrese la cantidad en Reales Brasileños: ");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        cantidadConvertida = conversor.convertirMoneda("BRL", "USD", cantidad);
                        System.out.println(cantidad + " BRL = " + cantidadConvertida + " USD");
                        break;
                    case 5:
                        // Dólar a Peso Colombiano
                        System.out.print("Ingrese la cantidad en Dólares: ");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        cantidadConvertida = conversor.convertirMoneda("USD", "COP", cantidad);
                        System.out.println(cantidad + " USD = " + cantidadConvertida + " COP");
                        break;
                    case 6:
                        // Peso Colombiano a Dólar
                        System.out.print("Ingrese la cantidad en Pesos Colombianos: ");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        cantidadConvertida = conversor.convertirMoneda("COP", "USD", cantidad);
                        System.out.println(cantidad + " COP = " + cantidadConvertida + " USD");
                        break;
                    case 7:
                        System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
        }

        scanner.close();
    }
}
