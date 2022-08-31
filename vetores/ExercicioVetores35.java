

package vetores;
/**
 *vetor a com 11.cada elemento de A é formado pela potencia de base 2 elevado
 * ao expoente igual a posição do elemento:a[i]=2 elevado a i
 * 
 */
public class ExercicioVetores35 {

    public static void main(String[] args) {
      int[] a = new int[11];
        for(int i=0;i<a.length;i++){
            a[i]=(int)Math.pow(2, i);
        }
        System.out.println("Valores em A :");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+ " ");
        }
    }
}
