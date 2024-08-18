import java.util.ArrayList;

public final class GerenciadorBiblioteca {

    private static ArrayList <Emprestimo> emprestimos = new ArrayList<>();
    private static ArrayList <Reserva> reservas = new ArrayList<>();
    private static ArrayList <Livro> livros = new ArrayList<>();
    private static ArrayList <Usuario> usuarios = new ArrayList<>();

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

    public static Livro buscarLivroPorCodLivro(int codLivro){

       for(Livro livro : livros){
        
            if(livro.getCodigo() == codLivro){
                return livro;
            }
       }
       return null;
    }

    public static ArrayList<Reserva> buscarReservasPorCodLivro(int codLivro){

        ArrayList<Reserva> reservasAuxiliar = new ArrayList<>();
        for(Reserva reserva : reservas){
            if(reserva.getCodLivro() == codLivro){
                reservasAuxiliar.add(reserva);
            }   
        }
        return reservasAuxiliar;
    }

    public static Reserva buscarReservaPorCodLivroECodUsuario(int codUsuario, int codLivro){

        ArrayList<Reserva> reservasEncontradas = buscarReservasPorCodLivro(codLivro);
        System.out.println(reservasEncontradas);
        for(Reserva reserva : reservasEncontradas){
            if(reserva.getCodUsuario() == codUsuario){
                return reserva;
            }
        }
        return null;
    }

    public static ArrayList<Reserva> buscarUsuariosPorCodLivro(int codLivro){

        ArrayList<Reserva> reservasAuxiliar = new ArrayList<>();
        for(Reserva reserva : reservas){
            if(reserva.getCodLivro() == codLivro){
                reservasAuxiliar.add(reserva);
            }   
        }
        return reservasAuxiliar;
    }

    public static Usuario buscarUsuarioPorCodigo(int codigo){
        for(Usuario usuario : usuarios){
            if(usuario.getCodigo() == codigo){
                return usuario;
            }
           }
           return null;
    }

    public static void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public static void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public static void criarEmprestimo(int codUsuario, int codLivro, int tempoEmprestimoUsuario, int codExemplar){

        emprestimos.add(new Emprestimo(codUsuario, codLivro, tempoEmprestimoUsuario, codExemplar));

    }

    public static void criarReserva(int codUsuario, int codLivro){

        reservas.add(new Reserva(codUsuario, codLivro));
    }

    public static void removerReserva(Reserva reserva){

        reservas.remove(reserva);
    }

    public static Emprestimo buscarEmprestimoPorCodExemplar(int codExemplar){

        for(Emprestimo emprestimo : emprestimos){
            
            if(emprestimo.getCodExemplar() == codExemplar){
                return emprestimo;
            }
        }
           return null;
    }
    
}
