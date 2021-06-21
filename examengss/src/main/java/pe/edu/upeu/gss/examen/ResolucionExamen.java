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
        int i, numero, resultado;
        System.out.println("Ingrese un numero: ");
        numero = in.nextInt();
        for (i=1; i<=10; i++) {
            resultado = i * numero;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
    public static void sumaNumeros(){
        int numero=0;
        int sumas=0, menor=0, Mayor=numero;
        while ( menor < Mayor ) {
            Mayor = numero / menor;
            if ( numero % menor == 0 ) 
                sumas += menor;
            if ( Mayor != menor && numero % Mayor == 0 )
                sumas += Mayor;
            
	}
        if (sumas == numero) {
            System.out.println("El numero "+numero+" es un numero perfecto;");
        } else {
            System.out.println("El numero "+numero+" no es un numero perfecto;");
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