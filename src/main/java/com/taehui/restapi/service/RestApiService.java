package com.taehui.restapi.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taehui.restapi.mapper.RestApiMapper;

@Service
public class RestApiService{
	
	@Autowired
    RestApiMapper restApiMapper;
	
	public List<Map<String, Object>> restApiList(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return restApiMapper.selectStation(map);
	}
	public int restApiListCount(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return restApiMapper.selectStationCount(map);
	 }
}
