/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadora;



/**
 *
* @author Karla ----- Fernanda---- Josue----Ana
*/
public class Graficadora {
    
    //Importante, plano debe ser publico y estatico
    public static plano plano;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    FrmPrincipal inicio = new FrmPrincipal();
    inicio.setLocationRelativeTo(null);
    inicio.setVisible(true);
}
}