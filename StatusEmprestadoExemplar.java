



public class StatusEmprestadoExemplar implements IStatusExemplar {

    private String nomeStatus = "Emprestado";

    public String getNomeStatus() {
        return nomeStatus;
    }

    public void setNomeStatus(String nomeStatus) {
        this.nomeStatus = nomeStatus;
    }

    public boolean emprestar(Exemplar exemplar){

        System.out.println("Esse exemplar já está emprestado ! \n");
        return false;
    }

    public void consultar(Emprestimo emprestimo){

        System.out.println("--EXEMPLAR EMPRESTADO: " );
        System.out.println("Nome usuário: " + GerenciadorBiblioteca.buscarUsuarioPorCodigo(emprestimo.getCodUsuario()).getNome());
        System.out.println("Data empréstimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Data prevista para devolução: " + emprestimo.getDataDevolucaoPrevista());
    }

}
