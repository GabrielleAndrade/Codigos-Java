
package codigos;


public class Lampada {

    public static void main(String[] args) {
       Lampada1 lampada01= new Lampada1();
       
       lampada01.cor="amarela";
       lampada01.ligada=false;
       lampada01.statusLampada();
        System.out.println(lampada01.cor);
    }
}
