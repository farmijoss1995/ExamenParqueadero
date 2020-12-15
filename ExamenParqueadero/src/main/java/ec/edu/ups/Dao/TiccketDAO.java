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
public class TiccketDAO {

    @PersistenceContext 
	private EntityManager em;
	
	public void insertTicket(ENTicket tic) {
		em.persist(tic);
	}

	public void update(ENTicket tic) throws Exception {
		em.merge(tic);
	}
	
	public List<ENTicket> getCuentaAhorros(){
		String jpql = "SELECT tc FROM ENTicket tc";
		Query query = em.createQuery(jpql,ENTicket.class);
		List<ENTicket> listado =  query.getResultList();	
		return listado;
	}

	
}