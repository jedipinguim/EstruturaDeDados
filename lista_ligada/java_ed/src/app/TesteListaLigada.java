package app;

public class TesteListaLigada {
    public static void main(String[] args) throws Exception {
        
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        
        lista.adicionaNoComeco("Vinicius");
        System.out.println(lista);

        lista.adicionaNoComeco("Pedrinho");
        System.out.println(lista);

        lista.adicionaNoComeco("Bia");
        System.out.println(lista);

        lista.adiciona("Caio");
        System.out.println(lista);

        lista.adiciona(1,"Cesar");
        System.out.println(lista);

        lista.removeDoComeco();
        System.out.println(lista);
    }
}