package com.guanbo.cxfwebservice.impl;

import com.guanbo.cxfwebservice.domain.User;
import com.guanbo.cxfwebservice.service.UserService;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;


@WebService(targetNamespace = "http://service.cxfwebservice.guanbo.com/",endpointInterface = "com.guanbo.cxfwebservice.service.UserService")
public class UserServiceImpl implements UserService {

    private final static List<User> userList = new ArrayList<>();

    static {
        User user = new User();
        user.setUserName("张三");
        user.setPassword("1111");
        user.setAddress("北京市");

        User user1 = new User();
        user1.setUserName("李松");
        user1.setPassword("2222");
        user1.setAddress("平阳");

        User user2 = new User();
        user2.setUserName("张武");
        user2.setPassword("3333");
        user2.setAddress("淮阳");

        userList.add(user);
        userList.add(user1);
        userList.add(user2);
    }

    @Override
    public User getUserByUserName(String userName) {
        User resultUser = null;
        for (User user : userList) {
            if(user.getUserName().equals(userName)){
                resultUser = user;
                break;
            }
        }
        return resultUser;
    }


}
