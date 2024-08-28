import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public final class GerenciadorBiblioteca {

    private static ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    private static ArrayList<Reserva> reservas = new ArrayList<>();
    private static ArrayList<Livro> livros = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }


    public static void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        GerenciadorBiblioteca.emprestimos = emprestimos;
    }

    public static ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public static void setReservas(ArrayList<Reserva> reservas) {
        GerenciadorBiblioteca.reservas = reservas;
    }

    public static boolean verificarReservasParaObservador(int codLivro) {
        int contador = 0;

        for (Reserva reserva : reservas) {
            if (codLivro == reserva.getCodLivro()) {
                contador += 1;
            }
        }

        if (contador > 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void atualizarStatusDevedor(Usuario usuario) {
        usuario.setDevedor(false);

        for (Emprestimo emprestimo : emprestimos) {

            if (emprestimo.getDataDevolucaoRealizada() == null
                    && ChronoUnit.DAYS.between(emprestimo.getDataDevolucaoPrevista(), LocalDate.now()) > 0) {
                usuario.setDevedor(true);

            }

        }
    }
    public static Livro buscarLivroPorCodLivro(int codLivro){

        for (Livro livro : livros) {

            if (livro.getCodigo() == codLivro) {
                return livro;
            }
        }
        return null;
    }

    public static ArrayList<Reserva> buscarReservasPorCodLivro(int codLivro) {

        ArrayList<Reserva> reservasAuxiliar = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getCodLivro() == codLivro) {
                reservasAuxiliar.add(reserva);
            }
        }
        return reservasAuxiliar;
    }

    public static Reserva buscarReservaPorCodLivroECodUsuario(int codUsuario, int codLivro) {

        ArrayList<Reserva> reservasEncontradas = buscarReservasPorCodLivro(codLivro);
        for (Reserva reserva : reservasEncontradas) {
            if (reserva.getCodUsuario() == codUsuario) {
                return reserva;
            }
        }
        return null;
    }

    public static ArrayList<Emprestimo> buscarEmprestimosPorCodUsuarioECodLivro(int codUsuario,int codLivro) {

        ArrayList<Emprestimo> emprestimosEncontrados = new ArrayList<>();
        
        ArrayList<Emprestimo> emprestimosEncontradosPorUsuario = buscarEmprestimosPorCodUsuario(codUsuario);

        for (Emprestimo emprestimo : emprestimosEncontradosPorUsuario) {

            if (emprestimo.getCodLivro() == codLivro) {
                emprestimosEncontrados.add(emprestimo);
            }
        }        
        return emprestimosEncontrados;
    }


    public static ArrayList<Reserva> buscarUsuariosPorCodLivro(int codLivro) {

        ArrayList<Reserva> reservasAuxiliar = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getCodLivro() == codLivro) {
                reservasAuxiliar.add(reserva);
            }
        }
        return reservasAuxiliar;
    }

    public static ArrayList<Reserva> buscarReservasPorCodUsuario(int codUsuario) {

        ArrayList<Reserva> reservasAuxiliar = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getCodUsuario() == codUsuario) {
                reservasAuxiliar.add(reserva);
            }
        }
        return reservasAuxiliar;
    }

    public static Usuario buscarUsuarioPorCodigo(int codigo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCodigo() == codigo) {
                return usuario;
            }
        }
        return null;
    }

    public static void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public static void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void criarEmprestimo(int codUsuario, int codLivro, int tempoEmprestimoUsuario, int codExemplar) {

        emprestimos.add(new Emprestimo(codUsuario, codLivro, tempoEmprestimoUsuario, codExemplar));

    }

    public static void criarReserva(int codUsuario, int codLivro) {

        reservas.add(new Reserva(codUsuario, codLivro));
    }

    public static void removerReserva(Reserva reserva) {
        
        System.out.println("Reserva removida com sucesso! \n");
        reservas.remove(reserva);
    }

    public static Emprestimo buscarEmprestimoPorCodExemplar(int codExemplar) {

        for (Emprestimo emprestimo : emprestimos) {

            if (emprestimo.getCodExemplar() == codExemplar) {
                return emprestimo;
            }
        }
        return null;
    }

    public static Emprestimo buscarEmprestimoPorCodLivro(int codLivro) {

        for (Emprestimo emprestimo : emprestimos) {

            if (emprestimo.getCodLivro() == codLivro) {
                return emprestimo;
            }
        }
        return null;
    }

    public static ArrayList<Emprestimo> buscarEmprestimosPorCodUsuario(int codUsuario) {

        ArrayList<Emprestimo> emprestimosEncontrados = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {

            if (emprestimo.getCodUsuario() == codUsuario) {
                emprestimosEncontrados.add(emprestimo);
            }
        }
        return emprestimosEncontrados;
    }

    public static int buscarQuantidadeDeReservasPorLivro(int codLivro) {
        int contador = 0;

        for (Reserva reserva : reservas) {
            if (codLivro == reserva.getCodLivro()) {
                contador += 1;
            }
        }
        return contador;
    }
}
