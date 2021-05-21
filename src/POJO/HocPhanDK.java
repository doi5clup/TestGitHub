package POJO;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@IdClass(HocPhanDKPK.class)
public class HocPhanDK {
    private String maSv;
    private String maMh;
    private String tenHk;
    private int namHoc;
    private Date ngayDk;
    private Time gioDk;

    @Id
    @Column(name = "MaSV", nullable = false, length = 10)
    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    @Id
    @Column(name = "MaMH", nullable = false, length = 10)
    public String getMaMh() {
        return maMh;
    }

    public void setMaMh(String maMh) {
        this.maMh = maMh;
    }

    @Id
    @Column(name = "TenHK", nullable = false, length = 10)
    public String getTenHk() {
        return tenHk;
    }

    public void setTenHk(String tenHk) {
        this.tenHk = tenHk;
    }

    @Id
    @Column(name = "NamHoc", nullable = false)
    public int getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(int namHoc) {
        this.namHoc = namHoc;
    }

    @Basic
    @Column(name = "NgayDK", nullable = true)
    public Date getNgayDk() {
        return ngayDk;
    }

    public void setNgayDk(Date ngayDk) {
        this.ngayDk = ngayDk;
    }

    @Basic
    @Column(name = "GioDK", nullable = true)
    public Time getGioDk() {
        return gioDk;
    }

    public void setGioDk(Time gioDk) {
        this.gioDk = gioDk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HocPhanDK hocPhanDK = (HocPhanDK) o;
        return namHoc == hocPhanDK.namHoc && Objects.equals(maSv, hocPhanDK.maSv) && Objects.equals(maMh, hocPhanDK.maMh) && Objects.equals(tenHk, hocPhanDK.tenHk) && Objects.equals(ngayDk, hocPhanDK.ngayDk) && Objects.equals(gioDk, hocPhanDK.gioDk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSv, maMh, tenHk, namHoc, ngayDk, gioDk);
    }
}
