package vetores;

import java.util.Scanner;

/**
 * ler as duas notas bimestrais pra um conjunto de 10 alunos armaenar as notas
 * em 2 vetores float progrm que calcule a media artm das notas armazenando em
 * um vetor result do msm tipo e taamanho.exibir a situação de cada aluno se >=7
 * aprovado else reprovado
 *
 */
public class ExercicioVetores19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float[] nota1 = new float[5];
        float[] nota2 = new float[5];
        float[] result = new float[5];
        float soma;

        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Digite a primeira nota do aluno: " + i);
            nota1[i] = s.nextFloat();
            System.out.println("Digite a segunda nota do aluno: " + i);
            nota2[i] = s.nextFloat();
            soma = (nota1[i] + nota2[i]);
            result[i] = soma / 2;

        }
        System.out.print("Valores das notas 1: ");
        for (int i = 0; i < nota1.length; i++) {
            System.out.print(nota1[i] + " ");
        }
        System.out.print(" Valores das notas 2: ");
        for (int i = 0; i < nota2.length; i++) {
            System.out.print(nota2[i] + " ");
            System.out.println();
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("O aluno " + i + "teve a nota: ");
            System.out.println(result[i]);
            if (result[i] >= 7) {
                System.out.println("E foi aprovado.");
            } else {
                System.out.println("E foi reprovado.");
            }
        }
    }

}
