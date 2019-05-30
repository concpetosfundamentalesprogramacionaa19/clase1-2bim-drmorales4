/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

/**
 *
 * @author drmorales4
 */
public class ArregloSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] c = new int[10]; // declaramos la variable
        System.out.println("-----------------------------------------------");
        for (int contador = 0; contador < c.length; contador++) {
            System.out.printf("%d\t\t%d\n", contador, c[contador]);
        }
        
        for (int contador = 0; contador < c.length; contador++) {
            c[contador] = 100+contador;
        }
        
        System.out.println("-----------------------------------------------");
        for (int contador = 0; contador < c.length; contador++) {
            System.out.printf("%d\t\t%d\n", contador, c[contador]);
        }
        
    }

}
