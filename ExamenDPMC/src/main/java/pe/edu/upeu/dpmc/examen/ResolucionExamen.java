 package main.java.pe.edu.upeu.dpmc.examen;
 import java.util.Scanner;
 
 /**
  * ResolucionExamen
  */
 public class ResolucionExamen {

    public static void Impuesto() {
        Scanner in = new Scanner(System.in);
        int i, n;
        double categoria_1, categoria_2, categoria_3, clave, costo;
        double impuesto, impuesto_a_pagar;
        categoria_1 = 0;
        categoria_2 = 0;
        categoria_3 = 0;
        impuesto_a_pagar = 0;
        System.out.print("Ingresa el valor del auto: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("Ingresa la categoria: ");
            clave = in.nextDouble();
            in.nextLine();
            costo = in.nextDouble();
            in.nextLine();
            impuesto=0;
            if(clave==1)
            {
                impuesto=costo*0.1;
                categoria_1=categoria_1+impuesto;
            }
            if(clave==2)
            {
                impuesto=costo*0.07;
                categoria_2=categoria_2+impuesto;
            }
            if(clave==3)
            {
                impuesto=costo*0.05;
                categoria_3=categoria_3+impuesto;
            }
            impuesto_a_pagar=impuesto_a_pagar+impuesto;
            System.out.println("Valor de impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("Valor de categoria 1: " + categoria_1);
        System.out.println("Valor de categoria 2: " + categoria_2);
        System.out.println("Valor de categoria 3: " + categoria_3);
        System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagar);
    }


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
        Impuesto();
        //TablaMultiplicar();
        //NUmerosPerfectos();
        
    }
 
     
 }