package Interfaces;

import clases.Producto;

public interface IProducto {

	public String obtenerModelo(int idProducto);
	public void guardarProducto(String nombre, int idProducto, double valor);
	public void eliminarProducto(int idProducto);
	public void editarProducto(int idProducto, String nombre, double valor);
	public Producto obtenerProducto(int idProducto);
}
