/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btgk_qlbanthietbicongnghe_nhomkln;

import bean.DanhMucBean;
import controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);//hien thi giua man hinh

        setTitle("Quan ly ban thiet bi dien tu");

        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView_212);
        controller.setView(jpnQLKhachHang_212, jlbQLKhachHang_212);

        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("QuanLyKhachHang", jpnQLKhachHang_212, jlbQLKhachHang_212));
        listItem.add(new DanhMucBean("TrangChu", jpnTrangChu_212, jlbTrangChu_212));
        listItem.add(new DanhMucBean("QuanLySanPham", jpnQLSanPham_212, jlbQLSanPham_212));
        listItem.add(new DanhMucBean("QuanLyKhuyenMai", jpnQLKhuyenMai_212, jlbQLKhuyenMai_212));
        listItem.add(new DanhMucBean("QuanLyNhanVien", jpnQLNhanVien_212, jlbQLNhanVien_212));
        listItem.add(new DanhMucBean("QuanLyHoaDon", jpnQLHoaDon_212, jlbQLHoaDon_212));
        listItem.add(new DanhMucBean("ThongKe", jpnThongKe_212, jlbThongKe_212));
        controller.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnTieuDe_212 = new javax.swing.JPanel();
        jlbTieuDe_212 = new javax.swing.JLabel();
        jpnView_212 = new javax.swing.JPanel();
        jpnKhung_212 = new javax.swing.JPanel();
        jpnTrangChu_212 = new javax.swing.JPanel();
        jlbTrangChu_212 = new javax.swing.JLabel();
        jpnQLSanPham_212 = new javax.swing.JPanel();
        jlbQLSanPham_212 = new javax.swing.JLabel();
        jpnQLKhuyenMai_212 = new javax.swing.JPanel();
        jlbQLKhuyenMai_212 = new javax.swing.JLabel();
        jpnQLNhanVien_212 = new javax.swing.JPanel();
        jlbQLNhanVien_212 = new javax.swing.JLabel();
        jpnQLKhachHang_212 = new javax.swing.JPanel();
        jlbQLKhachHang_212 = new javax.swing.JLabel();
        jpnQLHoaDon_212 = new javax.swing.JPanel();
        jlbQLHoaDon_212 = new javax.swing.JLabel();
        jpnThongKe_212 = new javax.swing.JPanel();
        jlbThongKe_212 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jpnTieuDe_212.setBackground(new java.awt.Color(204, 204, 255));

        jlbTieuDe_212.setBackground(new java.awt.Color(204, 204, 255));
        jlbTieuDe_212.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlbTieuDe_212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTieuDe_212.setText("QUẢN LÝ BÁN THIẾT BỊ CÔNG NGHỆ");

        javax.swing.GroupLayout jpnTieuDe_212Layout = new javax.swing.GroupLayout(jpnTieuDe_212);
        jpnTieuDe_212.setLayout(jpnTieuDe_212Layout);
        jpnTieuDe_212Layout.setHorizontalGroup(
            jpnTieuDe_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTieuDe_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTieuDe_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTieuDe_212Layout.setVerticalGroup(
            jpnTieuDe_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTieuDe_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTieuDe_212, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnView_212Layout = new javax.swing.GroupLayout(jpnView_212);
        jpnView_212.setLayout(jpnView_212Layout);
        jpnView_212Layout.setHorizontalGroup(
            jpnView_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1202, Short.MAX_VALUE)
        );
        jpnView_212Layout.setVerticalGroup(
            jpnView_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpnKhung_212.setPreferredSize(new java.awt.Dimension(268, 400));
        jpnKhung_212.setLayout(new java.awt.GridLayout(7, 1));

        jpnTrangChu_212.setBackground(new java.awt.Color(51, 204, 0));
        jpnTrangChu_212.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnTrangChu_212.setPreferredSize(new java.awt.Dimension(244, 50));

        jlbTrangChu_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbTrangChu_212.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangChu_212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTrangChu_212.setText("TRANG CHỦ");

        javax.swing.GroupLayout jpnTrangChu_212Layout = new javax.swing.GroupLayout(jpnTrangChu_212);
        jpnTrangChu_212.setLayout(jpnTrangChu_212Layout);
        jpnTrangChu_212Layout.setHorizontalGroup(
            jpnTrangChu_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTrangChu_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChu_212, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTrangChu_212Layout.setVerticalGroup(
            jpnTrangChu_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChu_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChu_212, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnKhung_212.add(jpnTrangChu_212);

        jpnQLSanPham_212.setBackground(new java.awt.Color(51, 204, 0));
        jpnQLSanPham_212.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnQLSanPham_212.setPreferredSize(new java.awt.Dimension(244, 50));

        jlbQLSanPham_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbQLSanPham_212.setForeground(new java.awt.Color(255, 255, 255));
        jlbQLSanPham_212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLSanPham_212.setText("QUẢN LÝ SẢN PHẨM");

        javax.swing.GroupLayout jpnQLSanPham_212Layout = new javax.swing.GroupLayout(jpnQLSanPham_212);
        jpnQLSanPham_212.setLayout(jpnQLSanPham_212Layout);
        jpnQLSanPham_212Layout.setHorizontalGroup(
            jpnQLSanPham_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLSanPham_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLSanPham_212, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQLSanPham_212Layout.setVerticalGroup(
            jpnQLSanPham_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLSanPham_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLSanPham_212, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnKhung_212.add(jpnQLSanPham_212);

        jpnQLKhuyenMai_212.setBackground(new java.awt.Color(51, 204, 0));
        jpnQLKhuyenMai_212.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnQLKhuyenMai_212.setPreferredSize(new java.awt.Dimension(244, 50));

        jlbQLKhuyenMai_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbQLKhuyenMai_212.setForeground(new java.awt.Color(255, 255, 255));
        jlbQLKhuyenMai_212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLKhuyenMai_212.setText("QUẢN LÝ KHUYẾN MÃI");

        javax.swing.GroupLayout jpnQLKhuyenMai_212Layout = new javax.swing.GroupLayout(jpnQLKhuyenMai_212);
        jpnQLKhuyenMai_212.setLayout(jpnQLKhuyenMai_212Layout);
        jpnQLKhuyenMai_212Layout.setHorizontalGroup(
            jpnQLKhuyenMai_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLKhuyenMai_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLKhuyenMai_212, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQLKhuyenMai_212Layout.setVerticalGroup(
            jpnQLKhuyenMai_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLKhuyenMai_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLKhuyenMai_212, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnKhung_212.add(jpnQLKhuyenMai_212);

        jpnQLNhanVien_212.setBackground(new java.awt.Color(51, 204, 0));
        jpnQLNhanVien_212.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnQLNhanVien_212.setPreferredSize(new java.awt.Dimension(244, 50));

        jlbQLNhanVien_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbQLNhanVien_212.setForeground(new java.awt.Color(255, 255, 255));
        jlbQLNhanVien_212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLNhanVien_212.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout jpnQLNhanVien_212Layout = new javax.swing.GroupLayout(jpnQLNhanVien_212);
        jpnQLNhanVien_212.setLayout(jpnQLNhanVien_212Layout);
        jpnQLNhanVien_212Layout.setHorizontalGroup(
            jpnQLNhanVien_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLNhanVien_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLNhanVien_212, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQLNhanVien_212Layout.setVerticalGroup(
            jpnQLNhanVien_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLNhanVien_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLNhanVien_212, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnKhung_212.add(jpnQLNhanVien_212);

        jpnQLKhachHang_212.setBackground(new java.awt.Color(51, 204, 0));
        jpnQLKhachHang_212.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnQLKhachHang_212.setPreferredSize(new java.awt.Dimension(244, 50));

        jlbQLKhachHang_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbQLKhachHang_212.setForeground(new java.awt.Color(255, 255, 255));
        jlbQLKhachHang_212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLKhachHang_212.setText("QUẢN LÝ KHÁCH HÀNG");

        javax.swing.GroupLayout jpnQLKhachHang_212Layout = new javax.swing.GroupLayout(jpnQLKhachHang_212);
        jpnQLKhachHang_212.setLayout(jpnQLKhachHang_212Layout);
        jpnQLKhachHang_212Layout.setHorizontalGroup(
            jpnQLKhachHang_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLKhachHang_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLKhachHang_212, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQLKhachHang_212Layout.setVerticalGroup(
            jpnQLKhachHang_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLKhachHang_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLKhachHang_212, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnKhung_212.add(jpnQLKhachHang_212);

        jpnQLHoaDon_212.setBackground(new java.awt.Color(51, 204, 0));
        jpnQLHoaDon_212.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnQLHoaDon_212.setPreferredSize(new java.awt.Dimension(244, 50));

        jlbQLHoaDon_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbQLHoaDon_212.setForeground(new java.awt.Color(255, 255, 255));
        jlbQLHoaDon_212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLHoaDon_212.setText("QUẢN LÝ HÓA ĐƠN");

        javax.swing.GroupLayout jpnQLHoaDon_212Layout = new javax.swing.GroupLayout(jpnQLHoaDon_212);
        jpnQLHoaDon_212.setLayout(jpnQLHoaDon_212Layout);
        jpnQLHoaDon_212Layout.setHorizontalGroup(
            jpnQLHoaDon_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLHoaDon_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLHoaDon_212, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQLHoaDon_212Layout.setVerticalGroup(
            jpnQLHoaDon_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLHoaDon_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLHoaDon_212, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnKhung_212.add(jpnQLHoaDon_212);

        jpnThongKe_212.setBackground(new java.awt.Color(51, 204, 0));
        jpnThongKe_212.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnThongKe_212.setPreferredSize(new java.awt.Dimension(244, 50));

        jlbThongKe_212.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbThongKe_212.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongKe_212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbThongKe_212.setText("THỐNG KÊ");

        javax.swing.GroupLayout jpnThongKe_212Layout = new javax.swing.GroupLayout(jpnThongKe_212);
        jpnThongKe_212.setLayout(jpnThongKe_212Layout);
        jpnThongKe_212Layout.setHorizontalGroup(
            jpnThongKe_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKe_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKe_212, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnThongKe_212Layout.setVerticalGroup(
            jpnThongKe_212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKe_212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKe_212, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnKhung_212.add(jpnThongKe_212);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTieuDe_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnKhung_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnView_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpnTieuDe_212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnView_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnKhung_212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbQLHoaDon_212;
    private javax.swing.JLabel jlbQLKhachHang_212;
    private javax.swing.JLabel jlbQLKhuyenMai_212;
    private javax.swing.JLabel jlbQLNhanVien_212;
    private javax.swing.JLabel jlbQLSanPham_212;
    private javax.swing.JLabel jlbThongKe_212;
    private javax.swing.JLabel jlbTieuDe_212;
    private javax.swing.JLabel jlbTrangChu_212;
    private javax.swing.JPanel jpnKhung_212;
    private javax.swing.JPanel jpnQLHoaDon_212;
    private javax.swing.JPanel jpnQLKhachHang_212;
    private javax.swing.JPanel jpnQLKhuyenMai_212;
    private javax.swing.JPanel jpnQLNhanVien_212;
    private javax.swing.JPanel jpnQLSanPham_212;
    private javax.swing.JPanel jpnThongKe_212;
    private javax.swing.JPanel jpnTieuDe_212;
    private javax.swing.JPanel jpnTrangChu_212;
    private javax.swing.JPanel jpnView_212;
    // End of variables declaration//GEN-END:variables
}
