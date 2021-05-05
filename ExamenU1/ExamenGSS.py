opcion = 0
def Ejercicio5GSS():
  opc = int(input("Menu Principal \n"+
   "1. Promedios notas \n"+
   "2. Bonos por desenpeño \n"+
   "3. Vacunas \n"+
   "4. Operaciones de matematica \n"+
   "5. Finish \n"+
   "ELIGE UNA OPCION : \n"))
  return opc
  
def Ejercicio1GSS():
 # datos de entrada
 Nfinal=0.0
 punidad=float(input("Ingrse primera nota: "))
 sunidad=float(input("Ingrese segunda nota: "))
 tunidad=float(input("Ingrese tercera nota: "))
 tfinal=float(input("Ingrese nota de trabajo final: "))
 # Proceso
 if punidad>0:
   Nfinal=(punidad*0.20)+(sunidad*0.15)+(tunidad*0.15)+(tfinal*0.50)
 # Datos de salida
 print(f"Nota final:{Nfinal:.1f} ")

def Ejercicio2GSS():
  # Datos de entrada
  sueldo=930
  bono=0
  puntos=int(input("Ingrese puntuacion obtenido: "))
  # Proceso
  if puntos>=50 and puntos<=100:
    bono=sueldo*0.10
  elif puntos>100 and puntos<=150:
    bono=sueldo*0.40
  elif puntos>150:
    bono=sueldo*0.70
  # Datos de salida
  print("Su bono es de:", bono)

def Ejercicio3GSS():
  # Datos de entrada
  edad=0
  edad=int(input("Ingrese su edad: "))
  sexo=input("Ingrese su sexo: \n h:hombre. \n m:mujer. \n")
  # Proceso
  if edad>=70:
   print("Usted recibe la vacuna tipo C.")
  elif edad>=16 and edad<70 and sexo=="m":
   print("Usted recibe la vacuna tipo B.")
  elif edad>=16 and edad<70 and sexo=="h":
   print("Usted recibe la vacuna tipo A.")
  elif edad<16:
   print("Usted recibe la vacuna tipo A.")

def Ejercicio4GSS():
  # Datos de entrada
  print("operaciones matematicas.")
  a=0
  b=0
  a=int(input("Ingrese el primer valor: "))
  b=int(input("Ingrese segundo valor: "))
  # Proceso
  print("Suma:  \n ", a+b)
  print("Resta:\n", a-b)
  print("Division: \n", a/b)
  print("Multiplicacion \n", a*b)
  print("Potenciacion \n", a**b)

while opcion !=5:
  opcion = Ejercicio5GSS()
  if opcion == 1:
    Ejercicio1GSS()
  if opcion == 2:
    Ejercicio2GSS()
  if opcion == 3:
    Ejercicio3GSS()
  if opcion == 4:
    Ejercicio4GSS()
  if opcion == 5:
    print('Programa terminado:')
  

 
 
 

