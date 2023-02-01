package clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Producto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Producto {
	
	@XmlElement(name = "NumeroDeSerie") 
	public int idProducto;
	
	@XmlElement(name = "NombreDelProducto") 
	public String nombre;
	
	@XmlElement(name = "ValorDelProducto") 
	public double valor;
	
	public Producto(){
		
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
