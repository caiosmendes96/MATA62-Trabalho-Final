import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public final class GerenciadorEmprestimos implements IGerenciadorEmprestimos {

    private static ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    @Override
    public void criarEmprestimo(int codUsuario, int codLivro, int tempoEmprestimoUsuario, int codExemplar) {
        emprestimos.add(new Emprestimo(codUsuario, codLivro, tempoEmprestimoUsuario, codExemplar));
    }

    @Override
    public Emprestimo buscarEmprestimoPorCodExemplar(int codExemplar) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getCodExemplar() == codExemplar) {
                return emprestimo;
            }
        }
        return null;
    }

    @Override
    public Emprestimo buscarEmprestimoPorCodLivro(int codLivro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getCodLivro() == codLivro) {
                return emprestimo;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Emprestimo> buscarEmprestimosPorCodUsuario(int codUsuario) {
        ArrayList<Emprestimo> emprestimosEncontrados = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getCodUsuario() == codUsuario) {
                emprestimosEncontrados.add(emprestimo);
            }
        }
        return emprestimosEncontrados;
    }

    @Override
    public ArrayList<Emprestimo> buscarEmprestimosPorCodUsuarioECodLivro(int codUsuario, int codLivro) {
        ArrayList<Emprestimo> emprestimosEncontrados = new ArrayList<>();
        ArrayList<Emprestimo> emprestimosEncontradosPorUsuario = buscarEmprestimosPorCodUsuario(codUsuario);

        for (Emprestimo emprestimo : emprestimosEncontradosPorUsuario) {
            if (emprestimo.getCodLivro() == codLivro) {
                emprestimosEncontrados.add(emprestimo);
            }
        }
        return emprestimosEncontrados;
    }

    @Override
    public void atualizarStatusDevedor(Usuario usuario) {
        usuario.setDevedor(false);

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getDataDevolucaoRealizada() == null
                    && ChronoUnit.DAYS.between(emprestimo.getDataDevolucaoPrevista(), LocalDate.now()) > 0) {
                usuario.setDevedor(true);
            }
        }
    }
}
