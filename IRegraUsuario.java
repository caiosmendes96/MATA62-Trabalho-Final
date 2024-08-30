import java.util.ArrayList;

public interface IRegraUsuario {

    public boolean validarEmprestimo(Usuario usuario,Livro livro,Reserva reservaEncontrada, ArrayList<Emprestimo> emprestimosEncontrados);

}
