package com.cg.friends.management.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import com.cg.friends.management.dao.FriendsDao;
import com.cg.friends.management.model.Friends;

@Repository
public class FriendsDaoImpl implements FriendsDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List getFriendsDetails() {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(Friends.class);
		return criteria.list();
	}
}
