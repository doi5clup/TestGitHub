package POJO;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(KyDKHPPK.class)
public class KyDKHP {
    private String tenHk;
    private int namHoc;
    private Date ngDk;
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
    @Column(name = "NgDK", nullable = true)
    public Date getNgDk() {
        return ngDk;
    }

    public void setNgDk(Date ngDk) {
        this.ngDk = ngDk;
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
        KyDKHP kyDKHP = (KyDKHP) o;
        return namHoc == kyDKHP.namHoc && Objects.equals(tenHk, kyDKHP.tenHk) && Objects.equals(ngDk, kyDKHP.ngDk) && Objects.equals(ngKt, kyDKHP.ngKt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenHk, namHoc, ngDk, ngKt);
    }
}
