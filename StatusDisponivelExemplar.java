



public class StatusDisponivelExemplar implements IStatusExemplar {

    private String nomeStatus = "Disponível";

    public String getNomeStatus() {
        return nomeStatus;
    }

    public void setNomeStatus(String nomeStatus) {
        this.nomeStatus = nomeStatus;
    }

    @Override
    public boolean validarEmprestimo() {
        return true;
    }
    
    @Override
    public void emprestar(Exemplar exemplar){
        exemplar.setStatus(new StatusEmprestadoExemplar());
    }

    @Override
    public void consultar(Emprestimo emprestimo){

    }



}
