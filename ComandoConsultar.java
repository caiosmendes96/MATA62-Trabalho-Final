
import java.util.ArrayList;

public class ComandoConsultar implements IComandoConsulta {

    public void executarConsultaLivro(int codLivro) {

        Livro livro = GerenciadorBiblioteca.gerenciadorLivros.buscarLivroPorCodLivro(codLivro);
        ArrayList<Reserva> reservasEncontradas = GerenciadorBiblioteca.gerenciadorReservas.getReservas();

        System.out.println("***--- CONSULTA LIVRO ---*** \n");

        System.out.println("---Titulo do livro: " + "\n" + livro.getTitulo());

        System.out.println("Quantidade de reservas: " + reservasEncontradas.size());

        if (reservasEncontradas.size() > 0) {

            for (Reserva reserva : reservasEncontradas) {

                Usuario usuario = GerenciadorBiblioteca.gerenciadorUsuarios
                        .buscarUsuarioPorCodigo(reserva.getCodUsuario());

                System.out.print("Nome usuário que fez a reserva: " + usuario.getNome() + "\n");
            }
        }
        for (Exemplar exemplar : livro.getExamplares()) {
            System.out.println("--EXEMPLAR: ");
            System.out.println("Código do exemplar: " + exemplar.getCodigo());
            System.out.println("Status: " + exemplar.getNomeStatusExemplar());

            Emprestimo emprestimo = GerenciadorBiblioteca.gerenciadorEmprestimos
                    .buscarEmprestimoPorCodExemplar(exemplar.getCodigo());

            exemplar.consultar(emprestimo);
        }
    }

    public void executarConsultaUsuario(int codUsuario) {

        ArrayList<Emprestimo> emprestimoEncontrados = GerenciadorBiblioteca.gerenciadorEmprestimos
                .buscarEmprestimosPorCodUsuario(codUsuario);
        ArrayList<Reserva> reservasEncontradas = GerenciadorBiblioteca.gerenciadorReservas
                .buscarReservasPorCodUsuario(codUsuario);

        System.out.println(" ***--- CONSULTA USUARIO ---*** \n \n ");

        System.out.println("--- EMPRÉSTIMOS \n");

        for (Emprestimo emprestimo : emprestimoEncontrados) {

            System.out.println("Título do livro: " + GerenciadorBiblioteca.gerenciadorLivros
                    .buscarLivroPorCodLivro(emprestimo.getCodLivro()).getTitulo());
            System.out.println("Data empréstimo: " + emprestimo.getDataEmprestimo());
            System.out.println("Status empréstimo:  " + emprestimo.getNomeStatusEmprestimo());

            emprestimo.consultarData();

        }

        System.out.println("--- RESERVAS \n");

        for (Reserva reserva : reservasEncontradas) {
            System.out.println("***");
            System.out.println("Título do livro: " + GerenciadorBiblioteca.gerenciadorLivros
                    .buscarLivroPorCodLivro(reserva.getCodLivro()).getTitulo());
            System.out.println("Data solicitação: " + reserva.getDataSolicitacao() + "\n ");
        }

    }
}
