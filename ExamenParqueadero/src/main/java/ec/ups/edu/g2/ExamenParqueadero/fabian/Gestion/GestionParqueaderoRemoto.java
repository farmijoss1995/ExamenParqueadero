package ec.ups.edu.g2.ExamenParqueadero.fabian.Gestion;

import ec.ups.edu.g2.ExamenParqueadero.fabian.EN.ENVehiculo;
import ec.ups.edu.g2.ExamenParqueadero.fabian.EN.ENticket;


public interface GestionParqueaderoRemoto {
	
	
	public boolean guardarTicket(ENticket t);
	public boolean guardarVehiculo(ENVehiculo v);
	public boolean actualizarTicket(ENticket t);
	public ENticket buscarTick(ENticket t);
	public ENVehiculo obtenerUnVehiculo(ENVehiculo enveh);
	public double valorPagar(int hora);
	public int obtenerCodigo();
	public int calcularTiempo(String a, String b);
	public Object[][] listarTicket();
	public Object[][] listarVehiculo(String placa);
	public boolean placaRepetida(String placa);
	
}