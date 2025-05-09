package org.uniquindio.edu.co.poo.model;

public class Matriz {
        private int filas;
        private int columnas;
        private int[][] matriz;

        public Matriz(int filas, int columnas) {
            this.filas = filas;
            this.columnas = columnas;
            matriz = new int[filas][columnas];
        }

    //Crea una nueva matriz de tamaño columnas x filas (porque al girar las filas y columnas se invierten).
        public int [][] girarMatrizDerecha(int[][] matriz) {

            //Crea una nueva matriz vacía de tamaño columnas x filas, porque al girar, las filas y columnas se invierten.
            int matrizEditada[][] = new int[columnas][filas];
            int indiceFila = 0;
            for (int i = 0; i < columnas; i++) {
                int indiceColumna = 0;
                //recorre el numero de filas desde la ultima posicion hasta la primera
                for (int j = filas - 1; j >= 0; j--) {
                    matrizEditada[indiceFila][indiceColumna] = matriz[j][i];
                    indiceColumna++;
                }
                indiceFila++;
            }
            return matrizEditada;
        }

    public int[][] getMatriz() {
        return matriz;
    }
}

