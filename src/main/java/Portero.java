package futbol;

public class Portero extends Futbolista implements Comparable<Futbolista> {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre,int edad,short golesRecibidos,byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
	}
	public short getGolesRecibidos() {
	        return golesRecibidos;
	    }

	public void setGolesRecibidos(short golesRecibidos) {
	        this.golesRecibidos = golesRecibidos;
	    }

	 public byte getDorsal() {
	        return dorsal;
	    }
	 
	 public void setDorsal(byte dorsal) {
	        this.dorsal = dorsal;
	    }

	public int compareTo(Portero p) {
	    return Math.abs(this.getGolesRecibidos() -p.getGolesRecibidos());	 
	}
	 public String toString() {
			return ("El fubolista "+getNombre()+" tiene "+getEdad()+",y juega de "+getPosicion()+" con el dorsal"+getDorsal()+ ". Le han marcado "+getGolesRecibidos());
	 }
	@Override
	public boolean jugarConLasManos() {
		return true;
	}

}
