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
public class lichsumuagiai {
    public String muaGiai;
    public int xepHang;
    public int thang;
    public int thua;
    public int hoa;

    public lichsumuagiai() {
    }

    public lichsumuagiai(String muaGiai, int xepHang, int thang, int thua, int hoa) {
        this.muaGiai = muaGiai;
        this.xepHang = xepHang;
        this.thang = thang;
        this.thua = thua;
        this.hoa = hoa;
    }

    public String getMuagiai() {
        return muaGiai;
    }

    public void setMuagiai(String muaGiai) {
        this.muaGiai = muaGiai;
    }

    public int getXepHang() {
        return xepHang;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getThua() {
        return thua;
    }

    public void setThua(int thua) {
        this.thua = thua;
    }

    public int getHoa() {
        return hoa;
    }

    public void setHoa(int hoa) {
        this.hoa = hoa;
    }
    
}
