#Datos de entrada
numE=float(input("Ingrese el numero de estudiantes a realizar el viaje:"))
#Proceso
if numE>100:
  print("El pasaje por alumno es de $20.00")
elif numE>=50 and numE<=100:
  print("El pasaje por estudiante es de $35.00")
elif numE>=20 and numE<50:
  print("El pasaje por estudiante es de $40.00")
elif numE<20:
  print("El pasaje por estudiante es de $70.00")
