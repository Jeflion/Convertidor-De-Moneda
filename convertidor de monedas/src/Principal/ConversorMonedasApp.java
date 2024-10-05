package Principal;

import Conversor.Conversor;

import java.io.IOException;
import java.util.Scanner;


public class ConversorMonedasApp {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia del conversor con la clave de la API
        Conversor conversor = new Conversor("TU_API_KEY");

        System.out.println("Bienvenido al Conversor.Conversor de Monedas");

        boolean continuar = true;

        while (continuar) {
            System.out.println("----------------------------------");
            System.out.println("Por favor selecciona una opción:");
            System.out.println("1. Dólares a Pesos Colombianos");
            System.out.println("2. Pesos Colombianos a Dólares");
            System.out.println("3. Dólares a Pesos Argentinos");
            System.out.println("4. Reales Brasileños a Dólares");
            System.out.println("5. Pesos Argentinos a Dólares");
            System.out.println("6. Pesos Colombianos a Pesos Argentinos");
            System.out.println("7. Salir");
            System.out.println("----------------------------------");

            int opcion = scanner.nextInt();

            if (opcion == 7) {
                System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                continuar = false;
                break;
            }

            System.out.print("Ingresa el valor que deseas convertir: ");
            double valor = scanner.nextDouble();

            double resultado = 0.0;

            switch (opcion) {
                case 1:
                    resultado = conversor.convertirMoneda("USD", "COP", valor);
                    System.out.println("***************************************");
                    System.out.println("El valor de "
                            + valor + " dólares corresponde a "
                            + resultado + " pesos colombianos.");
                    System.out.println("***************************************");
                    break;
                case 2:
                    resultado = conversor.convertirMoneda("COP", "USD", valor);
                    System.out.println("***************************************");
                    System.out.println("El valor de "
                            + valor + " pesos colombianos corresponde a "
                            + resultado + " dólares.");
                    System.out.println("***************************************");
                    break;
                case 3:
                    resultado = conversor.convertirMoneda("USD", "ARS", valor);
                    System.out.println("***************************************");
                    System.out.println("El valor de "
                            + valor + " dólares corresponde a "
                            + resultado + " pesos argentinos.");
                    System.out.println("***************************************");
                    break;
                case 4:
                    resultado = conversor.convertirMoneda("BRL", "USD", valor);
                    System.out.println("***************************************");
                    System.out.println("El valor de "
                            + valor + " reales brasileños corresponde a "
                            + resultado + " dólares.");
                    System.out.println("***************************************");
                    break;
                case 5:
                    resultado = conversor.convertirMoneda("ARS", "USD", valor);
                    System.out.println("***************************************");
                    System.out.println("El valor de "
                            + valor + " pesos argentinos corresponde a "
                            + resultado + " dólares.");
                    System.out.println("***************************************");
                    break;
                case 6:
                    resultado = conversor.convertirMoneda("COP", "ARS", valor);
                    System.out.println("***************************************");
                    System.out.println("El valor de "
                            + valor + " pesos colombianos corresponde a "
                            + resultado + " pesos argentinos.");
                    System.out.println("***************************************");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}