import java.util.Scanner;

public class Ejercicios{
   static Scanner entrada=new Scanner(System.in);
    
    public static void ejercicio1(){
        int nhamburguesas, Hsimple=0, Hdoble=0, Htriple=0;
        System.out.println("Ingrese la cantidad de hamburguesas: ");
        nhamburguesas= entrada.nextInt();
        for (int hamburguesas = 1; hamburguesas <=nhamburguesas; hamburguesas++){
            System.out.println("Ingrese cantidad (S=Sencillas, D=Dobles y T=Triples) de hamburguesas # "+hamburguesas+":");
            String tipo=entrada.next();
            if(tipo.toUpperCase().equals("S")){Hsimple++; }
            if(tipo.toUpperCase().equals("D")){Hdoble=Hdoble+1; }
            if(tipo.toUpperCase().equals("T")){Htriple+=1; }
        }
            System.out.println("Total a pagar:\n"+((Hsimple*20)+(Hdoble*25)+(Htriple*28)));
            System.out.println("Pago con tarjeta:\n"+(((Hsimple*20)+(Hdoble*25)+(Htriple*28))*0.5+((Hsimple*20)+(Hdoble*25)+(Htriple*28))));

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
        System.out.println("Del total de focos:\n"+fverde+" son verde(s)\n"+fblanco+" son blanco(s)\n"+frojo+" son rojo(s)\n en total son :"+nFocos);
    }

    public static void ejercicio3(){
        int t;
        System.out.println("Ingrese un numero para obtener la tabla de multiplicar:");
        t=entrada.nextInt();
        System.out.println("tabla del "+t);
        for(int i= 1; i<=12; i++){
            System.out.println(t+"*"+i+"="+t*i);
        }
    }

    public static void ejercicio4(){
        double a;
        try{
            System.out.println("Introduce un angulo (0...360): ");
            a=entrada.nextDouble();
            anguloCal(a);
        }
         catch(Exception e){
            System.out.println("Datos incorrectos.");
        }
        
    }    
      static void anguloCal(double a){
        double b = Math.toRadians(a);
        System.out.println("Seno de " + a + " es: " + Math.sin(b));
        }
     
    public static void ejercicio5(){
        int i, n;
        double compras, ganacia, intereses, multa, pagoanterior;
        double pagominimo, pagointereses, saldoactual, saldoanterior;
        ganacia = 0;
        System.out.print("Ingresa el valor de n: ");
        n = entrada.nextInt();
       
        for (i=1; i<=n; i++) {
            
            System.out.println("Ingresa el valor de compras realizadas: ");
            compras = entrada.nextDouble();
            
            System.out.println("Ingresa el valor de pago del corte anterior: ");
            pagoanterior = entrada.nextDouble();
            
            System.out.println("Ingresa el valor de saldo anterior: ");
            saldoanterior = entrada.nextDouble();
            
            if(saldoanterior*0.15>pagoanterior){
            
                intereses=saldoanterior*0.12;
                multa=200;
            }
            else{
            
                intereses=0;
                multa=0;
            }
            saldoactual=saldoanterior+compras-pagoanterior+intereses+multa;
            pagominimo=saldoactual*0.15;
            pagointereses=saldoactual*0.85;
            ganacia=ganacia+intereses;
            System.out.println("Valor de intereses: " + intereses);
            System.out.println("Valor de multa: " + multa);
            System.out.println("Valor de pago minimo: " + pagominimo);
            System.out.println("Valor de pago para no generar intereses: " + pagointereses);
            System.out.println("Valor de saldo actual: " + saldoactual);
            
        }
        System.out.println("Valor de ganacia por intereses: " + ganacia);
        
    }

    public static void ejercicio6(){
        int i, n;
        double categoria1, categoria2, categoria3, clave, costo;
        double impuesto, impuestopagar;
        categoria1 = 0;
        categoria2 = 0;
        categoria3 = 0;
        impuestopagar = 0;
        System.out.println("Ingresa numero de vehiculos: ");
        n = entrada.nextInt();
        for (i=1; i<=n; i++) {
            System.out.print("Ingresa el valor de clave: ");
            clave = entrada.nextDouble();
            entrada.nextLine();
            System.out.print("Ingresa el valor de costo: ");
            costo = entrada.nextDouble();
            impuesto=0;
            if(clave==1)
            {
                impuesto=costo*0.1;
                categoria1=categoria1+impuesto;
            }
            if(clave==2)
            {
                impuesto=costo*0.07;
                categoria2=categoria2+impuesto;
            }
            if(clave==3)
            {
                impuesto=costo*0.05;
                categoria3=categoria3+impuesto;
            }
            impuestopagar=impuestopagar+impuesto;
            System.out.println("Valor de impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("Valor de categoria 1: " + categoria1);
        System.out.println("Valor de categoria 2: " + categoria2);
        System.out.println("Valor de categoria 3: " + categoria3);
        System.out.println("Valor de impuesto a pagar: " + impuestopagar);
    }

    public static void ejercicio7(){
        int i;
        double salarioinicial, salariorecibido, year;
        for (i=1; i<=6; i++){
            salarioinicial=1500;
            year=i;
            salariorecibido=salarioinicial*Math.pow(1.1,year);
            System.out.println("Valor de salario inicial: " + salarioinicial);
            System.out.println("Valor de salario recibido: " + salariorecibido);
            System.out.println("Valor de year: " + year);
        }
    }
    
    public static void ejercicio8(){
        int i=1, n=0;
        float cal=0;
        int ap=0, rp=0;
        System.out.println("Intriduce el numero de alumnos: ");
        n=entrada.nextInt();
        while(i<=n){
            System.out.println("Calificacion del alumno"+i);
            cal=entrada.nextFloat();
            if(cal>=11){
                ap=ap+1;
            }
            else{
                rp=rp+1;
            }
            i++;
        }
        System.out.println("El numero de aprobados es: "+ap);
        System.out.println("El numero de reprobados es: "+rp);
    }

    public static void ejercicio9(){
        double cubo, numero;
        String teclarepetir;
        do{
            System.out.println("Ingrese el valor de un numero: ");
            numero=entrada.nextDouble();
            cubo=numero*numero*numero;
            System.out.println("Valor de cubo: "+cubo);
            do{
                System.out.println("\u00BFDesea repetir? (S/N):");
                teclarepetir=entrada.nextLine();
            } while(!teclarepetir.equalsIgnoreCase("S") && !teclarepetir.equalsIgnoreCase("n"));
        } while(teclarepetir.equalsIgnoreCase("S"));
        
    }

    public static void ejercicio10(){
        double P, i, n;
        double ahorros=0.00d;
        n=2021-1961;
        P=1500.0;
        i=15.0/100.0;
        ahorros=P*Math.pow(1.0+i,n);
        System.out.println("Valor de venta: " + P);
        System.out.println("Valor de ahorros: " + ahorros);
        
        
    }


    public static void main(String[]args){
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        ejercicio10();
    }
}
