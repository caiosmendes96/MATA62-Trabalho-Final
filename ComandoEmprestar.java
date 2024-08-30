import java.util.ArrayList;

public class ComandoEmprestar implements IComando {

    public void executar(int codUsuario, int codLivro) {

        System.out.println("***---EMPRESTIMO---*** \n");

        boolean encontrouExemplar = false;
        Usuario usuario = GerenciadorBiblioteca.getGerenciadorUsuarios().buscarUsuarioPorCodigo(codUsuario);
        Livro livro = GerenciadorBiblioteca.getGerenciadorLivros().buscarLivroPorCodLivro(codLivro);
        Reserva reservaEncontrada = GerenciadorBiblioteca.getGerenciadorReservas()
                .buscarReservaPorCodLivroECodUsuario(usuario.getCodigo(), livro.getCodigo());
        ArrayList<Emprestimo> emprestimosEncontrados = GerenciadorBiblioteca.getGerenciadorEmprestimos()
                .buscarEmprestimosPorCodUsuarioECodLivro(usuario.getCodigo(), livro.getCodigo());

        GerenciadorBiblioteca.getGerenciadorEmprestimos().atualizarStatusDevedor(usuario); // Verifica e atualiza o status

        for (Exemplar exemplar : livro.getExemplares()) {

            if (exemplar.podeEmprestar()) { // boolean verifica se o exemplar atual está disponivel
                encontrouExemplar = true;
                if (usuario.podeEmprestar(livro, reservaEncontrada,emprestimosEncontrados)) { // boolean verifica se o usuario está apto a pegar um livro
                                                    // emprestado (passar nas regras)

                    GerenciadorBiblioteca.getGerenciadorEmprestimos().criarEmprestimo(codUsuario, codLivro,
                            usuario.getTempoEmprestimo(), exemplar.getCodigo());

                    System.out.println("Criou empréstimo com sucesso! \n");
                    System.out.println("Nome do usuário: " + usuario.getNome());
                    System.out.println("Titulo do livro: " + livro.getTitulo());
                    System.out.println("Código do exemplar: " + exemplar.getCodigo());
                    if (reservaEncontrada != null) { // Se tiver uma reserva para esse livro, finalizar a reserva.
                        reservaEncontrada.alterarStatus();
                        usuario.diminuirQtdReserva(); //atualizar qtd de reservas do usuario
                        System.out.println("Reserva ativa foi finalizada com sucesso! \n");
                        
                    }
                    
                    usuario.atualizarLimiteEmprestimos(); // altera quantidade de emprestimo do usuario
                    exemplar.emprestar(); // altera o status do exemplar para emprestado
                    break;
                }else{
                    break; //Se o usuario não passar nas regras, sair do loop para não verificar novamente se tiver outro exemplar
                }
            }
        }

        if (!encontrouExemplar)
            System.out.println("Não foi possível criar o empréstimo, pois não há exemplar disponível !");

    }
}
