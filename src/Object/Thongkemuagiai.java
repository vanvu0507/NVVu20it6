/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author Admin
 */
public class Thongkemuagiai {
    public String muaGiai;
    public int xepHang;
    public String ghiBanNhieuNhat;
    public String thangNhieuNhat;
    public String thuaNhieuNhat;

    public Thongkemuagiai() {
    }

    public Thongkemuagiai(String muaGiai, int xepHang, String ghiBanNhieuNhat, String thangNhieuNhat, String thuaNhieuNhat) {
        this.muaGiai = muaGiai;
        this.xepHang = xepHang;
        this.ghiBanNhieuNhat = ghiBanNhieuNhat;
        this.thangNhieuNhat = thangNhieuNhat;
        this.thuaNhieuNhat = thuaNhieuNhat;
    }

    public String getMuaGiai() {
        return muaGiai;
    }

    public void setMuaGiai(String muaGiai) {
        this.muaGiai = muaGiai;
    }

    public int getXepHang() {
        return xepHang;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public String getGhiBanNhieuNhat() {
        return ghiBanNhieuNhat;
    }

    public void setGhiBanNhieuNhat(String ghiBanNhieuNhat) {
        this.ghiBanNhieuNhat = ghiBanNhieuNhat;
    }

    public String getThangNhieuNhat() {
        return thangNhieuNhat;
    }

    public void setThangNhieuNhat(String thangNhieuNhat) {
        this.thangNhieuNhat = thangNhieuNhat;
    }

    public String getThuaNhieuNhat() {
        return thuaNhieuNhat;
    }

    public void setThuaNhieuNhat(String thuaNhieuNhat) {
        this.thuaNhieuNhat = thuaNhieuNhat;
    }
    
}
