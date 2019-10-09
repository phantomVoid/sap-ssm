package com.phantom.comm;

import com.phantom.comm.enums.ListFlag;
import com.phantom.model.TCoItem;

import java.util.List;

/**
 * 用户工具类
 *
 * @author:phantomsaber
 * @version:2019/8/4 0:52
 * @email:phantomsaber@foxmail.com
 **/
public class ListUtils {
    /**
     * 判断List
     * @param list List
     * @return
     */
    public static ListFlag judgeList(List list){
        if(list != null){
            int size = list.size();
            if (size == 1){
                return ListFlag.Unique;
            }else if(size > 1){
                return ListFlag.Multiple;
            }else{
                return ListFlag.None;
            }
        }else{
            return ListFlag.None;
        }
    }
}
