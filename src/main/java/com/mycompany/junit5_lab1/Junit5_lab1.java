/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.junit5_lab1;

/**
 *
 * @author Admin
 */
public class Junit5_lab1 {

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 6, 4, 8, 9, 11};
        
        int sum = 0;
        for(int x : a)
            if(Utils.ktNt(x) == true)
                sum += x;
        System.out.println("Sum: " + sum);
    }
}
