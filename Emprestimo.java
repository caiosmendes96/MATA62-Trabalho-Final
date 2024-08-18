import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {

    private LocalDate dataEmprestimo;
    private int codLivro;
    private LocalDate dataDevolucao;
    private int codUsuario;
    private int codExemplar;

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
        this.dataDevolucao = this.dataEmprestimo.plusDays(tempoEmprestimoUsuario);
        this.codExemplar = codExemplar;
 

        //System.out.println("Tempo para emprestimo dias " + usuario.getTempoEmprestimo()); 
        System.out.println("Data Emprestimo: " + this.dataEmprestimo); 
        System.out.println("Data devolução: " + this.dataDevolucao); 

    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }



    

}
