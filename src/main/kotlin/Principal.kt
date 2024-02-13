import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round

fun main(){
    println("Hola mundo")


     // VARIABLES
     // CONSTANTES: val: se usan cuando el valor no cambia
     //VARIABLES:   var: datos que SI cambian

     //variables de tipo implicitas asigna el valor inicial a la variable
     var texto ="Hola Clase"
     var numero= 6
     var raiz = 3.6
     val fecha="25-09-2003"


       raiz= 4.5

     println("El valor de la raiz: ${raiz}" )
     println(fecha)

   //variables de tipo Explicitas
   var x: Int = 12
   var y: Double = 2.5
   var letra: Char = 'a'

  var num1= 56
  var num2=32
  var suma=num1+num2
  var resta=num1-num2
  var multiplicacion=num1*num2
  var division=num1/num2


  println("La suma de ${num1} + ${num2} es ${suma}")
  println("La resta de ${num1} - ${num2} es ${resta}")
  println("La multiplicacion de ${num1} * ${num2} es ${multiplicacion}")
  println("La division de ${num1} / ${num2} es ${division}")

  // Saltos de lineas
   println("""
    Datos
    De
    Cualquier
    Tipo
   """.trimIndent())
 // Como ingresar datos por teclado
println("Ingresa un valor")
  var n1 = readln().toInt()

  println("Ingresa otro valor")
  var n2 = readln().toInt()

  var suma_n1_n2= n1+n2

  println(n1)
  println(n2)

  println("La suma de ${n1} + ${n2} es ${suma_n1_n2}")

  //Calcular raiz
  var raiz1= Math.sqrt(suma_n1_n2.toDouble())
  println("LA RAIZ ES:  ${raiz1}")
  //Redondear un numero
  var pi=3.1416
  println(round(pi))
  println(pi)
 //Redondear hacia abajo
 println(floor(pi).toInt())
 // Redondear hacia arriba
 println(ceil(pi).toInt())

  //dar formanto a los numeros
  println(DecimalFormat( "#,##").format(raiz))
 }
