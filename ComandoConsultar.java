import java.util.ArrayList;

public class ComandoConsultar implements IComandoConsulta {

    public void executar(int codLivro){

        Livro livro = GerenciadorBiblioteca.buscarLivroPorCodLivro(codLivro);

        System.out.println("---Titulo do livro: " + "\n" + livro.getTitulo());

        ArrayList <Reserva> reservasEncontradas = GerenciadorBiblioteca.getReservas();

        System.out.println("Quantidade de reservas: " + reservasEncontradas.size());

        if(reservasEncontradas.size() > 0){
            
            for(Reserva reserva : reservasEncontradas){

                Usuario usuario = GerenciadorBiblioteca.buscarUsuarioPorCodigo(reserva.getCodUsuario());
                
                System.out.print("Nome usuário: " + usuario.getNome());
            }  
        }
        for(Exemplar exemplar : livro.getExamplares()){
            System.out.println("--EXEMPLAR: " );
            System.out.println ("Código do exemplar: " + exemplar.getCodigo());
            System.out.println ("Status: " + exemplar.getStatus());
            if(exemplar.getStatus() == false){
                //o exemplar foi emprestado, deverá ser exibido o nome do usuário que realizou o empréstimo, a data de empréstimo e a data prevista para devolução.
            }
        }





    }
}
