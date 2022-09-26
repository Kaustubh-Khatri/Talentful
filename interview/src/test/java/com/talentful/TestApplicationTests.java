package com.talentful;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.talentful.controller.CompanyController;
//import com.talentful.models.GetFootballMatchResponse;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TestApplicationTests {

	@Autowired
	private CompanyController controller;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
	
	@LocalServerPort
	private int port;	
	
	/*@Test
	public void getCompanyAllTest() throws Exception {
		System.out.println(restTemplate.getForObject("http://localhost:" + port + "/matches/b",
				ListGetFootballMatchResponse.class).getPage());
	}*/
	
}
