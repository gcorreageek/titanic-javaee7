package com.titanic.ventapasajes.service;

import com.titanic.ventapasajes.modelo.Bus;
import com.titanic.ventapasajes.modelo.Recorrido;
import com.titanic.ventapasajes.modelo.Venta;
import com.titanic.ventapasajes.repositorio.VentaRepositorio;
import com.titanic.ventapasajes.util.jpa.Transaccion;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.Date;

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




    public Venta obtenerVenta(Date fechaVenta, Recorrido ruta, String horaSalida, Bus bus) {
        return ventaRepositorio.obtenerVenta(fechaVenta, ruta, horaSalida, bus);
    }
}