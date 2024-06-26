/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal.paneles;

import com.mycompany.proyectofinal.ProyectoFinal;
import com.mycompany.proyectofinal.models.Curso;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author donovanpc
 */
public class Panel_Consulta_Curso extends javax.swing.JFrame {

    /**
     * Creates new form Panel_Consulta_Curso
     */
    public Panel_Consulta_Curso() {
        initComponents();
        actualizarTabla();
    }
    
    private void actualizarTabla(){
        DefaultTableModel data = new DefaultTableModel(new String[]{"ID","Nombre","Sección","Fecha de inicio","Fecha de fin","Hora de inicio","Hora de fin", "Profesor"},ProyectoFinal.cursos.size());
        jTable1.setModel(data);
        
        int row = 0;
        
        for (Curso c : ProyectoFinal.cursos){
            jTable1.setValueAt(c.id, row, 0);
            jTable1.setValueAt(c.nombre, row, 1);
            jTable1.setValueAt(c.seccion, row, 2);
            jTable1.setValueAt(c.fechaInicio, row, 3);
            jTable1.setValueAt(c.fechaFin, row, 4);
            jTable1.setValueAt(c.horaInicio, row, 5);
            jTable1.setValueAt(c.horaFin, row, 6);
            jTable1.setValueAt(c.profesor, row, 7);
            
            row++;
        }
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Consulta de cursos");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Guardar JSON");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Leer JSON");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(737, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(346, 346, 346))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addGap(15, 15, 15))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Panel_Administrador panel_Administrador = new Panel_Administrador();
        panel_Administrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Panel_Modificar_Curso panel_Modificar_Curso = new Panel_Modificar_Curso(jTable1.getSelectedRow());
        panel_Modificar_Curso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        guardarCursosEnJSON();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        LeerArchivo();
    }//GEN-LAST:event_jButton5ActionPerformed

        private void LeerArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccione el archivo JSON de cursos");

        int userSelection = fileChooser.showOpenDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            JSONParser parser = new JSONParser();
            try (FileReader reader = new FileReader(file)) {
                // Parsear el archivo JSON y convertirlo en un JSONArray
                JSONArray jsonArray = (JSONArray) parser.parse(reader);

                // Iterar sobre el JSONArray y convertir cada elemento en un objeto Curso
                for (Object obj : jsonArray) {
                    JSONObject jsonObject = (JSONObject) obj;


                    Curso curso = new Curso();
                    curso.id = String.valueOf(jsonObject.get("id"));
                    curso.nombre = String.valueOf(jsonObject.get("nombre"));
                    curso.seccion = String.valueOf(jsonObject.get("seccion"));
                    curso.fechaInicio = String.valueOf(jsonObject.get("fecha_inicio"));
                    curso.fechaFin = String.valueOf(jsonObject.get("fecha_fin"));
                    curso.horaInicio = String.valueOf(jsonObject.get("hora_inicio"));
                    curso.horaFin = String.valueOf(jsonObject.get("hora_fin"));
                    curso.profesor = String.valueOf(jsonObject.get("profesor"));

                    ProyectoFinal.cursos.add(curso);
                }
                for (Curso c : ProyectoFinal.cursos) {
                    System.out.println("ID: " + c.id);
                    System.out.println("Nombre: " + c.nombre);
                    System.out.println("Sección: " + c.seccion);
                    System.out.println("Fecha Inicio: " + c.fechaInicio);
                    System.out.println("Fecha Fin: " + c.fechaFin);
                    System.out.println("Hora Inicio: " + c.horaInicio);
                    System.out.println("Hora Fin: " + c.horaFin);
                    System.out.println("Profesor: " + c.profesor);
                    System.out.println();
                }
                
                actualizarTabla();
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public static void guardarCursosEnJSON() {
        // Crear un JFileChooser para seleccionar la ubicación del archivo
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo JSON de cursos");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (!file.getAbsolutePath().endsWith(".json")) {
                file = new File(file.getAbsolutePath() + ".json");
            }

            JSONArray jsonArray = new JSONArray();

            for (Curso c : ProyectoFinal.cursos) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("id", c.id);
                jsonObject.put("nombre", c.nombre);
                jsonObject.put("seccion", c.seccion);
                jsonObject.put("fecha_inicio", c.fechaInicio);
                jsonObject.put("fecha_fin", c.fechaFin);
                jsonObject.put("hora_inicio", c.horaInicio);
                jsonObject.put("hora_fin", c.horaFin);
                jsonObject.put("profesor", c.profesor);

                jsonArray.add(jsonObject);
            }

            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(jsonArray.toJSONString());
                fileWriter.flush();
                System.out.println("Archivo JSON guardado exitosamente en " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
