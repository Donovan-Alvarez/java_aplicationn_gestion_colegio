/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal.paneles;

import com.mycompany.proyectofinal.ProyectoFinal;
import com.mycompany.proyectofinal.models.Estudiante;
import com.mycompany.proyectofinal.models.Profesor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author donovanpc
 */
public class Panel_Consulta_Estudiante extends javax.swing.JFrame {

    /**
     * Creates new form Panel_Consulta_Estudiante
     */
    public Panel_Consulta_Estudiante() {
        initComponents();
        actualizarTabla();
        
    }
    
    private void actualizarTabla(){
        DefaultTableModel data = new DefaultTableModel(new String[]{"Carné","Nombre","Apellido","Contraseña"},ProyectoFinal.estudiantes.size());
        jTable1.setModel(data);
        
        int row = 0;
        
        for (Estudiante c : ProyectoFinal.estudiantes){
            jTable1.setValueAt(c.carne, row, 0);
            jTable1.setValueAt(c.nombre, row, 1);
            jTable1.setValueAt(c.apellido, row, 2);
            jTable1.setValueAt(c.password,row, 3);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Consulta estudiantes");

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

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Carga masiva XML");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Guardar XML");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Panel_Administrador panel_Administrador = new Panel_Administrador();
        panel_Administrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Panel_Modificar_Estudiante panel_Modificar_Estudiante = new Panel_Modificar_Estudiante(jTable1.getSelectedRow());
        panel_Modificar_Estudiante.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser archivo = new JFileChooser();
        int retorno = archivo.showDialog(this,"Cargar");
        if(retorno==JFileChooser.APPROVE_OPTION){
            leerArchivoXmlEstudiante(archivo.getSelectedFile());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String contenido = "<alumnos>\n";
        for(Estudiante e : ProyectoFinal.estudiantes){
            contenido+="\t<alumno>\n";
            contenido+="\t\t<carne>";
            contenido+= e.carne;
            contenido+="</carne>\n";
            contenido+="\t\t<nombre>";
            contenido+= e.nombre;
            contenido+="</nombre>\n";
            contenido+="\t\t<apellido>";
            contenido+= e.apellido;
            contenido+="</apellido>\n";
            contenido+="\t\t<password>";
            contenido+= e.password;
            contenido+="</password>\n";
            contenido+="\t</alumno>\n";
        }
        
        contenido+="</alumnos>";
        JFileChooser archivo = new JFileChooser();
        int retorno = archivo.showDialog(this,"Cargar");
        if(retorno==JFileChooser.APPROVE_OPTION){
            escribirArchivoTexto(archivo.getSelectedFile().toPath().toString(),contenido);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

        public void escribirArchivoTexto(String rutaConNombre,String contenido){
    
        try{
            FileWriter fw = new FileWriter(rutaConNombre);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(contenido);
            pw.close();
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
    public void leerArchivoXmlEstudiante(File archivo){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(archivo);
            
            doc.getDocumentElement().normalize();
            NodeList nodos = doc.getElementsByTagName("alumno");
            for(int i = 0; i<nodos.getLength();i++){
                Node nodo = nodos.item(i);
                if(nodo.getNodeType() == Node.ELEMENT_NODE){
                    Element e = (Element) nodo;
                    Estudiante em = new Estudiante();
                    em.carne = e.getElementsByTagName("carne").item(0)
                                    .getTextContent();
                    em.nombre = e.getElementsByTagName("nombre").item(0)
                                    .getTextContent();
                    em.apellido = e.getElementsByTagName("apellido").item(0)
                                    .getTextContent();    
                    em.password = e.getElementsByTagName("password").item(0)
                                    .getTextContent();                    
                    ProyectoFinal.estudiantes.add(em);
                }
            }
            actualizarTabla();
            
        }catch (Exception ex) {
            
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
