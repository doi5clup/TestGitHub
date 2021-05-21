package POJO;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class LopHoc {
    private String maLh;
    private String tenLh;
    private Integer hsNam;
    private Integer hsNu;
    private Integer tongHs;

    @Id
    @Column(name = "MaLH", nullable = false, length = 10)
    public String getMaLh() {
        return maLh;
    }

    public void setMaLh(String maLh) {
        this.maLh = maLh;
    }

    @Basic
    @Column(name = "TenLH", nullable = true, length = 30)
    public String getTenLh() {
        return tenLh;
    }

    public void setTenLh(String tenLh) {
        this.tenLh = tenLh;
    }

    @Basic
    @Column(name = "HSNam", nullable = true)
    public Integer getHsNam() {
        return hsNam;
    }

    public void setHsNam(Integer hsNam) {
        this.hsNam = hsNam;
    }

    @Basic
    @Column(name = "HSNu", nullable = true)
    public Integer getHsNu() {
        return hsNu;
    }

    public void setHsNu(Integer hsNu) {
        this.hsNu = hsNu;
    }

    @Basic
    @Column(name = "TongHS", nullable = true)
    public Integer getTongHs() {
        return tongHs;
    }

    public void setTongHs(Integer tongHs) {
        this.tongHs = tongHs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LopHoc lopHoc = (LopHoc) o;
        return Objects.equals(maLh, lopHoc.maLh) && Objects.equals(tenLh, lopHoc.tenLh) && Objects.equals(hsNam, lopHoc.hsNam) && Objects.equals(hsNu, lopHoc.hsNu) && Objects.equals(tongHs, lopHoc.tongHs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maLh, tenLh, hsNam, hsNu, tongHs);
    }
}
