package com.yqh.sbrm.service;

import java.util.List;
import java.util.Map;

import com.yqh.sbrm.entity.AdverInfo;

public interface AdverInfoService {

	List<AdverInfo> getAdverInfoList(Map<String,Object> map);
	
}
