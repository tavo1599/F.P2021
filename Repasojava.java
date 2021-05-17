import java.util.Scanner;

/**
 * StrRepetitive
 */
public class Repasojava {

    static Scanner teclado=new Scanner(System.in);
    

    public static void saludo() {
        System.out.println("Hola como estas?");
    }
    public static void name5() {
        System.out.println("Probando");
    }

    public static void suma10NumerosMientras() {
      //definir Variables
        int contador=0;
        double numeros, sumaNumeros=0;
        //Datos de Entrada y proceso
        while(contador<10){  //++contador    contador++
            ++contador;
            System.out.println("Ingrese el valor de la posicion "+contador+":");
            numeros=teclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;            
        }
        //Datos de salida
        System.out.println("La suma de los 10 numeros es:"+sumaNumeros);        
    }

    public static void suma10NumerosHacerMientras() {
        //definir Variables
          int contador=0;
          double numeros, sumaNumeros=0;
          //Datos de Entrada y proceso
         do{  //++contador:primero incrementa el valor     contador++: imprime el valor luego incrementa
              ++contador;
              System.out.println("Ingrese el valor de la posicion "+(contador)+":");
              numeros=teclado.nextDouble();
              sumaNumeros=sumaNumeros+numeros;
              
          } while(contador<10);
          //Datos de salida
          System.out.println("La suma de los 10 numeros es:"+sumaNumeros);        
      }    
        
      public static void suma10NumerosParaHasta() {
        //definir Variables
          double numeros, sumaNumeros=0;
          //Datos de Entrada y proceso
          for(int contador=1;contador<=10; contador++){
              System.out.println("Ingrese el valor de la posicion "+contador+":");
              numeros=teclado.nextDouble();
              sumaNumeros=sumaNumeros+numeros;              
          }
          //Datos de salida
          System.out.println("La suma de los 10 numeros es:"+sumaNumeros);        
      }       

    public static void menuMain(){
    
        String mensaje="Seleccion el algoritmo que desea ejecutar:"+
        "\n1=suma10NumerosMientras"+
        "\n2=suma10NumerosHacerMientras "+
        "\n3=suma10NumerosPara"+
        "\n4=numerosParesHasta100"+
        "\n5=numeroFibonaci"+
        "\n0=Salir del programa";
        
        System.out.println(mensaje);
        int opcion=0;
        do{
            opcion=teclado.nextInt();
            switch(opcion){
                case 1: suma10NumerosMientras();break;
                case 2: suma10NumerosHacerMientras();;break;
                case 3: suma10NumerosParaHasta();;break;
                case 4: numerosParesHasta100();break;
                case 5: numeroFibonaci();break;
            }
            if(opcion!=0)
            System.out.println("\n Desea seguir probando: "+mensaje);
            
        }while(opcion!=0);        
    }
    public static void numerosParesHasta100(){
        for(int contador=0;contador<100; contador++){
            if(contador%2==0){
                System.out.println("El numero "+contador+"es numero par");
            }
        }
    }
    public static void numeroFibonaci(){
        int numAnt=0;
        int numNue=1;
        int numTem=0;
        int contador=1;
        System.out.println("Numero Fibonaci");
        int numFinal=teclado.nextInt();
        while(contador<numFinal){
            numTem=numNue;
            numNue=numAnt+numNue;
            numAnt=numTem;
            contador++;

        }
        System.out.println("Numero Fibonaci de "+numFinal+" es: "+numNue);
    }
    public static void main(String[] args) {
    menuMain();
    }


}
