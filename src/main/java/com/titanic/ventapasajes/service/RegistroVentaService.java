package com.titanic.ventapasajes.service;

import java.io.Serializable;
import java.util.Date;

import javax.inject.Inject;

import com.titanic.ventapasajes.modelo.Bus;
import com.titanic.ventapasajes.modelo.Programacion;
import com.titanic.ventapasajes.modelo.Recorrido;
import com.titanic.ventapasajes.modelo.Venta;
import com.titanic.ventapasajes.repositorio.VentaRepositorio;
import com.titanic.ventapasajes.util.jpa.Transaccion;

/**
 * Created by josediaz on 7/28/14.
 */
public class RegistroVentaService implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Inject
    private VentaRepositorio ventaRepositorio;



    @Transaccion
    public Venta registrarVenta(Venta venta){


        return ventaRepositorio.adicionarVenta(venta);
    }




    public Venta obtenerVenta(Programacion programacion) {
        return ventaRepositorio.obtenerVenta(programacion);
    }
}