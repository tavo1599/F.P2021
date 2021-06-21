package pe.edu.upeu;

import java.math.BigInteger;

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
    public BigInteger factorialBig(int numero) { 
        BigInteger resultF=new BigInteger("1");
        if(numero>1){
            for (int i = 1; i <= numero; i++) {
                resultF=resultF.multiply(new BigInteger(String.valueOf(i)));
            }
        }   
        return resultF;
    }    

    public BigInteger factorialRecurvBig(int numero) {
        BigInteger resultF=new BigInteger("1");
        if(numero>1){
            return factorialRecurvBig(numero-1).multiply(new BigInteger(String.valueOf(numero)));          
        } else{
            return resultF; 
        }                        
    }
    public int fibonacci(int numFinal){
        int numAnt=0, numNue=1,numTem=0,contador=1;
        while(contador<numFinal){
          numTem=numNue;
          numNue=numAnt+numNue;
          numAnt=numTem;     
          contador++;
        }
        return numNue;
    } 
}
