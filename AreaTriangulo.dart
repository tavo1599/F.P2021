import 'dart:io';
void main(){
 //Definir variable
 print('Ejercicio 01: Area Triangulo');
 //Datos de entrada
 print("Ingrese base: ");
 var b=int.parse(stdin.readLineSync());
 print("Ingrese altura: ");
 var h=int.parse(stdin.readLineSync());
  //Proceso
  var area=(b*h)/2;
  //Datos de salida 
  print("El area de triangulo es: $area");
}