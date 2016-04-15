public class Producto{
	int precio;
	int cantidad;
	String nombre;
	void setPrecio(int iprecio){
		precio=iprecio;
	}
	int getPrecio(){
		return precio;
	}
	void setNombre(String snombre){
		nombre=snombre;
	}
	String getNombre(){
		return nombre;
	}
	void setCantidad(int icantidad){

		cantidad=icantidad;
	}
	int getCantidad(){
		return cantidad;
	}

}