package registration.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import registration.dto.User;

public class UserCrud {
	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("priya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void saveUser(User u) {
		et.begin();
		em.persist(u);
		et.commit();
	}
	public User fetchByEmail(String email) {
		Query query = em.createQuery("select a from User a where email=?1");
		query.setParameter(1, email);
		return (User)query.getSingleResult();
	}
	public User fetchUser(int id) {
		Query query = em.createQuery("select a from User a where id=?1");
		query.setParameter(1, id);
		return (User)query.getSingleResult();
	}
	public List<User> fetchAll() {
		Query query = em.createQuery("select u from User u");
		return query.getResultList();
			
	}
	public void deleteUser(int id) {
		User db = em.find(User.class, id);
		if(db!=null) {
			et.begin();
			em.remove(db);
			et.commit();
		}else {
			System.out.println("your data is not present in database ");
		}
	}
	public Object fetchUserById(int id) {
		// TODO Auto-generated method stub
		User db = em.find(User.class, id);
		if(db!=null) {
			return db;
		}else {
		return null;
		}
	}
	public void updateUser(User u) {
		System.out.println(u);
		User db = em.find(User.class, u.getId());
		if(db!=null) {
			if(u.getFirst_name()!=null) {
				db.setFirst_name(u.getFirst_name());
			}
			if(u.getLast_name()!=null) {
				db.setLast_name(u.getLast_name());
			}
			if(u.getEmail()!=null) {
				db.setEmail(u.getEmail());
			}
			if(u.getPhone()!=0) {
				db.setPhone(u.getPhone());
			}
			if(u.getAge()!=0) {
				db.setAge(u.getAge());
			}
			if(u.getGender()!=null) {
				db.setGender(u.getGender());
			}
		}
	}
	
}
