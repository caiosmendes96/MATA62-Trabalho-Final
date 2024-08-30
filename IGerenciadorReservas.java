import java.util.ArrayList;

public interface IGerenciadorReservas {
    public void criarReserva(int codUsuario, int codLivro);

    public void removerReserva(Reserva reserva);

    public Reserva buscarReservaPorCodLivroECodUsuario(int codUsuario, int codLivro);

    public ArrayList<Reserva> buscarReservasPorCodLivro(int codLivro);

    public ArrayList<Reserva> buscarReservasPorCodUsuario(int codUsuario);

    public boolean verificarReservasParaObservador(int codLivro);

    public int buscarQuantidadeDeReservasPorLivro(int codLivro);

    public ArrayList<Reserva> getReservas();
}
