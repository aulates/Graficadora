package graficadora;

/**
 *
 * @author Karla ----- Fernanda---- Josue----Ana
 */
public class Grafica {

    public static int a;
    public static int b;
    public static int c;
    private int x;
    private int y;

    public Grafica() {
    }

    public Grafica( int a, int b, int c, int x, int y) { 
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
        this.y = y;
    }

    public boolean concavidad(int a) {
        return (a < 0);

    }

    public float ejeSimetria(int a, int b) {
        float resultado= Float.valueOf(-b/(2*a));
       return resultado;
    }
    public String discriminante(int a, int b, int c) {
        int res = (b * b) - 4 * a * c;
        float resultado = new Float(res);
        return "" + resultado;
    }

    public String ambito(int a, int b, int c) {
        int res = -Integer.parseInt(discriminante(a, b, c)) / 4 * a;
        float resultado = new Float(res);
        return "" + resultado;
    }
    public float vertice(int a, int b, int c){
        float eje = (float) ejeSimetria(a, b);
        float dis = Float.parseFloat(discriminante(a, b, c));
        String res = "(- " + b + " / 2 * " + a + " ) , ( - " + dis + " / 4 *" + a + " )";
        return  eje  + (-dis / (4 * a)) ;
    }

    public String rango(int c, int a, int b) {
        float variable = ((-Float.parseFloat(discriminante(a, b, c))) / (4 * a));
        if (concavidad(a)) {
            return "( - ∞ , " + variable + " ]";
        } else {
            return "[ " + variable+ " , + ∞ )";
        }
    }

    public void puntos() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;

    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
