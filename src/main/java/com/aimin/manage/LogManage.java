package com.aimin.manage;

import org.apache.log4j.Logger;

public class LogManage {

    public  static final Logger getLogger (Class objClass) {
        return Logger.getLogger(objClass);
    }
}
