 package main.java.pe.edu.upeu.dpmc.examen;
 import java.util.Scanner;
 
 /**
  * ResolucionExamen
  */
 public class ResolucionExamen {

     public static void numerosPerfectos() {
        int i, j, suma;
        System.out.println("Los 3 primeros numeros perfectos son: ");
        for(i=1;i <= 1000;i++){   
            suma = 0;
            for(j = 1;j < i;j++){                        
                 if(i % j==0){
                    suma = suma + j; 
                 }
            }
          if(i == suma){                         
             System.out.println(i);
          }
        }
     }

     public static void TablaMultiplicar() {
        int Multiplicando ;
            System.out.println("¿Que tabla desea Realizar?");
            Scanner valor1 = new Scanner(System.in);
            Multiplicando = valor1.nextInt();

            int multiplicador = 1;
            do {   System.out.println (Multiplicando + " X " +            multiplicador + " = " + Multiplicando * multiplicador );

                   multiplicador += 1;

        } while (multiplicador<=10);     
    }
     

    public static void main(String[] args){
        //System.out.println("hola mundo");
        TablaMultiplicar();
        
    }
 
     
 }