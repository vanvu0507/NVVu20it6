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
public class Ketquathidau {
    public String tran;
    public String ngay;
    public String gio;
    public String tiSo;

    public Ketquathidau() {
    }

    public Ketquathidau(String tran, String ngay, String gio, String tiSo) {
        this.tran = tran;
        this.ngay = ngay;
        this.gio = gio;
        this.tiSo = tiSo;
    }

    public String getTran() {
        return tran;
    }

    public void setTran(String tran) {
        this.tran = tran;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }

    public String getTiso() {
        return tiSo;
    }

    public void setTiso(String tiSo) {
        this.tiSo = tiSo;
    }
    
}
