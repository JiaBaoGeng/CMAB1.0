package cn.jbg.cmab.service;

import cn.jbg.cmab.bean.Item;
import cn.jbg.cmab.bean.ItemExample;
import cn.jbg.cmab.dao.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by jbg on 2018/3/16.
 */
@Service
public class ItemService {
    @Autowired
    private ItemMapper itemMapper;

    public List<Item> queryItems(Map params){

        ItemExample example = new ItemExample();
        ItemExample.Criteria criteria = example.createCriteria();
        criteria.andItemInventoryGreaterThan(0);

        String itemName = params.get("itemName").toString();
        if(itemName!=null && !itemName.equals("")){
            itemName = "%" + itemName + "%";
            criteria.andItemNameLike(itemName);
        }
        return itemMapper.selectByExample(example);
    }
}
