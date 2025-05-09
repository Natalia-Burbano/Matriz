package org.uniquindio.edu.co.poo.app;
import org.uniquindio.edu.co.poo.model.Matriz;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //pide al usuario que ingrese el tamaño de la matriz
        int filas = ingresarCoordenadasMatriz("Ingrese el numero de las filas: ");
        int columnas = ingresarCoordenadasMatriz("Ingrese el numero de las columnas: ");

        //Crea el objeto Matriz
        Matriz matrizAux = new Matriz(filas, columnas);

        int matrizUsuario[][] = matrizAux.getMatriz();

        //pide el valor de cada fila y columna para ir rellenandola
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizUsuario[i][j] = ingresarNumero("ingrese el valor de la cordenada "+i+" "+j+" De la matriz: ");
            }
        }

        //Muestra las dos matrices
        JOptionPane.showMessageDialog(null, "Matriz original\n"+imprimirMatriz(matrizUsuario, filas, columnas));
        int matrizGirada[][] = matrizAux.girarMatrizDerecha(matrizUsuario);
        JOptionPane.showMessageDialog(null, "Matriz girada\n"+imprimirMatriz(matrizGirada, columnas, filas));

    }

    //Recorre la matriz para formar un String con los valores separados por espacios y saltos de línea.
    public static String imprimirMatriz(int[][] m, int fila, int columna) {
        String resultado = "";
        for(int i = 0; i < fila; i++) {
            for(int j = 0; j < columna; j++) {
                resultado += m[i][j]+"  ";
            }
            resultado += "\n";
        }
        return resultado;
    }

    //valida que no se ingrese un dato invalido
    public static int ingresarNumero(String texto){
        int numero = 0;
        boolean salida = false;
        while(!salida){
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(texto));
                salida = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            }
        }

        return numero;
    }

    // valida que no se ingrese un dato invalido
    public static int ingresarCoordenadasMatriz(String texto){
        int numero = 0;
        boolean salida = false;
        while(!salida){
            try{
                numero = Integer.parseInt(JOptionPane.showInputDialog(texto));
                if (numero <= 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                }

                salida = true;
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            }
        }
        return numero;
    }
}