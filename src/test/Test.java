/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import genericos.ClaseGenerica;

/**
 *
 * @author Alumno Mañana
 */
public class Test {
    public static void main(String[] args) {
        ClaseGenerica<Integer> obtInt = new ClaseGenerica(15);
        obtInt.obtenerTipo();
        
        ClaseGenerica<String> obtInt2 = new ClaseGenerica("Iker");
        obtInt2.obtenerTipo();
    }
}
