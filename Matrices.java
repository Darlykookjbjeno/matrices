
package com.mycompany.matrices;

import java.util.Scanner;
public class Matrices {

    public static void main(String[] args) {
        
        Scanner Lector = new Scanner(System.in);
        
        int matriz[][],filas,columnas;
        boolean simetrica=true;
         
        System.out.println("Escriba la cantidad de filas que desea:");
        filas= Lector.nextInt();
        System.out.println("Escriba las cantidad de columnas que desea:");
        columnas= Lector.nextInt();
        
        matriz =new int[filas][columnas];
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.println("matriz:"+"["+i+"]"+"["+j+"]");
                matriz[i][j]= Lector.nextInt();
            }
        }
        
       
        
        //cambiar matriz inversa
        
        
        
         if(filas == columnas){
            int i,j;
            i=0;
            while((i<filas) && (simetrica)){
                j=0;
                while((j<i) && (simetrica)){
                    if(matriz[i][j]!=matriz[j][i]){
                        simetrica=false;
                    }
                    j++;
                }
                i++;
            }
            if(simetrica){
                System.out.println("Su matriz es simétrica.");
            }
            else{
                System.out.println("Su matriz NO es simétrica.");
            }
        }
        else{
             System.out.println("La matriz no es simétrica.");
        }
        System.out.println("\nMostrando su matriz:");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.println();
        }
        System.out.println("\nMostrando su matriz transpuesta:");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matriz[j][i]+" | ");
            }
            System.out.println();
        }
  
        
    }
}
