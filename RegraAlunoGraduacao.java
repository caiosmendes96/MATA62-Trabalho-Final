


public class RegraAlunoGraduacao implements IRegraUsuario {

    @Override
    public boolean validarEmprestimo(Usuario usuario, Livro livro){

        Reserva reservaEncontrada = GerenciadorBiblioteca.buscarReservaPorCodLivroECodUsuario(usuario.getCodigo(),livro.getCodigo());
        Emprestimo emprestimoEncontrado = GerenciadorBiblioteca.buscarEmprestimoPorCodUsuarioECodLivro(usuario.getCodigo(), livro.getCodigo());

        if (usuario.isDevedor()) {
            System.out.println("Não foi possível criar o empréstimo, pois o usuario é devedor! \n");
            return false;
        }
        
        if (usuario.getLimiteEmprestimo() <= 0) {
            System.out.println("Não foi possível criar o empréstimo, pois o usuário já alcançou o limite de emprestimos. \n");
            return false;
        }

        if (reservaEncontrada == null && livro.buscarQuantidadeDeExemplaresDisponiveis() < GerenciadorBiblioteca.buscarQuantidadeDeReservasPorLivro(livro.getCodigo())){
            System.out.println("Não foi possível criar o empréstimo, todos os exemplares estão reservados e você não tem reserva para esse livro! \n");
            return false;
        }
        if(emprestimoEncontrado != null){

            if(emprestimoEncontrado.getStatus() instanceof StatusEmCursoEmprestimo ){
                System.out.println("Não foi possível criar o empréstimo, pois já existe um emprestimo desse livro em curso! \n");
                return false;
            }
        }


        return true;
    }



    

}
