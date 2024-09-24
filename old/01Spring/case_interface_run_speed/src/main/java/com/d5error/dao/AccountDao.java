package com.d5error.dao;

import com.d5error.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AccountDao {
    @Insert("insert into account(id, name, money) VALUES (#{id}, #{name}, #{money})")
    void insert(Account account);

    @Delete("delete from account where id = #{id}")
    void deleteById(int id);

    @Update("update account set name = #{name}, money = #{money} where id = #{id}")
    void update(Account account);

    @Select("select * from account")
    List<Account> selectAll();

    @Select("select * from account where id = #{id}")
    Account selectById(int id);
}
