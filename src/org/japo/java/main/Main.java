/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Casimiro Ondo Obiang casimiro.ondo.alum@iescamp.es
 */
public class Main {
    public static final Random RDM= new Random();
    public static void main(String[] args) {
        //ejercicio 03306-RespuestasAlteatoriaRepeticion
        //Constante
        final int TEST_MIN = 1;
        final int TEST_MAX = 11;
        final int N_INICIO = 0;
        final int N_FINAL = 10;
       
        //variable
       //bucle
       for(int i=TEST_MIN; i<TEST_MAX; i++){
           int logico =RDM.nextInt(N_FINAL-N_INICIO+1)+N_INICIO;
           System.out.printf("Respuesta %d....: %d%n", i, logico);
       }
    }
}
