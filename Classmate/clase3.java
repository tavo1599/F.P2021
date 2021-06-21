import java.util.Scanner;

public class clase3 {
    static Scanner sc=new Scanner(System.in);

    static void Ejercicio1(){
        String estacionNombre;
        System.out.println("Ingrese un numero");
        int estacion = sc.nextInt();
        int a = 0;
        switch(a){
            case 1:
                estacionNombre="verano";
            break;
            case 2:
                estacionNombre="Primavera";
            break;
            case 3:
                estacionNombre="Otoño";
            break;
            case 4:
                estacionNombre="Invierno";
            break;
            default:
                estacionNombre="verano";
            break;

        }
        System.out.println(estacionNombre);
    }
    static void ejercicio2(){
        char sexo=' ';
        int edad;
        double estatura;
        if(sexo=='M'){
            if(edad>=19 && edad<=22){
                if(estatura>=1.60 && estatura<=1.75){
                    System.out.println("Puedes con romel.");
                }
                
            }
            else{
                System.out.println("Friendzone.");
            }
        }
        else{
            System.out.println("Next");
        }
        else{
            System.out.println("");
        }

    }
    public static void main(String[] args){
        Ejercicio1();
    }
}
