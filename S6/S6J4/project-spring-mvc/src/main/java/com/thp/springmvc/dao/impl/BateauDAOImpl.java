package com.thp.springmvc.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.thp.springmvc.RowMapper.BateauRowMapper;
import com.thp.springmvc.dao.BateauDAO;
import com.thp.springmvc.entity.Bateau;

//@Transactional(propagation = Propagation.REQUIRES_NEW)
public class BateauDAOImpl implements BateauDAO{
	private JdbcTemplate template ;

	
 
	  public JdbcTemplate getTemplate() {
		return template;
	}

	private final String SQL_CREATE_BATEAU = "INSERT INTO moussaillonJDBC.bateau (id, name, type, size) VALUES (?,?,?,?)";
	private final String SQL_FIND_BATEAU_BY_ID = "SELECT * FROM moussaillonJDBC.bateau WHERE ID=? ";
	private final String SQL_FIND_ALL_BATEAU = "SELECT * FROM moussaillonJDBC.bateau";
	 
	 
	  public int create(int id, String name, String type, double size) {
		    return template.update(SQL_CREATE_BATEAU, id, name, type, size);
		}



	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	public Bateau findById(int id) {
	    return template.queryForObject(SQL_FIND_BATEAU_BY_ID, new Object[]{id}, new BateauRowMapper());
	}

	public List<Bateau> findAll() {
		
		 return (List<Bateau>) template.query(SQL_FIND_ALL_BATEAU,new BateauRowMapper());
	}

}
