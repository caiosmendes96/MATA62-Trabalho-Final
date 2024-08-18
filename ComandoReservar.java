


public class ComandoReservar implements IComandoEmprestimo {

    public void executar(int codUsuario, int codLivro){

        GerenciadorBiblioteca.criarReserva(codUsuario,codLivro);
        System.out.println("Criou reserva \n");

        System.out.println("Nome do usuário: " + GerenciadorBiblioteca.buscarUsuarioPorCodigo(codUsuario).getNome());

        System.out.println("Titulo do livro: " + GerenciadorBiblioteca.buscarLivroPorCodLivro(codLivro).getTitulo());

    }

}
