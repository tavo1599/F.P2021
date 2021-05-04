# Datos de entrada 
tiempo=int(input("Años trabajando en la empresa:"))
# Proceso
if tiempo==1:
  print("Usted recibe un bono de $100.00")
elif tiempo==2:
  print("Usted recibe un bono de $200.00")
elif tiempo==3:
  print("Usted recibe un bono de $300.00")
elif tiempo==4:
  print("Usted recibe un bono de $400.00")
elif tiempo==5:
  print("Usted recibe un bono de $500.00")
elif tiempo>5:
  print("Usted recibe un bono de $1000.00")