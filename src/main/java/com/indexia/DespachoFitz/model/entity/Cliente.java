package com.indexia.DespachoFitz.model.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "primer_nombre")
    private String primerNombre;
    @Column(name = "segundo_nombre")
    private String segundoNombre;
    @Column(name = "tercer_nombre")
    private String tercerNombre;
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Column(name = "direccion_1")
    private String direccion1;
    @Column(name = "direccion_2")
    private String direccion2;
    @Column(name = "rfc")
    private String RFC;
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    @Column(name = "ciudad")
    private String Ciudad;
    @Column(name = "estado")
    private String Estado;
    @Column(name = "país")
    private String pais;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "edad")
    private int edad;
    @Column(name = "telefono_1")
    private String telefono1;
    @Column(name = "telefono_2")
    private String telefono2;
    @Column(name = "curp")
    private String CURP;
    @Column(name = "actividad_economica")
    private String actividadEconomica;
    @Column(name = "ingresos_mensuales")
    private Double ingresosMensuales;
    @Column(name = "estatus_padron")
    private String estatusPadron;
    @Column(name = "nombre_comercial")
    private String nombreComercial;
    @Column(name = "fecha_inicio_operaciones")
    private Date fechaInicioOperaciones;
    @Column(name = "honorarios_mensuales")
    private Double honorariosMensuales;
    @Column(name = "e_firma")
    private String eFirma;
    @Column(name = "clabe_cieg_rps")
    private String clabeCiegRps;
    @Column(name = "situacion_bancaria")
    private String situacionBancaria;
    @Column(name = "regimen")
    private String regimen;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getTercerNombre() {
        return tercerNombre;
    }

    public void setTercerNombre(String tercerNombre) {
        this.tercerNombre = tercerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public Double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(Double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public String getEstatusPadron() {
        return estatusPadron;
    }

    public void setEstatusPadron(String estatusPadron) {
        this.estatusPadron = estatusPadron;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public Date getFechaInicioOperaciones() {
        return fechaInicioOperaciones;
    }

    public void setFechaInicioOperaciones(Date fechaInicioOperaciones) {
        this.fechaInicioOperaciones = fechaInicioOperaciones;
    }

    public Double getHonorariosMensuales() {
        return honorariosMensuales;
    }

    public void setHonorariosMensuales(Double honorariosMensuales) {
        this.honorariosMensuales = honorariosMensuales;
    }

    public String geteFirma() {
        return eFirma;
    }

    public void seteFirma(String eFirma) {
        this.eFirma = eFirma;
    }

    public String getClabeCiegRps() {
        return clabeCiegRps;
    }

    public void setClabeCiegRps(String clabeCiegRps) {
        this.clabeCiegRps = clabeCiegRps;
    }

    public String getSituacionBancaria() {
        return situacionBancaria;
    }

    public void setSituacionBancaria(String situacionBancaria) {
        this.situacionBancaria = situacionBancaria;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }
}
