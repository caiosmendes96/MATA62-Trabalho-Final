public class Exemplar {

    private static int id = 0;
	private int codigo;
    private IStatusExemplar status;

    public Exemplar(){
        id++;
        this.codigo = id;
        this.status = new StatusDisponivelExemplar();
    }

    public int getCodigo() {
        return codigo;
    }

    public IStatusExemplar getStatus() {
        return status;
    }

    public void setStatus(IStatusExemplar status) {
        this.status = status;
    }


    // MÉTODOS RELACIONADOS AO PADRÃO STATE STATUS

    public boolean podeEmprestar() {
        return status.isDisponivel();
    }

    public void emprestar(){
        status.emprestar(this);
    }

    public void consultar(Emprestimo emprestimo){
        status.consultar(emprestimo);
    }

    public void devolver(){
        status.devolver(this);
    }

    public String getNomeStatusExemplar(){
        return status.getNomeStatus();
    }

}
