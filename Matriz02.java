
package com.mycompany.matrices;

import java.util.Scanner;


public class Matriz02 {
     public static void main(String[] args) {
        
        Scanner Lector = new Scanner(System.in);
     
        int matriz[][]={{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println("\nOriginal:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.println();
        }
       
        System.out.println("\nMostrando su matriz transpuesta:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[j][i]+" | ");
            }
            System.out.println();
        }
     }
}
