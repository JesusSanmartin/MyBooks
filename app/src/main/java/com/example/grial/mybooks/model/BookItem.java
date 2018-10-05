package com.example.grial.mybooks.model;

import java.util.Date;


public class BookItem {

    private int id;
    private  String titulo;
    private  String autor;
    private  Date fecha;
    private  String descripcion;
    private  String urlMiniatura;

    public BookItem() {
    }

    public BookItem(int id, String titulo, String autor,
                    Date fecha, String descripcion, String urlMiniatura) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.descripcion= descripcion;
        this.urlMiniatura = urlMiniatura;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAuthor(String autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlMiniatura() {
        return urlMiniatura;
    }

    public void setUrlMiniatura(String urlMiniatura) {
        this.urlMiniatura = urlMiniatura;
    }
}