package pe.edu.upeu.clase01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.daoImpl.ProductoDaoImpl;
import pe.edu.upeu.clase01.entity.Producto;


@Service
public class ProductoService implements Todo<Producto> {
	
	@Autowired
	private ProductoDaoImpl daoImpl;
	@Override
	public int create(Producto t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
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
		return daoImpl.readAll();
	}

}
