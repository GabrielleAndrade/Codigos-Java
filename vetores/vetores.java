package vetores;
import java.util.Scanner;
public class vetores {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a = new int[5];
        int[] b= new int[a.length];
        for(int i=0;i<a.length;i++){
         System.out.println("valor da posição: "+i);
        a[i]=s.nextInt();
        b[i]=a[i];
        }
        System.out.print("Vetor a = ");
            for (int i =0;i<a.length;i++){
                System.out.print(a[i]+ " ");      
        }
            System.out.print("Vetor b = ");
            for (int i =0;i<b.length;i++){
                System.out.print(b[i]+ " ");
        }
}   
}   
