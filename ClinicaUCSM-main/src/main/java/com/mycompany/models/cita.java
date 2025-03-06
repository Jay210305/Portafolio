package com.mycompany.models;

public class cita {
    private int ncita;
    private String motivo;
    private int day;
    private int month;
    private int year;
    private char turno;
    private int docid;
    private int code;
    private int idlist;

    public int getNcita() {
        return ncita;
    }

    public String getMotivo() {
        return motivo;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public char getTurno() {
        return turno;
    }

    public int getDocid() {
        return docid;
    }

    public int getCode() {
        return code;
    }

    public int getIdlist() {
        return idlist;
    }

    public void setNcita(int ncita) {
        this.ncita = ncita;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public void setDocid(int docid) {
        this.docid = docid;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setIdlist(int idlist) {
        this.idlist = idlist;
    }
}
