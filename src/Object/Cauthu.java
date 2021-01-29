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
public class Cauthu {
    public String ten;
    public String viTri;
    public int soAo;
    public int chieuCao;
    public int canNang;
    public int namSinh;
    
    public Cauthu() {
        
    }
    
    public Cauthu(String ten, String viTri, int soAo, int chieuCao, int canNang, int namSinh) {
        this.ten = ten;
        this.viTri = viTri;
        this.soAo = soAo;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
        this.namSinh = namSinh;
    }
    
    public String getTen() {
        return ten;
    }
    
    public void setTen(String te) {
        this.ten = te;
    }
    
    public String getViTri() {
        return viTri;
    }
    
    public void setViTri(String vt) {
        this.viTri = vt;
    }
    
    public int getSoAo() {
        return soAo;
    }
    
    public void setSoAo(int s) {
        this.soAo = s;
    }
    
    public int getChieuCao() {
        return chieuCao;
    }
    
    public void setChieuCao(int cc) {
        this.chieuCao = cc;
    }
    
    public int gettCanNang() {
        return canNang;
    }
    
    public void setCanNang(int cn) {
        this.canNang = cn;
    }
    
    public int getNamSinh() {
        return namSinh;
    }
    
    public void setNamSinh(int ns) {
        this.namSinh = ns;
    }
}

