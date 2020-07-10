public class Nodo {
    private int dato;
    private Nodo hijoIzq;

    public Nodo(int dato) {
        this.dato = dato;
        this.hijoIzq = null;
        this.hijoDer = null;
    }

    private Nodo hijoDer;

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }
}
