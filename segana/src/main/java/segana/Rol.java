package segana;
// Generated Mar 13, 2012 4:29:28 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Rol generated by hbm2java
 */
@Entity
@Table(name="rol"
    ,catalog="gana"
)
public class Rol  implements java.io.Serializable {


     private int idrol;
     private String descripcion;
     private Set<Rolusuario> rolusuarios = new HashSet<Rolusuario>(0);
     private Set<Acesso> acessos = new HashSet<Acesso>(0);

    public Rol() {
    }

	
    public Rol(int idrol) {
        this.idrol = idrol;
    }
    public Rol(int idrol, String descripcion, Set<Rolusuario> rolusuarios, Set<Acesso> acessos) {
       this.idrol = idrol;
       this.descripcion = descripcion;
       this.rolusuarios = rolusuarios;
       this.acessos = acessos;
    }
   
     @Id 
    
    @Column(name="idrol", unique=true, nullable=false)
    public int getIdrol() {
        return this.idrol;
    }
    
    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }
    
    @Column(name="descripcion", length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="rol")
    public Set<Rolusuario> getRolusuarios() {
        return this.rolusuarios;
    }
    
    public void setRolusuarios(Set<Rolusuario> rolusuarios) {
        this.rolusuarios = rolusuarios;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="rol")
    public Set<Acesso> getAcessos() {
        return this.acessos;
    }
    
    public void setAcessos(Set<Acesso> acessos) {
        this.acessos = acessos;
    }




}


