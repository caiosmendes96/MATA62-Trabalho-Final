import java.util.ArrayList;

public final class GerenciadorReservas {

    private static ArrayList<Reserva> reservas = new ArrayList<>();

    public static ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public static void setReservas(ArrayList<Reserva> reservas) {
        GerenciadorReservas.reservas = reservas;
    }

    public static void criarReserva(int codUsuario, int codLivro) {
        reservas.add(new Reserva(codUsuario, codLivro));
    }

    public static void removerReserva(Reserva reserva) {
        reservas.remove(reserva);
        System.out.println("Reserva removida com sucesso! \n");
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

    public static ArrayList<Reserva> buscarReservasPorCodLivro(int codLivro) {
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

    public static boolean verificarReservasParaObservador(int codLivro) {
        int contador = 0;
        for (Reserva reserva : reservas) {
            if (codLivro == reserva.getCodLivro()) {
                contador += 1;
            }
        }
        return contador > 2;
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
