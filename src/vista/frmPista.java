/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import logica.hilo;

/**
 * Construcción del tablero de carrera.
 *
 * @author Wilmar Santiago Duque valencia / Documento: 1152707680
 * @author Kevin García Hincapié / Documento: 1018350636
 * @since logica
 * @version Carrera Caballos V4.0
 */
public class frmPista extends javax.swing.JFrame {

    public static frmPista frm;

    /**
     * Creates new form NewJFrame
     */
    public frmPista() {
        initComponents();
        Resultados.setEditable(false);

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
        ButInicioC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultados = new javax.swing.JTextArea();
        Trueno = new javax.swing.JLabel();
        Trueno1 = new javax.swing.JLabel();
        Zeus = new javax.swing.JLabel();
        Jarvis = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(974, 502));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(974, 502));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButInicioC.setText("Go!");
        ButInicioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButInicioCActionPerformed(evt);
            }
        });
        jPanel1.add(ButInicioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 890, -1, -1));

        Resultados.setEditable(false);
        Resultados.setColumns(20);
        Resultados.setRows(5);
        Resultados.setText("                    *** Resultados ***");
        Resultados.setPreferredSize(new java.awt.Dimension(164, 72));
        jScrollPane1.setViewportView(Resultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 860, 260, -1));
        jPanel1.add(Trueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 171));

        Trueno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Trueno.gif"))); // NOI18N
        Trueno1.setText("Trueno");
        jPanel1.add(Trueno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 60));

        Zeus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Zeus.gif"))); // NOI18N
        Zeus.setText("Zeus");
        jPanel1.add(Zeus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 60));

        Jarvis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tiro al blanco.gif"))); // NOI18N
        Jarvis.setText("Jarvis");
        jPanel1.add(Jarvis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Trueno - copia (2).gif"))); // NOI18N
        jLabel3.setText("Neron");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 120, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Zeus - copia 2.gif"))); // NOI18N
        jLabel4.setText("Cancerbero");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 130, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blanco2.gif"))); // NOI18N
        jLabel5.setText("Guardian");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 130, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Trueno - copia(3).gif"))); // NOI18N
        jLabel6.setText("Estrellita");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 120, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1530, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 973, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1540, 10));
        jSeparator4.getAccessibleContext().setAccessibleParent(jSeparator1);

        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 372, 1530, 10));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 1540, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondoracer.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 1430, 1410));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButInicioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButInicioCActionPerformed
        /**
        * Se crea 7 hilos para cada caballo en competencia
        */
        Resultados.setText("");
        hilo h1 = new hilo("Trueno", jSeparator1.getX(), Trueno1);
        hilo h2 = new hilo("Zeus", jSeparator4.getX(), Zeus);
        hilo h3 = new hilo("Jarvis", jSeparator5.getX(), Jarvis);
        hilo h4 = new hilo("Nerón", jSeparator5.getX(), Jarvis);
        hilo h5 = new hilo("Cancerbero", jSeparator5.getX(), Jarvis);
        hilo h6 = new hilo("Guardián", jSeparator5.getX(), Jarvis);
        hilo h7 = new hilo("Estrellita", jSeparator5.getX(), Jarvis);
        /**
        * Arrancan los hilos.
        */
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h6.start();
        h7.start();
    }//GEN-LAST:event_ButInicioCActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm = new frmPista();
                frm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButInicioC;
    private javax.swing.JLabel Jarvis;
    private javax.swing.JTextArea Resultados;
    private javax.swing.JLabel Trueno;
    private javax.swing.JLabel Trueno1;
    private javax.swing.JLabel Zeus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
