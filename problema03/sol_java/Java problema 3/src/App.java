import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //variables
        String nombre;
        double tipoempleado;
        double horastrabajadas;
        double cuotahora;
        double horasextra;
        double valorhorasextra;
        double subtotal;
        double totalPagar;

        double cuota1 = 1.5;
        double cuota2 = 2;
        double cuota3 = 2.5;
        double cuota4 = 3;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el tipo de empleado al que corresponde");
        tipoempleado = entrada.nextInt();

        entrada.nextLine(); //Limpieza buffer

        System.out.println("Ingrese la cantidad de horas trabajadas");
        horastrabajadas = entrada.nextDouble();

        entrada.nextLine(); //Limpieza buffer

        System.out.println("Ingrese la cuota que se le paga por hora");
        cuotahora = entrada.nextDouble();
        if (tipoempleado <= 0 || tipoempleado > 4 || horastrabajadas <= 0) {
            System.out.println("Por favor ingrese datos válidos");
        } else {
            if ((tipoempleado == 1 || tipoempleado == 2 || tipoempleado == 3 || tipoempleado == 4)
                    && horastrabajadas < 40) {
                subtotal = horastrabajadas * cuota1;
                System.out.printf("Nombre del empleado: %s\n"
                        + "Tipo de empleado: %.0f\n"
                        + "Numero de horas trabajadas: %.2f\n"
                        + "Cuota que se le paga por hora: %.2f\n"
                        + "Sueldo por pagar: %.2f\n", nombre, tipoempleado, horastrabajadas,
                        cuotahora, subtotal);
            } else {
                if (tipoempleado == 1 && horastrabajadas > 40) {
                    subtotal = 40 * cuotahora;
                    horasextra = horastrabajadas - 40;
                    valorhorasextra = (cuotahora * cuota1) * horasextra;
                    totalPagar = valorhorasextra + subtotal;

                    System.out.printf("Nombre del empleado: %s\n"
                            + "Tipo de empleado: %.0f\n"
                            + "Numero de horas trabajadas: %.2f\n"
                            + "Cuota que se le paga por hora: %.2f\n"
                            + "Sueldo por pagar: %.2f\n", nombre, tipoempleado,
                            horastrabajadas,
                            cuotahora, totalPagar);
                } else {
                    if (tipoempleado == 2 && horastrabajadas > 40) {
                        subtotal = 40 * cuotahora;
                        horasextra = horastrabajadas - 40;
                        valorhorasextra = (cuotahora * cuota2) * horasextra;
                        totalPagar = valorhorasextra + subtotal;

                        System.out.printf("Nombre del empleado: %s\n"
                                + "Tipo de empleado: %.0f\n"
                                + "Numero de horas trabajadas: %.2f\n"
                                + "Cuota que se le paga por hora: %.2f\n"
                                + "Sueldo por pagar: %.2f\n", nombre, tipoempleado,
                                horastrabajadas,
                                cuotahora, totalPagar);
                    } else {
                        if (tipoempleado == 3 && horastrabajadas > 40) {
                            subtotal = 40 * cuotahora;
                            horasextra = horastrabajadas - 40;
                            valorhorasextra = (cuotahora * cuota3) * horasextra;
                            totalPagar = valorhorasextra + subtotal;

                            System.out.printf("Nombre del empleado: %s\n"
                                    + "Tipo de empleado: %.0f\n"
                                    + "Numero de horas trabajadas: %.2f\n"
                                    + "Cuota que se le paga por hora: %.2f\n"
                                    + "Sueldo por pagar: %.2f\n", nombre,
                                    tipoempleado, horastrabajadas,
                                    cuotahora, totalPagar);
                        } else {
                            if (tipoempleado == 4 && horastrabajadas > 40) {
                                subtotal = 40 * cuotahora;
                                horasextra = horastrabajadas - 40;
                                valorhorasextra = (cuotahora * cuota4) * horasextra;
                                totalPagar = valorhorasextra + subtotal;

                                System.out.printf("Nombre del empleado: %s\n"
                                        + "Tipo de empleado: %.0f\n"
                                        + "Numero de horas trabajadas: %.2f\n"
                                        + "Cuota que se le paga por hora: %.2f\n"
                                        + "Sueldo por pagar: %.2f\n", nombre,
                                        tipoempleado, horastrabajadas,
                                        cuotahora, totalPagar);
                            }
                        }
                    }
                }
            }
        }
    }
}
