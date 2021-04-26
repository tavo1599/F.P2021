import scala.io.StdIn.readLine
object AreaTSC {
  def main(args: Array[String]) = {
  //Declaracion de variables
  println("Ejercicio 01: Area Triangulo")
  //Datos de entrada
  println("Ingrese base:")
  val b = readLine().toInt
  println("Ingrese altura:")
  val h = readLine().toInt
  //Proceso
  val area=(b*h)/2
  //Datos de salida 
  println("El are del Triangulo es:"+area)
  }
}