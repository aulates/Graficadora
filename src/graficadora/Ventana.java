package graficadora;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

/**
 *
* @author Karla ----- Fernanda---- Josue----Ana
*/
public class Ventana extends JFrame implements ActionListener{ 
    public double a;
    public double b;
    public double c;
    public double x1;
    public double x2;
    @Override
    public void actionPerformed(ActionEvent e) {
         
        

       Graficadora.plano.paintSQRFunc(Graficadora.plano.getGraphics(),a ,b ,c , x1 * 200, x2 * 200);
//       -0.2,5,-25,-200,200
//         A, B, C, X1, X2
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

}