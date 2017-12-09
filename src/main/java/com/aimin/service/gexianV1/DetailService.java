package com.aimin.service.gexianV1;

import com.aimin.manage.LogManage;
import org.apache.log4j.Logger;

public interface DetailService {
    final Logger logger = LogManage.getLogger(DetailService.class);
    public void testModalByChrome (String url);
}
