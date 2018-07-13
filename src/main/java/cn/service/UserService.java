package java.cn.service;

import java.cn.domain.User;
import java.cn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectById(String id){
        return userMapper.selectById(id);
    }
}
