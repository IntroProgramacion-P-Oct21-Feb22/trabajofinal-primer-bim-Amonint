import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double numero1;
        double numero2;
        double numero3;
        
        System.out.println("Ingrese el primer número");
        numero1 = entrada.nextDouble();
        
        System.out.println("Ingrese el segundo número");
        numero2 = entrada.nextDouble();
        
        System.out.println("Ingrese el tercer número");
        numero3 = entrada.nextDouble();
        
        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero mayor es:" + numero1);
        }else{
            if(numero2> numero1 && numero2 > numero3){
                System.out.println("EL numero mayor es:" + numero2);
            }else{
                if(numero3> numero1 && numero3 > numero2){
                    System.out.println("EL numero mayor es:" + numero3);
                }else{
                    if(numero1== numero2 || numero1 == numero3 || numero2 == numero3){
                        System.out.println("error uno o varios de los números ingresados son iguales");
                    }
                }
            }
        }
    }
}
