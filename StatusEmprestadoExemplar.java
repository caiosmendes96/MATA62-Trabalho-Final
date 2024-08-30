
public class StatusEmprestadoExemplar implements IStatusExemplar {

    @Override
    public String getNomeStatus() {
        return "Emprestado";
    }

    @Override
    public boolean isDisponivel() {

        return false;
    }

    @Override
    public void emprestar(Exemplar exemplar) {

    }

    @Override
    public void consultar(Emprestimo emprestimo) {

        System.out.println("Dados do usuário que realizou o empréstimo: ");
        System.out.println("Nome usuário: " + GerenciadorBiblioteca.getGerenciadorUsuarios()
                .buscarUsuarioPorCodigo(emprestimo.getCodUsuario()).getNome());
        System.out.println("Data empréstimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Data prevista para devolução: " + emprestimo.getDataDevolucaoPrevista());
    }

    @Override
    public void devolver(Exemplar exemplar) {

        exemplar.setStatus(new StatusDisponivelExemplar());
    }

}
