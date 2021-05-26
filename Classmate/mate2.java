import java.util.Scanner;

public class mate2 {
    static Scanner tl=new Scanner(System.in);

    static void ejercicio1(){
        int n1=0; 
        int n2=0;
        System.out.println("Inserte el primer numero: ");
        n1=tl.nextInt();
        System.out.println("Inserte el segundo numero: ");
        n2=tl.nextInt();
        if (n1 > n2){
            System.out.println("El numero mayor es: "+n1);
        }else{
            System.out.println("El numero mayor es: "+n2);
        }
    }

    

     

    static void ejercicio3(){
        char genero=' ';
        System.out.println("Especifique su sexo (M:masculino/F:femenino): ");
        genero=tl.next().charAt(0);
        if(genero=='M'){
            System.out.println("Amiguo");
        }
        if(genero=='f'){
            System.out.println("Amiguis");
        }
    }

    static void ejercicio4(){
        int num1;
        System.out.println("Introduca un numero");
        num1=tl.nextInt();
        if(num1%2==0){
            System.out.println("El numero"+num1+" es par.");
        }else{
            System.out.println("El numero "+num1+" es impar.");
        }
    }
    static void ejercicio5(){
        int edad;
        System.out.println("Introdusca su edad:");
        edad=tl.nextInt();
        if(edad>=18){
            System.out.println("Si podemos Salir xd: ");
        }else{
            System.out.println("No podemos salir a la siguiente xd:");
        }
    }
    static void ejercicio6(){
        int n1;
        System.out.println("Introduca un numero: ");
        n1=tl.nextInt();
        if(n1%2==0){
            n1=n1*3;
            System.out.println("El triple es: "+n1);
        }else{
            n1=n1*2;
            System.out.println("El doble es: "+n1);
        }

    }

    static void ejercicio7(){
        double consumo, total, impuesto, descuento; 
        System.out.println("Ingrese cantidad de consumo: ");
        consumo=tl.nextInt();
        if(consumo<100){
            descuento=consumo*0.1;
        }else{
            descuento=consumo*0.2;
        }
        impuesto=(consumo-descuento)*0.19;
        total=(consumo-descuento)+impuesto;
        System.out.println("El descuento es: "+descuento);
        System.out.println("El impuesto es: "+impuesto);
        System.out.println("El total es: "+total);

    }

    static void beca(){
        double beca, edad, promedio;
        System.out.println("Ingresa el valor de edad: ");
        edad = tl.nextDouble();
        
        System.out.println("Ingresa el valor de promedio: ");
        promedio = tl.nextDouble();
        
        beca=0;
        if(edad>18&&promedio>=18)
            beca=2000;
        if(edad>18&&promedio>=16&&promedio<18)
            beca=1000;
        if(edad>18&&promedio>=13&&promedio<16)
            beca=500;
        if(edad<=18&&promedio>=18)
            beca=3000;
        if(edad<=18&&promedio>=16&&promedio<18)
            beca=2000;
        if(edad>18&&promedio>=13&&promedio<16)
            beca=100;
        if(promedio<13)
            System.out.println("Estudia mas.");
        System.out.println("Valor de beca: " + beca);
    }

    static void triangulo(){
        double ladoa, ladob, ladoc;
        System.out.println("Ingresa el valor de lado a: ");
        ladoa = tl.nextDouble();
        
        System.out.println("Ingresa el valor de lado b: ");
        ladob = tl.nextDouble();
        
        System.out.println("Ingresa el valor de lado c: ");
        ladoc = tl.nextDouble();
        
        if(ladoa==ladob&&ladoa==ladoc)
            System.out.println("Equilatero");
        if((ladoa==ladob&&ladoa!=ladoc)||(ladoa==ladoc&&ladoa!=ladob)||(ladob==ladoc&&ladob!=ladoa))
            System.out.println("Isosceles");
        if(ladoa!=ladob&&ladoa!=ladoc&&ladob!=ladoc)
            System.out.println("Escaleno");
    }



    public static void main(String[] args){
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // beca();
        triangulo();
    }
}
