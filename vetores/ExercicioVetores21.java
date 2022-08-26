package vetores;
/**
 *gerar aleatoriamente vetor a com 10 int e iguais a 0e1
 * implementar programa que determine o percentual de numeros 0 e 1 no vetor a. 
 */
public class ExercicioVetores21 {

    public static void main(String[] args) {
        int[] a= new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=(int)Math.round(Math.random());
            
        }
        int par=0;
         for(int i=0;i<a.length;i++){
         if(a[i]%2==0){
         par++;    
         }    
         }
        int impar=a.length-par;
        float perImpar=(impar*100)/a.length;
        float perPar=100-perImpar;
        System.out.println("Valores no vetor A: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");    
        }
        System.out.println("Porcentagem de pares: "+ perPar+ "%.");
        System.out.println("Porcentagem de impares: "+ perImpar+ "%.");
        
    }
}
