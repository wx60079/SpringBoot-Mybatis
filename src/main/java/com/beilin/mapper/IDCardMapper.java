package com.beilin.mapper;

import com.beilin.entity.IDCard;

import java.util.List;

public interface IDCardMapper {



    //增
    public void insert(IDCard iDCard);

    //删
    public void delete(Integer uid);

    //改
    public void update(IDCard iDCard);

    //查
    public IDCard getByUid(Integer uid);

    /**
     * 获取包括user信息的身份证列表
     */
    public List<IDCard>  getListIdOfUser();

}