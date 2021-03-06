import java.awt.*;
import java.util.Objects;

public class NodoGrafo {

    private int nombre;
    private int x, y;
    public static final int d = 60;

    public NodoGrafo(int x, int y, int nombre) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }

    public void pintar(Graphics g){
        g.drawOval(this.x -d/2, this.y - d/2, d, d);
        g.drawString(nombre + "",x,y);
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

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NodoGrafo)) return false;
        NodoGrafo nodoGrafo = (NodoGrafo) o;
        return getNombre() == nodoGrafo.getNombre();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getX(), getY());
    }


}
