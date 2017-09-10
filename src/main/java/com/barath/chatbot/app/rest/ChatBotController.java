package com.barath.chatbot.app.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin("*")
public class ChatBotController {

    private RestTemplate restTemplate=new RestTemplate();
    private ObjectMapper mapper=new ObjectMapper();


    @GetMapping("/bot.html/demoQuery")
    public Object  handleRequestQuery(@RequestParam("q") String query, @RequestParam("sessionId") String sessionId) throws  Exception{

        System.out.println( " query "+query+" session id "+sessionId);
        String requestUrl="https://console.api.ai/api-client/demo/embedded/e8417c80-74db-420b-9501-25b14f8442b1/demoQuery?q="+query+"&sessionId="+sessionId;
        ResponseEntity<String> responseEntity=restTemplate.exchange(requestUrl, HttpMethod.GET,null,String.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()){
            System.out.println("Response body "+responseEntity.getBody());
        }

        return mapper.readValue(responseEntity.getBody(),Object.class);
    }
}

