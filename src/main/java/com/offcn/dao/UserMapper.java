package com.offcn.dao;

import com.offcn.bean.User;

import java.util.List;

/**
 * @ todo:
 * @ date:2019/4/18
 */
public interface UserMapper {
    public List<User> getList();

    int saveInfo(User user);

    User look(int uid);

    void update(User user);

    void delete(int uid);

	public User selectUser(User user);
}
