package pe.edu.upeu.clase01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.clase01.entity.Producto;
import pe.edu.upeu.clase01.service.ProductoService;

@RestController
public class ProductoController {
  
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/producto")
	public List<Producto> getList(){
		return productoService.readAll();
	}
}
