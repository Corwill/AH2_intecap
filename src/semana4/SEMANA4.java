
package semana4;
import java.util.Scanner;

public class SEMANA4 {

    
    public static void main(String[] args) {
        Scanner sp  =  new Scanner (System.in);
        System.out.println("Ingresa el primer numero:");
        int N1 = sp.nextInt();
        
        System.out.println("Ingresa el Segundo numero:");
        int N2 = sp.nextInt();
        
        if (N1 == N2)
            System.out.println("Los numeros son identicos");
        else
            System.out.println("Los numeros no son identicos");
            
            
        
        
}
}