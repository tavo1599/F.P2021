import java.util.Scanner;

public class Ejercicios{
   static Scanner entrada=new Scanner(System.in);
    
    public static void ejercicio1(){
        int tiempo = 0;
        int salario = 1500;
        double bono = 0;
        double aumento= 0.10;

        System.out.println("Ingrese los años de trabajo: ");
        tiempo=entrada.nextInt();
        if(tiempo==1){
        bono = salario*aumento+salario;
        System.out.println("Salario recibido: "+bono);
        }
        if(tiempo==2){
            bono = (salario*aumento+salario)*aumento+(salario*aumento+salario);
            System.out.println("Salario recibido: "+bono);
        } 
        if(tiempo==3){
            bono = ((salario*aumento+salario)*aumento+(salario*aumento+salario))*aumento+((salario*aumento+salario)*aumento+(salario*aumento+salario));
            System.out.println("Salario recibido: "+bono);
        }
        if(tiempo==4){
            bono = ((salario*aumento+salario)*aumento);
        }
        
    }
    public static void ejercicio2(){
        int nFocos, fverde=0, fblanco=0, frojo=0;
        System.out.println("Ingrese la cantidad de focos: ");
        nFocos= entrada.nextInt();
        for (int foco = 1; foco <=nFocos; foco++){
            System.out.println("Ingrese color (V=Verde, B=Blanco y R=Rojo)de foco # "+foco+":");
            String color=entrada.next();
            if(color.toUpperCase().equals("V")){fverde++; }
            if(color.toUpperCase().equals("B")){fblanco=fblanco+1; }
            if(color.toUpperCase().equals("R")){frojo+=1; }
        }
        System.out.println("Del total de focos:\n"+fverde+"son verde(s)\n"+fblanco+"son blanco(s)\n"+frojo+"son rojo(s)\nen total son :"+nFocos);
    }
    public static void main(String[]args){
        // ejercicio1();
        ejercicio2();
    }
}
