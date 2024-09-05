/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid2;

import java.util.Scanner;


public class Mid2 {

    public static void main(String[] args) {
         
        int[][] intArray = { { 1, 2 }, {2,1 }, {2,2} , {2,3}, {3,1}, {3,2}, {3,3} }; 
        System.out.println("Enter the position to change the value: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        intArray[0][0]={a,b};
        
        
        for (int i = 0; i < 9; i++) { 
            for (int j = 0; j < 2; j++) { 
            System.out.print(intArray [i][j]); 
            } 

        } 
    }
}
