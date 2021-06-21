package pe.edu.upeu.gss;

import java.util.Scanner;

import pe.edu.upeu.gss.examen.ResolucionExamen;

public class App
{
    public static void main( String[] args )
    {
        ResolucionExamen gustavo=new ResolucionExamen();
        Scanner in = new Scanner(System.in);
        boolean salir = false;
        int opcion;
         
        while(!salir){
             
            System.out.println("1. Impuesto de autos");
            System.out.println("2. tabla de multiplicar");
            System.out.println("3. Numero perfecto");
            System.out.println("4. Potencia");
            System.out.println("5. Salir");
             
            System.out.println("Escribe una de las opciones");
            opcion = in.nextInt();
             
            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    gustavo.impuestoAuto();
                    
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    gustavo.tablaMultiplicar();
                    break;
                 case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    gustavo.numerosPerfectos();
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4");
                    gustavo.potencia();
                    break;
                 case 5:
                    salir=true;
                    break;
                 default:
                    System.out.println("Solo números entre 1 y 4");
            }
             
        }

    }

   
}
