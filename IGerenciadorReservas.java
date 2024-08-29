import java.util.ArrayList;

public interface IGerenciadorReservas {
    void criarReserva(int codUsuario, int codLivro);

    void removerReserva(Reserva reserva);

    Reserva buscarReservaPorCodLivroECodUsuario(int codUsuario, int codLivro);

    ArrayList<Reserva> buscarReservasPorCodLivro(int codLivro);

    ArrayList<Reserva> buscarReservasPorCodUsuario(int codUsuario);

    boolean verificarReservasParaObservador(int codLivro);

    int buscarQuantidadeDeReservasPorLivro(int codLivro);

    ArrayList<Reserva> getReservas();
}
