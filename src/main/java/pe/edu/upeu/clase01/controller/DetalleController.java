package pe.edu.upeu.clase01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.clase01.entity.Detalle;
import pe.edu.upeu.clase01.service.DetalleService;

@RestController
public class DetalleController {
	
	@Autowired
	private DetalleService detalleService;
	
	@GetMapping("/detalle")
	public List<Detalle> getList(){
		return detalleService.readAll();
	}

}
