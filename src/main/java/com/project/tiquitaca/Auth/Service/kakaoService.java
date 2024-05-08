package com.project.tiquitaca.Auth.Service;

import jakarta.servlet.ServletException;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.json.JSONParser;
import org.json.simple.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RequiredArgsConstructor
@Service
public class kakaoService {
//    private final UserService userService;
    private final String KAKAO_API_URI = "https://kapi.kakao.com";

    public void getUserInfoWithToken(String token, String type) throws Exception,IOException, ServletException {

    }
}
