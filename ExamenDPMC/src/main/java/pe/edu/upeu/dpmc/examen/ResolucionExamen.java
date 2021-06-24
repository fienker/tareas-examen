 package main.java.pe.edu.upeu.dpmc.examen;
 import pe.edu.upeu.dpmc.utils.LeerTeclado;
 
 /**
  * ResolucionExamen
  */
 public class ResolucionExamen {
     LeerTeclado teclado = new LeerTeclado();

    public  void Impuesto() {
        //Declarar Variables
        int categoria, cant1=0,imp1=12,imp2=8,imp3=5,impt1=0,impt2=0,impt3=0;
        //Datos de entrada, prceso y salida
        do {
            categoria=teclado.leer(0,"¿Que categoria es su auto: 1-2-3 o 0 para finalizar?");
            
        switch (categoria) {
            case 1:
                cant1=teclado.leer(0,"cuantos vehiculos tiene de categoria 1");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+imp1+"% de su valor");
                impt1=impt1+imp1;
                }
                
                System.out.println("De toda la categoria se pagara"+impt1+"% de su valor");
                break;
            case 2:
                cant1=teclado.leer(0,"cuantos vehiculos tiene de categoria 2");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+imp2+"% de su valor");
                impt2=impt2+imp2;
               }
               System.out.println("De toda la categoria se pagara"+impt2+"% de su valor");
                break;
            case 3:
                cant1=teclado.leer(0,"cuantos vehiculos tiene de categoria 3");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+imp3+"% de su valor");
                impt3=impt3+imp3;
                }
                System.out.println("De toda la categoria se pagara"+impt3+"% de su valor");
                break;
            default:System.out.println("Opcion incorrecta--escoja entre 1-2-3 o 0 si desea salir");
                break;
        }
        }
    while (categoria!=0);
    }


     public void TablaMultiplicar() {
        int Multiplicando ;
            System.out.println("¿Que tabla desea Realizar?");
            Scanner valor1 = new Scanner(System.in);
            Multiplicando = valor1.nextInt();
            int multiplicador = 1;
            do {   System.out.println (Multiplicando + " X " + multiplicador + " = " + Multiplicando * multiplicador );
                   multiplicador += 1;
        } while (multiplicador<=20);     
    }

    public void NUmerosPerfectos(){

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

    public void PotenciaRecursiva() {
        int base,exponente;
        base=teclado.leer(0,"Ingrese el munero de la base ");
        exponente=teclado.leer(0,"Ingrese el numero del exponente ");
        System.out.println(base+"^"+exponente+"="+recursividad(base,exponente));
           }
       public double recursividad(int base,int exponente) {
           if (exponente==0) {
           return 1;
            }
           else{
           return base*recursividad(base,exponente-1);
            }
       }
 }