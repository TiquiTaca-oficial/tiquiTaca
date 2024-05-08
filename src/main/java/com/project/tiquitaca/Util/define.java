package com.project.tiquitaca.Util;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class define {
    public static final String AUTH_VERSION_PATH = "/api/v1/auth";
    @PostMapping("/kakao") //@ResponseBody ResponseEntity<MsgEntity>
    public void kakaoLogin(HttpServletResponse response) throws Exception{
//        if(!jwtService.validateToken(uservo.getToken())) //올바른 액세스 토큰인지 확인
//            return ResponseEntity.badRequest().build();

//        String value = kakaoService.getUserInfoWithToken(uservo.getToken(),"login");
//        if (value== "202")
//            return ResponseEntity.badRequest().build();
//        //jwt return 해줘야함
//        //refresh에서
//        Integer userid = userService.findUserID(value);
////        Token jwt = tokenService.findJwtoken(userid);
//        //tokendptj userid를 가진 행을 지우고 새롭게 만들어서 저장~
//        tokenService.deletedId(userid);
//
//        token jwt = jwtService.createJwt(value,userid,"kakao");
//        TokenSaveRequestDto token = new TokenSaveRequestDto(
//                jwt.getAccess(),jwt.getRefresh(),userid,value);
//        tokenService.save(token);
//        return ResponseEntity.ok().body(new MsgEntity(jwt.getAccess(),jwt.getRefresh()));
    }
}
