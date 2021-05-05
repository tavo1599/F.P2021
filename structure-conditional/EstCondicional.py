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
def muestraMenoredad():
  # datos de entrada
  p1nombre=input("Ingrese nombre 1ra persona")
  p1edad=int(input("Ingrese edad 1ra persona"))
  p2nombre=input("Ingrese nombre 2da persona")
  p2edad=int(input("Ingrese edad 2da persona"))
  p3nombre=input("Ingrese nombre 3ra persona")
  p3edad=int(input("Ingrese edad 3ra persona"))
