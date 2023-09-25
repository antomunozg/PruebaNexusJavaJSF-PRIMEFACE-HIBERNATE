/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import modelo.entidad.Empleados;
import modelo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Principal
 */
public class EmpleadosDao {
    
     public List<Empleados> listarEmpleados() {
        List<Empleados> lista = new ArrayList<>();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        String hql = "FROM Empleados";
        try {
            lista = sesion.createQuery(hql).list();
            t.commit();
            sesion.close();
        } catch (Exception e) {
            t.rollback();
        }
        return lista;
    }

    public void agregar(Empleados empleados) {
        Session sesion = null;
        Empleados depa = new Empleados();
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            empleados.setFechaHoraCreacion(obtenerFechaActual());
            sesion.save(empleados);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    public void modificar(Empleados empleados) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            empleados.setFechaHoraModifica(obtenerFechaActual());
            sesion.update(empleados);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    public void eliminar(Empleados empleados) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.delete(empleados);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }
    
    public static Date obtenerFechaActual() {
        Calendar cal = Calendar.getInstance();
        return cal.getTime();
    }
    
    public List<Empleados> listarEmpleadosConDepartamentos() {
    List<Empleados> lista = new ArrayList<>();
    Session sesion = HibernateUtil.getSessionFactory().openSession();
    Transaction t = sesion.beginTransaction();
    String hql = "SELECT e FROM Empleados e LEFT JOIN FETCH e.departamentos";
    try {
        lista = sesion.createQuery(hql).list();
        t.commit();
    } catch (Exception e) {
        t.rollback();
    } finally {
        sesion.close();
    }
    return lista;
}


    
}
