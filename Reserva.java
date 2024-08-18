


public class Reserva {

    private int codLivro;
    private int codUsuario;

    public Reserva(int codLivro, int codUsuario){
        this.codLivro = codLivro;
        this.codUsuario = codUsuario;
    }
    
    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

   

}
