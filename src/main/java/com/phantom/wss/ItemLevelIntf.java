package com.phantom.wss;
import javax.jws.WebService;

@WebService(name = "ItemLevelIntf", targetNamespace = "http://cxf.temptation.cn/")
public interface ItemLevelIntf {
    String exec();
}
