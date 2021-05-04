# Datos de entrada
sexo=0
edad=int(input("Ingrese su edad: "))
sexo=input("Ingrese su sexo (hombre, mujer): ")
# Proceso
if edad>=70:
  print("Usted recibe la vacuna tipo C.")
elif edad>=16 and edad<70 and sexo=="mujer":
  print("Usted recibe la vacuna tipo B.")
elif edad>=16 and edad<70 and sexo=="hombre":
  print("Usted recibe la vacuna tipo A.")
elif edad<16:
  print("Usted recibe la vacuna tipo A.")