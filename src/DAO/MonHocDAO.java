package DAO;

import HibernateUtil.HibernateUtil;
import POJO.MonHoc;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class MonHocDAO {
    public static List<MonHoc> getMonhoc() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<MonHoc> monhoc = null;

        try {
            final String hql = "select mh from MonHoc mh";
            Query query = session.createQuery(hql);

            monhoc = query.list();
        } catch (HibernateException e) {
            System.out.println(e);
        }
        finally {
            session.close();
        }
        return monhoc;
    }
}
