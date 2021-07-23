public class EjerciciosMatrices {

    public void imprimirMatrizCadena(String[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if(matriz[f][c]!=null && !matriz[f][c].equals("")){
                    System.out.print(matriz[f][c]+"\t");
                }else{
                    System.out.print("\t");
                }                
            }
            System.out.println("");
        } 
    }  
    public void ejercicio06(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <=i; j++) {
                 matriz[i][j] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ NUMERO 6");
        imprimirMatrizCadena(matriz);
    }
    public void ejercicio07(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matriz[i][j] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ NUMERO 7");
        imprimirMatrizCadena(matriz);
    }
    public void ejercicio08(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matriz[i][j+i] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ NUMERO 8");
        imprimirMatrizCadena(matriz);
    }
    public void ejercicio09(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <=i; j++) {
                 matriz[i][(dimen-1)-i+j] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ NUMERO 9");
        imprimirMatrizCadena(matriz);
    }
    public void ejercicio10(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <=i; j++) {
                 matriz[i][i-j] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ NUMERO 10");
        imprimirMatrizCadena(matriz);
    }
    public void ejercicio11(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matriz[i][(dimen-1)-(j+i)] = ""+numInit;
                 numInit++;
             }
        }
        System.out.println("MATRIZ NUMERO 11");
        imprimirMatrizCadena(matriz);
    }
    
    public void ejercicio12(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matriz[i][(dimen-1)-j] = ""+numInit;
                 numInit++;
             }
        }
        
        System.out.println("MATRIZ NUMERO 12");
        imprimirMatrizCadena(matriz);
    }
    public void ejercicio13(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int j = 0; j <dimen; j++) {
            for (int i = 0; i < (matriz.length)-j; i++) {            
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("MATRIZ NUMERO 13");
        imprimirMatrizCadena(matriz);
    }
    public void ejercicio14(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int j = 0; j <dimen; j++) {
            for (int i = 0; i < 1+j; i++) {            
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("MATRIZ NUMERO 14");
        imprimirMatrizCadena(matriz);
    }
    public void ejercicio16(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//i=filas, j=columnas
        for (int j = 0; j <dimen; j++) {
            for (int i =4; i > (matriz.length-2)-j; i--) {            
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("MATRIZ NUMERO 16");
        imprimirMatrizCadena(matriz);
    }
 









public static void main(String[] args) {
    EjerciciosMatrices  transf=new EjerciciosMatrices();
    transf.ejercicio06(5, 0);
    transf.ejercicio07(5, 0);
    transf.ejercicio08(5, 0);
    transf.ejercicio09(5, 0);
    transf.ejercicio10(5, 0);
    transf.ejercicio11(5, 0);
    transf.ejercicio12(5, 0);
    transf.ejercicio13(5, 0);
    transf.ejercicio14(5, 0);
    transf.ejercicio16(5, 0);

}
    
}
