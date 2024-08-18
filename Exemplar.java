public class Exemplar {

    private static int id = 0;
	private int codigo;
    private String status;

    public Exemplar(){
        id++;
        this.codigo = id;
        this.status = "disponivel";
    }

    public int getCodigo() {
        return codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void mudarStatus(){
        if(this.status == "disponivel"){
            this.status = "emprestado";
        }else{
            this.status = "disponivel";
        }
    }

}
