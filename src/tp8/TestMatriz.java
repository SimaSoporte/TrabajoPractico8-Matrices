/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

/**
 *
 * @author HP
 */
public class TestMatriz {
    
    public static void main(String[] args) {
        Matriz mat = new Matriz();
        mat.armar();
        if (mat.getArmada()) {
            //mat.recorrer();
            //mat.recorrerPares();
            mat.recorrerParesPosiciones();
        }
        else
            System.out.println("Eror: primero debe invocar el metodo armar().");
    }
}
