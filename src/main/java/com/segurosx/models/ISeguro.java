package com.segurosx.models;

public interface ISeguro {
    public abstract String getDetalleSeguro();

    public abstract void calcularRiesgo();

    public abstract String getNivelRiesgo();
}