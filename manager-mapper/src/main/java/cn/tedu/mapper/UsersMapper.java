package cn.tedu.mapper;

import cn.tedu.pojo.Users;

import java.util.List;

/**
 * @Auther: panda
 * @Date: 2019/5/14
 * @Descripton: cn.tedu
 * @version: 1.0
 */
public interface  UsersMapper {
    /**
    * 功能描述:
    *   查找所有的用户
    * @parm: []
    * @return: java.util.List<cn.tedu.pojo.Users>
    * @auther: panda
    * @date: 2019/5/14 15:53
    */

      List<Users> findAllUser();
      /**
      * 功能描述:
      *   增加用户
      * @parm: [users]
      * @return: void
      * @auther: panda
      * @date: 2019/5/14 16:02
      */

     void addUser(Users users);
}
