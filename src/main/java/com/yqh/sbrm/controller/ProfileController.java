package com.yqh.sbrm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.yqh.sbrm.entity.AdverInfo;
import com.yqh.sbrm.service.AdverInfoService;


@RestController
@RequestMapping("/profile")
public class ProfileController {

	
	@Autowired
	private AdverInfoService adverInfoService;
	
	@RequestMapping("/get")
	public void getAdverInfo(Long adverId){
		Map<String,Object> queryMap = new HashMap<>();
		queryMap.put("adverId", adverId);
		List<AdverInfo> adverInfoList = adverInfoService.getAdverInfoList(queryMap);
		System.out.println("adverInfoList >>> " + JSONObject.toJSONString(adverInfoList));
	}
	
	
}
