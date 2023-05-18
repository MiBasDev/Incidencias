/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 * Clase que mostra os datos dunha incidencia e permite modificar o seu estado e
 * a descrición da resolución da mesma.
 *
 * @author Miguel Bastos Gándara.
 */
public class IncidenceDialog extends javax.swing.JDialog {
    
    private Incidence incidence;

    /**
     * Cambia os datos da incidencia.
     *
     * @param incidence Incidencia a mostrar.
     */
    public void setIncidence(Incidence incidence) {
        this.incidence = incidence;
        jLblSendName.setText(this.incidence.getSender().getName() + " " + this.incidence.getSender().getSurname());
        jLblComputerName.setText(this.incidence.getComputer());
        jLblDescriptionText.setText(this.incidence.getDescription());
        jComboBoxStatus.setSelectedIndex(incidence.getStatus());
        jTextAreaResolution.setText(incidence.getResolution());
    }

    /**
     * Creates new form IncidenceDialog
     *
     * @param parent Frame padre.
     * @param modal True si modal, false si no.
     */
    public IncidenceDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblSend = new javax.swing.JLabel();
        jLlblComputer = new javax.swing.JLabel();
        jLblDescirption = new javax.swing.JLabel();
        jLblStatus = new javax.swing.JLabel();
        jLblResolution = new javax.swing.JLabel();
        jLblSendName = new javax.swing.JLabel();
        jLblComputerName = new javax.swing.JLabel();
        jLblDescriptionText = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResolution = new javax.swing.JTextArea();
        jButtonAccept = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Incidencia");

        jLblSend.setText("Enviado por:");

        jLlblComputer.setText("Equipo:");

        jLblDescirption.setText("Descrición:");

        jLblStatus.setText("Estado");

        jLblResolution.setText("Resolución:");

        jLblSendName.setText("eee");

        jLblComputerName.setText("eee");

        jLblDescriptionText.setText("eee");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non resolta", "Pendente", "Resolta" }));

        jTextAreaResolution.setColumns(20);
        jTextAreaResolution.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResolution);

        jButtonAccept.setText("Aceptar");
        jButtonAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcceptActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAccept)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblSend)
                            .addComponent(jLlblComputer)
                            .addComponent(jLblDescirption)
                            .addComponent(jLblStatus)
                            .addComponent(jLblResolution))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblDescriptionText)
                            .addComponent(jLblComputerName)
                            .addComponent(jLblSendName)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSend)
                    .addComponent(jLblSendName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLlblComputer)
                    .addComponent(jLblComputerName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblDescirption)
                    .addComponent(jLblDescriptionText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblStatus)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLblResolution))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonAccept))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcceptActionPerformed
        incidence.setStatus(jComboBoxStatus.getSelectedIndex());
        incidence.setResolution(jTextAreaResolution.getText());
        IncidenceDB.update(incidence);
        dispose();
    }//GEN-LAST:event_jButtonAcceptActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IncidenceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncidenceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncidenceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncidenceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccept;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLblComputerName;
    private javax.swing.JLabel jLblDescirption;
    private javax.swing.JLabel jLblDescriptionText;
    private javax.swing.JLabel jLblResolution;
    private javax.swing.JLabel jLblSend;
    private javax.swing.JLabel jLblSendName;
    private javax.swing.JLabel jLblStatus;
    private javax.swing.JLabel jLlblComputer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResolution;
    // End of variables declaration//GEN-END:variables
}
