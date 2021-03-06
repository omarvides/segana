package segana;
// Generated Mar 13, 2012 4:29:28 PM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Apuesta generated by hbm2java
 */
@Entity
@Table(name="apuesta"
    ,catalog="gana"
)
public class Apuesta  implements java.io.Serializable {


     private int idapuesta;
     private Usuario usuario;
     private Encuentro encuentro;
     private BigDecimal monto;
     private Set<Pronostico> pronosticos = new HashSet<Pronostico>(0);

    public Apuesta() {
    }

	
    public Apuesta(int idapuesta, Usuario usuario, Encuentro encuentro) {
        this.idapuesta = idapuesta;
        this.usuario = usuario;
        this.encuentro = encuentro;
    }
    public Apuesta(int idapuesta, Usuario usuario, Encuentro encuentro, BigDecimal monto, Set<Pronostico> pronosticos) {
       this.idapuesta = idapuesta;
       this.usuario = usuario;
       this.encuentro = encuentro;
       this.monto = monto;
       this.pronosticos = pronosticos;
    }
   
     @Id 
    
    @Column(name="idapuesta", unique=true, nullable=false)
    public int getIdapuesta() {
        return this.idapuesta;
    }
    
    public void setIdapuesta(int idapuesta) {
        this.idapuesta = idapuesta;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuario_idusuario", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="encuentro_idencuentro", nullable=false)
    public Encuentro getEncuentro() {
        return this.encuentro;
    }
    
    public void setEncuentro(Encuentro encuentro) {
        this.encuentro = encuentro;
    }
    
    @Column(name="monto", precision=20)
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="apuesta")
    public Set<Pronostico> getPronosticos() {
        return this.pronosticos;
    }
    
    public void setPronosticos(Set<Pronostico> pronosticos) {
        this.pronosticos = pronosticos;
    }




}


