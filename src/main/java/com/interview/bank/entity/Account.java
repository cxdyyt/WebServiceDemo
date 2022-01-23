package com.interview.bank.entity;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

@Repository
public class Account implements Serializable {

    private static final long serialVersionUID = -2307086062103176361L;

    public Account() {
        super();
    }

    @TableId(type = IdType.AUTO)
    Integer id;

    String name;

    String gender;

    Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // public Date getBirthday() {
    // return birthday;
    // }
    //
    // public void setBirthday(Date birthdate) {
    // this.birthday = birthdate;
    // }

}
