package cn.tedu.service;

import cn.tedu.mapper.UsersMapper;
import cn.tedu.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: panda
 * @Date: 2019/5/14
 * @Descripton: cn.tedu.service
 * @version: 1.0
 */
@Service("userService")
public class UserService {
    @Autowired
    UsersMapper mapper;
    /**
    * 功能描述:
    *   查询所有用户的service层
    * @parm: []
    * @return: java.util.List<cn.tedu.pojo.Users>
    * @auther: panda
    * @date: 2019/5/14 16:28
    */

    public List<Users> findAllUser(){
        return mapper.findAllUser();
    }



    /**
    * 功能描述:
    *   增加用户的service
    * @parm: cn.tedu.service.UserService
    * @return: void
    * @auther: panda
    * @date: 2019/5/14 16:29
    */

    public void  addUser(Users users){
       mapper.addUser(users);
    }

    public int delUser(String id) {
       return  mapper.delUser(id);
    }
}
