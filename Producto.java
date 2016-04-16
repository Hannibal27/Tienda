//Alumnos:
//Medina Mena Anibal
//Ortega Merida Juan Alberto
public class Producto{
	private int precio;
	int cantidad;
	private String nombre;
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