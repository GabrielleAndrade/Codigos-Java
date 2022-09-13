
package codigos;


public class ContaCorrente {
    public static void main(String[] args) {
        ContaCorrente01 conta = new ContaCorrente01();
        conta.num="12345";
        conta.saldo=200;
        conta.depositarDinheiro(50);
        conta.especial=true;
        conta.saque();
        System.out.println(conta.saldo);
    }
}
