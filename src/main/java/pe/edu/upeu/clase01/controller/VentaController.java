package pe.edu.upeu.clase01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.clase01.entity.Venta;
import pe.edu.upeu.clase01.service.VentaService;

@RestController

public class VentaController {
	
	@Autowired
	private VentaService ventaService;
	
	@GetMapping("/venta")
	public List<Venta> getList(){
		return ventaService.readAll();
	}

}
