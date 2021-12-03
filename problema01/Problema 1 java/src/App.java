import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // variables
        double angulo1;
        double angulo2;
        double angulo3;

        System.out.println("Ingrese el primer angulo del triangulo");
        angulo1 = entrada.nextInt();

        System.out.println("Ingrese el segundo angulo del triangulo");
        angulo2 = entrada.nextInt();

        System.out.println("Ingrese el tercer angulo del triangulo");
        angulo3 = entrada.nextInt();

        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.printf("El triangulo que corresponde a el ángulo "
                    + "ingresado es rectangulo\n");
        } else {
            if (angulo1 > 90 && angulo1 < 180 || angulo2 > 90 && angulo2 < 180
                    || angulo3 > 90 && angulo3 < 180) {
                System.out.printf("El triangulo que corresponde a el ángulo "
                        + "ingresado es obtusangulo\n");
            } else {
                if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
                    System.out.printf("El triangulo que corresponde a el ángulo "
                            + "ingresado es acutangulo\n");
                } else {
                    System.out.println("Los datos ingresados no corresponden "
                            + "a ninguno de estos triangulos");
                }
            }

        }
    }
    }
