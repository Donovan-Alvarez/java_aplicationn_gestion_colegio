/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal;

import com.mycompany.proyectofinal.models.Curso;
import com.mycompany.proyectofinal.models.Estudiante;
import com.mycompany.proyectofinal.models.Profesor;
import com.mycompany.proyectofinal.paneles.Login;
import java.util.ArrayList;

/**
 *
 * @author donovanpc
 */
public class ProyectoFinal {

    public static ArrayList<Profesor> profesors = new ArrayList<>();
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static ArrayList<Curso> cursos = new ArrayList<>();
    
    public static Profesor profesorLogueado = new Profesor();
    public static Estudiante estudianteLogueado = new Estudiante();
    
    
    
    
    
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);  

    }
}
