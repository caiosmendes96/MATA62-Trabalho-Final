public class Exemplar {

    private static int id = 0;
	private int codigo;
    private boolean status;

    public Exemplar(){
        id++;
        this.codigo = id;
        this.status = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
