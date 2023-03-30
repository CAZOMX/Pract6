/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6zunigaojedacarlos;

/**
 *
 * @author Usuario
 */
public class Cotizacion
{

    private int cantDias;
    private String destino;
    private String tipodeH;
    private double subTot;
    private double IVA;
    private double total;
    private double mensaulidad;

    public Cotizacion(int cantDias,
            String destino,
            String tipodeH,
            double subTot,
            double IVA,
            double total,
            double mensaulidad)
    {
        this.cantDias = cantDias;
        this.destino = destino;
        this.tipodeH = tipodeH;
        this.subTot = subTot;
        this.IVA = IVA;
        this.total = total;
        this.mensaulidad = mensaulidad;
    }

    public int getCantDias()
    {
        return cantDias;
    }

    public void setCantDias(int cantDias)
    {
        this.cantDias = cantDias;
    }

    public String getDestino()
    {
        return destino;
    }

    public void setDestino(String destino)
    {
        this.destino = destino;
    }

    public String getTipodeH()
    {
        return tipodeH;
    }

    public void setTipodeH(String tipodeH)
    {
        this.tipodeH = tipodeH;
    }

    public double getSubTot()
    {
        return subTot;
    }

    public void setSubTot(double subTot)
    {
        this.subTot = subTot;
    }

    public double getIVA()
    {
        return IVA;
    }

    public void setIVA(double IVA)
    {
        this.IVA = IVA;
    }

    public double getTotal()
    {
        return total;
    }

    public void setTotal(double total)
    {
        this.total = total;
    }

    public double getMensaulidad()
    {
        return mensaulidad;
    }

    public void setMensaulidad(double mensaulidad)
    {
        this.mensaulidad = mensaulidad;
    }

}
