


public class StatusConcluidoEmprestimo implements IStatusEmprestimo {

    private String nomeStatus = "Concluido";

    public String getNomeStatus() {
        return nomeStatus;
    }

    public void setNomeStatus(String nomeStatus) {
        this.nomeStatus = nomeStatus;
    }

    @Override
    public void consultarData(Emprestimo emprestimo) {

        System.err.println("Data realizada da devolução: " + emprestimo.getDataDevolucaoRealizada());
    }

    @Override
    public void finalizarEmprestimo(Usuario usuario,Emprestimo emprestimo){

        System.out.println("Emprestimo já foi finalizado! \n");

    }
}

