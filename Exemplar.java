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

    public boolean emprestar() {
        return status.emprestar(this);
    }

    public void consultar(Emprestimo emprestimo){
        
        status.consultar(emprestimo);
    }

    public String getNomeStatusExemplar(){
        return status.getNomeStatus();
    }

}
