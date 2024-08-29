


public class StatusAtivaReserva implements IStatusReserva {

    @Override
    public void alterarStatus(Reserva reserva){


        reserva.setStatus(new StatusFinalizadaReserva());
            
    }

    @Override
    public boolean isAtiva(){

        return true;
    }

    @Override
    public String getNomeStatus(){
        return "Ativa";
    }

}
