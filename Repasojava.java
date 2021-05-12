import java.util.Scanner;

public class Repasojava {
    static Scanner objTecla1=new Scanner(System.in);
    static int a=10;
    static char b=8;
    short c;
    float d;
    static double e=5;
    long f;
    String g="asdffgghj";
    Integer j=54;
    Double h=54.2;
    Long m=(long)87;

public static void saludo() {
    System.out.println("Dime tu nombre: ");
    String nombre=objTecla1.next();
    System.out.println("Hola "+nombre);
}

public static void saludo2() {
    System.out.println("Hola mundo");
}
public static void operacionesBasicas(){
    System.out.println("Suma: "+(a+e));
    System.out.println("Resta: "+(a-e));
    System.out.println("Divicion: "+(a/e));
    System.out.println("Multiplicacion: "+(a*e));
    System.out.println("Potencia: "+(Math.pow(a, e)));
}
public void operacionesBasicas2(){
    System.out.println("Suma: "+(a+e));
    System.out.println("Resta: "+(a-e));
    System.out.println("Divicion: "+(a/e));
    System.out.println("Multiplicacion: "+(a*e));
    System.out.println("Potencia: "+(Math.pow(a, e)));
}

public static void main(String[] args) {
    // saludo2();
    // saludo();
    // operacionesBasicas();
    Repasojava objRJ=new Repasojava();
    objRJ.operacionesBasicas2();


    
}
}