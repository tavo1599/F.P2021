import java.util.Scanner;
class AreaTriangulo{
  static Scanner teclado=new Scanner(System.in);
  public static void main(String[] arg){
    //Definir Variables y otros
    System.out.println("Ejercicio 01: Area Triangulo");
    int b, h, area;
    //Datos de entrada por dispositivos de entrada
    System.out.println("Ingrese Base:");
    b=teclado.nextInt();
    System.out.println("Ingrese Altura:");
    h=teclado.nextInt();
    //Proceso
    area=(b*h)/2;
    //Datos de salida
    System.out.println("El area es:"+area);
  }  
}