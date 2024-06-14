/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal;

import com.mycompany.proyectofinal.models.Curso;
import com.mycompany.proyectofinal.models.Estudiante;
import com.mycompany.proyectofinal.models.Profesor;
import com.mycompany.proyectofinal.models.Serializacion;
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
        String profesorFile = "profesor.ser";
        String estudiantesFile = "estudiantes.ser";
        String cursosFile = "cursos.ser";
        // Cargar las listas al iniciar el programa
        profesors = Serializacion.cargarLista(profesorFile);
        if (profesors == null) profesors = new ArrayList<>();
        
        estudiantes = Serializacion.cargarLista(estudiantesFile);
        if (estudiantes == null) estudiantes = new ArrayList<>();
        
        cursos = Serializacion.cargarLista(cursosFile);
        if (cursos == null) cursos = new ArrayList<>();
       
        
        // Mostrar la ventana de login
        Login login = new Login();
        login.setVisible(true);  
        
        // Guardar las listas al salir del programa
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            Serializacion.guardarLista(profesors, profesorFile);
            Serializacion.guardarLista(estudiantes, estudiantesFile);
            Serializacion.guardarLista(cursos, cursosFile);
        }));

    }
}
