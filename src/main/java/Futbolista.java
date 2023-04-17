package futbol;


public abstract class Futbolista implements Comparable<Futbolista> {
	private String nombre;
	private int edad;
	private final String posicion ;
	
	public Futbolista(String nombre,int edad,String posicion) {
		this.nombre=nombre;
		this.edad=edad;
		this.posicion=posicion;
	}
	public Futbolista() {
		this("Maradona",30,"delantero");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public String toString() {
		return ("El fubolista "+getNombre()+" tiene "+getEdad()+",y juega de "+getPosicion());
	}
    public boolean equals(Futbolista f) {
        if (f == null) {
            return false;
        }
        return this.nombre.equals(f.nombre) && this.edad == f.edad && this.posicion.equals(f.posicion);
    }
    @Override
    public int compareTo(Futbolista f) {
    	return this.nombre.compareTo(f.nombre);
    }
    public abstract boolean jugarConLasManos();

}
