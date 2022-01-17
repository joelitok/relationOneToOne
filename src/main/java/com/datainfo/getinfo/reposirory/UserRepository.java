package com.datainfo.getinfo.reposirory;

import java.util.List;

import com.datainfo.getinfo.bean.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByNameAndCountry(String name, String country);
}
