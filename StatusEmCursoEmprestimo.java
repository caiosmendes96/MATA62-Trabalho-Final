import java.time.LocalDate;

public class StatusEmCursoEmprestimo implements IStatusEmprestimo {

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
    @Override
    public boolean validarDevolucao(){
        return true;
    }
    @Override 
    public boolean isEmCurso(){
        return true;
    }
    @Override
    public String getNomeStatus() {
        return "Em curso";
    }

}
