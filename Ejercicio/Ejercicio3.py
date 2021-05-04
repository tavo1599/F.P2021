# Datos de entrada
precio=int(input("Ingrese el precio: "))
# Proceso
if precio>=200:
 descuento=precio*0.15
elif precio>100 and precio<200:
  descuento=precio*0.12
elif precio<100:
  descuento=precio*0.10
# Datos de salida
print("Total de descuento: ", "$", precio-descuento)
