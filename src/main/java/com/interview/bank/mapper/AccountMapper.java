package com.interview.bank.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.interview.bank.entity.Account;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}
