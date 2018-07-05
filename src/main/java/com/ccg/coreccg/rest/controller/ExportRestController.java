package com.ccg.coreccg.rest.controller;

import com.ccg.coreccg.rest.util.RestUtils;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@RestController
@RequestMapping("/export/api")
public class ExportRestController {

    @GetMapping("/ctypes")
    public String getJsonCTypes() {

        RestTemplate restTemplate = RestUtils.createProxyRestTemplate();
        String object = restTemplate.getForObject(
                "http://divniisad.ru/api/method/content.get_ctypes?api_key=70f6cfa88076c79d1b8931ec0f3a09c1",
                String.class);
        JSONObject jsonObject = new JSONObject(object);
        JSONObject items = jsonObject.getJSONObject("response").getJSONObject("items");
        Set<String> keySet = items.keySet();
        String res = "";
        for (String key : keySet) {
            res += items.getJSONObject(key).getString("title") + " ";
        }
        return res;
    }

}
