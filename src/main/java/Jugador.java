package futbol;

public class Jugador extends Futbolista implements Comparable<Futbolista> {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre,int edad,String posicion,short golesMarcados,byte dorsal) {
		super(nombre,edad,posicion);
		this.golesMarcados=golesMarcados;
		this.dorsal=dorsal;
	}
	public Jugador() {
		super();
		this.golesMarcados=289;
		this.dorsal=7;
	}
	public short getGolesMarcados() {
	        return golesMarcados;
	    }

	public void setGolesMarcados(short golesMarcados) {
	        this.golesMarcados = golesMarcados;
	    }

	 public byte getDorsal() {
	        return dorsal;
	    }
	 
	 public void setDorsal(byte dorsal) {
	        this.dorsal = dorsal;
	    }
	 public String toString() {
			return ("El fubolista "+getNombre()+" tiene "+getEdad()+",y juega de "+getPosicion()+" con el dorsal"+getDorsal()+ ". Ha marcado "+getGolesMarcados());
		} 
    @Override
    public int compareTo(Futbolista otroJugador) {
        int diferenciaEdad = Math.abs(getEdad() - otroJugador.getEdad());
        return diferenciaEdad;
    }
	@Override
	public boolean jugarConLasManos() {
		return false;
	}

}
