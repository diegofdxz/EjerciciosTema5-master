/*
Qué contiene la tabla generada por el algoritmo siguiente?

Algo QueHace
# ??
Constante TAMAÑO       : entero <- 3
Variable i, j, val: entero
Variable tab2d: entero[TAMAÑO][TAMAÑO]
Inicio
 val <- 1
 Para j <- 0 a TAMAÑO - 1
   Para i <- 0 a TAMAÑO - 1
     tab2d[j][i] <- val
     val <- val + 1
   FPara
 FPara
Fin

Este algoritmo genera una tabla de 3x3 con valores del 1 al 9
para generar una tabla de 4x4 con valores del 1 al 16, se debe cambiar la constante TAMAÑO a 4

1. Modificar el algoritmo anterior para que la tabla tenga cuatro filas y cuatro columnas con los valores de uno a dieciséis, completando en primer lugar la primera columna, luego la segunda, posteriormente la tercera y por último la cuarta.
Algo QueHace
# ??
Constante TAMAÑO       : entero <- 4
Variable i, j, val: entero
Variable tab2d: entero[TAMAÑO][TAMAÑO]
Inicio
    val <- 1
    Para j <- 0 a TAMAÑO - 1
        Para i <- 0 a TAMAÑO - 1
            tab2d[j][i] <- val
            val <- val + 1
        FPara
    FPara
Fin


2. Modificar el algoritmo nuevamente, para tener los siguientes valores en la tabla:

0   1   2   3

1   2   3   4

2   3   4   5

3   4   5   6

Algo QueHace
# ??
Constante TAMAÑO       : entero <- 4
Variable i, j, val: entero
Variable tab2d: entero[TAMAÑO][TAMAÑO]
Inicio
    val <- 0
    Para j <- 0 a TAMAÑO - 1
        Para i <- 0 a TAMAÑO - 1
            tab2d[j][i] <- val
            val <- val + 1
        FPara
    FPara
 */

public class Ej6 {
}
