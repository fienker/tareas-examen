def notafinaldeprogramacionDPMC():
  #Definir variables y otros 
  print("nota final del curso de Fundamentos de programación")
  #Datos de entrada 
  n1DPMC=int(input("Nota primera unidad:")) 
  n2DPMC=int(input("Nota segunda unidad:")) 
  n3DPMC=int(input("Nota tercera unidad:")) 
  nf4DPMC=int(input("Nota trabajo final:")) 
  #Proceso 
  promediofinalDPMC=(n1DPMC*0.2+n2DPMC*0.15+n3DPMC*0.15+nf4DPMC*0.5) 
  #Datos de salida 
  print("La nota final es:", promediofinalDPMC)


def premiodocenteDPMC():

  #definir variables
  premioObtenidoDPMC=930
  #datos de entrada
  salarioMinimo=float(input("Ingrese el salario minimo:"))
  puntuacionObtenida=float(input("Ingrese la puntuacion que ha obtenido:"))
  #Proceso
  if puntuacionObtenida<=100 and puntuacionObtenida>=50:
    premioObtenidoDPMC=salarioMinimo+93
  elif puntuacionObtenida>=101 and puntuacionObtenida<=150:
    premioObtenidoDPMC=salarioMinimo+372
  elif puntuacionObtenida>150:
    premioObtenidoDPMC=salarioMinimo+651
  #datos de salida
  print("El docente obtendra un sueldo total de:", premioObtenidoDPMC)

def vacunaCorrespondienteDPMC()
  #definir variables
  

  #datos de entrada
  #Proceso
  #datos de salida





#notafinaldeprogramacionDPMC()
#premiodocenteDPMC()