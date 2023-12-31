package modelo.entidad;
// Generated 24/09/2023 11:39:29 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Departamentos generated by hbm2java
 */
public class Departamentos  implements java.io.Serializable {


     private Integer id;
     private String departamentoCodigo;
     private String departamentoNombre;
     private Date fechaHoraCrea;
     private Date fechaHoraModifica;
     private Set<Empleados> empleadoses = new HashSet<Empleados>(0);

    public Departamentos() {
    }

    public Departamentos(String departamentoCodigo, String departamentoNombre, Date fechaHoraCrea, Date fechaHoraModifica, Set<Empleados> empleadoses) {
       this.departamentoCodigo = departamentoCodigo;
       this.departamentoNombre = departamentoNombre;
       this.fechaHoraCrea = fechaHoraCrea;
       this.fechaHoraModifica = fechaHoraModifica;
       this.empleadoses = empleadoses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDepartamentoCodigo() {
        return this.departamentoCodigo;
    }
    
    public void setDepartamentoCodigo(String departamentoCodigo) {
        this.departamentoCodigo = departamentoCodigo;
    }
    public String getDepartamentoNombre() {
        return this.departamentoNombre;
    }
    
    public void setDepartamentoNombre(String departamentoNombre) {
        this.departamentoNombre = departamentoNombre;
    }
    public Date getFechaHoraCrea() {
        return this.fechaHoraCrea;
    }
    
    public void setFechaHoraCrea(Date fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
    }
    public Date getFechaHoraModifica() {
        return this.fechaHoraModifica;
    }
    
    public void setFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
    }
    public Set<Empleados> getEmpleadoses() {
        return this.empleadoses;
    }
    
    public void setEmpleadoses(Set<Empleados> empleadoses) {
        this.empleadoses = empleadoses;
    }




}


