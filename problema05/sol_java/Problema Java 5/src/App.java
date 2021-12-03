import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double cory;
        double corx;
        
        System.out.println("Ingrese la cordenada X");
        corx = entrada.nextDouble();
        
        System.out.println("Ingrese la coordenada Y");
        cory = entrada.nextDouble();
        
        if(corx == 0 && cory ==0){
            System.out.println("La coordenada esta en el centro del plano");
        } else if (corx > 0 && cory > 0){
            System.out.println("La coordenada se encuentra en el primer cuadrante 1: Región superior derecha");
        } else if(corx < 0&& cory > 0){
            System.out.println("La coordenada se encuentra en el segundo cuadrante 2: Región superior izquierda");
        } else if (corx < 0 && cory < 0){
            System.out.println("La coordenada se encuentra en el tercer cuadrante 3: Región inferior izquierda");
        }else if (corx > 0 && cory <0){
            System.out.println("La coordenada se encuentra en el cuarto cuadrante 4: Región inferior derecha");
        }
    }
    
}
