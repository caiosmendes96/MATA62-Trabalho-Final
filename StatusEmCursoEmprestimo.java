import java.time.LocalDate;

public class StatusEmCursoEmprestimo implements IStatusEmprestimo {

    private String nomeStatus = "Em curso";

    @Override
    public void consultarData(Emprestimo emprestimo) {

        System.out.println("Data prevista para devolução: " + emprestimo.getDataDevolucaoPrevista());
    }

    @Override
    public void finalizarEmprestimo(Usuario usuario,Emprestimo emprestimo){

        usuario.setLimiteEmprestimo(usuario.getLimiteEmprestimo() + 1);
        emprestimo.setDataDevolucaoRealizada(LocalDate.now());
        emprestimo.setStatus(new StatusConcluidoEmprestimo());

    }

    public String getNomeStatus() {
        return nomeStatus;
    }

    public void setNomeStatus(String nomeStatus) {
        this.nomeStatus = nomeStatus;
    }
}
