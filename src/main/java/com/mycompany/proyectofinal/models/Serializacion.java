/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author donovan
 */
public class Serializacion {

    public static <T> void guardarLista(ArrayList<T> lista, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(lista);
            System.out.println("La lista ha sido serializada y guardada en " + filename);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static <T> ArrayList<T> cargarLista(String filename) {
        ArrayList<T> lista = null;
        try (FileInputStream fileIn = new FileInputStream(filename); ObjectInputStream in = new ObjectInputStream(fileIn)) {
            lista = (ArrayList<T>) in.readObject();
            System.out.println("La lista ha sido deserializada desde " + filename);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
        return lista;
    }
}
