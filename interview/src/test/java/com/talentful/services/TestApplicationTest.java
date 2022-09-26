package com.talentful.services;
/*package com.matches.services;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.talentful.models.GetFootballMatchResponse;
import com.talentful.service.FootballService;
import com.talentful.service.RestTemplateConfig;

@SpringBootTest
public class FootballServiceTest {
	@InjectMocks 
    private FootballService helloService = new FootballService();
	
	@Mock
	private RestTemplateConfig restTemplateConfig;
	
	@Test
	void testGet() {
		GetFootballMatchResponse footballMatchResponse = new GetFootballMatchResponse();
		footballMatchResponse.setPage(111);
		ResponseEntity responseEntity = Mockito.mock(ResponseEntity.class);
		when(responseEntity.getBody()).thenReturn(footballMatchResponse);

		when(restTemplateConfig.restTemplate().getForEntity(any(String.class), GetFootballMatchResponse.class)).thenReturn(responseEntity);
		System.out.println(" >>>> " + helloService.getFootballMatchResponse().getPage());
	}

}*/
