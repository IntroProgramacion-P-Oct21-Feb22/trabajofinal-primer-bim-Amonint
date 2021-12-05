import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //variables
        double porcentaje1 = 20;
        double porcentaje2 = 25;
        double porcentaje3 = 40;
        double porcentaje4 = 50;

        int cantidadtrajes;
        double preciounitario;
        double subtotal;
        double descuento;
        double precioFinal;

        System.out.println("Ingrese la cantidad de trajes a comprar");
        cantidadtrajes = entrada.nextInt();

        System.out.println("Ingrese el precio unitario");
        preciounitario = entrada.nextDouble();

        subtotal = cantidadtrajes * preciounitario;
        if (cantidadtrajes <= 0) {
            System.out.println("El valor no permitido");
        } else {
            if (cantidadtrajes == 1) {
                descuento = (subtotal * porcentaje1) / 100;
                precioFinal = subtotal - descuento;
                System.out.printf("El subotal a a pagar es: %.2f\n"
                        + "El descuento es: %.2f\n"
                        + "El total a pagar es: %.2f\n", subtotal, descuento, precioFinal);
            } else {
                if (cantidadtrajes == 2) {
                    descuento = (subtotal * porcentaje2) / 100;
                    precioFinal = subtotal - descuento;
                    System.out.printf("El subotal a a pagar es: %.2f\n"
                            + "El descuento es: %.2f\n"
                            + "El total a pagar es: %.2f\n", subtotal, descuento, precioFinal);
                } else {
                    if (cantidadtrajes == 3) {
                        descuento = (subtotal * porcentaje3) / 100;
                        precioFinal = subtotal - descuento;
                        System.out.printf("El subotal a a pagar es: %.2f\n"
                                + "El descuento es: %.2f\n"
                                + "El total a pagar es: %.2f\n", subtotal, descuento, precioFinal);
                    } else {
                        if (cantidadtrajes > 3) {
                            descuento = (subtotal * porcentaje4) / 100;
                            precioFinal = subtotal - descuento;
                            System.out.printf("El subotal a a pagar es: %.2f\n"
                                    + "El descuento es: %.2f\n"
                                    + "El total a pagar es: %.2f\n", subtotal, descuento, precioFinal);
                        }
                    }
                }
            }
        }
    }
}
