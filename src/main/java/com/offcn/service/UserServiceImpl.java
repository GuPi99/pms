package com.offcn.service;

import com.offcn.bean.User;
import com.offcn.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ todo:
 * @ date:2019/4/18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public List<User> getList() {
        return userMapper.getList();
    }

    public boolean saveInfo(User user) {
        return userMapper.saveInfo(user)==1;
    }

    public User look(int uid) {
        return userMapper.look(uid);
    }

    public void update(User user) {
         userMapper.update(user);
    }

    public void delete(int uid) {
        userMapper.delete(uid);
    }

	public User selectUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.selectUser(user);
	}
}
