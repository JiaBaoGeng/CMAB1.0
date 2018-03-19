package cn.jbg.cmab.service;

import cn.jbg.cmab.bean.Users;
import cn.jbg.cmab.bean.UsersExample;
import cn.jbg.cmab.dao.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jbg on 2018/2/8.
 */
@Service
public class UsersService {
    @Autowired
    private UsersMapper usersMapper;

    public String test(){
        List<Users> allUsers = new ArrayList<Users>();
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria= usersExample.createCriteria();
        criteria.andUsernameEqualTo("gaochw");

         allUsers= usersMapper.selectByExample(usersExample);
        return "Hello World" + allUsers.toString();
    }
}
