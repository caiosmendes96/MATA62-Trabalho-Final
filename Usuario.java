



public abstract class Usuario {

    private String nome;
    private int codigo;
    private int tempoEmprestimo;

    public Usuario(String nome,int codigo){
        this.nome = nome;
        this.codigo = codigo;
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

}
