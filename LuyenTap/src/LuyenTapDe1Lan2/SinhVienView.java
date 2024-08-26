/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LuyenTapDe1Lan2;

import java.util.ArrayList;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hawin
 */
public class SinhVienView extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel;
    ArrayList<SinhVien> list = new ArrayList<>();
    SinhVienService qlsv = new SinhVienService();
    String filename = "SinhVien.txt";

    /**
     * Creates new form SinhVienView
     */
    public SinhVienView() {
        ArrayList<SinhVien> list = qlsv.getListSinhVien();
        initComponents();
        loadData(list);
        cuoi();
    }

    void loadData(ArrayList<SinhVien> list) {
        int STT = 1;
        defaultTableModel = (DefaultTableModel) tblSV.getModel();
        defaultTableModel.setRowCount(0);
        for (SinhVien sinhVien : list) {
            defaultTableModel.addRow(new Object[]{
                STT++,
                sinhVien.getMaSV(),
                sinhVien.getTenSV(),
                sinhVien.getGioiTinh(),
                sinhVien.getNamSinh()
            });
        }
    }

    void cuoi() {
        int i = tblSV.getRowCount() - 1;
        String ma = (String) tblSV.getValueAt(i, 1);
        txtMa.setText(ma);
        String ten = (String) tblSV.getValueAt(i, 2);
        txtTen.setText(ten);
        String gioiTinh = (String) tblSV.getValueAt(i, 3);
        if (gioiTinh.equals("Nam")) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
        Integer namSinh = (Integer) tblSV.getValueAt(i, 4);
        String nam = String.valueOf(namSinh);
        cboNamSinh.setSelectedItem(nam);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        cboNamSinh = new javax.swing.JComboBox<>();
        btnGhi = new javax.swing.JButton();
        btnMo = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel2.setText("Mã SV");

        jLabel3.setText("Giới tính");

        jLabel4.setText("Tên");

        jLabel5.setText("Năm sinh");

        buttonGroup1.add(rdNam);
        rdNam.setText("Nam");

        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");

        cboNamSinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003" }));

        btnGhi.setText("Ghi file");
        btnGhi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGhiMouseClicked(evt);
            }
        });

        btnMo.setText("Mở file");
        btnMo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMoMouseClicked(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SV", "Tên SV", "Giới tính", "Năm sinh"
            }
        ));
        tblSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnGhi)
                        .addGap(50, 50, 50)
                        .addComponent(btnMo)
                        .addGap(64, 64, 64)
                        .addComponent(btnXoa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(rdNam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdNu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTen)
                                    .addComponent(cboNamSinh, 0, 139, Short.MAX_VALUE))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(rdNam)
                    .addComponent(rdNu)
                    .addComponent(cboNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGhi)
                    .addComponent(btnMo)
                    .addComponent(btnXoa))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        // TODO add your handling code here:
        int i = tblSV.getSelectedRow();
        String ma = (String) tblSV.getValueAt(i, 1);
        txtMa.setText(ma);
        String ten = (String) tblSV.getValueAt(i, 2);
        txtTen.setText(ten);
        String gioiTinh = (String) tblSV.getValueAt(i, 3);
        if (gioiTinh.equals("Nam")) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
        Integer namSinh = (Integer) tblSV.getValueAt(i, 4);
        String nam = String.valueOf(namSinh);
        cboNamSinh.setSelectedItem(nam);

    }//GEN-LAST:event_tblSVMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        int checks = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không");
        if (checks == JOptionPane.YES_OPTION) {
            int i = tblSV.getSelectedRow();
            Boolean check = qlsv.xoa(i);
            if (check) {
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                loadData(qlsv.getListSinhVien());
            }
        }

    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnGhiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGhiMouseClicked
        // TODO add your handling code here:
        String ma = txtMa.getText();
        String ten = txtTen.getText();
        String gioiTinh = "";
        if (rdNam.isSelected()) {
            gioiTinh = "Nam";
        } else {
            gioiTinh = "Nữ";
        }
        String namSinh = cboNamSinh.getSelectedItem().toString();
        if (ma.trim().isEmpty() || ten.trim().isEmpty() || ma == "" || ten == "" || ma == null || ten == null) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return;
        }
        int checks = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không???");
        if (checks == JOptionPane.YES_OPTION) {
            Integer nam = Integer.parseInt(namSinh);
            SinhVien sv = new SinhVien(ma, ten, gioiTinh, nam);
            Boolean check = qlsv.add(sv);
            if (check) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                loadData(qlsv.getListSinhVien());
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại");

            }
        }
        int checkss = JOptionPane.showConfirmDialog(this, "Bạn có muốn ghi không??");
        if (checkss == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, qlsv.ghiFile(filename));
        } else {
            JOptionPane.showMessageDialog(this, "Ghi thất bại");

        }
    }//GEN-LAST:event_btnGhiMouseClicked

    private void btnMoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoMouseClicked
        // TODO add your handling code here:
        int checkss = JOptionPane.showConfirmDialog(this, "Bạn có muốn đọc không??");
        if (checkss == JOptionPane.YES_OPTION) {
            qlsv.getListSinhVien().clear();
            JOptionPane.showMessageDialog(this, qlsv.docFile(filename));
            loadData(qlsv.getListSinhVien());
        }

    }//GEN-LAST:event_btnMoMouseClicked

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
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVienView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnMo;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboNamSinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
