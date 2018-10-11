package com.cg.friends.management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.friends.management.dao.FriendsDao;
import com.cg.friends.management.service.FriendsService;


	@Service
	public class FriendsServiceImpl implements FriendsService {

		@Autowired
		private FriendsDao friendsDao;

		@Override
		public List getFriends() {
			// TODO Auto-generated method stub
			return friendsDao.getFriendsDetails();
		}	

	}

