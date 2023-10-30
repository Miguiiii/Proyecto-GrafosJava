
package InterfazGrafica;
import javax.swing.JFrame;
/**
 *
 * @author carlo_iuymm
 */
public class Pantalla extends JFrame {

    public Pantalla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        agregarVertice = new javax.swing.JButton();
        eliminarVertice = new javax.swing.JButton();
        agregarArista = new javax.swing.JButton();
        eliminarArista = new javax.swing.JButton();
        mostrarGrafo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        agregarVertice.setText("Agregar vértice");
        agregarVertice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarVerticeMouseClicked(evt);
            }
        });
        agregarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarVerticeActionPerformed(evt);
            }
        });

        eliminarVertice.setText("Eliminar vértice");
        eliminarVertice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarVerticeMouseClicked(evt);
            }
        });
        eliminarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarVerticeActionPerformed(evt);
            }
        });

        agregarArista.setText("Agregar arista");
        agregarArista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarAristaMouseClicked(evt);
            }
        });

        eliminarArista.setText("Eliminar arista");
        eliminarArista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarAristaMouseClicked(evt);
            }
        });
        eliminarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAristaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(eliminarVertice)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminarArista)
                            .addComponent(agregarArista)))
                    .addComponent(agregarVertice)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addComponent(agregarVertice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarVertice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarArista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarArista)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        mostrarGrafo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mostrarGrafo.setText("Mostrar grafo");
        mostrarGrafo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarGrafoMouseClicked(evt);
            }
        });
        mostrarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarGrafoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mostrarGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(mostrarGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarGrafoActionPerformed

    }//GEN-LAST:event_mostrarGrafoActionPerformed

    private void mostrarGrafoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarGrafoMouseClicked
        new InterfazGrafica().selectFile();
    }//GEN-LAST:event_mostrarGrafoMouseClicked

    private void eliminarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarAristaActionPerformed

    private void eliminarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarVerticeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarVerticeActionPerformed

    private void agregarVerticeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarVerticeMouseClicked
        
        new InterfazGrafica().selectFile();
    }//GEN-LAST:event_agregarVerticeMouseClicked

    private void eliminarVerticeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarVerticeMouseClicked
        
        new InterfazGrafica().selectFile();
    }//GEN-LAST:event_eliminarVerticeMouseClicked

    private void agregarAristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarAristaMouseClicked
        
        new InterfazGrafica().selectFile();
    }//GEN-LAST:event_agregarAristaMouseClicked

    private void eliminarAristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarAristaMouseClicked
        
        new InterfazGrafica().selectFile();
    }//GEN-LAST:event_eliminarAristaMouseClicked

    private void agregarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarVerticeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarVerticeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarArista;
    private javax.swing.JButton agregarVertice;
    private javax.swing.JButton eliminarArista;
    private javax.swing.JButton eliminarVertice;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JButton mostrarGrafo;
    // End of variables declaration//GEN-END:variables
}
