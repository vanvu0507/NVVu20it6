/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Object.lichsumuagiai;
import Object.Cauthu;

/**
 *
 * @author Admin
 */
public class Lichsumuagiaidata {
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
     public static void InsertLichsumuagiai(lichsumuagiai ls) {
        String sql = "insert into lichsumuagiai values(?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, ls.getMuagiai());
            ps.setInt(2, ls.getXepHang());
            ps.setInt(3, ls.getThang());
            ps.setInt(4, ls.getThua());
            ps.setInt(5, ls.getHoa());
            ps.setString(6, "Nguyễn Văn Vũ");
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm lịch sử thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Lịch sử không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateLichsumuagiai(lichsumuagiai ls) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE lichsumuagiai SET Xếp_hạng= ?, Thắng= ?,"
                    + " Thua= ?, Hoà = ? where Mùa_giải = ?");
            ps.setString(5, ls.getMuagiai());
            ps.setInt(1, ls.getXepHang());
            ps.setInt(2, ls.getThang());
            ps.setInt(3, ls.getThua());
            ps.setInt(4, ls.getHoa());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteLichsumuagiai(String mg) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM lichsumuagiai WHERE Mùa_giải = ?");
            ps.setString(1, mg);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
}
}
