/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Object.Lichthidau;
/**
 *
 * @author Admin
 */
public class Lichthidaudata {
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
     public static void InsertLichthidau(Lichthidau lt) {
        String sql = "insert into lichthidau values(?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, lt.getTran());
            ps.setString(2, lt.getNgay());
            ps.setString(3, lt.getGio());
            ps.setString(4, lt.getSvd());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm lịch thi đấu thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "lịch thi đấu không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateLichthidau(Lichthidau lt) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE lichthidau SET  Tran = ?, Gio = ?,"
                    + "SVD = ? where Ngay = ?");
            ps.setString(4, lt.getNgay());
            ps.setString(1, lt.getTran());
            ps.setString(2, lt.getGio());
            ps.setString(3, lt.getSvd());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteLichthidau(String ng) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM lichthidau WHERE Ngay = ?");
            ps.setString(1, ng);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
}
}
