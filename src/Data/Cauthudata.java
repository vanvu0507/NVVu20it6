/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.Cauthu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class Cauthudata {
        
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
     public static void InsertCauthu(Cauthu ct) {
        String sql = "insert into cauthu values(?,?,?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, ct.getTen());
            ps.setString(2, ct.getViTri());
            ps.setInt(3, ct.getSoAo());
            ps.setInt(4, ct.getChieuCao());
            ps.setInt(5, ct.gettCanNang());
            ps.setInt(6, ct.getNamSinh());
            ps.setString(7, "Nguyễn Hoàng Hải");
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm cầu thủ thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Cầu thủ không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateSach(Cauthu ct) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE cauthu SET  Ten = ?, Vitri = ?,"
                    + "Chieucao = ?, Cannang = ?, Namsinh = ? where Soao = ?");
            ps.setString(6, ct.getTen());
            ps.setString(1, ct.getViTri());
            ps.setInt(2, ct.getSoAo());
            ps.setInt(3, ct.getChieuCao());
            ps.setInt(4, ct.gettCanNang());
            ps.setInt(5, ct.getNamSinh());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteCauthu(String te) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM SACH WHERE Ma_Sach = ?");
            ps.setString(1, te);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
