public class ArbolBinario {
    private Nodo raiz;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    // Operaciones Arboles binarios

    // 1. PREORDEN
    public void preOrden(){
        System.out.println(ANSI_RED+"\tPREORDEN --> PADRE - IZQUIERDO - DERECHO"+ANSI_RESET);
        preOrden(this.raiz);
    }

    private void preOrden(Nodo n){
        // Recorrido recursivo
        if (n != null) { // n == null caso base cierre de recursividad
            System.out.print("NODO ===> "+n.getDato()+" | ");
            preOrden(n.getHijoIzq());
            preOrden(n.getHijoDer());
        }
    }
    // 2. POSTORDEN
    public void postOrden(){
        System.out.println(ANSI_RED+"\tPOSTORDEN --> IZQUIERDO- DERECHO - PADRE"+ANSI_RESET);
        postOrden(this.raiz);
    }

    private void postOrden(Nodo n){
        // Recorrido recursivo
        if (n != null) { // n == null caso base cierre de recursividad
            preOrden(n.getHijoIzq());
            preOrden(n.getHijoDer());
            System.out.print("NODO ===> "+n.getDato()+" | ");
        }
    }

    // 3. INORDEN
    public void inOrden(){
        System.out.println(ANSI_RED+"\tINORDEN --> IZQUIERDO - PADRE - DERECHO"+ANSI_RESET);
        inOrden(this.raiz);
    }

    private void inOrden(Nodo n){
        // Recorrido recursivo
        if (n != null) { // n == null caso base cierre de recursividad
            preOrden(n.getHijoIzq());
            System.out.print("NODO ===> "+n.getDato()+" | ");
            preOrden(n.getHijoDer());
        }
    }

    // 4. BUSCAR
    public String buscar(int dato){
        if (buscar(dato, this.raiz)) return "DATO A BUSCAR --> "+dato+" ENCONTRADO";
        return "DATO A BUSCAR --> "+dato+" NO ENCONTRADO";
    }

    private boolean buscar(int dato, Nodo n){
        if (n != null){
            if (n.getDato() == dato) return true; // Si lo encuentra retorna verdadero
            boolean encontradoIzq = buscar(dato, n.getHijoIzq()); // Sino sigue buscando con los hijos izq
            boolean encontradoDer = buscar(dato, n.getHijoDer()); // Sino sigue buscando con los hijos der
            if (encontradoIzq || encontradoDer) return true;

        }
        return false;
    }

    // 5. CONTAR
    public String contar(){
        int total = contar(this.raiz);
        return "El arbol tiene " + total + " nodos";
    }

    public int contar(Nodo n){
        if (n == null) return 0;
        int c1 = contar(n.getHijoIzq());
        int c2 = contar(n.getHijoDer());
        int total = c1 + c2 + 1; // todos los hijo izq y derecha mas la raiz
        return total;
    }

    // 6. SUMAR
    public String sumar(){
        Object total = sumar(this.raiz);
        return "La suma de los nodos es " + total;
    }

    public int sumar(Nodo n){
        if (n == null) return 0;
        int c1 = sumar(n.getHijoIzq());
        int c2 = sumar(n.getHijoDer());
        int total = c1 + c2 + n.getDato(); // todos los hijo izq y derecha mas la raiz
        return total;
    }

    // 7. CALCULAR ALTURA
    public String calcularAltura(){
        int altura = calcularAltura(this.raiz);
        return "LA ALTURA DEL ARBOL ES ==== "+altura;
    }

    public int calcularAltura(Nodo n){
        if (n == null) return 0;
        int h1 = calcularAltura(n.getHijoIzq());
        int h2 = calcularAltura(n.getHijoDer());

        if (h1 > h2) return h1 + 1; // Nodo raiz +1
        return h2 + 1;
    }

    // 8. BUSCAR MAYOR
    public String buscarMayor(){
        int mayor = buscarMayor(this.raiz);
        return "EL NODO MAYOR ES ==== "+mayor;
    }

    public int buscarMayor(Nodo n){
        if (n == null) return 0;
        int m1 = buscarMayor(n.getHijoIzq());
        int m2 = buscarMayor(n.getHijoDer());
        int m3 = n.getDato(); // padre

        if (m1 > m2 && m1 > m3) return m1; // menor que el derecho y el padre
        if (m2 > m1 && m2 > m3) return m2; // menor que el izquierdo y el padre
        return m3;
    }

    // 9. BUSCAR MAYOR
    public String buscarMenor(){
        int menor = buscarMenor(this.raiz);
        return "EL NODO MENOR ES ==== "+menor;
    }

    public int buscarMenor(Nodo n){
        if (n == null) return 0;
        int m1 = buscarMenor(n.getHijoIzq());
        int m2 = buscarMenor(n.getHijoDer());
        int m3 = n.getDato(); // padre

        if (m1 < m2 && m1 < m3) return m1; // mayor que el derecho y el padre
        if (m2 < m1 && m2 < m3) return m2; // mayor que el izquierdo y el padre
        return m3;
    }

    // CONSTRUCTOR DEL ARBOL
    public ArbolBinario(){
        this.setRaiz(null);
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}