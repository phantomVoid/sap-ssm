package com.phantom.comm;

import com.phantom.dao.TCoItemDao;
import com.phantom.model.TCoItem;
import com.phantom.model.TCoItemExample;

import java.util.ArrayList;
import java.util.List;

/**
 * 物料基础数据工具类
 * @author:phantomsaber
 * @version:2019/10/4 17:29
 * @email:phantomsaber@foxmail.com
 **/
public class ItemUtils {

    /**
     * 获取 itemList
     * @param itemDao
     * @param itemCode 物料号
     * @return
     */
    public static List<TCoItem> getItemByItemCode(TCoItemDao itemDao,String itemCode){
        List<TCoItem> res = new ArrayList<>();
        try {
            TCoItemExample itemExp = new TCoItemExample();
            TCoItemExample.Criteria itemExpCri = itemExp.createCriteria();

            itemExpCri.andCI_ITEM_CODEEqualTo(itemCode);
            res = itemDao.selectByExample(itemExp);
        } catch (Exception e) {
            res = null;
        }
        return res;
    }

    public static TCoItem getItemByList(List<TCoItem> itemList){
        return itemList.get(0);
    }
}
