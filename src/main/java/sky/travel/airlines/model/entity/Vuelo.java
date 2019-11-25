package sky.travel.airlines.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vuelos")
public class Vuelo {

	@Id
	@Column(name = "vuelo_id", length = 10)
	private String id;
	
	@Column(name = "fec_ida")
	@Temporal(TemporalType.DATE)
	private Date fechaIda;
	
	@Column(name = "fec_vuelta")
	@Temporal(TemporalType.DATE)
	private Date fechaVuelta;
	
	@Column(name = "nombre", length = 30)
	private String nombre;
	
	@OneToMany(mappedBy = "vuelo", fetch = FetchType.LAZY)
	private List<Pasajero> pasajeros;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "origen_id")
	private Origen origen;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "destino_id")
	private Destino destino;
	
//////
	public Vuelo() {
		this.pasajeros = new ArrayList<>();
	}
	
	public void addPasajero(Pasajero pasajero) {
		pasajero.setVuelo(this);
		this.pasajeros.add(pasajero);
	}
	//////

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFechaIda() {
		return fechaIda;
	}

	public void setFechaIda(Date fechaIda) {
		this.fechaIda = fechaIda;
	}

	public Date getFechaVuelta() {
		return fechaVuelta;
	}

	public void setFechaVuelta(Date fechaVuelta) {
		this.fechaVuelta = fechaVuelta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	
	
}
