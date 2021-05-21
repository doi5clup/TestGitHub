import DAO.MonHocDAO;
import DAO.SinhVienDAO;
import POJO.MonHoc;
import POJO.SinhVien;

import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<SinhVien> sinhvien = SinhVienDAO.getAllSinhVien();

        for (SinhVien i: sinhvien)
        {
            System.out.println(i.getMaSv() + " " + i.getTenSv());
        }

        /*List<MonHoc> monhoc = MonHocDAO.getMonhoc();
        for (MonHoc i: monhoc)
            System.out.println(i.getTenMh());*/
        //System.out.println("hello");
    }
}
