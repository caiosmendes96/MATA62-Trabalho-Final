
public final class AlunoPosGraduacao extends Usuario {

    public AlunoPosGraduacao(String nome, int codigo) {
        super(nome, codigo, new RegraAlunoGraduacao());
        this.definirTempoEmprestimo();
        definirLimiteEmprestimo();
    }

    public void definirTempoEmprestimo() {
        super.setTempoEmprestimo(5);
    }

    public void definirLimiteEmprestimo() {
        super.setLimiteEmprestimo(4);
    }
}
