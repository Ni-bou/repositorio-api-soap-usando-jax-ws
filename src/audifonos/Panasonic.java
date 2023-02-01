package audifonos;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import Interfaces.IProducto;
import clases.Producto;

@WebService (serviceName="SoapNIS", endpointInterface = "audifonos.Panasonic")
	public class Panasonic implements IProducto {

	public double proceso(int opcion, int valor1, int valor2) {
		// TODO Auto-generated method stub
		double resultado = 0;
		switch(opcion) {
		case 1 :
			resultado = valor1 + valor2;
			break;
		case 2 :
			resultado = valor1 - valor2;
			break;
		case 3 :
			resultado = valor1 * valor2;
			break;
		case 4 :
			resultado = valor1 / valor2;
			break;
		default:
			break;
		}
		
		return resultado;
	}

	@Override
	public String obtenerModelo(int idProducto) {
		// TODO Auto-generated method stub
		// 1 RECIBE EL ID
		// 2 SE CONECTA A LA BBDD Y LE MANDA EL ID
		// 3 LA BBDD ME RESPONDE CON EL PRODUCTO
		// 4 OBTENGO EL MODELO DEL PANASONIC QUE BUSCO
		return "WC100";
	}

	@Override
	public void guardarProducto(String nombre, int idProducto, double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProducto(int idProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editarProducto(int idProducto, String nombre, double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto obtenerProducto(int idProducto) {
		// TODO Auto-generated method stub
		Producto p = new Producto();
		p.setIdProducto(1);
		p.setNombre("Radio");
		p.setValor(300);
		return p;
	}

}
