package com.phantom.sap.intf;
import javax.jws.WebService;
import java.util.Map;

@WebService(name = "ItemLevelIntf", targetNamespace = "http://cxf.temptation.cn/")
public interface ItemLevelIntf {
    String exec();
}
