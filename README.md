# Bloques ABC

Solución al problema de los Bloques ABC — Prueba técnica Loggro.

## Descripción del problema

Se tiene una colección de 20 bloques, cada uno con 2 letras:

```
(B O) (X K) (D Q) (C P) (N A) (G T) (R E) (T G) (Q D) (F S)
(H U) (V I) (A T) (O B) (E R) (F S) (L Y) (P C) (Z M) (J W)
```

La función `puedoObtenerPalabra(String palabra)` determina si una palabra puede escribirse usando estos bloques, respetando las siguientes reglas:

1. Una vez que se usa un bloque, no puede volver a usarse.
2. No distingue entre mayúsculas y minúsculas.

## Algoritmo

Se utiliza **backtracking recursivo**: para cada letra de la palabra se busca un bloque disponible que la contenga, se marca como usado y se avanza a la siguiente letra. Si en algún punto no hay bloque disponible, se deshace la selección y se prueba con otro.

## Casos de prueba

| Palabra     | Resultado |
|-------------|-----------|
| `"A"`       | `true`    |
| `"LIBRO"`   | `true`    |
| `"BOZO"`    | `false`   |
| `"TRAJE"`   | `true`    |
| `"COMUN"`   | `true`    |
| `"CAMPANA"` | `false`   |
| `"DORITO"`  | `true`    |
| `"ARLEQUIN"`| `true`    |

## Requisitos

- Java 11 o superior
- Maven 3.6 o superior

## Estructura del proyecto

```
bloques-abc/
├── pom.xml
└── src/
    ├── main/java/com/loggro/
    │   └── BloquesABC.java        ← lógica principal
    └── test/java/com/loggro/
        └── BloquesABCTest.java    ← pruebas unitarias (JUnit 5)
```

## Cómo ejecutar

### Correr las pruebas

```bash
cd bloques-abc
mvn test
```

### Compilar el proyecto

```bash
cd bloques-abc
mvn compile
```
