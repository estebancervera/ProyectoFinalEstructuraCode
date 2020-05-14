import java.awt.*;

public class Enlace {
    private int x1,y1,x2,y2;
    private int peso;

    public Enlace(int x1, int y1, int x2, int y2, int peso) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.peso = peso;
    }

    public void pintar(Graphics g){
        g.drawLine(x1,y1,x2,y2);
        if(x1 > x2 && y1 > y2){
            g.drawString("" + peso, x1 - Math.abs((x1 - x2))/2, y1 - Math.abs((y1 - y2))/2);
        }
        if (x1 < x2 && y1 < y2){
            g.drawString("" + peso, x2 - Math.abs((x1 - x2))/2, y2 - Math.abs((y1 - y2))/2);
        }
        if(x1 > x2 && y1 < y2){
            g.drawString("" + peso, x1 - Math.abs((x1 - x2))/2, y2 - Math.abs((y1 - y2))/2);
        }
        if(x1 < x2 && y1 > y2){
            g.drawString("" + peso, x2 - Math.abs((x1 - x2))/2, y1 - Math.abs((y1 - y2))/2);
        }
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}