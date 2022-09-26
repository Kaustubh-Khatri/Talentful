package com.matches.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matches.model.GetFootballMatchResponse;

@Service
public class FootballService {
	@Autowired
	RestTemplateConfig restTemplate;

	public GetFootballMatchResponse getFootballMatchResponse() {
		GetFootballMatchResponse getFootballMatchResponse =  restTemplate.restTemplate().getForEntity("https://jsonmock.hackerrank.com/api/football_matches/",
				GetFootballMatchResponse.class).getBody();
		
		System.out.println(" >>>> " + getFootballMatchResponse.getMatches().size());
		
		return getFootballMatchResponse;
	}
}
