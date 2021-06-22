def puedevotar(): #ejercicio 3.1
  #definir variables
  print("puede votar?")
  edad=18
  #datos de entrada
  edad=int(input("digite su edad:"))
  #proceso
  if edad>0 and edad<100:
    print("edad correcta")
    if edad>=18:
      print("si puede votar")
    if edad<=17:
      print("no puede votar")
  else:
    print("edad incorrecta")
  #datos de salida
  print("dirijase a votar si es mayor de edad")

def sueldosemanal(): #ejercico 3.2
  #definir variables
  print("El empleado recivira")
  montoP=0
  #datos de entrada
  cantidadX=int(input("ingrese las horas de trabajo:"))
  montoP=int(input("ingrese el pago por hora:"))
  #proceso
  if cantidadX<=40 and cantidadX>=0:
    print("no execede")

    montoP=(cantidadX*montoP)
  elif cantidadX>=40 and cantidadX<=60:
    print("si execede")
    montoP=(cantidadX*montoP)*2

    montoP=cantidadX
  elif cantidadX>=40 and cantidadX<=60:
    print("si execede")
    montoP=cantidadX*2

  #datos de salida
  print("el empleado recivira un pago de:", montoP )

def bonoDocente():  #3.16

  #definir variables 3.16
  bonoObtenido=0.0
  #datos de entrada
  salarioMinimo=float(input("Ingrese el salario minimo:"))
  puntuacionObtenida=float(input("Ingrese la puntuacion que ha obtenido:"))
  #Proceso
  if puntuacionObtenida<=100 and puntuacionObtenida>=0:
    bonoObtenido=salarioMinimo
  elif puntuacionObtenida>=101 and puntuacionObtenida<=150:
    bonoObtenido=salarioMinimo*2
  elif puntuacionObtenida>150:
    bonoObtenido=salarioMinimo*3
  #datos de salida
  print("El docente obtendra un bono:", bonoObtenido)




#Llamar ejercicio
#bonoDocente()
#puedevotar()
sueldosemanal()
