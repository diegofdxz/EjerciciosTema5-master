# EjerciciosTema5
# Mi repositorio es https://github.com/diegofdxz/EjerciciosTema5-master.git


## 1  Despegue inmediato
Crear un algoritmo escribiendo los valores comprendidos entre diez y cero en orden descendente en una tabla, y posteriormente recorrer esta tabla para mostrar la cuenta hacia atrás.



## 2 Número de ocurrencias

Realizar un algoritmo que haga que el usuario introduzca tantas cifras comprendidas entre cero y nueve como desee. Una vez que el usuario ha terminado su serie introduciendo -1, el algoritmo muestra el número de veces que se ha escrito cada dígito.

Ejemplo de ejecución:

Indicar un valor comprendido entre 0 y 9 o -1 para terminar:

2

Otro valor, por favor o -1 para terminar...

9

Otro valor, por favor o -1 para terminar...

2

Otro valor, por favor o -1 para terminar...

2

Otro valor, por favor o -1 para terminar...

0

Otro valor, por favor o -1 para terminar...

-1

Cantidad de 0: 1

Cantidad de 1: 0

Cantidad de 2: 3

Cantidad de 3: 0

Cantidad de 4: 0

Cantidad de 5: 0

Cantidad de 6: 0

Cantidad de 7: 0

Cantidad de 8: 0

Cantidad de 9: 1



## 3 Nota media (versión 4)
Producir un algoritmo agregando notas en una tabla. Al final, mostrar todas las calificaciones y su media.

Ejemplo de ejecución del algoritmo:

¿Nota?

12

¿Nota?

15

¿Nota?

8

¿Nota?

7

¿Nota?

-1

La media de las notas (12; 15; 8; 7) es 10,5.

## 4 Máquina de votar
Cree un algoritmo que pida a los usuarios que voten (los usuarios se turnarán para usar su máquina de votación). Se proponen varios candidatos. Al final del día, el presidente de la mesa de votación introduce un código especial para finalizar la votación (68753421) y se muestran los resultados. Eso sí, este ejercicio es teórico, ya que la seguridad no está garantizada y un usuario puede votar varias veces...

Ejemplo de ejecución del algoritmo:

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

4

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

1

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

3

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

4

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

3

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

4

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

4

ha votado

Elija entre:

1 - Emilia TERREROS

2 - Gerardo ESCODAR

3 - María AGUAVIVA

4 - Nadia LETUX

68753421

Resultados:

Emilia TERREROS: 14,29 %

Gerardo ESCODAR: 0,00 %

María AGUAVIVA: 28,57 %

Nadia LETUX: 57,14 %



## 5 Palíndromo
Un palíndromo es una palabra cuyo orden de letras sigue siendo el mismo si se lee de izquierda a derecha o de derecha a izquierda. Ejemplos: Kayak, Ana, radar, rotor, etc.

Escriba un algoritmo que pida al usuario una palabra sin acento, en minúsculas y seguida de un carácter en particular para indicar el final (# por ejemplo), y que le diga al usuario si esta palabra es un palíndromo.

Ejemplo de ejecución:

Escriba una palabra y después #

kayak#

kayak es un palíndromo

## 6 ¿Qué hace?
¿Qué contiene la tabla generada por el algoritmo siguiente?

Algo QueHace  
"#" ??  
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


Modificar el algoritmo anterior para que la tabla tenga cuatro filas y cuatro columnas con los valores de uno a dieciséis, completando en primer lugar la primera columna, luego la segunda, posteriormente la tercera y por último la cuarta.

Modificar el algoritmo nuevamente, para tener los siguientes valores en la tabla:

0

1

2

3

1

2

3

4

2

3

4

5

3

4

5

6

## 7 Matriz
Crear una tabla de caracteres bidimensional de tamaño 20×30, en la que se colocan caracteres elegidos al azar. Mostrar la tabla generada.

## 8 Micro guerra de barcos
Realizar un algoritmo que permita jugar a los barcos con las siguientes simplificaciones:

Solo hay un jugador.

Solo hay cuatro filas y cuatro columnas.

Solo hay un barco que ocupa una única celda (este espacio se elige al azar).

Ejemplo de ejecución:

????

????

????

????

¿Qué columna? 2

¿Qué línea? 2

Agua

????

?~??

????

????

¿Qué columna? 4

¿Qué línea? 1

Agua

??~

?~??

????

????

¿Qué columna? 1

¿Qué línea? 3

Tocado y hundido

Ha ganado

## 9 Tres en raya
Crear un algoritmo para jugar a tres en raya: en una cuadrícula de tres celdas por tres, los jugadores se turnan para escribir su símbolo (X y O) en una celda vacía. El primer jugador que logre alinear (en fila, columna o diagonal) tres de sus símbolos, gana.



## 10 Registro de Empleados
Los empleados de una cierta compañía se representan en la base de datos de la compañía por su nombre,número de empleado y número de la seguridad social.Construir una estructura de tablas hash que permita acceder al registro de un empleado por cualquiera de estos tres datos.(Nota:No se dispone de memoria suficiente para duplicar los registros de los empleados).

