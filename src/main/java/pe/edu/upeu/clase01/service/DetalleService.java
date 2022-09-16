package pe.edu.upeu.clase01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.daoImpl.DetalleDaoImpl;
import pe.edu.upeu.clase01.entity.Detalle;

@Service
public class DetalleService implements Todo<Detalle> {
	
	@Autowired
	private DetalleDaoImpl daoImpl;
	@Override
	public int create(Detalle t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Detalle t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Detalle read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Detalle> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}

}
