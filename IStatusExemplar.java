


public interface IStatusExemplar {


    public boolean validarEmprestimo();

    public void emprestar(Exemplar exemplar);

    public void consultar(Emprestimo emprestimo);
    
    public String getNomeStatus();




}
