package com.d5error.dao;

import com.d5error.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {
    @Insert("insert into account(id, name, money) VALUES (#{id}, #{name}, #{money})")
    public void insert(Account account);

    @Delete("delete from account where id = #{id}")
    public void delete(int id);

    @Update("update account set name = #{name}, money = #{money} where id = ${id}")
    public void update(Account account);

    @Select("select * from account")
    public List<Account> selectAll();

    @Select("select * from account where id = #{id}")
    public Account selectById(int id);
}