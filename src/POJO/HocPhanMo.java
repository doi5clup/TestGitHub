package POJO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(HocPhanMoPK.class)
public class HocPhanMo {
    private String maMh;
    private String tenHk;
    private int namHoc;
    private String phong;
    private Integer thu;
    private Integer ca;
    private Integer maxSlot;

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
    @Column(name = "Phong", nullable = true, length = 20)
    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    @Basic
    @Column(name = "Thu", nullable = true)
    public Integer getThu() {
        return thu;
    }

    public void setThu(Integer thu) {
        this.thu = thu;
    }

    @Basic
    @Column(name = "Ca", nullable = true)
    public Integer getCa() {
        return ca;
    }

    public void setCa(Integer ca) {
        this.ca = ca;
    }

    @Basic
    @Column(name = "MaxSlot", nullable = true)
    public Integer getMaxSlot() {
        return maxSlot;
    }

    public void setMaxSlot(Integer maxSlot) {
        this.maxSlot = maxSlot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HocPhanMo hocPhanMo = (HocPhanMo) o;
        return namHoc == hocPhanMo.namHoc && Objects.equals(maMh, hocPhanMo.maMh) && Objects.equals(tenHk, hocPhanMo.tenHk) && Objects.equals(phong, hocPhanMo.phong) && Objects.equals(thu, hocPhanMo.thu) && Objects.equals(ca, hocPhanMo.ca) && Objects.equals(maxSlot, hocPhanMo.maxSlot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maMh, tenHk, namHoc, phong, thu, ca, maxSlot);
    }
}
