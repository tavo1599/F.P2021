# Datos de entrada 
horas=int(input("Horas de estacionamiento: "))
# proceso
if horas<=2:
  horas=horas*5
  print("monto a pagar: ", horas)
if horas>=3 and horas<=5:
  horas=(horas<=2*5) + (horas>=3 and horas<=5*4)
  print("monto a pagar: ", horas)
