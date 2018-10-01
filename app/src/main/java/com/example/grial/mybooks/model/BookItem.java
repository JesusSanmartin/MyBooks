package com.example.grial.mybooks.model;

import java.util.Date;


public class BookItem {

    public final String id;

    public final String titulo;

    public final String autor;

    public final Date fecha;

    public final String descripcion;

    public final String urlMiniatura;

    public BookItem(String id, String titulo, String autor,
                    Date fecha, String descripcion, String urlMiniatura) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.descripcion= descripcion;
        this.urlMiniatura = urlMiniatura;
    }
}