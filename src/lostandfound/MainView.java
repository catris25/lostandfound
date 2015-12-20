package lostandfound;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author LIA
 */
public class MainView extends javax.swing.JFrame {

    BarangController bc; 
    
    public MainView(boolean isAdmin) {
        initComponents();
        if(!isAdmin){
            adminMenuPanel.setVisible(false);
        }else{
            UserController user = new UserController();
            String username = user.user;
            adminMenuPanel.setVisible(true);
            welcomeText.setText("Selamat datang, admin "+username+"!");
        }
        runMethods();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //close confirmation dialog
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we){
             if(JOptionPane.showConfirmDialog(null, 
                     "Anda yakin akan keluar dari aplikasi ini?", "Konfirmasi",
                     JOptionPane.YES_NO_OPTION,
                     JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                System.exit(0);
             }   
            }
        });
    }
    
    private void lihatBelumDiambil(){
        ResultSet dataBarang = bc.lihatBarangBelumDiambil();
        barangHilangTable.setEnabled(false);
        
        barangHilangTable.setModel(DbUtils.resultSetToTableModel(dataBarang));
        
        barangHilangTable.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("ID");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(30);
        barangHilangTable.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("Nama Barang");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(160);
        barangHilangTable.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("Jenis Barang");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("Tgl ditemukan");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(4).setHeaderValue("Keterangan");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(5).setHeaderValue("Nama penemu");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(6).setHeaderValue("No KTP");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(7).setHeaderValue("Telepon");

    }
    
    private void lihatSudahDiambil(){
        bc = new BarangController();
        bc.start();
        ResultSet dataBarang = bc.lihatBarangSudahDiambil();
        barangHilangTable.setEnabled(false);
        
        barangHilangTable.setModel(DbUtils.resultSetToTableModel(dataBarang));
        
        barangHilangTable.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("ID");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(30);
        barangHilangTable.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("Nama Barang");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("Jenis Barang");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("Tgl ditemukan");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(4).setHeaderValue("Keterangan");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(5).setHeaderValue("Nama penemu");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(6).setHeaderValue("No KTP Penemu");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(7).setHeaderValue("Telepon Penemu");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(8).setHeaderValue("Pemilik");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(9).setHeaderValue("No KTP Pemilik");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(10).setHeaderValue("Tgl mengambil");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(11).setHeaderValue("Telepon Pemilik");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(12).setHeaderValue("Alamat Pemilik");
    }
    
    public void runMethods(){
        
        this.setLocationRelativeTo(null);
        bc = new BarangController();
        bc.start();
        lihatBelumDiambil();        
        //barangHilangTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        TableColumnModel tcm = barangHilangTable.getColumnModel();
        TableColumn tc = tcm.getColumn(1);
        tc.setWidth(tc.getWidth()+25);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulPanel = new javax.swing.JPanel();
        judulLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        barangHilangTable = new javax.swing.JTable();
        topMenuPanel = new javax.swing.JPanel();
        cariBarangPanel = new javax.swing.JPanel();
        keywordBarangText = new javax.swing.JTextField();
        cariBarangLabel = new javax.swing.JLabel();
        kategoriBarangBox = new javax.swing.JComboBox();
        cariBarangButton = new javax.swing.JButton();
        adminMenuPanel = new javax.swing.JPanel();
        lihatBarangButton = new javax.swing.JButton();
        tambahBarangButton = new javax.swing.JButton();
        ambilBarangButton = new javax.swing.JButton();
        judulMenuPanelLabel = new javax.swing.JLabel();
        lihatBarangComboBox = new javax.swing.JComboBox();
        welcomeText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lost and Found");
        setBackground(new java.awt.Color(255, 255, 255));

        judulPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        judulPanel.setForeground(new java.awt.Color(204, 255, 153));

        judulLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        judulLabel.setForeground(new java.awt.Color(0, 153, 153));
        judulLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulLabel.setLabelFor(this);
        judulLabel.setText("Sistem Informasi -Lost and Found-");
        judulLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout judulPanelLayout = new javax.swing.GroupLayout(judulPanel);
        judulPanel.setLayout(judulPanelLayout);
        judulPanelLayout.setHorizontalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, judulPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        judulPanelLayout.setVerticalGroup(
            judulPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barangHilangTable.setAutoCreateRowSorter(true);
        barangHilangTable.setBackground(new java.awt.Color(204, 204, 255));
        barangHilangTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barangHilangTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(barangHilangTable);

        cariBarangLabel.setText("Cari Barang");

        kategoriBarangBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Barang elektronik", "Makanan/minuman", "Perhiasan/aksesoris", "Buku/ATK", "Pakaian/garmen", "Tas/dompet", "Dokumen", "Kunci", "Lainnya" }));
        kategoriBarangBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriBarangBoxActionPerformed(evt);
            }
        });

        cariBarangButton.setText("Cari");
        cariBarangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariBarangButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cariBarangPanelLayout = new javax.swing.GroupLayout(cariBarangPanel);
        cariBarangPanel.setLayout(cariBarangPanelLayout);
        cariBarangPanelLayout.setHorizontalGroup(
            cariBarangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cariBarangPanelLayout.createSequentialGroup()
                .addGroup(cariBarangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cariBarangPanelLayout.createSequentialGroup()
                        .addComponent(keywordBarangText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kategoriBarangBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cariBarangButton))
                    .addComponent(cariBarangLabel))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        cariBarangPanelLayout.setVerticalGroup(
            cariBarangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cariBarangPanelLayout.createSequentialGroup()
                .addComponent(cariBarangLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cariBarangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keywordBarangText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kategoriBarangBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cariBarangButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        adminMenuPanel.setPreferredSize(new java.awt.Dimension(550, 55));

        lihatBarangButton.setText("Lihat");
        lihatBarangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatBarangButtonActionPerformed(evt);
            }
        });

        tambahBarangButton.setText("Tambah barang hilang");
        tambahBarangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBarangButtonActionPerformed(evt);
            }
        });

        ambilBarangButton.setText("Pengambilan barang");
        ambilBarangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambilBarangButtonActionPerformed(evt);
            }
        });

        judulMenuPanelLabel.setText("Admin Menu ");

        lihatBarangComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Barang yang belum diambil", "Barang yang sudah diambil" }));
        lihatBarangComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatBarangComboBoxActionPerformed(evt);
            }
        });

        welcomeText.setBackground(new java.awt.Color(255, 255, 255));
        welcomeText.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(255, 51, 51));
        welcomeText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        welcomeText.setText("welcome");

        javax.swing.GroupLayout adminMenuPanelLayout = new javax.swing.GroupLayout(adminMenuPanel);
        adminMenuPanel.setLayout(adminMenuPanelLayout);
        adminMenuPanelLayout.setHorizontalGroup(
            adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminMenuPanelLayout.createSequentialGroup()
                        .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lihatBarangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lihatBarangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ambilBarangButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tambahBarangButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(adminMenuPanelLayout.createSequentialGroup()
                        .addComponent(judulMenuPanelLabel)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        adminMenuPanelLayout.setVerticalGroup(
            adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuPanelLayout.createSequentialGroup()
                .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulMenuPanelLabel)
                    .addComponent(welcomeText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lihatBarangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahBarangButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lihatBarangButton)
                    .addComponent(ambilBarangButton))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout topMenuPanelLayout = new javax.swing.GroupLayout(topMenuPanel);
        topMenuPanel.setLayout(topMenuPanelLayout);
        topMenuPanelLayout.setHorizontalGroup(
            topMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topMenuPanelLayout.createSequentialGroup()
                .addComponent(cariBarangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(97, 97, 97)
                .addComponent(adminMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        topMenuPanelLayout.setVerticalGroup(
            topMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topMenuPanelLayout.createSequentialGroup()
                .addComponent(cariBarangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(adminMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(judulPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(topMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lihatBarangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatBarangButtonActionPerformed
        int lihatMenu = lihatBarangComboBox.getSelectedIndex();
        if(lihatMenu==0){
            lihatBelumDiambil();
        }else if(lihatMenu==1){
            lihatSudahDiambil();
        }
        
        
    }//GEN-LAST:event_lihatBarangButtonActionPerformed

    private void cariBarangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariBarangButtonActionPerformed
        String keyword = keywordBarangText.getText();
        String kategori = kategoriBarangBox.getSelectedItem().toString();
        
        System.out.println("keyword "+keyword+"/ncategory"+kategori);
        bc = new BarangController();
        ResultSet hasilPencarian = bc.cariBarangHilang(keyword, kategori);
        barangHilangTable.setModel(DbUtils.resultSetToTableModel(hasilPencarian));
        
        barangHilangTable.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("ID");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("Nama Barang");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("Jenis Barang");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("Tgl ditemukan");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(4).setHeaderValue("Keterangan");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(5).setHeaderValue("Nama penemu");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(6).setHeaderValue("No KTP");
        barangHilangTable.getTableHeader().getColumnModel().getColumn(7).setHeaderValue("Telepon");
        
    }//GEN-LAST:event_cariBarangButtonActionPerformed

    private void kategoriBarangBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriBarangBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategoriBarangBoxActionPerformed

    private void tambahBarangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBarangButtonActionPerformed
        // display the form to input barang

        TambahBarangView tambah = new TambahBarangView();
        tambah.setVisible(true);
        
    }//GEN-LAST:event_tambahBarangButtonActionPerformed

    private void ambilBarangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambilBarangButtonActionPerformed
       
        //this.setEnabled(false);
        CariBarangByIDView cari = new CariBarangByIDView();
        cari.setVisible(true);
    }//GEN-LAST:event_ambilBarangButtonActionPerformed

    private void lihatBarangComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatBarangComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lihatBarangComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminMenuPanel;
    private javax.swing.JButton ambilBarangButton;
    private javax.swing.JTable barangHilangTable;
    private javax.swing.JButton cariBarangButton;
    private javax.swing.JLabel cariBarangLabel;
    private javax.swing.JPanel cariBarangPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel judulMenuPanelLabel;
    private javax.swing.JPanel judulPanel;
    private javax.swing.JComboBox kategoriBarangBox;
    private javax.swing.JTextField keywordBarangText;
    private javax.swing.JButton lihatBarangButton;
    private javax.swing.JComboBox lihatBarangComboBox;
    private javax.swing.JButton tambahBarangButton;
    private javax.swing.JPanel topMenuPanel;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}