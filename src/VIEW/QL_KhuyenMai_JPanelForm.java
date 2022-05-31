/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIEW;

import MODEL.QL_KhuyenMai_212;
import SERVICE.QLKhuyenMai_Service;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class QL_KhuyenMai_JPanelForm extends javax.swing.JPanel {
    private List<QL_KhuyenMai_212> list = new ArrayList<>();
    DefaultTableModel defaultTableModel;
    QLKhuyenMai_Service kmService;
    QL_KhuyenMai_212 km;
    /**
     * Creates new form QL_KhuyenMai_JPanelForm
     */
    public QL_KhuyenMai_JPanelForm() throws SQLException {
        initComponents();
        kmService = new QLKhuyenMai_Service();
        km = new QL_KhuyenMai_212();
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tbDSKM_212.setModel(defaultTableModel);

        defaultTableModel.addColumn("MaKM");
        defaultTableModel.addColumn("TenCTKM");
        defaultTableModel.addColumn("MucGiamGia");
        defaultTableModel.addColumn("NgayBatDau");
        defaultTableModel.addColumn("NgayKetThuc");
        defaultTableModel.addColumn("MoTa");
        setTableData(kmService.getAllUsers());
    }
     private void setTableData(List<QL_KhuyenMai_212> khuyenmai) {
        for (QL_KhuyenMai_212 km : khuyenmai) {
            defaultTableModel.addRow(new Object[]{km.getMaKM_212(), km.getTenChuongTrinhKM_212(), km.getMucGiamGia_212(), km.getNgayBatDau_212(), km.getNgayKetThuc_212(), km.getMoTa_212()});

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

        jpnCTKuyenMai_212 = new javax.swing.JPanel();
        jPanel2_212 = new javax.swing.JPanel();
        jLabel1_212 = new javax.swing.JLabel();
        jLabel2_212 = new javax.swing.JLabel();
        cbxMucGiamGia_212 = new javax.swing.JComboBox<>();
        txtTenCTKM_212 = new javax.swing.JTextField();
        jLabel3_212 = new javax.swing.JLabel();
        jLabel4_212 = new javax.swing.JLabel();
        jLabel_212 = new javax.swing.JLabel();
        jScrollPane2_212 = new javax.swing.JScrollPane();
        txtAreaMoTa_212 = new javax.swing.JTextArea();
        btnLuu_212 = new javax.swing.JButton();
        btnRefresh_212 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDateChooserNBD_212 = new com.toedter.calendar.JDateChooser();
        jDateChooserNKT_212 = new com.toedter.calendar.JDateChooser();
        jpnDSKhuyenMai_212 = new javax.swing.JPanel();
        jScrollPane3_212 = new javax.swing.JScrollPane();
        tbDSKM_212 = new javax.swing.JTable();
        txtKhuyenMai_212 = new javax.swing.JTextField();
        btnTimKiem_212 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(836, 548));

        jpnCTKuyenMai_212.setBackground(new java.awt.Color(204, 255, 204));
        jpnCTKuyenMai_212.setBorder(javax.swing.BorderFactory.createTitledBorder("Chương trình khuyến mãi"));

        jPanel2_212.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1_212.setText("Tên chương trình");

        jLabel2_212.setText("Mức giảm giá (%)");

        cbxMucGiamGia_212.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25" }));
        cbxMucGiamGia_212.setPreferredSize(new java.awt.Dimension(72, 28));

        txtTenCTKM_212.setPreferredSize(new java.awt.Dimension(64, 28));

        jLabel3_212.setText("Ngày bắt đầu");

        jLabel4_212.setText("Ngày kết thúc");

        jLabel_212.setText("Mô tả");

        txtAreaMoTa_212.setColumns(20);
        txtAreaMoTa_212.setRows(5);
        jScrollPane2_212.setViewportView(txtAreaMoTa_212);

        btnLuu_212.setBackground(new java.awt.Color(153, 153, 255));
        btnLuu_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLuu_212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/luu.png"))); // NOI18N
        btnLuu_212.setText("Lưu");

        btnRefresh_212.setBackground(new java.awt.Color(153, 153, 255));
        btnRefresh_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefresh_212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/refresh.png"))); // NOI18N
        btnRefresh_212.setText("Làm mới");
        btnRefresh_212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh_212ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/rsz_1sale.png"))); // NOI18N

        jDateChooserNBD_212.setPreferredSize(new java.awt.Dimension(190, 28));

        jDateChooserNKT_212.setPreferredSize(new java.awt.Dimension(190, 28));

        javax.swing.GroupLayout jPanel2_212Layout = new javax.swing.GroupLayout(jPanel2_212);
        jPanel2_212.setLayout(jPanel2_212Layout);
        jPanel2_212Layout.setHorizontalGroup(
            jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_212Layout.createSequentialGroup()
                .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2_212Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2_212Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2_212Layout.createSequentialGroup()
                                .addComponent(btnLuu_212)
                                .addGap(74, 74, 74)
                                .addComponent(btnRefresh_212))
                            .addGroup(jPanel2_212Layout.createSequentialGroup()
                                .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1_212)
                                    .addComponent(jLabel2_212)
                                    .addComponent(jLabel_212)
                                    .addComponent(jLabel4_212)
                                    .addComponent(jLabel3_212))
                                .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2_212Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2_212, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                            .addComponent(cbxMucGiamGia_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTenCTKM_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2_212Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDateChooserNBD_212, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDateChooserNKT_212, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2_212Layout.setVerticalGroup(
            jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_212Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_212)
                    .addComponent(txtTenCTKM_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_212)
                    .addComponent(cbxMucGiamGia_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2_212Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3_212)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4_212)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_212))
                    .addGroup(jPanel2_212Layout.createSequentialGroup()
                        .addComponent(jDateChooserNBD_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserNKT_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2_212, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu_212)
                    .addComponent(btnRefresh_212))
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jpnCTKuyenMai_212Layout = new javax.swing.GroupLayout(jpnCTKuyenMai_212);
        jpnCTKuyenMai_212.setLayout(jpnCTKuyenMai_212Layout);
        jpnCTKuyenMai_212Layout.setHorizontalGroup(
            jpnCTKuyenMai_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpnCTKuyenMai_212Layout.setVerticalGroup(
            jpnCTKuyenMai_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCTKuyenMai_212Layout.createSequentialGroup()
                .addComponent(jPanel2_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnDSKhuyenMai_212.setBackground(new java.awt.Color(204, 255, 204));
        jpnDSKhuyenMai_212.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách khuyến mãi"));

        tbDSKM_212.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3_212.setViewportView(tbDSKM_212);

        btnTimKiem_212.setBackground(new java.awt.Color(153, 153, 255));
        btnTimKiem_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimKiem_212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/search.png"))); // NOI18N
        btnTimKiem_212.setText("Tìm kiếm");

        javax.swing.GroupLayout jpnDSKhuyenMai_212Layout = new javax.swing.GroupLayout(jpnDSKhuyenMai_212);
        jpnDSKhuyenMai_212.setLayout(jpnDSKhuyenMai_212Layout);
        jpnDSKhuyenMai_212Layout.setHorizontalGroup(
            jpnDSKhuyenMai_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDSKhuyenMai_212Layout.createSequentialGroup()
                .addGroup(jpnDSKhuyenMai_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnDSKhuyenMai_212Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3_212, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                    .addGroup(jpnDSKhuyenMai_212Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(txtKhuyenMai_212, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimKiem_212)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnDSKhuyenMai_212Layout.setVerticalGroup(
            jpnDSKhuyenMai_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDSKhuyenMai_212Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jpnDSKhuyenMai_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKhuyenMai_212, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem_212, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3_212, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnCTKuyenMai_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDSKhuyenMai_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnDSKhuyenMai_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnCTKuyenMai_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefresh_212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh_212ActionPerformed
        // TODO add your handling code here:
        txtTenCTKM_212.setText("");
        jDateChooserNBD_212.setCalendar(null);
        jDateChooserNKT_212.setCalendar(null);
        txtAreaMoTa_212.setText("");        
        
    }//GEN-LAST:event_btnRefresh_212ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu_212;
    private javax.swing.JButton btnRefresh_212;
    private javax.swing.JButton btnTimKiem_212;
    private javax.swing.JComboBox<String> cbxMucGiamGia_212;
    private com.toedter.calendar.JDateChooser jDateChooserNBD_212;
    private com.toedter.calendar.JDateChooser jDateChooserNKT_212;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_212;
    private javax.swing.JLabel jLabel2_212;
    private javax.swing.JLabel jLabel3_212;
    private javax.swing.JLabel jLabel4_212;
    private javax.swing.JLabel jLabel_212;
    private javax.swing.JPanel jPanel2_212;
    private javax.swing.JScrollPane jScrollPane2_212;
    private javax.swing.JScrollPane jScrollPane3_212;
    private javax.swing.JPanel jpnCTKuyenMai_212;
    private javax.swing.JPanel jpnDSKhuyenMai_212;
    private javax.swing.JTable tbDSKM_212;
    private javax.swing.JTextArea txtAreaMoTa_212;
    private javax.swing.JTextField txtKhuyenMai_212;
    private javax.swing.JTextField txtTenCTKM_212;
    // End of variables declaration//GEN-END:variables
}
