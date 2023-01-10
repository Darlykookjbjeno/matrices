
package com.mycompany.matrices;

import java.util.Scanner;

public class Matrices01 {
    
     public static void main(String[] args) {
        
        Scanner Lector = new Scanner(System.in);
        
        int matriz[][]= new  int[3][3];
        int matrizD[][]= new  int[3][3];
        int filas,columnas;
        int sumas=0;

        
        System.out.println("\nMatriz #1");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("matriz:"+"["+i+"]"+"["+j+"]");
                matriz[i][j]= Lector.nextInt();
            }
        }
        
         System.out.println("\nmatriz #2");
         for(int i=0;i<matrizD.length;i++){
            for(int j=0;j<matrizD.length;j++){
                System.out.println("matriz:"+"["+i+"]"+"["+j+"]");
                matrizD[i][j]= Lector.nextInt();
            }
        }
        
        
        System.out.println("\nMostrando su matriz #1:");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.println();
        }
        
        System.out.println("\nMostrando su matriz #2:");
        for(int i=0;i<matrizD.length;i++){
            for(int j=0;j<matrizD.length;j++){
                System.out.print(matrizD[i][j]+" | ");
            }
            System.out.println();
        }
        
        
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j]+=matrizD[i][j];
            }
        }
        
        System.out.println("\nMostrando la suma de matrices");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.println();
        }
     }
}
