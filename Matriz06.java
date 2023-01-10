
package com.mycompany.matrices;

import java.util.Scanner;

public class Matriz06 {
    public static void main(String[] args) {
        
        Scanner Lector = new Scanner(System.in);
        
        int marco[][]= new int[5][5];
        
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0 || j==0){
                
                    marco[i][j]=1; 
                    
                    //i==0||i==4||j==0||j==4)
                    
                }else if(i==4 || j== 4){
                
                    marco[i][j]=1;
                    
                }else{
                    marco[i][j]=0;
                }
            }
        }
        
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(marco[i][j]+" | ");
            }
            System.out.println("");
        }
        
    }  
}
