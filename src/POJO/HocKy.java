package POJO;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(HocKyPK.class)
public class HocKy {
    private String tenHk;
    private int namHoc;
    private Date ngBd;
    private Date ngKt;

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
    @Column(name = "NgBD", nullable = true)
    public Date getNgBd() {
        return ngBd;
    }

    public void setNgBd(Date ngBd) {
        this.ngBd = ngBd;
    }

    @Basic
    @Column(name = "NgKT", nullable = true)
    public Date getNgKt() {
        return ngKt;
    }

    public void setNgKt(Date ngKt) {
        this.ngKt = ngKt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HocKy hocKy = (HocKy) o;
        return namHoc == hocKy.namHoc && Objects.equals(tenHk, hocKy.tenHk) && Objects.equals(ngBd, hocKy.ngBd) && Objects.equals(ngKt, hocKy.ngKt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenHk, namHoc, ngBd, ngKt);
    }
}
