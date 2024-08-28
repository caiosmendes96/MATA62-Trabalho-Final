


public class RegraProfessor implements IRegraUsuario {

    @Override
    public boolean validarEmprestimo(Usuario usuario,Livro livro){

        if (usuario.isDevedor()) {
            System.out.println("Não foi possível criar o empréstimo, pois o usuario é devedor!");
            return false;
        }
        return true;
    }

}
