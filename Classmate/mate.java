import java.util.Scanner;

public class mate { 
    static Scanner tl=new Scanner(System.in);

    static void suma(){
    int num1=5,num2=3;
    int suma, resta, multi, divi, resi, potencia;
    suma = num1+num2;
    resta= num1-num2;
    multi = num1*num2;
    divi = num1/num2;
    resi = num1%num2;
    potencia = (int) Math.pow((double)num1, (double)num2);
    System.out.println("suma "+suma);
    System.out.println("resta "+resta);
    System.out.println("multiplicacion "+multi);
    System.out.println("division "+divi);
    System.out.println("residuo "+resi);
    System.out.println("potencia "+potencia);
    }

    static void segundoEjercicio(){
        double nota1, nota2, nota3, nota4, promedio;
        System.out.println("Ingrese nota1: ");
        nota1=tl.nextDouble();
        System.out.println("Ingrese nota2: ");
        nota2=tl.nextDouble();
        System.out.println("Ingrese nota3: ");
        nota3=tl.nextDouble();
        System.out.println("Ingrese nota4: ");
        nota4=tl.nextDouble();
        promedio=(nota1+nota2+nota3+nota4)/4;
        System.out.println("Su promedio es: "+promedio);

    }

    static void tercerEjercicio(){
        int segundos, horas, minutos;
        System.out.println("Ingrese los segundos: ");
        segundos=tl.nextInt();
        horas=segundos/3600;
        minutos=segundos/60;
        System.out.println("Tiene: "+horas+" horas");
        System.out.println("Tiene: "+minutos+" minutos");

    }

    static void igv(){
        double precioarticulo;
        double IGV;
        double total;
        System.out.println("Ingrese el precio del articulo: ");
        precioarticulo=tl.nextDouble();
        IGV=precioarticulo*0.18;
        System.out.println("El IGV es "+ IGV);
        total=precioarticulo+IGV;
        System.out.println("El total a pagar es "+total);
    }

    static void SumaNnumeros(){
        double valorN=0;
        double suma=0;
        System.out.println("Ingrese el valor de N:  ");
        valorN=tl.nextInt();
        suma=(valorN*(valorN+1))/2;
        System.out.println("Suma de N numeros es: "+suma);


    }

    static void areaDeUnCirculo(){
        double pi=3.14;
        double area;
        double radio;
        System.out.println("Ingrese el radio: ");
        radio=tl.nextDouble();
        area= pi*(Math.pow(radio, 2));
        System.out.println("El area del circulo es: "+area);


    }

    static void articuloX(){
        double articulo;
        double descuento;
        double Pfinal;
        System.out.println("Ingrese precio del articulo: ");
        articulo=tl.nextDouble();
        descuento=articulo-(articulo*0.20);
        System.out.println("El precio con descuento es "+descuento);
        Pfinal=(descuento*0.12)+descuento;
        System.out.println("El precio final es: "+Pfinal);
    }


    public static void main(String[]args){
        // suma();
        // segundoEjercicio();
        // tercerEjercicio();
        // igv();
        // sumaNnumeros();
        // areaDeUnCirculo();
        articuloX();
    }
}
