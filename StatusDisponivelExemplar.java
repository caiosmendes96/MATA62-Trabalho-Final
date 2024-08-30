



public class StatusDisponivelExemplar implements IStatusExemplar {
    
    @Override
    public String getNomeStatus() {
        return "Disponível";
    }

    @Override
    public boolean isDisponivel() {
        return true;
    }
    
    @Override
    public void emprestar(Exemplar exemplar){
        exemplar.setStatus(new StatusEmprestadoExemplar());
    }

    @Override
    public void consultar(Emprestimo emprestimo){

    }

    @Override 
    public void devolver(Exemplar exemplar){
        
    }



}
