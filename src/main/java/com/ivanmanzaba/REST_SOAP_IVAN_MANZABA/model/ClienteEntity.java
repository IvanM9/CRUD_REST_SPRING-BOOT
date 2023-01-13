package com.ivanmanzaba.REST_SOAP_IVAN_MANZABA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "cliente")
public class ClienteEntity {
    @Id
    private Integer codcliente;

    private String dni;
    private String nombre;
    private String direccion;
    private String tipocliente;
    private String ccaa;

    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(String tipocliente) {
        this.tipocliente = tipocliente;
    }

    public String getCcaa() {
        return ccaa;
    }

    public void setCcaa(String ccaa) {
        this.ccaa = ccaa;
    }
}
