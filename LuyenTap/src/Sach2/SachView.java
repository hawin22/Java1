/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sach2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hawin
 */
public class SachView extends javax.swing.JFrame {
    ArrayList<Sach> list = new ArrayList<>();
    DefaultTableModel defaultTableModel;
    SachService qlSach = new SachService();
    String fileName = "Sach.txt";
    /**
     * Creates new form SachView
     */
    public SachView() {
        ArrayList<Sach> list = qlSach.getListSach();
        initComponents();
        loadData(list);
        cuoi();
    }
void loadData(ArrayList<Sach> list){
    int STT = 1;
    defaultTableModel = (DefaultTableModel) tblSach.getModel();
    defaultTableModel.setRowCount(0);
    for (Sach sach : list) {
        defaultTableModel.addRow(new Object[]{
            STT++,
            sach.getTen(),
            sach.getTheLoai(),
            sach.getGiaSach()
        });
    }
}
void cuoi(){
    int i = tblSach.getRowCount() - 1;
        String ten = (String) tblSach.getValueAt(i, 1);
        txtTen.setText(ten);
        String theLoai = (String) tblSach.getValueAt(i, 2);
        cboTheLoai.setSelectedItem(theLoai);
        Integer gia = (Integer) tblSach.getValueAt(i, 3);
        String giaSach = String.valueOf(gia);
        txtGia.setText(giaSach);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        cboTheLoai = new javax.swing.JComboBox<>();
        btnMo = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÝ SÁCH");

        jLabel2.setText("Tên");

        jLabel3.setText("Thể loại");

        jLabel4.setText("Giá");

        cboTheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiểu thuyết", "Trinh thám" }));

        btnMo.setText("Mở");
        btnMo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMoMouseClicked(evt);
            }
        });

        btnGhi.setText("Ghi file");
        btnGhi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGhiMouseClicked(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Tên sách", "Thể loại", "Giá"
            }
        ));
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboTheLoai, javax.swing.GroupLayout.Alignment.TRAILING, 0, 158, Short.MAX_VALUE)
                            .addComponent(txtTen, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGia))))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMo)
                    .addComponent(btnGhi)
                    .addComponent(btnXoa))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnGhi)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnXoa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        // TODO add your handling code here:
        int i = tblSach.getSelectedRow();
        String ten = (String) tblSach.getValueAt(i, 1);
        txtTen.setText(ten);
        String theLoai = (String) tblSach.getValueAt(i, 2);
        cboTheLoai.setSelectedItem(theLoai);
        Integer gia = (Integer) tblSach.getValueAt(i, 3);
        String giaSach = String.valueOf(gia);
        txtGia.setText(giaSach);
    }//GEN-LAST:event_tblSachMouseClicked

    private void btnMoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoMouseClicked
        // TODO add your handling code here:
        qlSach.getListSach().clear();
        int checkss = JOptionPane.showConfirmDialog(this, "Bạn có muốn đọc không");
        if (checkss == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(this, qlSach.docFile(fileName));
        loadData(qlSach.getListSach());
        }
        else{
        JOptionPane.showMessageDialog(this, "Đọc thất bại"); 
        }
    }//GEN-LAST:event_btnMoMouseClicked

    private void btnGhiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGhiMouseClicked
        // TODO add your handling code here:
        String ten = txtTen.getText();
        String theLoai = cboTheLoai.getSelectedItem().toString();
        try {
            String gia = txtGia.getText();
            if (ten.trim().isEmpty() || gia.trim().isEmpty() || ten == "" || gia == "" || ten == null || gia == null) {
               JOptionPane.showMessageDialog(this, "Không được để trống");
               return;
            }
            Integer giaSach = Integer.parseInt(gia);
            if (giaSach < 50) {
               JOptionPane.showMessageDialog(this, "Giá phải lớn 50");
               return;
            }
            int check = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không");
            if (check == JOptionPane.YES_OPTION) {
                Sach s = new Sach(ten, theLoai, giaSach);
                Boolean checks = qlSach.add(s);
                if (checks) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                    loadData(qlSach.getListSach());
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Thêm thất bại");
              
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Giá phải là 1 số");
        }
        int checkss = JOptionPane.showConfirmDialog(this, "Bạn có muốn ghi không");
        if (checkss == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, qlSach.ghiFile(fileName));
        }
    }//GEN-LAST:event_btnGhiMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        int i = tblSach.getSelectedRow();
         int checkss = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không");
        if (checkss == JOptionPane.YES_OPTION){
        Boolean check = qlSach.xoa(i);
        if (check) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadData(qlSach.getListSach());
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
            
        }
    }//GEN-LAST:event_btnXoaMouseClicked

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
            java.util.logging.Logger.getLogger(SachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SachView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnMo;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboTheLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
