package com.odessey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.odessey.model.Mission;
import com.odessey.service.OdesseyService;


@Controller
@RequestMapping("/")
public class OdesseyController {
	@Autowired
	@Qualifier("odesseymissionservice")
	private OdesseyService odesseyMissionService;
	
	@Autowired
	@Qualifier("odesseyastronautservice")
	private OdesseyService odesseyastronautservice;
	@RequestMapping(value="/missions", method=RequestMethod.GET)
	public String viewMissionDetails(Model missionModel){
		List<Mission> missionList=odesseyMissionService.getMissionDetails();
		missionModel.addAttribute("missionDetailList",missionList);
		System.out.println("mission details controller");
		return "missiondetails";
		
	}
}
