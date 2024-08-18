import java.time.LocalDate;

public class Reserva {

    private int codLivro;
    private int codUsuario;
    private LocalDate dataSolicitacao;

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Reserva(int codUsuario, int codLivro){

        LocalDate date = LocalDate.now();
        
        this.codLivro = codLivro;
        this.codUsuario = codUsuario;
        this.dataSolicitacao = date;
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
