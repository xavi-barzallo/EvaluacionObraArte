package ec.ups.edu.eva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "TBL_Obra")
public class obra {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ob_codigo")
	private String codigo;
	
	@Column(name = "ob_nombre")
	private String nombreOb;
	
	@Column(name = "ob_altura")
	private double altura;
	
	@Column(name = "ob_descripcion")
	private String descripcion;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreOb() {
		return nombreOb;
	}

	public void setNombreOb(String nombreOb) {
		this.nombreOb = nombreOb;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "obra [codigo=" + codigo + ", nombreOb=" + nombreOb + ", altura=" + altura + ", descripcion="
				+ descripcion + "]";
	}
	
	
	
}
