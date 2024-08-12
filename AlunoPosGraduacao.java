


public final class AlunoPosGraduacao extends Usuario {

    public AlunoPosGraduacao(String nome,int codigo){
        super(nome,codigo);
        this.definirTempoEmprestimo();
    }
    public void definirTempoEmprestimo(){
        super.setTempoEmprestimo(5);
    }
}
