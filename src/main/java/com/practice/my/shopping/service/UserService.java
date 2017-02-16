package com.practice.my.shopping.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.practice.my.shopping.entity.User;

@Stateless
public class UserService {

	 @PersistenceContext
	 private EntityManager em;
	 
	 
	 public User addUser(User user) {
		 em.persist(user);
		 return user;
	 }
	 
	 public User updateUser(User user) {
		 
		 User foundUser = em.find(User.class, user.getId());
		 if(foundUser == null) {
			 // TODO: throw exception
		 }
		 em.merge(user);
		 
		 return user;
	 }
	 
	 public List<User> getAllUsers() {
		 List<User> users = new ArrayList<>();
		 users = em.createNamedQuery(User.FIND_ALL, User.class).getResultList();
		 return users;
	 }
	 
}
