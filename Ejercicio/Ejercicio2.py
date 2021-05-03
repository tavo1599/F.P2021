# Definir variables
montoP=0
# Datos de entrada
cantidadx=int(input("Cantidad de dinero:"))
# Proceso
if cantidadx<=10:
  print("Puedes regalarle una Tarjeta.")
elif cantidadx>=11 and cantidadx<=100:
  print("Puedes regalarle unos Chocolates.")
elif cantidadx>=101 and cantidadx<=250:
  print("Puedes regalarle unas Flores.")
elif cantidadx>=251:
  print("Puedes regalarle un Anillo.")