
/*Ejercicio 6: Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y transponerla en la segunda.*/
package com.mycompany.matrices;

import java.util.Scanner;

public class Matriz05 {
    public static void main(String[] args) {
        
        Scanner Lector = new Scanner(System.in);
       
       int uno[][]=new int[5][9];
       int dos[][]=new int[9][5];
       
       for(int i=0;i<5;i++){
           for(int j=0;j<9;j++){
               System.out.print("matriz:"+"["+i+"]"+"["+j+"] :");
               uno[i][j]=Lector.nextInt();
           }
           System.out.println("");
       }
       
       
       //transponiendo:
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                dos[j][i]=uno[i][j];
            }
        }
        
       //original
       
        System.out.println("\nMatriz");
       for(int i=0;i<5;i++){
           for(int j=0;j<9;j++){
               System.out.print(uno[i][j]+" | ");
           }
           System.out.println("");
       }
       
       //transpuesta
       System.out.println("\nMatriz Transpuesta");
       for(int i=0;i<9;i++){
           for(int j=0;j<5;j++){
               System.out.print(dos[i][j]+" | ");
           }
           System.out.println("");
       }
    }
}
