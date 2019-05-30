/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author drmorales4
 */
public class DemoRandomico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random(4);
        
        int v = aleatorios.nextInt();
        System.out.printf("%d\n", v);
        
    }
    
}
