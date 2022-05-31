/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIEW;

/**
 *
 * @author DELL
 */

import MODEL.QL_NhanVien_239;
import SERVICE.QLNhanVien_Service;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class QL_NhanVien_JPanelForm extends javax.swing.JPanel {

    private List<QL_NhanVien_239> list = new ArrayList<>();
    DefaultTableModel defaultTableModel;
    QLNhanVien_Service nvService;
    QL_NhanVien_239 nv;

    public QL_NhanVien_JPanelForm() throws SQLException {
        initComponents();
        nvService = new QLNhanVien_Service();
        nv = new QL_NhanVien_239();

        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tblNhanVien_239.setModel(defaultTableModel);

        defaultTableModel.addColumn("MaKH");
        defaultTableModel.addColumn("HoTen");
        defaultTableModel.addColumn("GioiTinh");
        defaultTableModel.addColumn("SoDienThoai");
        defaultTableModel.addColumn("DiaChi");
        defaultTableModel.addColumn("VaiTro");
        defaultTableModel.addColumn("TrangThai");
        defaultTableModel.addColumn("Email");
        defaultTableModel.addColumn("NgaySinh");
        setTableData(nvService.getAllUsers());     
       

    }

    private void setTableData(List<QL_NhanVien_239> nhanvien) {
        for (QL_NhanVien_239 nv : nhanvien) {
            defaultTableModel.addRow(new Object[]{nv.getMaNV_239(), nv.getTenNV_239(), nv.getGioiTinh_239(), nv.getdienthoai_239(), nv.getdiaChi_239(),nv.getVaiTro_239(),nv.getTrangThai_239(),nv.getemail_239(),nv.getNgaySinh_239()});

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JPanelTTNV = new javax.swing.JPanel();
        labelMa_239 = new javax.swing.JLabel();
        jLabel2_239 = new javax.swing.JLabel();
        jLabel3_239 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        maNV_239 = new javax.swing.JTextField();
        tenNV_239 = new javax.swing.JTextField();
        diaChi_239 = new javax.swing.JTextField();
        cbxVaitro_239 = new javax.swing.JComboBox<>();
        labelDienthoai_239 = new javax.swing.JLabel();
        labelNgaysinh_239 = new javax.swing.JLabel();
        label_Email_239 = new javax.swing.JLabel();
        label_Gioitinh_239 = new javax.swing.JLabel();
        label_Trangthai_239 = new javax.swing.JLabel();
        jRadioButton1_239 = new javax.swing.JRadioButton();
        jRadioButton2_239 = new javax.swing.JRadioButton();
        jRadioButton3_239 = new javax.swing.JRadioButton();
        jRadioButton4_239 = new javax.swing.JRadioButton();
        email_239 = new javax.swing.JTextField();
        ngaysinh_239 = new javax.swing.JTextField();
        dienthoai_239 = new javax.swing.JTextField();
        btThem_239 = new javax.swing.JButton();
        btSua_239 = new javax.swing.JButton();
        btLammoi_239 = new javax.swing.JButton();
        btLuu_239 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12_239 = new javax.swing.JLabel();
        jComboBox4_239 = new javax.swing.JComboBox<>();
        jLabel10_239 = new javax.swing.JLabel();
        jComboBox2_239 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien_239 = new javax.swing.JTable();

        jRadioButton1.setText("jRadioButton1");

        setBackground(new java.awt.Color(204, 255, 204));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        JPanelTTNV.setBackground(new java.awt.Color(204, 255, 204));
        JPanelTTNV.setBorder(javax.swing.BorderFactory.createTitledBorder("Thiết lập thông tin nhân viên"));
        JPanelTTNV.setLayout(new java.awt.GridBagLayout());

        labelMa_239.setText("Mã NV ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 53, 0, 0);
        JPanelTTNV.add(labelMa_239, gridBagConstraints);

        jLabel2_239.setText("Tên NV");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 53, 0, 0);
        JPanelTTNV.add(jLabel2_239, gridBagConstraints);

        jLabel3_239.setText("Vai trò");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 53, 0, 0);
        JPanelTTNV.add(jLabel3_239, gridBagConstraints);

        jLabel4.setText("Địa chỉ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 53, 0, 0);
        JPanelTTNV.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 180;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 53, 0, 0);
        JPanelTTNV.add(maNV_239, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 180;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 53, 0, 0);
        JPanelTTNV.add(tenNV_239, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 180;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 53, 0, 0);
        JPanelTTNV.add(diaChi_239, gridBagConstraints);

        cbxVaitro_239.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên kho", "Nhân viên bán hàng", "Nhân viên giữ xe" }));
        cbxVaitro_239.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVaitro_239ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 53, 0, 0);
        JPanelTTNV.add(cbxVaitro_239, gridBagConstraints);

        labelDienthoai_239.setText("Điện thoại");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 51, 0, 0);
        JPanelTTNV.add(labelDienthoai_239, gridBagConstraints);

        labelNgaysinh_239.setText("Ngày sinh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 51, 0, 0);
        JPanelTTNV.add(labelNgaysinh_239, gridBagConstraints);

        label_Email_239.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 51, 0, 0);
        JPanelTTNV.add(label_Email_239, gridBagConstraints);

        label_Gioitinh_239.setText("Giới tính");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 51, 0, 0);
        JPanelTTNV.add(label_Gioitinh_239, gridBagConstraints);

        label_Trangthai_239.setText("Trạng thái");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 51, 0, 0);
        JPanelTTNV.add(label_Trangthai_239, gridBagConstraints);

        buttonGroup1.add(jRadioButton1_239);
        jRadioButton1_239.setText("Đang làm việc");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 21, 0, 0);
        JPanelTTNV.add(jRadioButton1_239, gridBagConstraints);

        buttonGroup1.add(jRadioButton2_239);
        jRadioButton2_239.setText("Nghỉ việc");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 27, 0, 0);
        JPanelTTNV.add(jRadioButton2_239, gridBagConstraints);

        buttonGroup2.add(jRadioButton3_239);
        jRadioButton3_239.setText("Nam");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 21, 0, 0);
        JPanelTTNV.add(jRadioButton3_239, gridBagConstraints);

        buttonGroup2.add(jRadioButton4_239);
        jRadioButton4_239.setText("Nữ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 27, 0, 0);
        JPanelTTNV.add(jRadioButton4_239, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 188;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 21, 0, 0);
        JPanelTTNV.add(email_239, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 188;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 21, 0, 0);
        JPanelTTNV.add(ngaysinh_239, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 188;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 21, 0, 0);
        JPanelTTNV.add(dienthoai_239, gridBagConstraints);

        btThem_239.setBackground(new java.awt.Color(153, 153, 255));
        btThem_239.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btThem_239.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/plus.png"))); // NOI18N
        btThem_239.setText("Thêm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 116, 17, 0);
        JPanelTTNV.add(btThem_239, gridBagConstraints);

        btSua_239.setBackground(new java.awt.Color(153, 153, 255));
        btSua_239.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSua_239.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/sua.png"))); // NOI18N
        btSua_239.setText("Sửa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 17, 0);
        JPanelTTNV.add(btSua_239, gridBagConstraints);

        btLammoi_239.setBackground(new java.awt.Color(153, 153, 255));
        btLammoi_239.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLammoi_239.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/refresh.png"))); // NOI18N
        btLammoi_239.setText("Làm mới");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 17, 0);
        JPanelTTNV.add(btLammoi_239, gridBagConstraints);

        btLuu_239.setBackground(new java.awt.Color(153, 153, 255));
        btLuu_239.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLuu_239.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/luu.png"))); // NOI18N
        btLuu_239.setText("Lưu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 9, 0, 72);
        JPanelTTNV.add(btLuu_239, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelTTNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JPanelTTNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc"));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel12_239.setText("Lọc theo vai  trò");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 87, 6, 0);
        jPanel3.add(jLabel12_239, gridBagConstraints);

        jComboBox4_239.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên kho", "Nhân viên bán hàng", "Nhân viên giữ xe", " " }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 35, 0, 0);
        jPanel3.add(jComboBox4_239, gridBagConstraints);

        jLabel10_239.setText("Lọc theo giới tính");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 92, 0, 0);
        jPanel3.add(jLabel10_239, gridBagConstraints);

        jComboBox2_239.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam ", "Nữ", " " }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 32, 0, 300);
        jPanel3.add(jComboBox2_239, gridBagConstraints);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        tblNhanVien_239.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Vai trò", "Địa chỉ", "Điện thoại", "Ngảy sinh", "Giới tính", "Email", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tblNhanVien_239);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxVaitro_239ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVaitro_239ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxVaitro_239ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelTTNV;
    private javax.swing.JButton btLammoi_239;
    private javax.swing.JButton btLuu_239;
    private javax.swing.JButton btSua_239;
    private javax.swing.JButton btThem_239;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbxVaitro_239;
    private javax.swing.JTextField diaChi_239;
    private javax.swing.JTextField dienthoai_239;
    private javax.swing.JTextField email_239;
    private javax.swing.JComboBox<String> jComboBox2_239;
    private javax.swing.JComboBox<String> jComboBox4_239;
    private javax.swing.JLabel jLabel10_239;
    private javax.swing.JLabel jLabel12_239;
    private javax.swing.JLabel jLabel2_239;
    private javax.swing.JLabel jLabel3_239;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton1_239;
    private javax.swing.JRadioButton jRadioButton2_239;
    private javax.swing.JRadioButton jRadioButton3_239;
    private javax.swing.JRadioButton jRadioButton4_239;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDienthoai_239;
    private javax.swing.JLabel labelMa_239;
    private javax.swing.JLabel labelNgaysinh_239;
    private javax.swing.JLabel label_Email_239;
    private javax.swing.JLabel label_Gioitinh_239;
    private javax.swing.JLabel label_Trangthai_239;
    private javax.swing.JTextField maNV_239;
    private javax.swing.JTextField ngaysinh_239;
    private javax.swing.JTable tblNhanVien_239;
    private javax.swing.JTextField tenNV_239;
    // End of variables declaration//GEN-END:variables
}
