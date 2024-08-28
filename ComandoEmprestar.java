import java.util.ArrayList;

public class ComandoEmprestar implements IComando {

    public void executar(int codUsuario, int codLivro) {

        System.out.println("EMPRESTIMO \n");
        Reserva reservaEncontrada = GerenciadorBiblioteca.buscarReservaPorCodLivroECodUsuario(codUsuario, codLivro);
        boolean encontrouExemplar = false;
        Usuario usuario = GerenciadorBiblioteca.buscarUsuarioPorCodigo(codUsuario);
        Livro livro = GerenciadorBiblioteca.buscarLivroPorCodLivro(codLivro);

        GerenciadorBiblioteca.atualizarStatusDevedor(usuario);


                    for (Exemplar exemplar : livro.getExamplares()) {

                        if(exemplar.podeEmprestar()){
                            encontrouExemplar = true;
                            if(usuario.podeEmprestar(livro)){

                                GerenciadorBiblioteca.criarEmprestimo(codUsuario, codLivro, usuario.getTempoEmprestimo(),livro.getExamplares().get(0).getCodigo());
                                
                                System.out.println("Criou empréstimo com sucesso! \n");
                                System.out.println("Nome do usuário: " + usuario.getNome());
                                System.out.println("Titulo do livro: " + livro.getTitulo());
                                System.out.println("Código do exemplar: " + exemplar.getCodigo());
                                if(reservaEncontrada != null){ //Se tiver uma reserva para esse livro, remover a reserva.
                                    GerenciadorBiblioteca.removerReserva(reservaEncontrada);
                                }
                                usuario.atualizarLimiteEmprestimos();
                                exemplar.emprestar();
                                break;
                            }
                        }
                    }
                    
                    if (!encontrouExemplar) System.out.println("Não foi possível criar o empréstimo, pois não há exemplar disponível !");
                          
    }
}
