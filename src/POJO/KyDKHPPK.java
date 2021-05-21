package POJO;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class KyDKHPPK implements Serializable {
    private String tenHk;
    private int namHoc;

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
        KyDKHPPK kyDKHPPK = (KyDKHPPK) o;
        return namHoc == kyDKHPPK.namHoc && Objects.equals(tenHk, kyDKHPPK.tenHk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenHk, namHoc);
    }
}
