


public interface IStatusEmprestimo {

    public void consultarData(Emprestimo emprestimo);

    public void finalizarEmprestimo(Usuario usuario,Emprestimo emprestimo);

    public String getNomeStatus();


}
