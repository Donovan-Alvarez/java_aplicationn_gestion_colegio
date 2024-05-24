/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.models;

import java.util.ArrayList;

/**
 *
 * @author donovanpc
 */
public class Estudiante {
    public String carne;
    public String nombre;
    public String apellido;
    public String password;
    public ArrayList<Curso> cursos = new ArrayList<>(); 
    public ArrayList<Integer> notaFinal = new ArrayList<>();
    
    public Estudiante(String carne, String nombre, String apellido, String password) {
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
    }

    public Estudiante() {
    }

    public ArrayList<Integer> getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(ArrayList<Integer> notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    
    
    
}
