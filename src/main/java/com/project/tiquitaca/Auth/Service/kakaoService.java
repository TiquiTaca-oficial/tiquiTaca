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
//        JSONObject jsonObj = (JSONObject) new JSONParser().parse(accessToken);
//        String token = (String) jsonObj.get("token");
        //HttpHeader 생성
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", "Bearer " + token);
//        headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
//
//        //HttpHeader 담기
//        RestTemplate rt = new RestTemplate();
//        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity<>(headers);
//        ResponseEntity<String> response = rt.exchange(
//                KAKAO_API_URI + "/v1/user/access_token_info",//v2/user/me
//                HttpMethod.GET,
//                httpEntity,
//                String.class
//        );
//        //Response 데이터 파싱
//        JSONParser jsonParser = new JSONParser();
//        JSONObject jsonObj    = (JSONObject) jsonParser.parse(response.getBody());
//
//        Long id = (Long) jsonObj.get("id");
//        //users table에 id가 있는지 확인 후 없으면 프론트에게 실패코드 성공하면 성공코드
////       String code = userService.findTokenId(Long.toString(id));
////       if (type=="login" && code == null) return "202";
//
//       return Long.toString(id);
    }
}
