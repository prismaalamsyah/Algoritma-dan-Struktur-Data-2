/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmatrix;

/**
 * 
 * 
 *
 * @author Prisma Alamsyah
 */
public class matrix3x3 {
    public static void main(String[] args) {
        int[][] matrix3x3 = {
            {34, 56, 41},
            {45, 36, 37},
            {51, 32, 46}
        };
        
        for(int i=0; i< matrix3x3.length; i++){
            for(int j=0; j< matrix3x3[0].length; j++){
                System.out.print(matrix3x3[i][j]+" ");
            }
            System.out.println();
        }
        identitas.prisma(args);
    }
    
}
