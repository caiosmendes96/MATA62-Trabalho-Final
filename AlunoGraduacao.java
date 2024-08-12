public final class AlunoGraduacao extends Usuario {

    public AlunoGraduacao(String nome,int codigo){
        super(nome,codigo);
        this.definirTempoEmprestimo();
    }
    public void definirTempoEmprestimo(){
        super.setTempoEmprestimo(3);
    }
}
