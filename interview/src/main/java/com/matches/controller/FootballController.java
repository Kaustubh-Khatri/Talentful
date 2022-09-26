package com.matches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.matches.model.GetFootballMatchResponse;
import com.matches.services.FootballService;

@RestController
@RequestMapping(path = "/matches/")
public class FootballController {
	
	@Autowired FootballService footballService;
	
	
	@RequestMapping(path = "{team}", method = RequestMethod.GET)
	public @ResponseBody GetFootballMatchResponse getFoolballMatches(@PathVariable (name = "team") String team) {
		System.out.println(" >>>> ");
		return footballService.getFootballMatchResponse();
	}

}
