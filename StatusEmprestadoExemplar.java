
public class StatusEmprestadoExemplar implements IStatusExemplar {

    private String nomeStatus = "Emprestado";

    public String getNomeStatus() {
        return nomeStatus;
    }

    @Override
    public boolean validarEmprestimo() {

        return false;
    }

    @Override
    public void emprestar(Exemplar exemplar) {

    }

    @Override
    public void consultar(Emprestimo emprestimo) {

        System.out.println("--EXEMPLAR EMPRESTADO: ");
        System.out.println("Nome usuário: " + GerenciadorBiblioteca.getGerenciadorUsuarios()
                .buscarUsuarioPorCodigo(emprestimo.getCodUsuario()).getNome());
        System.out.println("Data empréstimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Data prevista para devolução: " + emprestimo.getDataDevolucaoPrevista());
    }

}
