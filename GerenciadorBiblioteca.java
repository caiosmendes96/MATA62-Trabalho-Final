import java.util.ArrayList;

public final class GerenciadorBiblioteca {

    private static ArrayList <Emprestimo> emprestimos = new ArrayList<>();


    public static void criarEmprestimo(int codUsuario, int codLivro){

        emprestimos.add(new Emprestimo(codUsuario, codLivro));
    }

}
