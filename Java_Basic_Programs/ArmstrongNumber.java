/*
 Programa Java para comprobar el número de Armstrong entre dos enteros

Un número entero positivo con dígitos p, q, r, s…, se conoce como número de Armstrong de orden n si se cumple la siguiente condición.

pqrs... = pn + qn + rn + sn +....
Ejemplo:

370 = 3*3*3 + 7*7*7 + 0
   = 27 + 343 + 0
   = 370

Por tanto, 370 es un número de Armstrong.

Ejemplos:

Entrada: 100 200
Salida: 153
Explicación: se dan 100 y 200  
dos números enteros.
 153 = 1*1*1 + 5*5*5 + 3*3*3  
     = 1 + 125 + 27
     = 153
Por tanto, sólo 153 es un número de Armstrong entre 100 y 200.
Acercarse:

En primer lugar, recorreremos todos los números en el rango dado. Luego, para cada número, tenemos que contar el número de dígitos que contiene. Si el número de dígitos del número actual es n, entonces, encuentre la suma de la (n-ésima) potencia de todos los dígitos del número indicado. Y si la suma es igual al número actual i , imprima el número.

 */
public class ArmstrongNumber {
    
}
