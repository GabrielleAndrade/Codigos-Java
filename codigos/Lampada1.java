
package codigos;


public class Lampada1 {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    boolean ligada;
    
    
    public void statusLampada(){
        if (ligada==true){
            System.out.println("A lampada esta ligada.");
        }else {
            System.out.println("A lampada esta desligada.");
        }
    }
   
}
