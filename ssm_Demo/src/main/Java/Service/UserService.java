package Service;

import Entity.User;

public interface UserService {
    User selectById(String id);
}
