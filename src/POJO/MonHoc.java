package POJO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class MonHoc {
    private String maMh;
    private String tenMh;
    private Integer soTinChi;

    @Id
    @Column(name = "MaMH", nullable = false, length = 10)
    public String getMaMh() {
        return maMh;
    }

    public void setMaMh(String maMh) {
        this.maMh = maMh;
    }

    @Basic
    @Column(name = "TenMH", nullable = true, length = 30)
    public String getTenMh() {
        return tenMh;
    }

    public void setTenMh(String tenMh) {
        this.tenMh = tenMh;
    }

    @Basic
    @Column(name = "SoTinChi", nullable = true)
    public Integer getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(Integer soTinChi) {
        this.soTinChi = soTinChi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonHoc monHoc = (MonHoc) o;
        return Objects.equals(maMh, monHoc.maMh) && Objects.equals(tenMh, monHoc.tenMh) && Objects.equals(soTinChi, monHoc.soTinChi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maMh, tenMh, soTinChi);
    }
}
