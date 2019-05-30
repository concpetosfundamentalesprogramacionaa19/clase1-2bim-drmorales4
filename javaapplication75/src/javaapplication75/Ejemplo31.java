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
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();
        
        int[] datos = new int[6];
        String[] rangos = {"0-8", "8.1 - 12", "12.1 - 16", "16.1 - 19", "19.1 "
                + "- 20", "20.1 - ∞"};
        
        int numNotas;
        int contNotas = 1; // contador para que el usario sepa que nota esta ingresando
        
        // el usario ingresa la cantidad de notas que quiere ingresar
        System.out.println("Ingrese la cantidad de notas que desea ingresar: ");
        numNotas = entrada.nextInt();
        // arreglo con el numero de notas que el usario quiere
        double[] notas = new double [numNotas];
        
        for (int cont = 0; cont < notas.length; cont++) { // ingreso de las notas
            System.out.printf("Ingrese la nota %d: ", contNotas);
            notas[cont] = entrada.nextDouble();
            contNotas = contNotas + 1;
            
        }
        
        for (int i = 0; i < notas.length; i++) { // contabilizar las notas
            
            if (notas[i] >= 0 && notas [i]<=8) {
                datos[0] = datos[0] + 1;
                
            }else{
                if (notas[i] > 8 && notas[i] <= 12) {
                    datos[1] = datos[1] + 1;
                    
                }else{
                    if (notas[i] > 12 && notas[i] <= 16) {
                        datos[2] = datos[2] + 1;
                        
                    }else{
                        if (notas[i] > 16 && notas[i] <= 19) {
                            datos[3] = datos[3] + 1;
                            
                        }else{
                            if (notas[1] > 19 && notas[i] <= 20) {
                                datos[4] = datos[4] + 1;
                                
                            }else{
                                if (notas[i] > 20) {
                                    datos[5] = datos[5] + 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        
        System.out.println("\nResultados\n");
        
        for(int j = 0; j < datos.length; j++){
            System.out.printf("Notas de %s = %d\n", rangos[j], datos[j]);
        }
        


    }
}
