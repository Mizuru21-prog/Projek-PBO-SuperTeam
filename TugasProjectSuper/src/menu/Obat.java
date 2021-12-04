/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu;

/**
 *
 * @author mizuru
 */
public class Obat extends javax.swing.JFrame {

    /**
     * Creates new form Obat
     */
    public Obat() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gambarFlue = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sakitBatuk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Obat-Obatan");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gambarFlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/GAMBAR/flue.jpeg"))); // NOI18N
        gambarFlue.setBorderPainted(false);
        gambarFlue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gambarFlue.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        gambarFlue.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        gambarFlue.setMargin(new java.awt.Insets(2, 10, 2, 10));
        gambarFlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gambarFlueActionPerformed(evt);
            }
        });
        getContentPane().add(gambarFlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 250, 250));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("BATUK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        sakitBatuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/GAMBAR/Batuk.jpeg"))); // NOI18N
        sakitBatuk.setBorderPainted(false);
        sakitBatuk.setMaximumSize(new java.awt.Dimension(281, 235));
        sakitBatuk.setMinimumSize(new java.awt.Dimension(281, 235));
        sakitBatuk.setPreferredSize(new java.awt.Dimension(281, 235));
        sakitBatuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sakitBatukActionPerformed(evt);
            }
        });
        getContentPane().add(sakitBatuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 310, 250));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("FLUE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 51));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Jenis Penyakit");
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 51));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gambarFlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gambarFlueActionPerformed
        Flue sakit = new Flue();
        sakit.setVisible(true);
        dispose();
    }//GEN-LAST:event_gambarFlueActionPerformed

    private void sakitBatukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sakitBatukActionPerformed
        Batuk sakit = new Batuk();
        sakit.setVisible(true);
        dispose();
    }//GEN-LAST:event_sakitBatukActionPerformed

    
    public void obat() {
        new Obat().setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gambarFlue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sakitBatuk;
    // End of variables declaration//GEN-END:variables
}
