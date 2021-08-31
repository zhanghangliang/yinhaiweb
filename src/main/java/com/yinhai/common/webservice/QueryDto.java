package com.yinhai.common.webservice;

import cn.hutool.json.JSONObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueryDto {

    private String target;
    private JSONObject inputJson;
    private String jybh;

}
