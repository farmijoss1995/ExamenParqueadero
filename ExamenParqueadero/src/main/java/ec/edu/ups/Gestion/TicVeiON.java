package ec.edu.ups.Gestion;

import javax.ejb.Stateless;

import ec.edu.ups.Dao.TiccketDAO;
import ec.edu.ups.Dao.VehiculoDAO;
import ec.edu.ups.EN.ENTicket;
import ec.edu.ups.EN.ENVehiculo;

@Stateless
public class TicVeiON implements GestionPaqueaderaRemoto, GestionParqueaderoLocal {

	@Override
	public boolean guardarTicket(ENTicket t) {
		TiccketDAO tic = new TiccketDAO();
		VehiculoDAO veh = new VehiculoDAO();
		ENVehiculo enVe = new ENVehiculo();
		
		t.setVehiculoveID(enVe);
		tic.insertTicket(t);
		return true;
	}

	@Override
	public Boolean guardarVehiculo(ENVehiculo v) {
		VehiculoDAO veh = new VehiculoDAO();
		veh.insertVehiculo(v);

		return true;
	}

	

	public int calcularTiempo(String a, String b) {
		ENTicket e = new ENTicket();
		int hora1;
		int hora2;
		int r;
//            hora1 = Integer.parseInt(a.substring(0, 2));
//            hora2 = Integer.parseInt(b.substring(0, 2));
		String[] tiepo = a.split(":");
		String[] tiepo2 = b.split(":");
		hora1 = Integer.parseInt(tiepo[0]);
		hora2 = Integer.parseInt(tiepo2[0]);
		r = (hora2 - hora1);
		if (r == 0) {
			r = 1;
			return r;
		} else {
			return r;
		}

	}

	public double valorPagar(int hora) {
		double pagar = ((0.75 * hora) / 1);
		return pagar;
	}

	

}
