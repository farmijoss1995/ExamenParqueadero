package ec.edu.ups.Dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import ec.edu.ups.EN.ENTicket;
import ec.edu.ups.EN.ENVehiculo;


@Stateless
	public class VehiculoDAO {

	@PersistenceContext
		private EntityManager em;
		
		public void insertVehiculo(ENVehiculo veh) {
			em.persist(veh);
		}

		public void update(ENVehiculo veh) throws Exception {
			em.merge(veh);
		}
		
		public List<ENTicket> getVehiculo(){
			String jpql = "SELECT vh FROM ENVehiculo vh";
			Query query = em.createQuery(jpql,ENTicket.class);
			List<ENTicket> listado =  query.getResultList();	
			return listado;
		}

		

}
