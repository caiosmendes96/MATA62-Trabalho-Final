import java.util.ArrayList;

public class RegraAlunoPosGraduacao implements IRegraUsuario {

    @Override
    public boolean validarEmprestimo(Usuario usuario, Livro livro) {

        Reserva reservaEncontrada = GerenciadorBiblioteca.getGerenciadorReservas()
                .buscarReservaPorCodLivroECodUsuario(usuario.getCodigo(), livro.getCodigo());
        ArrayList<Emprestimo> emprestimosEncontrados = GerenciadorBiblioteca.gerenciadorEmprestimos
                .buscarEmprestimosPorCodUsuarioECodLivro(usuario.getCodigo(), livro.getCodigo());

        if (usuario.isDevedor()) {
            System.out.println("Não foi possível criar o empréstimo, pois o usuario é devedor! \n");
            return false;
        }

        if (usuario.getLimiteEmprestimo() <= 0) {
            System.out.println(
                    "Não foi possível criar o empréstimo, pois o usuário já alcançou o limite de emprestimos. \n");
            return false;
        }

        if (reservaEncontrada == null && livro.buscarQuantidadeDeExemplaresDisponiveis() <= GerenciadorBiblioteca
                .getGerenciadorReservas().buscarQuantidadeDeReservasPorLivro(livro.getCodigo())) {
            System.out.println(
                    "Não foi possível criar o empréstimo, todos os exemplares estão reservados e você não tem reserva para esse livro! \n");
            return false;
        }

        if (emprestimosEncontrados != null) {
            for (Emprestimo emprestimo : emprestimosEncontrados) {

                if (emprestimo.getStatus().isEmCurso()) {
                    System.out.println(
                            "Não foi possível criar o empréstimo, pois já existe um emprestimo desse livro em curso! \n");
                    return false;
                }
            }
        }

        return true;
    }

}
