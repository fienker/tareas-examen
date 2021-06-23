 package main.java.pe.edu.upeu.dpmc.examen;
 import java.util.*;
 
 /**
  * ResolucionExamen
  */
 public class ResolucionExamen {
     public static void potencia() {
         for (int i = 1; i <=20; i++) {
             System.out.println("Tabla multiplicar del "+ i);
             for (int j = 1; j <=20; j++) {
                 System.out.println(i+"*"+j+"="+i*j);
             }
         }
     }

    public static void main(String[] args){
        //System.out.println("hola mundo");
        potencia();
    }
 
     
 }