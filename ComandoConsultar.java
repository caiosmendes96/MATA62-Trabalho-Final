
import java.util.ArrayList;

public class ComandoConsultar implements IComandoConsulta {

    public void executarConsultaLivro(int codLivro) {

        Livro livro = GerenciadorBiblioteca.getGerenciadorLivros().buscarLivroPorCodLivro(codLivro);
        ArrayList<Reserva> reservasEncontradas = GerenciadorBiblioteca.getGerenciadorReservas().getReservas();// ????

        System.out.println("***--- CONSULTA LIVRO ---*** \n");

        System.out.println("---Titulo do livro: " + "\n" + livro.getTitulo());

        System.out.println("Quantidade de reservas: " + reservasEncontradas.size());

        if (reservasEncontradas.size() > 0) {

            for (Reserva reserva : reservasEncontradas) {

                Usuario usuario = GerenciadorBiblioteca.getGerenciadorUsuarios()
                        .buscarUsuarioPorCodigo(reserva.getCodUsuario());

                System.out.print("Nome usuário que fez a reserva: " + usuario.getNome() + "\n");
            }
        }
        for (Exemplar exemplar : livro.getExamplares()) {
            System.out.println("--EXEMPLAR: ");
            System.out.println("Código do exemplar: " + exemplar.getCodigo());
            System.out.println("Status: " + exemplar.getNomeStatusExemplar());

            Emprestimo emprestimo = GerenciadorBiblioteca.getGerenciadorEmprestimos()
                    .buscarEmprestimoPorCodExemplar(exemplar.getCodigo());

            exemplar.consultar(emprestimo);
        }
    }

    public void executarConsultaUsuario(int codUsuario) {

        ArrayList<Emprestimo> emprestimoEncontrados = GerenciadorBiblioteca.getGerenciadorEmprestimos()
                .buscarEmprestimosPorCodUsuario(codUsuario);
        ArrayList<Reserva> reservasEncontradas = GerenciadorBiblioteca.getGerenciadorReservas()
                .buscarReservasPorCodUsuario(codUsuario);

        System.out.println(" ***--- CONSULTA USUARIO ---*** \n \n ");

        System.out.println("--- EMPRÉSTIMOS \n");

        for (Emprestimo emprestimo : emprestimoEncontrados) {

            System.out.println("Título do livro: " + GerenciadorBiblioteca.getGerenciadorLivros()
                    .buscarLivroPorCodLivro(emprestimo.getCodLivro()).getTitulo());
            System.out.println("Data empréstimo: " + emprestimo.getDataEmprestimo());
            System.out.println("Status empréstimo:  " + emprestimo.getNomeStatusEmprestimo());

            emprestimo.consultarData();

        }

        System.out.println("--- RESERVAS \n");

        for (Reserva reserva : reservasEncontradas) {
            System.out.println("***");
            System.out.println("Título do livro: " + GerenciadorBiblioteca.getGerenciadorLivros()
                    .buscarLivroPorCodLivro(reserva.getCodLivro()).getTitulo());
            System.out.println("Data solicitação: " + reserva.getDataSolicitacao() + "\n ");
        }

    }
}
