/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int  t=0, p=1, hasil=0;
        String s = JOptionPane.showInputDialog("Masukkan banyaknya deret Fibonacci: " );
        int x = Integer.parseInt(s);
        for(int i=1; i<=x; i++){
        t=p;
        p=hasil;
        System.out.print(hasil+" ");
        hasil=t+p;
        }
    }
//ini udah dirubah menjadi deret sesuai jumlah yang kita inginkan kaka :)
}
    
