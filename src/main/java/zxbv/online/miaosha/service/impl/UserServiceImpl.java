package zxbv.online.miaosha.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zxbv.online.miaosha.dao.UserDao;
import zxbv.online.miaosha.domain.User;
import zxbv.online.miaosha.service.UserService;

/**
 * @ClassName UserserviceImpl
 * @Description TODO
 * @Author zxb
 * @Date 2019/8/17 17:45
 * @Version 1.0
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean tx() {
        User u1 = new User();
        u1.setId(2);
        u1.setUsername("222");
        userDao.insert(u1);

        User u2 = new User();
        u2.setId(1);
        u2.setUsername("111");
        userDao.insert(u2);

        return true;
    }
}
