


public class ComandoEmprestar implements IComandoEmprestimo {

    public void executar(int codUsuario, int codLivro){

        GerenciadorBiblioteca.criarEmprestimo(codUsuario,codLivro);
        System.out.println("Criou empréstimo \n");
        System.out.println(codUsuario);
        System.out.println(codLivro);
    }

}
