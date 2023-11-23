# Trabajo_Semana6
# Método de Simpson 1/3 #

El Método de Simpson 1/3 es una técnica numérica utilizada para aproximar el valor de una integral definida. Este método se basa en la aproximación de una función por segmentos de parábolas. A diferencia de la regla del trapecio, que aproxima la función por segmentos de líneas rectas, el Método de Simpson 1/3 utiliza segmentos de parábolas para lograr una mejor precisión en la aproximación de la integral.

Uso del Método de Simpson 1/3:

El objetivo principal del Método de Simpson 1/3 es calcular la integral definida de una función en un intervalo dado. Este método es particularmente útil cuando se trata de funciones que no son fácilmente integrables de forma analítica. Al dividir el intervalo de integración en subintervalos y aproximar cada subintervalo por una parábola, el método ofrece una mejor aproximación a la integral total.

Fórmula del Método de Simpson 1/3:

La fórmula general para el cálculo de la integral utilizando el Método de Simpson 1/3 en un intervalo [a, b] es la siguiente:

![imagen](https://github.com/ErickGaona/Trabajo_Semana6/assets/68031169/f87d959e-e816-40ac-b1af-c0408beb9216)


Donde:

    f(x) es la función que se está integrando.
    a y b son los límites inferior y superior del intervalo de integración, respectivamente.
    y en este caso x = (a + b) /2

    
## Desarrollando actividad ##

1.- Crear una función con nombre (integracion) que use el método de Simpson para
    calcular el valor aproximado de cualquier función . Se recomienda analizar lo siguiente:
    
    a.- El tipo de dato que devolverá la función integracion
    
        Nos devolverá un valor numérico que representa la aproximación de la integral definida
        y va ser de tipo Double.

    b.-¿Cuáles son los parámetros que recibe la función?
    
        Los parámetros que la función recibe son 4: (f) La función que se desea integrar el límite inferior y superior de la integral definida llamados "a" y "b" 
        y por ultimo x la cual esta definida como = (a+b)/2

## Explicación del Código ##

![imagen](https://github.com/ErickGaona/Trabajo_Semana6/assets/68031169/928ecde6-a456-4512-a1cf-30bbe1096127)

    1.- def integracion(f: Double => Double, a: Double, b: Double): Double = {: Esta línea define la función integracion que toma cuatro parámetros:
        f, que es la función a integrar, y a y b, que son los límites inferior 
        y superior del intervalo de integración. La función devuelve un valor de tipo Double.

    2.-    val x = (a + b) / 2: Calcula el punto medio x del intervalo de integración ([a, b]).

    3.-    val integral = (b - a) * (f(a) + 4 * f(x) + f(b) / 6): Calcula la aproximación de la integral utilizando la fórmula del Método de Simpson 1/3. 
        
        Aquí, f(a) es el valor de la función en el límite inferior a, f(x) es el valor de la función en el punto medio x, y f(b) es el valor de la función en el límite superior b. 
        La fórmula completa multiplica este valor por la longitud del intervalo para obtener una aproximación de la integral.

    4.-    integral: Esta línea simplemente devuelve el valor calculado de la integral.


### Calcular error ###
![imagen](https://github.com/ErickGaona/Trabajo_Semana6/assets/68031169/ee74d816-a98e-465c-8fe3-adfe8a603ba6)


        def calError(valorEsperado: Double, valorObtenido: Double): Double =: Esto define la función calError que toma dos parámetros de tipo Double (valorEsperado y valorObtenido)
        y devuelve un resultado de tipo Double. 
        El símbolo = indica que la función sigue en las siguientes líneas.
        
        math.abs(valorEsperado - valorObtenido): Aquí se utiliza la función abs del objeto math para calcular el valor absoluto de la diferencia entre valorEsperado y valorObtenido.
        El valor absoluto asegura que el error sea siempre no negativo, independientemente de cuál sea mayor. 
        La diferencia entre el valor esperado y el valor obtenido es una medida del error entre la aproximación y el valor real deseado.



Referencias:

https://www.freecodecamp.org/espanol/news/la-regla-de-simpson-la-formula-y-como-funciona/

https://multimedia.uned.ac.cr/pem/metodos_numericos_ensenanza/glosario/mod4.html
