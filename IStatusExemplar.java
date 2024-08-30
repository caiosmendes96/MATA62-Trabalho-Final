


public interface IStatusExemplar {


    public boolean isDisponivel();

    public void emprestar(Exemplar exemplar);

    public void consultar(Emprestimo emprestimo);

    public void devolver(Exemplar exemplar);

    public String getNomeStatus();




}
