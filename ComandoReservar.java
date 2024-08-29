
public class ComandoReservar implements IComando {

    public void executar(int codUsuario, int codLivro) {

        Usuario usuario = GerenciadorBiblioteca.getGerenciadorUsuarios().buscarUsuarioPorCodigo(codUsuario);
        Livro livro = GerenciadorBiblioteca.getGerenciadorLivros().buscarLivroPorCodLivro(codLivro);

        if (usuario.podeReservar()) {

            System.out.println("Criou reserva com sucesso! \n");
            System.out.println("Nome do usuário: " + usuario.getNome());
            System.out.println("Titulo do livro: " + livro.getTitulo());

            GerenciadorBiblioteca.getGerenciadorReservas().criarReserva(codUsuario, codLivro);

            usuario.incrementarQtdReserva();

            if (GerenciadorBiblioteca.getGerenciadorReservas().verificarReservasParaObservador(codLivro)) {
                livro.notificarObservadores();
            }
        } else {
            System.out.println("Não foi possível criar a reserva! O usuário já possui 3 livros reservados! \n");
        }

    }

}
