#include <iostream>
int main () {
  //definir variables
  printf("Ejercicio 01: Area de un triangulo\n");
  int b=0, h=0, area=0;
  // Datos de entrada
  printf("Ingrese base:");
  scanf("%i", &b);
  printf("INgrese altura:");
  scanf("%i", &h);
  // proceso
  area=(b*h)/2;
  // Datos de salida
  printf("Area de un Triangulo es:%i %s", area, "\n");

  return 0;
}
