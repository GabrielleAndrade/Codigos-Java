
package codigos;

import java.util.Scanner;


public class ContaCorrente01 {
    Scanner s = new Scanner(System.in);
    String num;
    double saldo;
    double limite;
    boolean especial;

  
    public void saque(){
        double saque;
        System.out.println("Digite o valor de saque: ");
        saque=s.nextDouble();
        if(!(saque>saldo)){
         saldo-=saque;
        }
    }
    double depositarDinheiro(double deposito){
        return saldo+=deposito;
    }
    double consultarSaldo(){
        return saldo; 
    }
    public void chequeEspecial(){
        if(especial){
            System.out.println("o cliente tem cheque especial.");
        }else {
            System.out.println("O cliente nao usa cheque especial.");
        }
        
    }
    
}
