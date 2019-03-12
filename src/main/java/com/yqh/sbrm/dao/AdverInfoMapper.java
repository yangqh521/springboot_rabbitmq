package com.yqh.sbrm.dao;


import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.yqh.sbrm.entity.AdverInfo;


@Mapper
public interface AdverInfoMapper {
    
	List<AdverInfo> getAdverInfoList(Map<String,Object> map);
	
	
}