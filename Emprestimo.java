import java.sql.Date;

public class Emprestimo {

    private Date dataEmprestimo;
    private int codLivro;
    private Date dataDevolucao;
    private int codUsuario;

    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    public Emprestimo(int codUsuario, int codLivro){
        this.codUsuario = codUsuario;
        this.codLivro = codLivro;
        //this.dataEmprestimo = 
        //this.dataDevolução = dataEmprestimo + usuario.getTempoEmprestimo();
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }



    

}
