package POJO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class SinhVien {
    private String maSv;
    private String tenSv;
    private String gioiTinh;
    private Date ngSinh;
    private String diaChi;
    private String pass;

    @Id
    @Column(name = "MaSV", nullable = false, length = 10)
    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    @Basic
    @Column(name = "TenSV", nullable = true, length = 30)
    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    @Basic
    @Column(name = "GioiTinh", nullable = true, length = 10)
    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Basic
    @Column(name = "NgSinh", nullable = true)
    public Date getNgSinh() {
        return ngSinh;
    }

    public void setNgSinh(Date ngSinh) {
        this.ngSinh = ngSinh;
    }

    @Basic
    @Column(name = "DiaChi", nullable = true, length = 50)
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Basic
    @Column(name = "Pass", nullable = true, length = 30)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(maSv, sinhVien.maSv) && Objects.equals(tenSv, sinhVien.tenSv) && Objects.equals(gioiTinh, sinhVien.gioiTinh) && Objects.equals(ngSinh, sinhVien.ngSinh) && Objects.equals(diaChi, sinhVien.diaChi) && Objects.equals(pass, sinhVien.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSv, tenSv, gioiTinh, ngSinh, diaChi, pass);
    }
}
