package pe.edu.upeu.clase01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.daoImpl.VentaDaoImpl;
import pe.edu.upeu.clase01.entity.Venta;

@Service

public class VentaService  implements Todo<Venta>{
	
	@Autowired
	private VentaDaoImpl daoImpl;
	@Override
	public int create(Venta t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Venta t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Venta read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Venta> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}
}
