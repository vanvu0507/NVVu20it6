/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Object.Thongkemuagiai;
/**
 *
 * @author Admin
 */
public class Thongkemuagiaidata {
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
     public static void InsertThongkemuagiai(Thongkemuagiai tk) {
        String sql = "insert into thongkemuagiai values(?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, tk.getMuaGiai());
            ps.setInt(2, tk.getXepHang());
            ps.setString(3, tk.getGhiBanNhieuNhat());
            ps.setString(4, tk.getThangNhieuNhat());
            ps.setString(5, tk.getThuaNhieuNhat());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm phiếu thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "phiếu không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateThongkemuagiai(Thongkemuagiai tk) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE thongkemuagiai SET  Xephang = ?, Ghibannhieunhat = ?,"
                    + "Thangnhieunhat = ?, Thuanhieunhat = ? where Muagiai = ?");
            ps.setString(5, tk.getMuaGiai());
            ps.setInt(1, tk.getXepHang());
            ps.setString(2, tk.getGhiBanNhieuNhat());
            ps.setString(3, tk.getThangNhieuNhat());
            ps.setString(4, tk.getThuaNhieuNhat());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteThongkemuagiai(String mg) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM thongkemuagiai WHERE Muagiai = ?");
            ps.setString(1, mg);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
}
}
