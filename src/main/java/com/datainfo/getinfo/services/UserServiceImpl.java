package com.datainfo.getinfo.services;

import java.util.List;

import com.datainfo.getinfo.bean.User;
import com.datainfo.getinfo.reposirory.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(User user) {
		System.out.println("user addr:"+user.getAddress().getCity());
		userRepository.save(user);
	}

    @Override
    public User findById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
		//return null;
	}
    @Override
	public User update(User user, long l) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
    @Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
    @Override
	public User updatePartially(User user, long id) {
		// TODO Auto-generated method stub
		User usr = findById(id);
		usr.setCountry(user.getCountry());
		return userRepository.save(usr);
	}

    @Override
	public List<User> findByNameAndCountry(String name, String country) {
		return userRepository.findByNameAndCountry(name, country);
	}

    @Override
    public List<User> getUser() {
        // TODO Auto-generated method stub
        return (List<User>) userRepository.findAll();
    }
   
}
