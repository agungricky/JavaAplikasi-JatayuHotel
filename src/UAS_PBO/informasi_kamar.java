/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_PBO;

import static UAS_PBO.Menu.toolsinfokamar;
import java.awt.Toolkit;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author asus
 */
public class informasi_kamar extends javax.swing.JFrame {

    /**
     * Creates new form informasi_kamar1
     */
    public informasi_kamar() {
        initComponents();
        setLocationRelativeTo(this);
        tampil_data();
        setIconImage();
    }
    
    void tampil_data(){
        koneksi koneksiku=new koneksi();
        koneksiku.koneksi();
        try {
            String sql="SELECT Blok_kamar, No_kamar, Status_kamar FROM persedian_kamar WHERE Status_kamar LIKE '%Kosong%'";
            koneksiku.rs=koneksiku.st.executeQuery(sql);
            tabel.setModel(DbUtils.resultSetToTableModel(koneksiku.rs));
        } catch (Exception e) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        blokkmr = new javax.swing.JTextField();
        nomor = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        tipe = new javax.swing.JTextField();
        sttkamar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Bacground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informasi Kamar");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Pristina", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INFORMASI KAMAR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 540, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 550, 70));

        tabel.setBackground(new java.awt.Color(255, 153, 0));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 610, 250));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Blok Kamar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nomor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Harga / Malam");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tipe");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Status Kamar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        blokkmr.setEditable(false);
        getContentPane().add(blokkmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 240, -1));
        getContentPane().add(nomor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 240, -1));

        harga.setEditable(false);
        getContentPane().add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 240, -1));

        tipe.setEditable(false);
        getContentPane().add(tipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 240, -1));

        sttkamar.setEditable(false);
        getContentPane().add(sttkamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 240, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS_PBO/close_14776.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 130, 130));

        Bacground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS_PBO/5169fc28544fde43c93d741341a25f00.jpg"))); // NOI18N
        getContentPane().add(Bacground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 1020, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        toolsinfokamar.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
           int baris=tabel.getSelectedRow();
           
           String blokkamar=(String) tabel.getValueAt(baris, 0);
           String nomorku=(String) tabel.getValueAt(baris, 1);
          String sttkamarku=(String) tabel.getValueAt(baris, 2);
           if(blokkamar.equals("A")){
               harga.setText("150,000");
               tipe.setText("VIP");
           }
           
           if(blokkamar.equals("B")){
               harga.setText("100,000");
               tipe.setText("REGULER");
           }
           
           if(blokkamar.equals("C")){
               harga.setText("50,000");
               tipe.setText("BIASA");
           }
           blokkmr.setText(blokkamar);
           nomor.setText(nomorku);
           sttkamar.setText(sttkamarku);
    }//GEN-LAST:event_tabelMouseClicked

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
            java.util.logging.Logger.getLogger(informasi_kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(informasi_kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(informasi_kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(informasi_kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new informasi_kamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bacground;
    private javax.swing.JTextField blokkmr;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomor;
    private javax.swing.JTextField sttkamar;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tipe;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("garuda_indonesin_artwork_illustration_generated.jpg")));
    }
}
