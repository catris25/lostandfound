package lostandfound;

/**
 *
 * @author LIA
 */

public class TambahBarangMenu extends javax.swing.JFrame {
    
    BarangController barang = new BarangController();
    
    public TambahBarangMenu() {
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

        messageDialog = new javax.swing.JDialog();
        messageNotifLabel = new javax.swing.JLabel();
        judulPanel = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        inputFormPanel = new javax.swing.JPanel();
        InputFormLabelPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InputFormFieldPanel = new javax.swing.JPanel();
        namaBarangTextField = new javax.swing.JTextField();
        tglDitemukanTextField = new javax.swing.JTextField();
        jenisBarangComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        keteranganTextArea = new javax.swing.JTextArea();
        BarangInputFormPanel = new javax.swing.JPanel();
        BarangLabelPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BarangFieldPanel = new javax.swing.JPanel();
        noKtpTextField = new javax.swing.JTextField();
        noTeleponTextField = new javax.swing.JTextField();
        namaPenemuTextField = new javax.swing.JTextField();
        tambahBarangButton = new javax.swing.JButton();
        resetFormTambahButton = new javax.swing.JButton();

        messageDialog.setBackground(new java.awt.Color(51, 204, 255));
        messageDialog.setMaximumSize(new java.awt.Dimension(200, 300));
        messageDialog.setPreferredSize(new java.awt.Dimension(200, 300));
        messageDialog.setResizable(false);

        messageNotifLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        messageNotifLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout messageDialogLayout = new javax.swing.GroupLayout(messageDialog.getContentPane());
        messageDialog.getContentPane().setLayout(messageDialogLayout);
        messageDialogLayout.setHorizontalGroup(
            messageDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messageNotifLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
        );
        messageDialogLayout.setVerticalGroup(
            messageDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messageDialogLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(messageNotifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judul.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        judul.setText("Form laporan barang hilang");

        javax.swing.GroupLayout judulPanelLayout = new javax.swing.GroupLayout(judulPanel);
        judulPanel.setLayout(judulPanelLayout);
        judulPanelLayout.setHorizontalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        judulPanelLayout.setVerticalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bodyPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        inputFormPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail penemuan"));

        jLabel1.setText("Nama barang");

        jLabel2.setText("Jenis barang");

        jLabel3.setText("Tanggal ditemukan");

        jLabel4.setText("Keterangan");

        javax.swing.GroupLayout InputFormLabelPanelLayout = new javax.swing.GroupLayout(InputFormLabelPanel);
        InputFormLabelPanel.setLayout(InputFormLabelPanelLayout);
        InputFormLabelPanelLayout.setHorizontalGroup(
            InputFormLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputFormLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InputFormLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        InputFormLabelPanelLayout.setVerticalGroup(
            InputFormLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputFormLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        namaBarangTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaBarangTextFieldActionPerformed(evt);
            }
        });

        jenisBarangComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Barang Elektronik", "Tas dan sejenisnya", "Buku dan sejenisnya", "Lainnya" }));
        jenisBarangComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisBarangComboBoxActionPerformed(evt);
            }
        });

        keteranganTextArea.setColumns(20);
        keteranganTextArea.setRows(5);
        jScrollPane1.setViewportView(keteranganTextArea);

        javax.swing.GroupLayout InputFormFieldPanelLayout = new javax.swing.GroupLayout(InputFormFieldPanel);
        InputFormFieldPanel.setLayout(InputFormFieldPanelLayout);
        InputFormFieldPanelLayout.setHorizontalGroup(
            InputFormFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputFormFieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InputFormFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(InputFormFieldPanelLayout.createSequentialGroup()
                        .addGroup(InputFormFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaBarangTextField)
                            .addComponent(jenisBarangComboBox, 0, 200, Short.MAX_VALUE)
                            .addComponent(tglDitemukanTextField))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InputFormFieldPanelLayout.setVerticalGroup(
            InputFormFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputFormFieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaBarangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jenisBarangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tglDitemukanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarangInputFormPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail Penemu"));

        jLabel5.setText("Nama penemu");

        jLabel6.setText("No KTP");

        jLabel7.setText("No telepon");

        javax.swing.GroupLayout BarangLabelPanelLayout = new javax.swing.GroupLayout(BarangLabelPanel);
        BarangLabelPanel.setLayout(BarangLabelPanelLayout);
        BarangLabelPanelLayout.setHorizontalGroup(
            BarangLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarangLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        BarangLabelPanelLayout.setVerticalGroup(
            BarangLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangLabelPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        noKtpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noKtpTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarangFieldPanelLayout = new javax.swing.GroupLayout(BarangFieldPanel);
        BarangFieldPanel.setLayout(BarangFieldPanelLayout);
        BarangFieldPanelLayout.setHorizontalGroup(
            BarangFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangFieldPanelLayout.createSequentialGroup()
                .addGroup(BarangFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namaPenemuTextField)
                    .addComponent(noKtpTextField)
                    .addComponent(noTeleponTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                .addGap(0, 164, Short.MAX_VALUE))
        );
        BarangFieldPanelLayout.setVerticalGroup(
            BarangFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangFieldPanelLayout.createSequentialGroup()
                .addComponent(namaPenemuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noKtpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noTeleponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout BarangInputFormPanelLayout = new javax.swing.GroupLayout(BarangInputFormPanel);
        BarangInputFormPanel.setLayout(BarangInputFormPanelLayout);
        BarangInputFormPanelLayout.setHorizontalGroup(
            BarangInputFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangInputFormPanelLayout.createSequentialGroup()
                .addComponent(BarangLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarangFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BarangInputFormPanelLayout.setVerticalGroup(
            BarangInputFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarangFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
            .addComponent(BarangLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tambahBarangButton.setText("Submit");
        tambahBarangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBarangButtonActionPerformed(evt);
            }
        });

        resetFormTambahButton.setText("Reset form");
        resetFormTambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFormTambahButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputFormPanelLayout = new javax.swing.GroupLayout(inputFormPanel);
        inputFormPanel.setLayout(inputFormPanelLayout);
        inputFormPanelLayout.setHorizontalGroup(
            inputFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputFormPanelLayout.createSequentialGroup()
                .addComponent(InputFormLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputFormFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(BarangInputFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputFormPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tambahBarangButton)
                .addGap(18, 18, 18)
                .addComponent(resetFormTambahButton)
                .addGap(68, 68, 68))
        );
        inputFormPanelLayout.setVerticalGroup(
            inputFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputFormPanelLayout.createSequentialGroup()
                .addGroup(inputFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputFormLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputFormFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarangInputFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(inputFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahBarangButton)
                    .addComponent(resetFormTambahButton)))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judulPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(judulPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaBarangTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaBarangTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaBarangTextFieldActionPerformed

    private void noKtpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noKtpTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noKtpTextFieldActionPerformed

    private void tambahBarangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBarangButtonActionPerformed
        // TODO add your handling code here:
        String namaBarang = namaBarangTextField.getText();
        String jenisBarang = jenisBarangComboBox.getSelectedItem().toString();
        String tglDitemukan = tglDitemukanTextField.getText();
        String ket = keteranganTextArea.getText();
        String namaPenemu = namaPenemuTextField.getText();
        String noKtp = noKtpTextField.getText();
        String noTelepon = noTeleponTextField.getText();
        //System.out.println("data : "+ namaBarang + jenisBarang + tglDitemukan + ket + namaPenemu +noKtp + noTelepon);
        String message = barang.tambahBarang(namaBarang, jenisBarang, tglDitemukan, ket, namaPenemu, noKtp, noTelepon);
        
        System.out.println("message : "+message);
        messageDialog.setVisible(true);
        messageDialog.setSize(200, 200);
        messageDialog.setTitle("Notifikasi!");
        messageDialog.setLocation(250, 250);
        messageNotifLabel.setText(message);
        
    }//GEN-LAST:event_tambahBarangButtonActionPerformed

    private void resetFormTambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFormTambahButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetFormTambahButtonActionPerformed

    private void jenisBarangComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisBarangComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisBarangComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(TambahBarangMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahBarangMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahBarangMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahBarangMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahBarangMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarangFieldPanel;
    private javax.swing.JPanel BarangInputFormPanel;
    private javax.swing.JPanel BarangLabelPanel;
    private javax.swing.JPanel InputFormFieldPanel;
    private javax.swing.JPanel InputFormLabelPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel inputFormPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jenisBarangComboBox;
    private javax.swing.JLabel judul;
    private javax.swing.JPanel judulPanel;
    private javax.swing.JTextArea keteranganTextArea;
    private javax.swing.JDialog messageDialog;
    private javax.swing.JLabel messageNotifLabel;
    private javax.swing.JTextField namaBarangTextField;
    private javax.swing.JTextField namaPenemuTextField;
    private javax.swing.JTextField noKtpTextField;
    private javax.swing.JTextField noTeleponTextField;
    private javax.swing.JButton resetFormTambahButton;
    private javax.swing.JButton tambahBarangButton;
    private javax.swing.JTextField tglDitemukanTextField;
    // End of variables declaration//GEN-END:variables
}
