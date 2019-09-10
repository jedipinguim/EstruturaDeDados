package ed;
/**
 * VetorTeste
 */
public class VetorTeste {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Vinicius");
        Aluno b1 = new Aluno("Pedrinho");
        Aluno c1 = new Aluno("Bia");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(b1);
        lista.adiciona(0, c1);       
  

        System.out.println(lista);

        for (int i = 0; i < 300; i++) {
            Aluno y = new Aluno("Aluno " + i);
            lista.adiciona(y);
        }

        System.out.println(lista);
        

    }
}