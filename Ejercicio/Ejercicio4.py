# Datos de entrada 
edad=int(input("Ingrese su edad: "))
nota=float(input("Ingrese su promedio: "))
# Proceso
if edad>18 and nota>=9:
  print("Usted tiene una beca de $2000.00")
elif edad>=18 and nota>=7.5:
  print("Usted tiene una beca de $1000.00")
elif edad>=18 and nota<7.5 and nota>=6.0:
  print("usted tiene una beca de $500.00")
elif nota<6.0:
  print("Se le invita a usted a seguir estudiando y participar en el proximo ciclo escolar")
elif edad<=18 and nota>=9:
  print("Usted tiene una beca de $3000.00")
elif edad<=18 and nota<9 and nota>=8:
  print("usted tiene una beca de $2000.00")
elif edad<=18 and nota<8 and nota>=6:
  print("Usted tien una beca de $100.00")
elif nota<6:
  print("Se le invita a usted a seguir estudiando y participar en el proximo ciclo escolar")