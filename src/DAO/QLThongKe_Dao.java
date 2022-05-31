package DAO;

import MODEL.QL_SanPhamDaBan_203;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phank
 */
public class QLThongKe_Dao {
    
    public List<QL_SanPhamDaBan_203> getAllProduct () throws SQLException{
        List<QL_SanPhamDaBan_203> QL_SanPhamDaBans = new ArrayList<>();

        Connection connection = ConnectDB.getJBDCConnection();

        String sql = "select SanPham.maSP,tenSP,soLuongHienCon,soLuongDat\n" +
                        "from SanPham,ChiTietHoaDon";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                QL_SanPhamDaBan_203 qL_SanPhamDaBan = new QL_SanPhamDaBan_203();
                qL_SanPhamDaBan.setMaSP_203(rs.getInt(1));
                qL_SanPhamDaBan.setTenSP_203(rs.getString(2));
                qL_SanPhamDaBan.setSoLuongCon_203(rs.getInt(3));
                qL_SanPhamDaBan.setSoLuongDaBan_203(rs.getInt(4));
                QL_SanPhamDaBans.add(qL_SanPhamDaBan);
            }
            return QL_SanPhamDaBans;
    }
     public int thongKeSOLuong(String tenSp) throws SQLException{
      int tong = 0;
       Connection connection = ConnectDB.getJBDCConnection();

        String sql = "select soLuongHienCon\n" +
                            "from SanPham where tenSP=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString(1, tenSp);
           ResultSet rs = preparedStatement.executeQuery();
           while (rs.next()) {
          tong  =rs.getInt(1);
      }
     return tong;
}
 
    public static void main(String[] args) throws SQLException {
        QLThongKe_Dao qLSanPham_Dao = new QLThongKe_Dao();
        System.out.println(qLSanPham_Dao.thongKeSOLuong("iPhone 11"));
       
    }
}