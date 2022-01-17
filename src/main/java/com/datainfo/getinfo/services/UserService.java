package com.datainfo.getinfo.services;

import java.util.List;

import com.datainfo.getinfo.bean.User;




public interface UserService {
    public void createUser(User user); 
	public List<User> getUser();
	public User findById(long id);
	public User update(User user, long l);
	public void deleteUserById(long id);
	public User updatePartially(User user, long id);
	public List<User> findByNameAndCountry(String name, String country);


}
