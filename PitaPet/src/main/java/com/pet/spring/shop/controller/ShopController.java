package com.pet.spring.shop.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pet.spring.shop.dto.ShopDto;
import com.pet.spring.shop.service.ShopService;

@Controller
public class ShopController {
	
	@Autowired
	private ShopService service;
	
	@RequestMapping("/shop/list")
	public ModelAndView getList(ModelAndView mView,HttpServletRequest request) {
		service.getList(mView, request);
		mView.setViewName("shop/list");
		return mView;
	}
	
	@RequestMapping("/shop/insertForm")
	public String insertForm() {
		return "shop/insertform";
	}
	
	@RequestMapping("/shop/ajaxUpload")
	@ResponseBody
	public Map<String, Object> authAjaxUpload(ShopDto dto, HttpServletRequest request){		
		return service.uploadAjaxImage(dto, request);
	}
	
	@RequestMapping("/shop/insert")
	public ModelAndView authInsert(ShopDto dto,HttpServletRequest request, ModelAndView mView) {
		service.insert(dto);
		mView.setViewName("redirect:/shop/list.do");
		return mView;
	}
	

}
