package com.yinhai.common.webservice;

import com.yinhai.common.webservice.result.ResponseResult;
import com.yinhai.common.webservice.result.ResponseResultHelper;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import static java.lang.System.exit;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("webservice")
@EnableScheduling
public class YinHaiController {

    private static final Logger LOG = Logger.getLogger(YinHaiController.class.getName());

    @PostMapping(value = "/getData")
    @ResponseBody
    public ResponseResult getData(@RequestBody QueryDto dto) {
        return ResponseResultHelper.returnResult(responseResult -> {
            String data = YinHaiBusinessImplPortClient.send(dto.getTarget(), dto.getInputJson().toString(), dto.getJybh());
            responseResult.put("data", data);
        });
    }

//
//    @Scheduled(fixedRate = 60 * 60 * 1000)
//    public void init() {
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //创建日期转换对象：年 月 日
//            String date = "2040-8-15"; //假设 设定日期是  2018-11-11
//            String webUrl = "https://www.baidu.com";
//            URLConnection conn = new URL(webUrl).openConnection();
//            conn.connect();
//            long dateL = conn.getDate();
//            Date today = new Date(dateL); //今天 实际日期是  2018-11-12    Debug：Wed Nov 12 12:08:12 CST 2018
//            Date dateD = sdf.parse(date); //将字符串转换为 date 类型  Debug：Sun Nov 11 00:00:00 CST 2018
//            boolean flag = dateD.getTime() >= today.getTime();
//            if (!flag) {
//                LOG.info("到期");
//                exit(0);
//            }
//        } catch (Exception e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        }
//    }
}
