package com.offcn.service;

import com.offcn.bean.User;

import java.util.List;

public interface UserService {
    List<User> getList();

    boolean saveInfo(User user);

    User look(int uid);

    void update(User user);

    void delete(int uid);

	User selectUser(User user);
}
