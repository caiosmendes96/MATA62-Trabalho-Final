import java.util.ArrayList;

public class ComandoDevolver implements IComando {

    public void executar(int codUsuario, int codLivro) {

        Usuario usuario = GerenciadorBiblioteca.buscarUsuarioPorCodigo(codUsuario);
        ArrayList <Emprestimo> emprestimosEncontrados = GerenciadorBiblioteca.buscarEmprestimosPorCodUsuarioECodLivro(codUsuario,codLivro);
        Livro livro = GerenciadorBiblioteca.buscarLivroPorCodLivro(codLivro);
        boolean encontrouEmprestimoEmAberto = false;
        
        if (emprestimosEncontrados != null){

            for (Emprestimo emprestimo : emprestimosEncontrados){

                if(emprestimo.podeDevolver()){ //boolean verifica o status do emprestimo encontrado para o livro, se estiver EM CURSO, retorna true

                    encontrouEmprestimoEmAberto = true;
                    Exemplar exemplar = GerenciadorBiblioteca.buscarExemplarPorCodExemplar(livro, emprestimo.getCodExemplar());
                    exemplar.devolver();
                    emprestimo.finalizarEmprestimo(usuario);
                    System.out.println("Devolução realizada com sucesso! \n");
                }
            }
            if (!encontrouEmprestimoEmAberto) System.out.println("Não foi possivel realizar a devolução! Não existe empréstimo EM CURSO do livro para esse usuário!");

        }
    }

}
