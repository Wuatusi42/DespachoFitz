package com.indexia.DespachoFitz.utils;

import jakarta.persistence.Column;

import java.util.Date;

public class ClienteRequest {
    private String inicialName;
    private String secondName;
    private String threeName;
    private String paternLastName;
    private String maternLastName;
    private String address1;
    private String address2;
    private String RFC;
    private Date birthdate;
    private String City;
    private String state;
    private String country;
    private String sex;
    private int age;
    private String phone1;
    private String phone2;
    private String CURP;
    private String economyActivity;
    private Double monthIncome;
    private String statusPadron;
    private String comercialName;
    private Date dateInicialOperation;
    private Double monthlyFees;
    private String eSignature;
    private String clabCiegRps;
    private String bancarySituacion;
    private String Regimen;

    public String getInicialName() {
        return inicialName;
    }

    public void setInicialName(String inicialName) {
        this.inicialName = inicialName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThreeName() {
        return threeName;
    }

    public void setThreeName(String threeName) {
        this.threeName = threeName;
    }

    public String getPaternLastName() {
        return paternLastName;
    }

    public void setPaternLastName(String paternLastName) {
        this.paternLastName = paternLastName;
    }

    public String getMaternLastName() {
        return maternLastName;
    }

    public void setMaternLastName(String maternLastName) {
        this.maternLastName = maternLastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getEconomyActivity() {
        return economyActivity;
    }

    public void setEconomyActivity(String economyActivity) {
        this.economyActivity = economyActivity;
    }

    public Double getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(Double monthIncome) {
        this.monthIncome = monthIncome;
    }

    public String getStatusPadron() {
        return statusPadron;
    }

    public void setStatusPadron(String statusPadron) {
        this.statusPadron = statusPadron;
    }

    public String getComercialName() {
        return comercialName;
    }

    public void setComercialName(String comercialName) {
        this.comercialName = comercialName;
    }

    public Date getDateInicialOperation() {
        return dateInicialOperation;
    }

    public void setDateInicialOperation(Date dateInicialOperation) {
        this.dateInicialOperation = dateInicialOperation;
    }

    public Double getMonthlyFees() {
        return monthlyFees;
    }

    public void setMonthlyFees(Double monthlyFees) {
        this.monthlyFees = monthlyFees;
    }

    public String geteSignature() {
        return eSignature;
    }

    public void seteSignature(String eSignature) {
        this.eSignature = eSignature;
    }

    public String getClabCiegRps() {
        return clabCiegRps;
    }

    public void setClabCiegRps(String clabCiegRps) {
        this.clabCiegRps = clabCiegRps;
    }

    public String getBancarySituacion() {
        return bancarySituacion;
    }

    public void setBancarySituacion(String bancarySituacion) {
        this.bancarySituacion = bancarySituacion;
    }

    public String getRegimen() {
        return Regimen;
    }

    public void setRegimen(String regimen) {
        Regimen = regimen;
    }
}
