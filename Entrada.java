
import java.util.*;

class Entrada {
    String zona;
    int precio;
    boolean[] asientos; // true = ocupado

    public Entrada(String zona, int precio, int capacidad) {
        this.zona = zona;
        this.precio = precio;
        this.asientos = new boolean[capacidad];
    }

    public int disponibles() {
        int count = 0;
        for (boolean ocupado : asientos) {
            if (!ocupado) count++;
        }
        return count;
    }

    public void mostrarAsientos() {
        System.out.print(zona + ": ");
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i]) {
                System.out.print("[X] ");
            } else {
                System.out.print("[" + (i + 1) + "] ");
            }
        }
        System.out.println();
    }

    public boolean comprarAsiento(int indice) {
        if (indice >= 0 && indice < asientos.length && !asientos[indice]) {
            asientos[indice] = true;
            return true;
        }
        return false;
    }
} 

