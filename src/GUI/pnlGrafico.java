/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import codigo.*;
import java.awt.*;
import java.util.ArrayList;
import objetos.GraficaPastel;
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author gara8
 */
public class pnlGrafico extends javax.swing.JPanel {

    Cargas cargas = new Cargas();
    DefaultPieDataset datos = new DefaultPieDataset();
    
    public pnlGrafico() {
        initComponents();
        
        GraficaPastel.listaDatos = new ArrayList<>();
        ArrayList<GraficaPastel> listaDatos = cargas.cargarGrafico();
        Object[] arreglo = new Object[2];
        for (int i = 0; i < listaDatos.size(); i++) {
            arreglo[0] = listaDatos.get(i).getNombre();
            arreglo[1] = listaDatos.get(i).getCantidad();
            String nombre = (String) arreglo[0];
            int cantidad = (int) arreglo[1];
            datos.setValue(nombre, cantidad);
        }
        JFreeChart grafico_circular = ChartFactory.createPieChart("Cantidad de delincuentes de acuerdo con el tipo de delincuente asignado", datos, true, true, false);
        ChartPanel panel = new ChartPanel(grafico_circular);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(500,300));
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(panel,BorderLayout.NORTH);
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}