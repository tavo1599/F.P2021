package pe.edu.upeu.gss.examen;

import java.util.Scanner;

public class ResolucionExamen{
  static Scanner in = new Scanner(System.in);
  

    public static void impuestoAuto(){
        int i, n;
        double categoria1, categoria2, categoria3, categoria, costo;
        double impuesto, impuestoapagar;
        categoria1 = 0;
        categoria2 = 0;
        categoria3 = 0;
        impuestoapagar = 0;
        System.out.println("Ingresa el numero de vehiculos: ");
        n = in.nextInt();
        for (i=1; i<=n; i++) {
            System.out.println("PROCESO " + i);
            System.out.println("Ingresa la categoria: ");
            categoria = in.nextDouble();
            System.out.println("Ingresa el valor de costo: ");
            costo = in.nextDouble();
            impuesto=0;
            if(categoria==1)
            {
                impuesto=costo*0.12;
                categoria1=categoria1+impuesto;
            }
            if(categoria==2)
            {
                impuesto=costo*0.08;
                categoria2=categoria2+impuesto;
            }
            if(categoria==3)
            {
                impuesto=costo*0.05;
                categoria3=categoria3+impuesto;
            }
            impuestoapagar=impuestoapagar+impuesto;
            System.out.println("Valor de impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("Valor de categoria 1: " + categoria1);
        System.out.println("Valor de categoria 2: " + categoria2);
        System.out.println("Valor de categoria 3: " + categoria3);
        System.out.println("Valor de impuesto a pagar: " + impuestoapagar);
    }

    public static void tablaMultiplicar() {
        for(int i = 1 ; i<= 20 ; i++){
            for(int j = 0 ; j<=10 ; j++ ){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
    public static void numerosPerfectos(){
        int i, suma = 0, n;
        System.out.println("Introduce un número: ");
        n = in.nextInt();
        for (i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1                            
            if (n % i == 0) {
                suma = suma + i;   // si es divisor se suma
            }
        }
        if (suma == n) {           // si el numero es igual a la suma de sus divisores es perfecto                
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
        

    }

    public static void potencia(){
        int base=0,exponente=0;
        System.out.print("Introduce la base: ");
        base = in.nextInt();
        System.out.print("Introduce el exponente: ");
        exponente = in.nextInt();
        System.out.printf("%n%d elevado a %d es igual a %.3f", base, exponente, potencia(base, exponente));
        System.out.println();
    }
    private static double potencia(int base, int exponente){
        if(exponente==0){
            return 1;
        } else if (exponente<0) {
            return potencia(base, exponente+1) / base;
        } else {
            return base * potencia(base, exponente-1);
        }
    }
    
    
}