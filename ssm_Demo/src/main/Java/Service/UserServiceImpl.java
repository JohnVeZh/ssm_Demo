package Service;

import Dao.UserMapper;
import Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectById(String id){
        return userMapper.selectById(id);
    }
}
