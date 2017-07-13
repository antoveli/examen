package com.example.examen;

/**
 * Created by alumno on 12/07/2017.
 */
public class Restaurante {

    private String nombre;
    private String direccion;
    private int cantTrabajadores;
    private int categoria;
    private boolean aceptaNinios;
    private double impuesto;


    public Restaurante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantTrabajadores() {
        return cantTrabajadores;
    }

    public void setCantTrabajadores(int cantTrabajadores) {
        this.cantTrabajadores = cantTrabajadores;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public boolean isAceptaNinios() {
        return aceptaNinios;
    }

    public void setAceptaNiños(boolean aceptaNinios) {
        this.aceptaNinios = aceptaNinios;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double calcularImpuesto( int categoria, boolean aceptaNinios, int cantComensales )
    {   double impuesto;

        if( aceptaNinios)
        {
            impuesto =( cantComensales*categoria)/3;
        }
        else
        {
            impuesto = cantComensales*categoria;
        }
        return  impuesto;
    }
}
