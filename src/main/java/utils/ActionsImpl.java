package utils;

import entites.User;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ActionsImpl implements Actions {

    @Override
    public void createEntry(Object currentEntry) {
        Session session = HibernateSessionFactory.buildSessionFactory().openSession();
        session.beginTransaction();

        session.save(currentEntry);
        session.getTransaction().commit();

        session.close();
    }

    @Override
    public void deleteEntry(Object currentEntry) {
        Session session = HibernateSessionFactory.buildSessionFactory().openSession();
        session.beginTransaction();

        session.delete(currentEntry);
        session.getTransaction().commit();

        session.close();
    }

    @Override
    public void updateEntry(Object currentEntry) {
        Session session = HibernateSessionFactory.buildSessionFactory().openSession();
        session.beginTransaction();

        session.update(currentEntry);
        session.getTransaction().commit();

        session.close();
    }

    @Override
    public List<User> getAllEntries() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
        Root<User> root = criteriaQuery.from(User.class);
        criteriaQuery.select(root);

        Query query = session.createQuery(criteriaQuery);
        List<User> results = query.getResultList();
        session.close();
        return results;
    }

    @Override
    public Object getEntryById(int id) {
        return null;
    }
}
