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
 * Modulo generated by hbm2java
 */
@Entity
@Table(name="modulo"
    ,catalog="gana"
)
public class Modulo  implements java.io.Serializable {


     private int idmodulo;
     private String descrpipcion;
     private Set<Opcion> opcions = new HashSet<Opcion>(0);

    public Modulo() {
    }

	
    public Modulo(int idmodulo) {
        this.idmodulo = idmodulo;
    }
    public Modulo(int idmodulo, String descrpipcion, Set<Opcion> opcions) {
       this.idmodulo = idmodulo;
       this.descrpipcion = descrpipcion;
       this.opcions = opcions;
    }
   
     @Id 
    
    @Column(name="idmodulo", unique=true, nullable=false)
    public int getIdmodulo() {
        return this.idmodulo;
    }
    
    public void setIdmodulo(int idmodulo) {
        this.idmodulo = idmodulo;
    }
    
    @Column(name="descrpipcion", length=45)
    public String getDescrpipcion() {
        return this.descrpipcion;
    }
    
    public void setDescrpipcion(String descrpipcion) {
        this.descrpipcion = descrpipcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="modulo")
    public Set<Opcion> getOpcions() {
        return this.opcions;
    }
    
    public void setOpcions(Set<Opcion> opcions) {
        this.opcions = opcions;
    }




}


