
public abstract class Usuario {

    private String nome;
    private int codigo;
    private int tempoEmprestimo;
    private int qtdReservas;
    private int limiteEmprestimo;
    private boolean devedor;
    private IRegraUsuario regraUsuario;



    public Usuario(String nome, int codigo, IRegraUsuario regraUsuario) {
        this.nome = nome;
        this.codigo = codigo;
        this.qtdReservas = 0;
        this.regraUsuario = regraUsuario;
    }

    public IRegraUsuario getRegraUsuario() {
        return regraUsuario;
    }

    public void setRegraUsuario(IRegraUsuario regraUsuario) {
        this.regraUsuario = regraUsuario;
    }

    public abstract void definirTempoEmprestimo();

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

    public void incrementarQtdReserva() {
        this.qtdReservas++;
    }

    public int getQtdReservas() {
        return qtdReservas;
    }

    public void setQtdReservas(int qtdReservas) {

        this.qtdReservas = qtdReservas;
    }

    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(int limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public boolean isDevedor() {
        return devedor;
    }

    public void setDevedor(boolean devedor) {
        this.devedor = devedor;
    }

    public boolean podeEmprestar(Livro livro){
        return regraUsuario.validarEmprestimo(this, livro);
    }

    public void atualizarLimiteEmprestimos(){

        this.limiteEmprestimo -=1 ;

    }

}
