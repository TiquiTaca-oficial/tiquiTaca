package com.project.tiquitaca.Users.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class userVo {
    private String userId;
    private String email;
    private String nickName;

    private String validKey;
    private boolean Certify;
    private String image;
}
