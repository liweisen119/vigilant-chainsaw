package ArraysCollections;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.5;
        notasAlunoA[2] = 6.7;

        for(int i = 0; i <= notasAlunoA.length - 1; i++) {
            System.out.println(notasAlunoA[i]);
        }

        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        System.out.println(Arrays.toString(notasAlunoA));

        double[] notasAlunoB = { 6.9, 8.0, 5.5, 10 };

        for(int i = 0; i <= notasAlunoB.length - 1; i++) {
            System.out.println(notasAlunoB[i]);
        }
    }
}
