// Crear una funcion con el nombre "Integracion"

// 1. Tipo de dato = Double
// 2. Parametros que recibe la funcion?

def integracion(f: Double => Double, a: Double, b: Double): Double = {
  val x = (a + b) / 2
  val integral = (b - a)  * (f(a) + 4 * f(x) + f(b)/6)
      integral
}


  // Calcular el error

  def calError(valorEsperado: Double, valorObtenido: Double): Double =
    math.abs(valorEsperado - valorObtenido)


  // Integral #1
  val funcion1: Double => Double = (x: Double) => -math.pow(x, 2) + 8 * x - 12
  val res1: Double = integracion(funcion1, 3, 5)
  val valorEsperado1: Double = 7.33
  val error1: Double = calError(valorEsperado1, res1)
//Salida: 39.0


// Integral #2
val funcion2: Double => Double = (x: Double) => (3* math.pow(x, 2))
val res2: Double = integracion(funcion1, 0, 2)
val valorEsperado2: Double = 8
val error2: Double = calError(valorEsperado1, res2)
//Salida: -64.0

// Integral #3
val funcion3: Double => Double = (x: Double) => (x+2 * math.pow(x, 2)- math.pow(x,3)  + ( 5 * math.pow(x, 4)))
val res3: Double = integracion(funcion1, -1, 1)
val valorEsperado3: Double = 3.333
val error3: Double = calError(valorEsperado1, res2)
//Salida: -139.666

//Integral #4
val funcion4: Double => Double  =(x:Double) => ((2*x) + 1) / ((math.pow(x, 2)) + x)
val res4: Double =integracion(funcion4,1,2)
val valorEsperado4: Double = 1.09861
val error4:  Double = calError(valorEsperado4, res4)
//Salida: 5.90555

//Integral #5
val funcion5: Double => Double  =(x:Double) => math.pow(Math.E, x)
val res5: Double =integracion(funcion5,0,1)
val valorEsperado5: Double = 1.71828
val error5 : Double = calError(valorEsperado5, res5)
//Salida: 8.04793

//Integral #6
val funcion6: Double => Double  =(x:Double) => 1 / math.sqrt(x -1)
val res6: Double =integracion(funcion6, 2,3)
val valorEsperado6: Double = 0.82842
val error6: Double = calError(valorEsperado6, res6)
//Salida:  4.38383

//Integral #7
val funcion7: Double => Double  = (x:Double) =>  1 / (1 + math.pow(x,2))
val res7: Double = integracion(funcion7, 0,1)
val valorEsperado7: Double = 0.785398
val error7 : Double = calError(valorEsperado7, res7)
// Salida: 4.28333333
