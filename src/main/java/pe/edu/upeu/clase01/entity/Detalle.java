package pe.edu.upeu.clase01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detalle {
	
   private static final long serialVersionUID = 1L; 
   
   private int iddetalle;
   private int cantidad;
   private int precio;
   private int idventa;
   private int idproducto;
public int getIddetalle() {
	return iddetalle;
}
public void setIddetalle(int iddetalle) {
	this.iddetalle = iddetalle;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public int getIdventa() {
	return idventa;
}
public void setIdventa(int idventa) {
	this.idventa = idventa;
}
public int getIdproducto() {
	return idproducto;
}
public void setIdproducto(int idproducto) {
	this.idproducto = idproducto;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}

}
