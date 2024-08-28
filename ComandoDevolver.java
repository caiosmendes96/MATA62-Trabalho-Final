import java.time.LocalDate;
import java.util.ArrayList;

public class ComandoDevolver implements IComando {

    public void executar(int codUsuario, int codLivro) {

        ArrayList<Emprestimo> emprestimosEncontrados = GerenciadorBiblioteca.buscarEmprestimosPorCodUsuario(codUsuario);
        Usuario usuario = GerenciadorBiblioteca.buscarUsuarioPorCodigo(codUsuario);
        boolean encontrouEmprestimo = false;

        for (Emprestimo emprestimo : emprestimosEncontrados) {
            if (emprestimo.getCodLivro() == codLivro) {
                emprestimo.finalizarEmprestimo(usuario);
                encontrouEmprestimo = true;
                break;
            }
        }
        System.out.println(encontrouEmprestimo ? "Devolução realizada com sucesso!"
                : "Não foi possivel realizar a devolução! Não existe empréstimo em curso para esse usuário!");

    }

}
