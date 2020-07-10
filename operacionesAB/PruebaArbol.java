public class PruebaArbol {

    public static void main(String[] args) {
        ArbolBinario ab = new ArbolBinario();
        // Declaracion de los nodos del arbol
        Nodo n1 = new Nodo(1);
        Nodo n2 = new Nodo(2);
        Nodo n3 = new Nodo(3);
        Nodo n4 = new Nodo(4);
        Nodo n5 = new Nodo(5);
        Nodo n6 = new Nodo(6);
        Nodo n7 = new Nodo(7);

        // Hijos del nodo 2
        n2.setHijoIzq(n4);
        n2.setHijoDer(n5);

        // Hijos del nodo 1
        n1.setHijoIzq(n2);
        n1.setHijoDer(n3);

        n3.setHijoIzq(n6);
        n3.setHijoDer(n7);
        // Nodo 1 como raiz
        ab.setRaiz(n1);

        ab.preOrden();
        System.out.println("\n\n");
        ab.postOrden();
        System.out.println("\n\n");
        ab.inOrden();
        System.out.println("\n\n");
        // NO ENCONTRADOS
        System.out.println(ab.buscar(20));
        System.out.println(ab.buscar(30));
        System.out.println(ab.buscar(75));
        System.out.println("\n\n");

        // ENCONTRADOS
        System.out.println(ab.buscar(1));
        System.out.println(ab.buscar(4));
        System.out.println(ab.buscar(6));
        System.out.println("\n\n");

        System.out.println(ab.contar());
        System.out.println("\n\n");

        System.out.println(ab.sumar());
        System.out.println("\n\n");

        System.out.println(ab.calcularAltura());
        System.out.println("\n\n");

        System.out.println(ab.buscarMayor());
        System.out.println("\n\n");

        System.out.println(ab.buscarMenor());

    }
}
