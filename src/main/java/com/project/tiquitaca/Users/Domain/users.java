package com.project.tiquitaca.Users.Domain;

import jakarta.persistence.*;
import lombok.Builder;

public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column
    private String email;
    @Column
    private String nickName;

    @Column
    private String validKey;
    @Column
    private boolean Certify;
    @Column
    private String image;
    @Enumerated(EnumType.STRING)
    private enumCode auth;
    @Builder
    public users(String email,String nickname, String validKey,boolean Certify, String image) {
        this.email = email;
        this.nickName = nickname;
        this.validKey = validKey;
        this.Certify = Certify;
        this.image = image;
    }
}
