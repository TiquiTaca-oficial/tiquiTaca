package com.project.tiquitaca.Auth.Dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
@Data
public class SocialUserInfoDto {
    private long id;
    private String email;
    private String name;
}
