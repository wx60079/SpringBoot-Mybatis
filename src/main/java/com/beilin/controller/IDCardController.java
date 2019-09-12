package com.beilin.controller;

import com.beilin.entity.IDCard;
import com.beilin.entity.IDCardRequest;
import com.beilin.mapper.IDCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class IDCardController {
    @Autowired
    private IDCardMapper iDCardMapper;

    //插入IDCard信息
    @PostMapping("/insert")
    public void insert(@RequestBody IDCard iDCard){
        iDCardMapper.insert(iDCard);
    }

    //根据uid删除
    @RequestMapping("/delete/{uid}")
    public  void delete(@PathVariable("uid") Integer uid){
        iDCardMapper.delete(uid);
    }

    @RequestMapping("/update/{uid}")
    public void update(IDCardRequest idCardRequest, @PathVariable("uid") Integer uid){
        IDCard idCard = new IDCard();
        idCard.setCardId(idCardRequest.getCardId());
        idCard.setUid(idCardRequest.getUid());
        try{
            idCard.setBeginTime(this.strToDate(idCardRequest.getBeginTime()));
            idCard.setEndTime(this.strToDate(idCardRequest.getEndTime()));
        }catch (Exception e){
            e.printStackTrace();
        }
        iDCardMapper.update(idCard);
    }

    /**
     *  根据uid查询
     * @return
     */
    @RequestMapping("/select/{uid}")
    public IDCard getByUid(@PathVariable("uid") Integer uid) {
        IDCard iDCard = iDCardMapper.getByUid(uid);
        return iDCard;
    }

    /**
     * 查出带有user信息的身份证列表
     * @return
     */
    @GetMapping("/IDCardsOfUser")
    public List<IDCard> listOfUser(){
        List<IDCard>  iDCards=  iDCardMapper.getListIdOfUser();
        return iDCards;
    }

    private Date strToDate(String strDate) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.parse(strDate);
    }
}
