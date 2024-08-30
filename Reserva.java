import java.time.LocalDate;

public class Reserva {

    private int codLivro;
    private int codUsuario;
    private LocalDate dataSolicitacao;
    private IStatusReserva status;



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
        this.status = new StatusAtivaReserva();
    }

    public IStatusReserva getStatus() {
        return status;
    }

    public void setStatus(IStatusReserva status) {
        this.status = status;
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

    // MÉTODOS RELACIONADOS AO PADRÃO STATE STATUS
    
    public void alterarStatus(){
        status.alterarStatus(this);
    }
    public String getNomeStatus(){
        return this.status.getNomeStatus();
    }
    public boolean isAtiva(){
        return this.status.isAtiva();
    }

}
