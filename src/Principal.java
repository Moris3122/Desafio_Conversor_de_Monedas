
import java.util.Objects;
import java.util.Scanner;

public class Principal {
    static String monto;
    static String seleccion= "-1";
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ObtenerTasaParMonedas obtenerTasaParMonedas = new ObtenerTasaParMonedas();

        while(!Objects.equals(seleccion, "7")) {
            System.out.println("""
                    \n*********************************************
                        Bienvenido al conversor de Moneda\n
                    1) Dolar.............===>>> Peso Argentino
                    2) Peso Argentino....===>>> Dolar
                    3) Dolar.............===>>> Real Brasileño
                    4) Real Brasileño....===>>> Dolar
                    5) Dolar.............===>>> Peso Chileno
                    6) Peso Chileno......===>>> Dolar
                    7) Salir
                    
                    *********************************************
                    Elija una opcion válida: """ + "\n");

            seleccion = (scanner.nextLine());

            if(Integer.parseInt(seleccion) <= 6 && Integer.parseInt(seleccion) >= 1 ){
                System.out.println("Ingrese Monto a convertir: ");
                monto = (scanner.nextLine());
            }

            switch (seleccion) {
                case "1": //Dolar a peso Argentino
                    obtenerTasaParMonedas.obtenerTasa("USD", "ARS", monto);
                    break;
                case "2": //Peso Argentino a Dolar
                    obtenerTasaParMonedas.obtenerTasa("ARS", "USD", monto);
                    break;
                case "3"://Dolar a Real Brasileño
                    obtenerTasaParMonedas.obtenerTasa("USD", "BRL", monto);
                    break;
                case "4": // Real Brasileño a Dolar
                    obtenerTasaParMonedas.obtenerTasa("BRL", "USD", monto);
                    break;
                case "5": //Dolar a Peso Chileno
                    obtenerTasaParMonedas.obtenerTasa("USD", "CLP", monto);
                    break;
                case "6": //Peso Chileno a Dolar
                    obtenerTasaParMonedas.obtenerTasa("CLP", "USD", monto);
                    break;
                case "7":
                    System.out.println("Gracias por operar con nosotros!!");
                    System.out.println("Tenga un buen día.");
                    break;
                default:
                    System.out.println("¡¡¡¡ Número fuera de rango !!!!");
                    break;
            }
        }
    }
}
