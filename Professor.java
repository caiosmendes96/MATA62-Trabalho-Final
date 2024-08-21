

public final class Professor extends Usuario {


    public Professor(String nome,int codigo){
        super(nome,codigo);
        this.definirTempoEmprestimo();
    }
    public void definirTempoEmprestimo(){
        super.setTempoEmprestimo(7);
    }
    
}
