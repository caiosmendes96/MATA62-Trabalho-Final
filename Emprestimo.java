import java.time.LocalDate;


public class Emprestimo {

    private LocalDate dataEmprestimo;
    private int codLivro;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoRealizada; 
    private int codUsuario;
    private int codExemplar;
    private String status; 

    public LocalDate getDataDevolucaoRealizada() {
        return dataDevolucaoRealizada;
    }

    public void setDataDevolucaoRealizada(LocalDate dataDevolucaoRealizada) {
        this.dataDevolucaoRealizada = dataDevolucaoRealizada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public int getCodExemplar() {
        return codExemplar;
    }

    public void setCodExemplar(int codExemplar) {
        this.codExemplar = codExemplar;
    }

    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    public Emprestimo(int codUsuario, int codLivro, int tempoEmprestimoUsuario, int codExemplar){
        LocalDate date = LocalDate.now();

        this.codUsuario = codUsuario;
        this.codLivro = codLivro;
        this.dataEmprestimo = date;
        this.dataDevolucaoPrevista = this.dataEmprestimo.plusDays(tempoEmprestimoUsuario);
        this.codExemplar = codExemplar;
        this.status = "em curso";
        this.dataDevolucaoRealizada = null;

    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDate dataDevolucaoPrevista) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }



    

}
