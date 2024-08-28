public final class AlunoGraduacao extends Usuario {

    public AlunoGraduacao(String nome, int codigo) {
        super(nome, codigo, new RegraAlunoGraduacao());
        this.definirTempoEmprestimo();
        definirLimiteEmprestimo();
    }

    public void definirTempoEmprestimo() {
        super.setTempoEmprestimo(3);
    }

    public void definirLimiteEmprestimo() {
        super.setLimiteEmprestimo(3);
    }
}
