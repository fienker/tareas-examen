 package main.java.pe.edu.upeu.dpmc.examen;
 import java.util.Scanner;
 
 /**
  * ResolucionExamen
  */
 public class ResolucionExamen {

     public static void TablaMultiplicar() {
        int Multiplicando ;
            System.out.println("¿Que tabla desea Realizar?");
            Scanner valor1 = new Scanner(System.in);
            Multiplicando = valor1.nextInt();
            int multiplicador = 1;
            do {   System.out.println (Multiplicando + " X " + multiplicador + " = " + Multiplicando * multiplicador );
                   multiplicador += 1;
        } while (multiplicador<=20);     
    }

    public static void NUmerosPerfectos(){

        Scanner lector = new Scanner(System.in); //Utilidad de interacció

        System.out.println("Empezando listado:"); //Utilidad para escribir en pantalla
        int m = 1;
        do{
        m = m + 1;
        int n = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        do{
        f = m - 1;
        n = n + 1;
        c = m % n;
        if (c == 0){
        d = d + n;
        }
        }while (n != f);
        if (d == m){
        System.out.println("el numero perfecto es: " + m);
        }
        }while(m <= 1000 );
    }
     

    public static void main(String[] args){
        //System.out.println("hola mundo");
        //TablaMultiplicar();
        NUmerosPerfectos();
        
    }
 
     
 }