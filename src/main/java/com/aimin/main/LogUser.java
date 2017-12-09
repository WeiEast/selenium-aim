package com.aimin.main;

import com.aimin.manage.LogManage;
import org.apache.log4j.Logger;

public class LogUser {
    private static final Logger logger = LogManage.getLogger(LogUser.class);
    public static void main (String[] args) {
        logger.debug("这是debugger信息");
        logger.info("这是普通信息");
        logger.error("这是错误信息");
    }
}
