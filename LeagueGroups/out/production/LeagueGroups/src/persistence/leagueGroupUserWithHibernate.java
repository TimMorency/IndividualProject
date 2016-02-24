package persistence;

import entity.leagueGroupUser;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;
/**
 * Created by Student on 2/24/2016.
 */
public class leagueGroupUserWithHibernate {

    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());



    public List<leagueGroupUser> getAllLeagueGroupUser() {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<leagueGroupUser> leagueGroupUsers = new ArrayList<leagueGroupUser>();
        Transaction dbTransaction = null;

        try {
            dbTransaction = session.beginTransaction();
            List departmentsInDB = session.createQuery("FROM leaguegroupuser").list();

            for (Iterator iterator = departmentsInDB.iterator(); iterator.hasNext();) {

                leagueGroupUser lg = (leagueGroupUser) iterator.next();
                leagueGroupUsers.add(lg);
            }

            dbTransaction.commit();

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        log.info("Number of departments: " + leagueGroupUsers.size());

        return leagueGroupUsers;
    }

    public leagueGroupUser getLeagueGroupUser(Integer userId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<leagueGroupUser> departments = new ArrayList<leagueGroupUser>();
        Transaction dbTransaction = null;

        String query = ("FROM leaguegroupuser D WHERE D.userId =" + userId);

        try {
            dbTransaction = session.beginTransaction();
            departments = session.createQuery(query).list();

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        return departments.get(0);
    }

    public leagueGroupUser getLeagueGroupUserBy(String userId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<leagueGroupUser> departments = new ArrayList<leagueGroupUser>();
        Transaction dbTransaction = null;


        String query = ("FROM leaguegroupuser D WHERE D.userId = " + userId);

        log.info("GetLeagueGroupUserBy Query: " + query);

        try {
            dbTransaction = session.beginTransaction();
            departments = session.createQuery(query).list();

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        return departments.get(0);
    }


    public void updateLeagueGroupUser(leagueGroupUser u) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction dbTransaction = null;
        try {
            dbTransaction = session.beginTransaction();

            leagueGroupUser leagueGroupUserUpdate = (leagueGroupUser)session.get(leagueGroupUser.class, u.getUserId());


            leagueGroupUserUpdate.setUserName(u.getUserName());
            leagueGroupUserUpdate.setSummonerName(u.getSummonerName());
            leagueGroupUserUpdate.setEmail(u.getEmail());
            leagueGroupUserUpdate.setPassword(u.getPassword());


            session.update(leagueGroupUserUpdate);
            dbTransaction.commit();

        } catch (HibernateException error) {
            if (dbTransaction != null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }
    }


    public Boolean deleteLeagueGroupUser(leagueGroupUser u) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction dbTransaction = null;

        try {
            dbTransaction = session.beginTransaction();
            leagueGroupUser uToDelete = (leagueGroupUser)session.get(leagueGroupUser.class, u.getUserId());
            session.delete(uToDelete);
            dbTransaction.commit();

        } catch (HibernateException error) {
            if (dbTransaction != null) dbTransaction.rollback();
            error.printStackTrace();
            return false;
        } finally {
            session.close();
        }

        return true;
    }


    public int addDepartment(leagueGroupUser u) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction dbTransaction = null;
        Integer id = null;

        try {
            dbTransaction = session.beginTransaction();
            id = (Integer) session.save(u);
            dbTransaction.commit();

            log.info("Added User: " + u + " with id of: " + id);

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            log.error(error);
        } finally {
            session.close();
        }
        return id;
    }
}
