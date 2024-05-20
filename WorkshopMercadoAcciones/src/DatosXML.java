import java.util.InputMismatchException;
import java.util.Scanner;

public class DatosXML implements InterfazAnalizador {
    Scanner input = new Scanner(System.in);

    @Override
    public String obtenerDatos() {
        int resp;
        do {
            try {
                System.out.println("\nPor favor indique de qué compañía desea conocer los datos de sus acciones en formato JSON:");
                System.out.println("1. Alphabet Inc. (Google)");
                System.out.println("2. Amazon.com Inc.");
                System.out.println("3. Apple Inc.");
                System.out.println("4. Berkshire Hathaway Inc.");
                System.out.println("5. Facebook Inc.");
                System.out.println("6. Johnson & Johnson");
                System.out.println("7. JPMorgan Chase & Co.");
                System.out.println("8. Microsoft Corporation");
                System.out.println("9. Tesla Inc.");
                System.out.println("10. Visa Inc.");
                resp = input.nextInt();
                System.out.println("Procesando Datos...\n");
                switch (resp) {
                    case 1:
                        return "<Stock><Symbol>GOOGL</Symbol><Name>Alphabet Inc. (Google)</Name><Price>2750.0</Price><Volume>1200000</Volume><MarketCap>1920.5</MarketCap></Stock>";
                    case 2:
                        return "<Stock><Symbol>AMZN</Symbol><Name>Amazon.com Inc.</Name><Price>3250.0</Price><Volume>1500000</Volume><MarketCap>1700.3</MarketCap></Stock>";
                    case 3:
                        return "<Stock><Symbol>AAPL</Symbol><Name>Apple Inc.</Name><Price>150.0</Price><Volume>2000000</Volume><MarketCap>2300.6</MarketCap></Stock>";
                    case 4:
                        return "<Stock><Symbol>BRK.A</Symbol><Name>Berkshire Hathaway Inc.</Name><Price>420000.0</Price><Volume>50000</Volume><MarketCap>630.8</MarketCap></Stock>";
                    case 5:
                        return "<Stock><Symbol>FB</Symbol><Name>Facebook Inc.</Name><Price>340.0</Price><Volume>800000</Volume><MarketCap>950.2</MarketCap></Stock>";
                    case 6:
                        return "<Stock><Symbol>JNJ</Symbol><Name>Johnson & Johnson</Name><Price>170.0</Price><Volume>600000</Volume><MarketCap>420.4</MarketCap></Stock>";
                    case 7:
                        return "<Stock><Symbol>JPM</Symbol><Name>JPMorgan Chase & Co.</Name><Price>150.0</Price><Volume>700000</Volume><MarketCap>390.5</MarketCap></Stock>";
                    case 8:
                        return "<Stock><Symbol>MSFT</Symbol><Name>Microsoft Corporation</Name><Price>250.65</Price><Volume>45231200</Volume><MarketCap>1900.21</MarketCap></Stock>";
                    case 9:
                        return "<Stock><Symbol>TSLA</Symbol><Name>Tesla Inc.</Name><Price>620.0</Price><Volume>1200000</Volume><MarketCap>580.9</MarketCap></Stock>";
                    case 10:
                        return "<Stock><Symbol>V</Symbol><Name>Visa Inc.</Name><Price>230.0</Price><Volume>3000000</Volume><MarketCap>490.7</MarketCap></Stock>";
                    default:
                        System.out.println("Por favor seleccione una opción válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero válido.");
                input.nextLine(); // Limpiar el búfer del scanner
                resp = 0; // Asignar un valor no válido para continuar el bucle
            }
        } while (resp < 1 || resp > 10);

        return ""; // En caso de que no se pueda obtener la entrada válida, se devuelve una cadena vacía
    }
}
