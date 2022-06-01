/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIEW;

import MODEL.QL_KhachHang_212;
import SERVICE.QLKhachHang_Service;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class QL_KhachHang_JPanelForm extends javax.swing.JPanel {

    /**
     * Creates new form QL_KhachHang_JPanelForm
     */
    private List<QL_KhachHang_212> list = new ArrayList<>();
    DefaultTableModel defaultTableModel;
    QLKhachHang_Service khService;
    QL_KhachHang_212 kh;

    public QL_KhachHang_JPanelForm() throws SQLException {
        initComponents();
        khService = new QLKhachHang_Service();
        kh = new QL_KhachHang_212();

        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tblKhachHang_212.setModel(defaultTableModel);

        defaultTableModel.addColumn("MaKH");
        defaultTableModel.addColumn("HoTen");
        defaultTableModel.addColumn("GioiTinh");
        defaultTableModel.addColumn("SoDienThoai");
        defaultTableModel.addColumn("DiaChi");
        setTableData(khService.getAllUsers());

    }

    private void setTableData(List<QL_KhachHang_212> khachhang) {
        for (QL_KhachHang_212 kh : khachhang) {
            defaultTableModel.addRow(new Object[]{kh.getMaKH_212(), kh.getHoTen_212(), kh.getGioiTinh_212(), kh.getSdt_212(), kh.getDiachi_212()});

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1_212 = new javax.swing.JPanel();
        jPanel_ThietLapTTKH_212 = new javax.swing.JPanel();
        jPanel2_212 = new javax.swing.JPanel();
        lblTKH_212 = new javax.swing.JLabel();
        lblGT_212 = new javax.swing.JLabel();
        lblSDT_212 = new javax.swing.JLabel();
        lblDC_212 = new javax.swing.JLabel();
        txtTenKH_212 = new javax.swing.JTextField();
        txtSDT_212 = new javax.swing.JTextField();
        rdobtnNam_212 = new javax.swing.JRadioButton();
        rdobtnNu_212 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDiaChi_212 = new javax.swing.JTextArea();
        txtMaKH_212 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3_212 = new javax.swing.JPanel();
        btnAdd_212 = new javax.swing.JButton();
        btnSua_212 = new javax.swing.JButton();
        btnXoa_212 = new javax.swing.JButton();
        btnLamMoi_212 = new javax.swing.JButton();
        jPanel_ThongTinKH_212 = new javax.swing.JPanel();
        jScrollPane2_212 = new javax.swing.JScrollPane();
        tblKhachHang_212 = new javax.swing.JTable();
        txtSearch_212 = new javax.swing.JTextField();
        btnSearch_212 = new javax.swing.JButton();
        jLabel5_212 = new javax.swing.JLabel();
        cbbLoc_212 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(836, 548));

        jPanel1_212.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1_212.setPreferredSize(new java.awt.Dimension(836, 548));

        jPanel_ThietLapTTKH_212.setBackground(new java.awt.Color(204, 255, 204));
        jPanel_ThietLapTTKH_212.setBorder(javax.swing.BorderFactory.createTitledBorder("Thiết lập thông tin khách hàng"));
        jPanel_ThietLapTTKH_212.setPreferredSize(new java.awt.Dimension(800, 235));

        jPanel2_212.setBackground(new java.awt.Color(204, 255, 204));

        lblTKH_212.setText("Tên khách hàng");

        lblGT_212.setText("Giới tính");

        lblSDT_212.setText("Số điện thoại");

        lblDC_212.setText("Địa chỉ");

        txtTenKH_212.setPreferredSize(new java.awt.Dimension(200, 28));

        txtSDT_212.setPreferredSize(new java.awt.Dimension(200, 28));

        buttonGroup1.add(rdobtnNam_212);
        rdobtnNam_212.setText("Nam");

        buttonGroup1.add(rdobtnNu_212);
        rdobtnNu_212.setText("Nữ");

        txtAreaDiaChi_212.setColumns(20);
        txtAreaDiaChi_212.setRows(5);
        jScrollPane1.setViewportView(txtAreaDiaChi_212);

        txtMaKH_212.setPreferredSize(new java.awt.Dimension(200, 28));

        jLabel1.setText("Mã KH");

        javax.swing.GroupLayout jPanel2_212Layout = new javax.swing.GroupLayout(jPanel2_212);
        jPanel2_212.setLayout(jPanel2_212Layout);
        jPanel2_212Layout.setHorizontalGroup(
            jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_212Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGT_212)
                    .addComponent(jLabel1)
                    .addComponent(lblTKH_212))
                .addGap(12, 12, 12)
                .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2_212Layout.createSequentialGroup()
                        .addComponent(rdobtnNam_212)
                        .addGap(18, 18, 18)
                        .addComponent(rdobtnNu_212)
                        .addGap(144, 144, 144)
                        .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSDT_212)
                            .addComponent(lblDC_212)))
                    .addComponent(txtMaKH_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKH_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSDT_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2_212Layout.setVerticalGroup(
            jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_212Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSDT_212)
                    .addComponent(txtSDT_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaKH_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2_212Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel2_212Layout.createSequentialGroup()
                        .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdobtnNam_212)
                            .addComponent(rdobtnNu_212)
                            .addComponent(lblGT_212)
                            .addComponent(lblDC_212))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTKH_212)
                            .addComponent(txtTenKH_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel3_212.setBackground(new java.awt.Color(204, 255, 204));

        btnAdd_212.setBackground(new java.awt.Color(153, 153, 255));
        btnAdd_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd_212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/plus.png"))); // NOI18N
        btnAdd_212.setText("Thêm");
        btnAdd_212.setPreferredSize(new java.awt.Dimension(112, 38));
        btnAdd_212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_212ActionPerformed(evt);
            }
        });

        btnSua_212.setBackground(new java.awt.Color(153, 153, 255));
        btnSua_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua_212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/sua.png"))); // NOI18N
        btnSua_212.setText("Sửa");
        btnSua_212.setPreferredSize(new java.awt.Dimension(112, 38));
        btnSua_212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_212ActionPerformed(evt);
            }
        });

        btnXoa_212.setBackground(new java.awt.Color(153, 153, 255));
        btnXoa_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa_212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/xoa.png"))); // NOI18N
        btnXoa_212.setText("Xóa");
        btnXoa_212.setPreferredSize(new java.awt.Dimension(112, 38));
        btnXoa_212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_212ActionPerformed(evt);
            }
        });

        btnLamMoi_212.setBackground(new java.awt.Color(153, 153, 255));
        btnLamMoi_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoi_212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/refresh.png"))); // NOI18N
        btnLamMoi_212.setText("Làm mới");
        btnLamMoi_212.setPreferredSize(new java.awt.Dimension(112, 38));
        btnLamMoi_212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoi_212ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3_212Layout = new javax.swing.GroupLayout(jPanel3_212);
        jPanel3_212.setLayout(jPanel3_212Layout);
        jPanel3_212Layout.setHorizontalGroup(
            jPanel3_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_212Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLamMoi_212, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btnXoa_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3_212Layout.setVerticalGroup(
            jPanel3_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLamMoi_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_ThietLapTTKH_212Layout = new javax.swing.GroupLayout(jPanel_ThietLapTTKH_212);
        jPanel_ThietLapTTKH_212.setLayout(jPanel_ThietLapTTKH_212Layout);
        jPanel_ThietLapTTKH_212Layout.setHorizontalGroup(
            jPanel_ThietLapTTKH_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ThietLapTTKH_212Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel_ThietLapTTKH_212Layout.setVerticalGroup(
            jPanel_ThietLapTTKH_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ThietLapTTKH_212Layout.createSequentialGroup()
                .addGroup(jPanel_ThietLapTTKH_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel_ThongTinKH_212.setBackground(new java.awt.Color(204, 255, 204));
        jPanel_ThongTinKH_212.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin khách hàng"));
        jPanel_ThongTinKH_212.setPreferredSize(new java.awt.Dimension(665, 300));

        tblKhachHang_212.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKhachHang_212.setPreferredSize(new java.awt.Dimension(300, 250));
        tblKhachHang_212.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHang_212MouseClicked(evt);
            }
        });
        jScrollPane2_212.setViewportView(tblKhachHang_212);

        txtSearch_212.setPreferredSize(new java.awt.Dimension(71, 28));

        btnSearch_212.setBackground(new java.awt.Color(153, 153, 255));
        btnSearch_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch_212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/search.png"))); // NOI18N
        btnSearch_212.setText("Tìm kiếm");
        btnSearch_212.setPreferredSize(new java.awt.Dimension(112, 28));

        jLabel5_212.setText("Lọc theo giới tính");

        cbbLoc_212.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        javax.swing.GroupLayout jPanel_ThongTinKH_212Layout = new javax.swing.GroupLayout(jPanel_ThongTinKH_212);
        jPanel_ThongTinKH_212.setLayout(jPanel_ThongTinKH_212Layout);
        jPanel_ThongTinKH_212Layout.setHorizontalGroup(
            jPanel_ThongTinKH_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ThongTinKH_212Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2_212, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel_ThongTinKH_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5_212)
                    .addGroup(jPanel_ThongTinKH_212Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cbbLoc_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
            .addGroup(jPanel_ThongTinKH_212Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(txtSearch_212, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_ThongTinKH_212Layout.setVerticalGroup(
            jPanel_ThongTinKH_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ThongTinKH_212Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ThongTinKH_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_ThongTinKH_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ThongTinKH_212Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5_212)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbLoc_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ThongTinKH_212Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jScrollPane2_212, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1_212Layout = new javax.swing.GroupLayout(jPanel1_212);
        jPanel1_212.setLayout(jPanel1_212Layout);
        jPanel1_212Layout.setHorizontalGroup(
            jPanel1_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_212Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_ThongTinKH_212, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                    .addComponent(jPanel_ThietLapTTKH_212, javax.swing.GroupLayout.PREFERRED_SIZE, 824, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1_212Layout.setVerticalGroup(
            jPanel1_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_212Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_ThietLapTTKH_212, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_ThongTinKH_212, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1_212, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoa_212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_212ActionPerformed
        // TODO add your handling code here:
        int row = tblKhachHang_212.getSelectedRow();
        if (row == -1)//nguoi dung chua chon hang nao
        {
            JOptionPane.showMessageDialog(QL_KhachHang_JPanelForm.this, "Vui lòng chọn khách hàng cần xóa trước", "Lỗi", JOptionPane.ERROR_MESSAGE);

        } else {
            int confirm = JOptionPane.showConfirmDialog(QL_KhachHang_JPanelForm.this, "Bạn chắc chắn muốn xóa không?");
            if (confirm == JOptionPane.YES_OPTION) {

                try {
                    int khId = Integer.valueOf(String.valueOf(tblKhachHang_212.getValueAt(row, 0)));

                    khService.deleteKH(khId);

                    defaultTableModel.setRowCount(0);//de xoa het du lieu hien tai
                    setTableData(khService.getAllUsers());
                    JOptionPane.showMessageDialog(this, "Xóa thành công!");
                } catch (SQLException ex) {
                    Logger.getLogger(QL_KhachHang_JPanelForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    }//GEN-LAST:event_btnXoa_212ActionPerformed

    private void tblKhachHang_212MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHang_212MouseClicked
        // TODO add your handling code here:
        int i = tblKhachHang_212.getSelectedRow();
        txtTenKH_212.setText(tblKhachHang_212.getValueAt(i,1).toString());
        String gender = tblKhachHang_212.getValueAt(i,2).toString();
        if (gender.equalsIgnoreCase("Nam")){
            rdobtnNam_212.setSelected(true);
            rdobtnNu_212.setSelected(false);
        }
        else{
            rdobtnNu_212.setSelected(true);
            rdobtnNam_212.setSelected(false);
        }
        txtSDT_212.setText(tblKhachHang_212.getValueAt(i,3).toString());
        txtAreaDiaChi_212.setText(tblKhachHang_212.getValueAt(i,4).toString());

    }//GEN-LAST:event_tblKhachHang_212MouseClicked

    private void btnSua_212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_212ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnSua_212ActionPerformed
    
    private void btnAdd_212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_212ActionPerformed
        // TODO add your handling code here:
        if (txtTenKH_212.getText().equals("") || txtSDT_212.getText().equals("") || txtAreaDiaChi_212.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!");
        } else {
            try {
                kh.setHoTen_212(txtTenKH_212.getText());
                kh.setSdt_212(txtSDT_212.getText());
                kh.setDiachi_212(txtAreaDiaChi_212.getText());
                String gt = "Nam";
                if (rdobtnNam_212.isSelected()) {
                    gt = "Nam";// lua chon 1 trong 2
                }
                if (rdobtnNu_212.isSelected()) {
                    gt = "Nữ";
                }
                kh.setGioiTinh_212(gt);
               
                khService.addKH(kh);
                defaultTableModel.setRowCount(0);
                setTableData(khService.getAllUsers());
                JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công!");
            } catch (SQLException ex) {
                Logger.getLogger(QL_KhachHang_JPanelForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }
    }//GEN-LAST:event_btnAdd_212ActionPerformed

    private void btnLamMoi_212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoi_212ActionPerformed
        // TODO add your handling code here:
        txtTenKH_212.setText("");
        txtSDT_212.setText("");
        txtAreaDiaChi_212.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnLamMoi_212ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd_212;
    private javax.swing.JButton btnLamMoi_212;
    private javax.swing.JButton btnSearch_212;
    private javax.swing.JButton btnSua_212;
    private javax.swing.JButton btnXoa_212;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbLoc_212;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5_212;
    private javax.swing.JPanel jPanel1_212;
    private javax.swing.JPanel jPanel2_212;
    private javax.swing.JPanel jPanel3_212;
    private javax.swing.JPanel jPanel_ThietLapTTKH_212;
    private javax.swing.JPanel jPanel_ThongTinKH_212;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2_212;
    private javax.swing.JLabel lblDC_212;
    private javax.swing.JLabel lblGT_212;
    private javax.swing.JLabel lblSDT_212;
    private javax.swing.JLabel lblTKH_212;
    private javax.swing.JRadioButton rdobtnNam_212;
    private javax.swing.JRadioButton rdobtnNu_212;
    private javax.swing.JTable tblKhachHang_212;
    private javax.swing.JTextArea txtAreaDiaChi_212;
    private javax.swing.JTextField txtMaKH_212;
    private javax.swing.JTextField txtSDT_212;
    private javax.swing.JTextField txtSearch_212;
    private javax.swing.JTextField txtTenKH_212;
    // End of variables declaration//GEN-END:variables
}
