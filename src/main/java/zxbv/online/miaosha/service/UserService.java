package zxbv.online.miaosha.service;

import org.apache.ibatis.annotations.Param;
import zxbv.online.miaosha.domain.User;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author zxb
 * @Date 2019/8/17 17:45
 * @Version 1.0
 */
public interface UserService {
    User getById(@Param("id") int id);

    boolean tx();
}
