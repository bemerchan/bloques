package com.loggro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para BloquesABC.
 * Verifica todos los casos de prueba definidos en el enunciado.
 */
@DisplayName("Pruebas de BloquesABC")
class BloquesABCTest {

    private BloquesABC bloquesABC;

    @BeforeEach
    void setUp() {
        bloquesABC = new BloquesABC();
    }

    @Test
    @DisplayName("puedoObtenerPalabra(\"A\") debe retornar true")
    void testA() {
        assertTrue(bloquesABC.puedoObtenerPalabra("A"));
    }

    @Test
    @DisplayName("puedoObtenerPalabra(\"LIBRO\") debe retornar true")
    void testLIBRO() {
        assertTrue(bloquesABC.puedoObtenerPalabra("LIBRO"));
    }

    @Test
    @DisplayName("puedoObtenerPalabra(\"BOZO\") debe retornar false")
    void testBOZO() {
        assertFalse(bloquesABC.puedoObtenerPalabra("BOZO"));
    }

    @Test
    @DisplayName("puedoObtenerPalabra(\"TRAJE\") debe retornar true")
    void testTRAJE() {
        assertTrue(bloquesABC.puedoObtenerPalabra("TRAJE"));
    }

    @Test
    @DisplayName("puedoObtenerPalabra(\"COMUN\") debe retornar true")
    void testCOMUN() {
        assertTrue(bloquesABC.puedoObtenerPalabra("COMUN"));
    }

    @Test
    @DisplayName("puedoObtenerPalabra(\"CAMPANA\") debe retornar false")
    void testCAMPANA() {
        assertFalse(bloquesABC.puedoObtenerPalabra("CAMPANA"));
    }

    @Test
    @DisplayName("puedoObtenerPalabra(\"DORITO\") debe retornar true")
    void testDORITO() {
        assertTrue(bloquesABC.puedoObtenerPalabra("DORITO"));
    }

    @Test
    @DisplayName("puedoObtenerPalabra(\"ARLEQUIN\") debe retornar true")
    void testARLEQUIN() {
        assertTrue(bloquesABC.puedoObtenerPalabra("ARLEQUIN"));
    }

    @Test
    @DisplayName("No distingue entre mayúsculas y minúsculas - minúsculas")
    void testMinusculas() {
        assertTrue(bloquesABC.puedoObtenerPalabra("libro"));
        assertFalse(bloquesABC.puedoObtenerPalabra("bozo"));
        assertTrue(bloquesABC.puedoObtenerPalabra("traje"));
    }

    @Test
    @DisplayName("No distingue entre mayúsculas y minúsculas - mezcla")
    void testMezclaCase() {
        assertTrue(bloquesABC.puedoObtenerPalabra("Libro"));
        assertFalse(bloquesABC.puedoObtenerPalabra("Bozo"));
        assertTrue(bloquesABC.puedoObtenerPalabra("DoRiTo"));
    }

    @Test
    @DisplayName("Palabra vacía debe retornar true")
    void testPalabraVacia() {
        assertTrue(bloquesABC.puedoObtenerPalabra(""));
    }

    @Test
    @DisplayName("Palabra nula debe retornar true")
    void testPalabraNula() {
        assertTrue(bloquesABC.puedoObtenerPalabra(null));
    }
}
