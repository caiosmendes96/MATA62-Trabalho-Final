import java.util.ArrayList;

public class ComandoDevolver implements IComando {

    public void executar(int codUsuario, int codLivro) {

        Usuario usuario = GerenciadorBiblioteca.getGerenciadorUsuarios().buscarUsuarioPorCodigo(codUsuario);
        ArrayList<Emprestimo> emprestimosEncontrados = GerenciadorBiblioteca.getGerenciadorEmprestimos()
                .buscarEmprestimosPorCodUsuarioECodLivro(codUsuario, codLivro);

        if (emprestimosEncontrados != null) {

            for (Emprestimo emprestimo : emprestimosEncontrados) {

                if (emprestimo.podeDevolver()) { // boolean verifica o status do emprestimo encontrado para o livro, se
                                                 // estiver EM CURSO, retorna true

                    emprestimo.finalizarEmprestimo(usuario);
                    System.out.println("Devolução realizada com sucesso! \n");
                } else {
                    System.out.println(
                            "Não foi possivel realizar a devolução! Não existe empréstimo EM CURSO do livro para esse usuário!");
                }
            }

        } else {
            System.out.println(
                    "Não foi possivel realizar a devolução! Não existe empréstimo do livro para esse usuário!");
        }
    }

}
