
import java.util.ArrayList;

public class ComandoConsultar implements IComandoConsulta {

    public void executarConsultaLivro(int codLivro){
        // COMANDO LIV
        System.out.println("--- CONSULTA LIVRO --- \n");
        
        Livro livro = GerenciadorBiblioteca.buscarLivroPorCodLivro(codLivro);

        System.out.println("---Titulo do livro: " + "\n" + livro.getTitulo());

        ArrayList <Reserva> reservasEncontradas = GerenciadorBiblioteca.getReservas();

        System.out.println("Quantidade de reservas: " + reservasEncontradas.size());

        if(reservasEncontradas.size() > 0){
            
            for(Reserva reserva : reservasEncontradas){

                Usuario usuario = GerenciadorBiblioteca.buscarUsuarioPorCodigo(reserva.getCodUsuario());
                
                System.out.print("Nome usuário que fez a reserva: " + usuario.getNome());
            }  
        }
        for(Exemplar exemplar : livro.getExamplares()){
            System.out.println("--EXEMPLAR: " );
            System.out.println ("Código do exemplar: " + exemplar.getCodigo());
            System.out.println ("Status: " + exemplar.getStatus());

            if(exemplar.getStatus() == "emprestado"){
                Emprestimo emprestimo = GerenciadorBiblioteca.buscarEmprestimoPorCodExemplar(exemplar.getCodigo());
                System.out.println("--EXEMPLAR EMPRESTADO: " );
                System.out.println("Nome usuário: " + GerenciadorBiblioteca.buscarUsuarioPorCodigo(emprestimo.getCodUsuario()).getNome());
                System.out.println("Data empréstimo: " + emprestimo.getDataEmprestimo());
                System.out.println("Data prevista para devolução: " + emprestimo.getDataDevolucao());
            }
        }
    }

    public void executarConsultaUsuario(int codUsuario){
        
        System.out.println(" --- CONSULTA USUARIO --- \n");

        ArrayList <Emprestimo> emprestimoEncontrados = GerenciadorBiblioteca.buscarEmprestimosPorCodUsuario(codUsuario);
        System.out.println("--- EMPRÉSTIMOS \n");
        for (Emprestimo emprestimo : emprestimoEncontrados){
            
            System.out.println("Título do livro: " + GerenciadorBiblioteca.buscarLivroPorCodLivro(emprestimo.getCodLivro()).getTitulo() );
            System.out.println("Data empréstimo: " + emprestimo.getDataEmprestimo());
            System.out.println("Status empréstimo:  " + emprestimo.getStatus());
            System.out.println("Data prevista para devolução: " + emprestimo.getDataDevolucao());
        }
        System.out.println("--- RESERVAS \n");
        ArrayList <Reserva> reservasEncontradas = GerenciadorBiblioteca.buscarReservasPorCodUsuario(codUsuario);
        for(Reserva reserva : reservasEncontradas){  
            System.out.println("***");  
            System.out.println("Título do livro: " + GerenciadorBiblioteca.buscarLivroPorCodLivro(reserva.getCodLivro()).getTitulo() );
            System.out.println("Data solicitação: " + reserva.getDataSolicitacao());
        }








    }
}
