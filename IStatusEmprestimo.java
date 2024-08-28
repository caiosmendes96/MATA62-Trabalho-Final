


public interface IStatusEmprestimo {

    public void consultarData(Emprestimo emprestimo);

    public void finalizarEmprestimo(Usuario usuario,Emprestimo emprestimo);

    public boolean validarDevolucao();

    public boolean isEmCurso();

    public String getNomeStatus();


}
