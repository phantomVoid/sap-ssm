package com.phantom.sap.comm;

import com.sap.conn.jco.ext.JCoSessionReference;
import java.util.concurrent.atomic.AtomicInteger;

public class RfcSessionReference implements JCoSessionReference {
    static AtomicInteger atomicInt = new AtomicInteger(0);
    private String id = "session-" + String.valueOf(atomicInt.addAndGet(1));

    @Override
    public void contextFinished() {
    }

    @Override
    public void contextStarted() {
    }

    @Override
    public String getID() {
        return id;
    }

}