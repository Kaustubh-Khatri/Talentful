package com.talentful.service;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.client.RestTemplate;
 
@Configuration
public class RestTemplateConfig {
 
  CloseableHttpClient httpClient = new DefaultHttpClient();

  
  @Bean
  public RestTemplate restTemplate() {
    RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory());
    return restTemplate;
  }
 
  @Bean
  public HttpComponentsClientHttpRequestFactory clientHttpRequestFactory() {
    HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
    clientHttpRequestFactory.setHttpClient(httpClient);
    return clientHttpRequestFactory;
  }
 
  @Bean
  public TaskScheduler taskScheduler() {
    ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
    scheduler.setThreadNamePrefix("poolScheduler");
    scheduler.setPoolSize(50);
    return scheduler;
  }
}