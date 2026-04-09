package com.loggro;

public class BloquesABC {

    private static final char[][] BLOQUES = {
        {'B', 'O'}, {'X', 'K'}, {'D', 'Q'}, {'C', 'P'}, {'N', 'A'},
        {'G', 'T'}, {'R', 'E'}, {'T', 'G'}, {'Q', 'D'}, {'F', 'S'},
        {'H', 'U'}, {'V', 'I'}, {'A', 'T'}, {'O', 'B'}, {'E', 'R'},
        {'F', 'S'}, {'L', 'Y'}, {'P', 'C'}, {'Z', 'M'}, {'J', 'W'}
    };

    public boolean puedoObtenerPalabra(String palabra) {
        if (palabra == null || palabra.isBlank()) {
            return true;
        }

        String texto = palabra.toUpperCase();
        return resolver(texto, 0, new boolean[BLOQUES.length]);
    }

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

    private boolean contieneLetra(char[] bloque, char letra) {
        return bloque[0] == letra || bloque[1] == letra;
    }
}
