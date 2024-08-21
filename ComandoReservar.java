

public class ComandoReservar implements IComando {

    public void executar(int codUsuario, int codLivro){

        
        Usuario usuario = GerenciadorBiblioteca.buscarUsuarioPorCodigo(codUsuario);
        Livro livro = GerenciadorBiblioteca.buscarLivroPorCodLivro(codLivro);

        
        if(usuario.getQtdReservas() < 3 ){
            System.out.println("Criou reserva com sucesso! \n");
            System.out.println("Nome do usuário: " + usuario.getNome());
            System.out.println("Titulo do livro: " + livro.getTitulo());
            GerenciadorBiblioteca.criarReserva(codUsuario,codLivro);
            usuario.incrementarQtdReserva();
        }else{
            System.out.println("Não foi possível criar a reserva! O usuário já possui 3 livros reservados! \n");
        }


        

    }

}
