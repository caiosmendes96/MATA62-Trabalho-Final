

public class ComandoEmprestar implements IComandoEmprestimo {

    public void executar(int codUsuario, int codLivro){
            // O sistema deve permitir o empréstimo de livros. Durante o empréstimo, o usuário informará o
            //comando “emp” seguido do código do usuário e do código do livro, separados por espaço em
            //branco. Ex.: “emp 123 100”. Caso o usuário tenha uma reserva feita previamente por ele para
            //o dado livro, a reserva deve ser excluída e o empréstimo efetivado. Ao final do procedimento
            //o sistema deve emitir uma mensagem de sucesso ou insucesso, que mencione o nome do
            //usuário e o título do livro. Se for uma mensagem de insucesso, ela deve também mencionar o
            //motivo do insucesso.
        System.out.println("EMPRESTIMO \n");
        Reserva reservaEncontrada = GerenciadorBiblioteca.buscarReservaPorCodLivroECodUsuario(codUsuario,codLivro);
        if(reservaEncontrada != null){

            Usuario usuario = GerenciadorBiblioteca.buscarUsuarioPorCodigo(codUsuario);
            Livro livro = GerenciadorBiblioteca.buscarLivroPorCodLivro(codLivro);

            for(Exemplar exemplar : livro.getExamplares()){
                if(exemplar.getStatus() == "disponivel"){
                    GerenciadorBiblioteca.criarEmprestimo(codUsuario,codLivro,usuario.getTempoEmprestimo(), livro.getExamplares().get(0).getCodigo());

                    exemplar.mudarStatus();

                    GerenciadorBiblioteca.removerReserva(reservaEncontrada);
                    System.out.println("Criou empréstimo com sucesso! \n");
                    System.out.println("Nome do usuário: " + usuario.getNome());
                    System.out.println("Titulo do livro: " + livro.getTitulo());
                    System.out.println("Código do exemplar: " + exemplar.getCodigo());
                    break;
                }
            }
            //System.out.println("Não tem exemplares disponíveis para empréstimo !");

        }else{
            System.out.println("Não tem reserva !");
        }
        
    }

}
