
package com.mycompany.matrices;

import java.util.Scanner;


public class Matriz04 {
    public static void main(String[] args) {
        
        Scanner Lector = new Scanner(System.in);
        int[][] matriz;
        int filas,columnas,sumafil=0,sumacol=0;
        
        System.out.println("Ingrese la cantidad de filas:");
        filas=Lector.nextInt();
        System.out.println("Ingrese la cantidad decolumnas");
        columnas=Lector.nextInt();
       
        matriz= new int[filas][columnas];
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("Matriz:"+"["+i+"]"+"["+j+"]");
                matriz[i][j]=Lector.nextInt();
            }
            System.out.println("");
        }
        
        
        System.out.println("\nMatriz");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.println("");
        }
        
        //sumamos las filas.
        for(int i=0;i<filas;i++){
            sumafil=0;
            for(int j=0;j<columnas;j++){
                sumafil+=matriz[i][j];
            }
            System.out.println("\nLa suma de la fila ["+i+"] es: "+sumafil);
        }
        
        for(int j=0;j<columnas;j++){
            sumacol=0;
            for(int i=0;i<filas;i++){
                    sumacol+=matriz[i][j];
            }
            System.out.println("\nLa suma de la columna ["+j+"] es: "+sumacol);
        }
        
        
      
    } 
}
