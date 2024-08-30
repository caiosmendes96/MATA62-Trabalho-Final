

public class StatusFinalizadaReserva implements IStatusReserva {

    
    @Override
    public void alterarStatus(Reserva reserva){
            
    }
    @Override
    public boolean isAtiva(){

        return false;
    }
    @Override
    public String getNomeStatus(){
        return "Finalizada";
    }

}
