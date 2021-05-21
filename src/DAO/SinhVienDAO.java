package DAO;

import HibernateUtil.HibernateUtil;
import POJO.SinhVien;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class SinhVienDAO {
    public static List<SinhVien> getAllSinhVien() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        List<SinhVien> sinhvien = null;

        try {
            final String hql = "select sv from SinhVien sv";
            Query query = session.createQuery(hql);

            sinhvien = query.list();
        } catch (HibernateException e) {
            System.out.println(e);
        }
        finally {
            session.close();
        }
        return sinhvien;
    }
}
