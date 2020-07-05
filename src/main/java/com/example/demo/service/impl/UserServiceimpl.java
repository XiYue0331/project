package com.example.demo.service.impl;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @description 
* @author GAO JIAN
* @create 2020-6-30
**/

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDAO uDAO;

    @Override
    public List<User> getAllUser() {
        return uDAO.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return uDAO.findById(id).orElse(null);
    }

    @Override
    public boolean deleteUser(Integer id) {
        uDAO.deleteById(id);
        return true;
    }

    @Override
    public boolean insert(User user) {
        if(user!=null) {
            uDAO.save(user);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean update(Integer uid, Integer salary) {
        return false;
    }
}
