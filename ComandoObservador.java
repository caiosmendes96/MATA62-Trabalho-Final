
public class ComandoObservador implements IComandoObservador {

    public void executarRegistroObservador(int codUsuario, int codLivro) {
        System.out.println("Observador registrado com sucesso! \n");

        Livro livro = GerenciadorBiblioteca.buscarLivroPorCodLivro(codLivro);
        Usuario usuario = GerenciadorBiblioteca.buscarUsuarioPorCodigo(codUsuario);

        if (livro != null && usuario instanceof Observador) {
            livro.registrarObservador((Observador) usuario);
            System.out.println("Observador registrado para o livro: " + livro.getTitulo());
        } else {
            System.out.println("Falha ao registrar observador.");
        }
    }

    public void executarConsultaNotificacoes(int codUsuario) {
        System.out.println("Consulta de notificações. \n");

        Usuario usuario = GerenciadorBiblioteca.buscarUsuarioPorCodigo(codUsuario);

        if (usuario instanceof Professor) {
            Professor professor = (Professor) usuario;
            System.out.println("Professor " + professor.getNome() + " foi notificado "
                    + professor.getContadorNotificacoes() + " vezes.");
        } else {
            System.out.println("Falha ao consultar notificações. Usuário não é um professor.");
        }

    }
}
