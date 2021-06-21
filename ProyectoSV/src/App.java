import pe.edu.upeu.SubProgramas;

public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("*******Operaciones Basicas********");
        /*OperacionesMat objOB=new OperacionesMat();//Un objeto
        objOB.operacionesBasicas();*/
        Teclado tec=new Teclado();
        SubProgramas objSP=new SubProgramas();
        int numero=tec.leer(0, "Ingrese un numero");
        System.out.println("Factorial Iterativo:"+objSP.factorialBig(numero));
        System.out.println("Factorial Recursivo:"+objSP.factorialRecurvBig(numero));
    }
}
