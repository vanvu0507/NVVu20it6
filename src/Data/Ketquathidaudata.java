/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Object.Ketquathidau;

/**
 *
 * @author Admin
 */
public class Ketquathidaudata {
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
     public static void InsertKetquathidau(Ketquathidau kq) {
        String sql = "insert into ketquathidau values(?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, kq.getTran());
            ps.setString(2, kq.getNgay());
            ps.setString(3, kq.getGio());
            ps.setString(4, kq.getTiso());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm Kết quả thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Kết quả không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateKetquathidau(Ketquathidau kq) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE ketquathidau SET  Tran = ?, Gio = ?,"
                    + " Tiso = ? where Ngay = ?");
            ps.setString(4, kq.getNgay());
            ps.setString(1, kq.getTran());
            ps.setString(2, kq.getGio());
            ps.setString(3, kq.getTiso());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteKetquathidau(String ng ) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM ketquathidau WHERE ngày = ?");
            ps.setString(1, ng);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
}
}
