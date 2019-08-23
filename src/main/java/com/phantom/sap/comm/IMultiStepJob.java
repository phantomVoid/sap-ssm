package com.phantom.sap.comm;

public interface IMultiStepJob {
    public boolean runNextStep();

    String getName();

    public void cleanUp();
}
