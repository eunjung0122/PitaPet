package com.pet.spring.adopt.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pet.spring.adopt.dto.AdoptDto;
import com.pet.spring.adopt.dto.ReserveDto;

public interface AdoptService {
	
	public List<AdoptDto> getList(HttpServletRequest request);
	//테스트용-후에 삭제될 부분
	public void testGetList(HttpServletRequest request);
	public Map<String, Object> getListPaging(HttpServletRequest request);
	public Map<String, Object> addViewCount(int num);
	public AdoptDto getDetail(HttpServletRequest request);
	//테스트용
	public AdoptDto testGetDetail(HttpServletRequest request);
	public AdoptDto updateDetail(HttpServletRequest request);
	public Map<String, Object> insert(AdoptDto dto, HttpServletRequest request);	
	public Map<String, Object> update(AdoptDto dto, HttpServletRequest request);
	public Map<String, Object> delete(int num);
	//생일 메인 노출
	public AdoptDto mainBirthData();
	public List<AdoptDto> mainBirthList();
	
}
