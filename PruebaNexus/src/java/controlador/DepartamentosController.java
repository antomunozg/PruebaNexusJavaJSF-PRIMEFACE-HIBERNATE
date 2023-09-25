/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.DepartamentosDao;
import modelo.entidad.Departamentos;

/**
 *
 * @author principal
 */
@ManagedBean
@ViewScoped
public class DepartamentosController {

    /**
     * Creates a new instance of DepartamentosController
     */
    private List<Departamentos> listaDepartamentoss;
    private Departamentos departamentos;

    public DepartamentosController() {
        departamentos = new Departamentos();
    }

    public List<Departamentos> getListaDepartamentos() {
        DepartamentosDao ad = new DepartamentosDao();
        listaDepartamentoss = ad.listarDepartamentos();
        return listaDepartamentoss;
    }

    public void setListaDepartamentoss(List<Departamentos> listaDepartamentoss) {
        this.listaDepartamentoss = listaDepartamentoss;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public void limpiarDepartamentos() {
        departamentos = new Departamentos();
    }

    public void agregarDepartamentos() {
        DepartamentosDao ad = new DepartamentosDao();
        ad.agregar(departamentos);
    }

    public void modificarDepartamentos() {
        DepartamentosDao ad = new DepartamentosDao();
        ad.modificar(departamentos);
        limpiarDepartamentos();
    }

    public void eliminarDepartamentos() {
        DepartamentosDao ad = new DepartamentosDao();
        ad.eliminar(departamentos);
        limpiarDepartamentos();
    }
}
