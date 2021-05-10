import java.util.Scanner;
/**
 * estrepetitive
 */
public class estrepetitive {

    static Scanner teclado=new Scanner(System.in);

    public static void suma10NumerosMientras() {
        //Definir Variables
        int contador=0;
        double numeros, sumaNumeros=0;
        //Datos de Entrada
        while(contador<10){
            System.out.println("Ingrese el valor de la posicion "+(++contador)+":");
            numeros=teclado.nextDouble();
            sumaNumeros+=numeros;
        }
        //Datos de salida
        System.out.println("La suma de los 10 numeros es: "+sumaNumeros);

        
    }
    
    public static void suma10NumerosHacerMientras() {
        //Definir Variables
        int contador=0;
        double numeros, sumaNumeros=0;
        //Datos de Entrada
        do{
            System.out.println("Ingrese el valor de la posicion "+(++contador)+":");
            numeros=teclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;

        } while(contador<10);
        //Datos de salida
        System.out.println("La suma de los 10 numeros es: "+sumaNumeros);

        
    }

    public static void suma10NumerosParaHasta() {
        //definir Variables
          double numeros, sumaNumeros=0;
          //Datos de Entrada y proceso
          for(int contador=1;contador<=10; contador++){
              System.out.println("Ingrese el valor de la posicion "+(contador)+":");
              numeros=teclado.nextDouble();
              sumaNumeros=sumaNumeros+numeros;              
          }
          //Datos de salida
          System.out.println("La suma de los 10 numeros es:"+sumaNumeros);        
      }

   public static void main(String[] arg) {
      /* System.out.println("hola");  
       suma10NumerosMientras();
       suma10NumerosHacerMientras();*/
       suma10NumerosParaHasta();
   } 

}