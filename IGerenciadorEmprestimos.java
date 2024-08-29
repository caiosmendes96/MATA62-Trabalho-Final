import java.util.ArrayList;

public interface IGerenciadorEmprestimos {
    void criarEmprestimo(int codUsuario, int codLivro, int tempoEmprestimoUsuario, int codExemplar);

    Emprestimo buscarEmprestimoPorCodExemplar(int codExemplar);

    Emprestimo buscarEmprestimoPorCodLivro(int codLivro);

    ArrayList<Emprestimo> buscarEmprestimosPorCodUsuario(int codUsuario);

    ArrayList<Emprestimo> buscarEmprestimosPorCodUsuarioECodLivro(int codUsuario, int codLivro);

    void atualizarStatusDevedor(Usuario usuario);
}
