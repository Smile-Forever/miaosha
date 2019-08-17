package zxbv.online.miaosha.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import zxbv.online.miaosha.domain.User;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author zxb
 * @Date 2019/8/17 17:41
 * @Version 1.0
 */
@Mapper
public interface UserDao {
    @Select("select * from user where id=#{id}")
     User getById(@Param("id") int id);
    @Insert("insert into user (id , username) values (#{id},#{username})")
    int insert(User user);
}
