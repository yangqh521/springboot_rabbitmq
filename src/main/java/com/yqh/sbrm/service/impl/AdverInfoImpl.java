package com.yqh.sbrm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yqh.sbrm.dao.AdverInfoMapper;
import com.yqh.sbrm.entity.AdverInfo;
import com.yqh.sbrm.service.AdverInfoService;

@Service
public class AdverInfoImpl implements AdverInfoService {

	@Autowired
	private AdverInfoMapper adverInfoMapper;

	@Override
	public List<AdverInfo> getAdverInfoList(Map<String, Object> map) {
		return adverInfoMapper.getAdverInfoList(map);
	}
	
	
	
	
	
	
}
