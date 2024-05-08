package com.project.tiquitaca.Auth.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.project.tiquitaca.Util.define.AUTH_VERSION_PATH;

@Slf4j
@RequestMapping(value = AUTH_VERSION_PATH)
@RestController
@RequiredArgsConstructor
public class SocailLoginController {
}
