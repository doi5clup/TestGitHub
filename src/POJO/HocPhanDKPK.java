package POJO;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class HocPhanDKPK implements Serializable {
    private String maSv;
    private String maMh;
    private String tenHk;
    private int namHoc;

    @Column(name = "MaSV", nullable = false, length = 10)
    @Id
    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    @Column(name = "MaMH", nullable = false, length = 10)
    @Id
    public String getMaMh() {
        return maMh;
    }

    public void setMaMh(String maMh) {
        this.maMh = maMh;
    }

    @Column(name = "TenHK", nullable = false, length = 10)
    @Id
    public String getTenHk() {
        return tenHk;
    }

    public void setTenHk(String tenHk) {
        this.tenHk = tenHk;
    }

    @Column(name = "NamHoc", nullable = false)
    @Id
    public int getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(int namHoc) {
        this.namHoc = namHoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HocPhanDKPK that = (HocPhanDKPK) o;
        return namHoc == that.namHoc && Objects.equals(maSv, that.maSv) && Objects.equals(maMh, that.maMh) && Objects.equals(tenHk, that.tenHk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSv, maMh, tenHk, namHoc);
    }
}
