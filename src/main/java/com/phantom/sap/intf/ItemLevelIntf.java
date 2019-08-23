package com.phantom.sap.intf;
import javax.jws.WebService;

@WebService(name = "ItemLevelIntf", targetNamespace = "http://cxf.temptation.cn/")
public interface ItemLevelIntf {
    String exec();
}
