package com.loggro;

/**
 * Solución al problema de los bloques ABC.
 *
 * Colección de 20 bloques con 2 letras cada uno:
 * (B O) (X K) (D Q) (C P) (N A) (G T) (R E) (T G) (Q D) (F S)
 * (H U) (V I) (A T) (O B) (E R) (F S) (L Y) (P C) (Z M) (J W)
 *
 * Reglas:
 * 1. Una vez que se usa una letra en un bloque, ese bloque no se puede usar nuevamente.
 * 2. No distingue entre mayúsculas y minúsculas.
 */
public class BloquesABC {

    private static final char[][] BLOQUES = {
        {'B', 'O'}, {'X', 'K'}, {'D', 'Q'}, {'C', 'P'}, {'N', 'A'},
        {'G', 'T'}, {'R', 'E'}, {'T', 'G'}, {'Q', 'D'}, {'F', 'S'},
        {'H', 'U'}, {'V', 'I'}, {'A', 'T'}, {'O', 'B'}, {'E', 'R'},
        {'F', 'S'}, {'L', 'Y'}, {'P', 'C'}, {'Z', 'M'}, {'J', 'W'}
    };

    /**
     * Determina si la palabra dada puede ser escrita usando la colección de bloques.
     *
     * @param palabra la palabra a verificar (puede ser mayúscula o minúscula)
     * @return true si la palabra puede ser escrita, false en caso contrario
     */
    public boolean puedoObtenerPalabra(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return true;
        }
        String palabraUpper = palabra.toUpperCase();
        boolean[] usados = new boolean[BLOQUES.length];
        return resolver(palabraUpper, 0, usados);
    }

    /**
     * Método recursivo con backtracking para verificar si la palabra puede formarse.
     *
     * @param palabra    la palabra en mayúsculas
     * @param posicion   índice actual de la letra a colocar
     * @param usados     array que indica qué bloques ya han sido usados
     * @return true si se puede completar la palabra desde esta posición
     */
    private boolean resolver(String palabra, int posicion, boolean[] usados) {
        if (posicion == palabra.length()) {
            return true;
        }

        char letra = palabra.charAt(posicion);

        for (int i = 0; i < BLOQUES.length; i++) {
            if (!usados[i] && contieneLetra(BLOQUES[i], letra)) {
                usados[i] = true;
                if (resolver(palabra, posicion + 1, usados)) {
                    return true;
                }
                usados[i] = false;
            }
        }

        return false;
    }

    /**
     * Verifica si un bloque contiene la letra indicada.
     *
     * @param bloque el bloque (array de 2 caracteres)
     * @param letra  la letra a buscar
     * @return true si el bloque contiene la letra
     */
    private boolean contieneLetra(char[] bloque, char letra) {
        return bloque[0] == letra || bloque[1] == letra;
    }
}
