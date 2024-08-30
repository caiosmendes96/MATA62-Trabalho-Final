import java.util.ArrayList;

public interface IGerenciadorEmprestimos {
    public void criarEmprestimo(int codUsuario, int codLivro, int tempoEmprestimoUsuario, int codExemplar);

    public Emprestimo buscarEmprestimoPorCodExemplar(int codExemplar);

    public Emprestimo buscarEmprestimoPorCodLivro(int codLivro);

    public ArrayList<Emprestimo> buscarEmprestimosPorCodUsuario(int codUsuario);

    public ArrayList<Emprestimo> buscarEmprestimosPorCodUsuarioECodLivro(int codUsuario, int codLivro);

    public void atualizarStatusDevedor(Usuario usuario);
}
