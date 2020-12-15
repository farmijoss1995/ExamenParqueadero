package ec.edu.ups.Vista;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.EN.ENTicket;
import ec.edu.ups.EN.ENVehiculo;
import ec.edu.ups.Gestion.GestionParqueaderoLocal;

@ManagedBean
public class Ticketview {
	@Inject
	private GestionParqueaderoLocal gestionLocal;
	
	ENVehiculo v = new ENVehiculo();
	ENTicket t= new ENTicket();
	
}
