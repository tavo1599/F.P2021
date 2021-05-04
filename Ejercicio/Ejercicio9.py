# Datos de entrada
puntos=int(input("Puntuacion obtenida: "))
# Proceso
if puntos>0 and puntos<=100:
 print("Usted obtenio 1 salario minimo.")
elif puntos>100 and puntos<=150:
 print("Usted obtenio 2 salarios minimos")
elif puntos>150:
  print("Usted obtenio 3 salarios minimos")