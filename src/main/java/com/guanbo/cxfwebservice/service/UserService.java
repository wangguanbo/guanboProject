package com.guanbo.cxfwebservice.service;

import com.guanbo.cxfwebservice.domain.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface UserService {

    @WebMethod
    public User getUserByUserName(@WebParam(name = "userName") String userName);


}
