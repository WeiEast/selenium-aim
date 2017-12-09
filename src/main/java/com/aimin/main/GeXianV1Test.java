package com.aimin.main;

import com.aimin.service.gexianV1.DetailService;
import com.aimin.service.gexianV1.impl.DetailServiceImpl;

public class GeXianV1Test {
    public  static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/users/aimin/drivers/chromedriver");
        DetailService service = new DetailServiceImpl();
        service.testModalByChrome("https://app.winbaoxian.com/insureh5/view/template_detail_1.html?nw=1&productId=100153&utm_source=service&u=aec753ef29204dda9aabd278126463f3");
    }
}
