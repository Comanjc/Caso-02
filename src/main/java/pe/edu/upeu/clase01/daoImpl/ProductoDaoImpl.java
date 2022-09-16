package pe.edu.upeu.clase01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.entity.Producto;

@Component
public class ProductoDaoImpl implements Todo<Producto> {
   
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Producto t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Producto t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from producto", new BeanPropertyRowMapper<Producto>(Producto.class));
	}
}
