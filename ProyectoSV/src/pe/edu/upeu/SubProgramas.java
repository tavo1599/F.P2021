package pe.edu.upeu;

public class SubProgramas {
    public int factorial(int numero){
        int resultF=1;
        if(numero>1){
            for (int i = 1; i <= numero; i++){
                resultF*=i;
            }
        }
        return resultF;
    }
    public int potencia(int numero){
        return 0;
    }
    public void funcionExponencial() {
        System.out.println("Factorial:"+factorial(5));
    }
}
