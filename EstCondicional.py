def Ejercicios01():
  # Definir variable
  montoP=0
  # Datos de entrada
  cantidadX=int(input("Ingrese cantidad de lapices:"))
  # Proceso
  if cantidadX>=1000:
    montoP=cantidadX*0.80
  else:
    montoP=cantidadX*0.90
  # Datos de salida
  print("Monto a pagar es:", montoP)

Ejercicios01()
