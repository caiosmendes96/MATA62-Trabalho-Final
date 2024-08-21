



public abstract class Usuario {

    private String nome;
    private int codigo;
    private int tempoEmprestimo;
    private int qtdReservas;

    public Usuario(String nome,int codigo){
        this.nome = nome;
        this.codigo = codigo;
        this.qtdReservas = 0;
    }

    public abstract void definirTempoEmprestimo(); //metodo abstrato

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTempoEmprestimo() {
        return tempoEmprestimo;
    }

    public void setTempoEmprestimo(int tempoEmprestimo) {
        this.tempoEmprestimo = tempoEmprestimo;
    }

    public void incrementarQtdReserva(){
        this.qtdReservas++;
    }

    public int getQtdReservas() {
        return qtdReservas;
    }

    public void setQtdReservas(int qtdReservas) {

        this.qtdReservas = qtdReservas;
    }

}
