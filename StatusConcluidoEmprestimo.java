


public class StatusConcluidoEmprestimo implements IStatusEmprestimo {

    private String nomeStatus = "Concluido";

    public String getNomeStatus() {
        return nomeStatus;
    }

    @Override
    public void consultarData(Emprestimo emprestimo) {

        System.err.println("Data realizada da devolução: " + emprestimo.getDataDevolucaoRealizada());
    }

    @Override
    public boolean validarDevolucao(){
        return false;
    }

    @Override 
    public boolean isEmCurso(){
        return false;
    }


    @Override
    public void finalizarEmprestimo(Usuario usuario,Emprestimo emprestimo){

        System.out.println("Emprestimo já foi finalizado! \n");

    }
}

