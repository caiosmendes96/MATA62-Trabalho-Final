import java.util.ArrayList;

public final class GerenciadorReservas implements IGerenciadorReservas {

    private static ArrayList<Reserva> reservas = new ArrayList<>();

    @Override
    public void criarReserva(int codUsuario, int codLivro) {
        reservas.add(new Reserva(codUsuario, codLivro));
    }

    @Override
    public void removerReserva(Reserva reserva) {
        reservas.remove(reserva);
        System.out.println("Reserva removida com sucesso! \n");
    }

    @Override
    public Reserva buscarReservaPorCodLivroECodUsuario(int codUsuario, int codLivro) {
        ArrayList<Reserva> reservasEncontradas = buscarReservasPorCodLivro(codLivro);
        for (Reserva reserva : reservasEncontradas) {
            if (reserva.getCodUsuario() == codUsuario) {
                return reserva;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    @Override
    public ArrayList<Reserva> buscarReservasPorCodLivro(int codLivro) {
        ArrayList<Reserva> reservasAuxiliar = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getCodLivro() == codLivro) {
                reservasAuxiliar.add(reserva);
            }
        }
        return reservasAuxiliar;
    }

    @Override
    public ArrayList<Reserva> buscarReservasPorCodUsuario(int codUsuario) {
        ArrayList<Reserva> reservasAuxiliar = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getCodUsuario() == codUsuario) {
                reservasAuxiliar.add(reserva);
            }
        }
        return reservasAuxiliar;
    }

    @Override
    public boolean verificarReservasParaObservador(int codLivro) {
        int contador = 0;
        for (Reserva reserva : reservas) {
            if (codLivro == reserva.getCodLivro() && reserva.isAtiva()) {
                contador += 1;
            }
        }
        return contador > 2;
    }

    @Override
    public int buscarQuantidadeDeReservasPorLivro(int codLivro) {
        int contador = 0;
        for (Reserva reserva : reservas) {
            if (codLivro == reserva.getCodLivro()) {
                contador += 1;
            }
        }
        return contador;
    }
}
