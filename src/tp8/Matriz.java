package tp8;

public class Matriz {    
    private int arreglo[][] = new int [4][];
    private boolean armada = false;

    /**
     * Devuelve el valor boolean true si la matriz fue armada, de lo contrario 
     * devuelve false. El valor inicial es false y se cambia al invocar el metodo armar().
     * @return
     */
    public boolean getArmada() { return armada; }

    /**
     * Arma la matirz cargandola con los valores de cada posicion.
     */
    public void armar() {
        arreglo[0] = new int[4];
        arreglo[1] = new int[3];
        arreglo[2] = new int[5];
        arreglo[3] = new int[2];
        int x=1;
        for (int i=0; i<4; i++) {
            for (int j=0; j<arreglo[i].length; j++) {
                arreglo[i][j] = x*3;
                x++;
            }
        }
        armada = true;
    }
    
    /**
     * Recorre la matriz completa mostrando el valor de todas las posiciones.
     */
    public void recorrer() {
        for (int i=0; i<4; i++) {
            System.out.print("Fila " + (i+1) + " ---> ");
            for (int j=0; j<arreglo[i].length; j++) {
                System.out.print(arreglo[i][j] + " "); 
            }
            System.out.println("");
        }        
    }    

    /**
     * Recorre la matriz completa mostrando unicamente los valores pares.
     */
    public void recorrerPares() {
       for (int i=0; i<4; i++) {
           System.out.print("Fila " + (i+1) + " ---> | ");
            for (int j=0; j<arreglo[i].length; j++) {
                if ( arreglo[i][j] % 2 == 0 )
                    System.out.print(arreglo[i][j] + " | "); 
            }
            System.out.println("");
        }
    }

    /**
     * Recorre la matriz completa mostrando unicamente los valores pares. Dibuja 
     * la matriz para mostrar la posicion relativa de cada elemento.
     */
    public void recorrerParesPosiciones() {
        System.out.println("            --------------------------");
        for (int i=0; i<4; i++) {
           System.out.print("Fila " + (i+1) + " ---> | ");
            for (int j=0; j<arreglo[i].length; j++) {
                if ( arreglo[i][j] % 2 == 0 ) {
                    if (arreglo[i][j]<10) System.out.print(" ");
                    System.out.print(arreglo[i][j] + " | "); 
                }
                else
                    System.out.print("   | "); 
            }
            System.out.println("");
        }
        System.out.println("            --------------------------");
    }
}