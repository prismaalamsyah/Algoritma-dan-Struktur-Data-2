/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmatrix;

/**
 *
 * @author Prisma Alamsyah
 */
public class penguranganmatrix3x2 {
    public static void main(String[] args) {
        int [][] MatrixA = {
            {16, 32},
            {64, 128},
            {192, 224}
        };
        int [][] MatrixB = {
            {8, 21},
            {31, 45},
            {87, 52}
        };
        if((MatrixA.length == MatrixB.length) && (MatrixA[0].length == MatrixB[0].length)){
            int [][] C = new int[MatrixA.length][MatrixA[0].length];
            for(int i=0; i<MatrixA.length; i++){
                for(int j=0; j<MatrixA[0].length; j++){
                    C[i][j] = MatrixA[i][j] - MatrixB[i][j];
                }
            }
            for(int[]c: C){
                for(int q: c){
                    System.out.print(q+ " ");
                }
                System.out.println();
            }
        }
        identitas.prisma(args);
    }
}

