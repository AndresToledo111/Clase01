/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01;

/**
 *
 * @author patri
 */
public class Clase01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        double promedio;
        String cadena = "ssspatriciosss";
        char letra = '1';

        String[] letras = {"a", "b", "c", "d", "e"};
        System.out.println("el largo del arreglo es " + letras.length);

        boolean esMenorADos = true;

        for (String let : letras) {
            System.out.println("let = " + let);
        }

        for (int i = 0; i < letras.length; i++) {
            System.out.println("indice " + i);
            System.out.println("letra " + letras[i]);
        }
//OTra clase Objeto c:
    }

}
