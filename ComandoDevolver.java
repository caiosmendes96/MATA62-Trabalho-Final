import java.util.ArrayList;

public class ComandoDevolver implements IComandoEmprestimo {


    public void executar(int codUsuario, int codLivro){
        // O sistema deve permitir a devolução de um dado livro. Durante a devolução, o usuário deve
        //digitar o comando “dev” seguido do código de identificação do usuário e do código de
        //identificação do livro emprestado. Ao final, o sistema deve emitir uma mensagem de sucesso
        //ou insucesso da devolução, que mencione o nome do usuário e o título do livro. A mensagem
        //de insucesso deve dizer o motivo. Nesse caso, o insucesso só ocorre se não houver
        //empréstimo em aberto daquele livro para aquele usuário.


        ArrayList<Emprestimo> emprestimosEncontrados = GerenciadorBiblioteca.buscarEmprestimosPorCodUsuario(codUsuario);
        boolean encontrouEmprestimo = false;

        for(Emprestimo emprestimo: emprestimosEncontrados){

            if(emprestimo.getCodLivro() == codLivro){
                if(emprestimo.getStatus() == "em curso"){

                    emprestimo.setStatus("finalizado");
                    encontrouEmprestimo = true;
                    break;
                }
            }
        }
        System.out.println(encontrouEmprestimo ? "Devolução realizada com sucesso!"  : "Não foi possivel realizar a devolução! Não existe empréstimo em curso para esse usuário!");




    }

}
