/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

/**
 *
 * @author Washim_Akram
 */
interface I {

    class C implements I{
        public void methodI(int i){
            System.out.println(i);
        }
        public static void main(String[] args) {
            C obj=new C();
    
    obj.methodI(4);
    }
    }
    
    
}
