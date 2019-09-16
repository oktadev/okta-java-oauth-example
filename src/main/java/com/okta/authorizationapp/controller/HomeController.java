package com.okta.authorizationapp.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    private Map<String, LocalDateTime> usersLastAccess = new HashMap<>();

        @GetMapping("/")
        public String getCurrentUser(@AuthenticationPrincipal OidcUser user, Model model) {
            String email = user.getEmail();

            model.addAttribute("email", email);
            model.addAttribute("lastAccess", usersLastAccess.get(email));
            model.addAttribute("firstName", user.getGivenName());
            model.addAttribute("lastName", user.getFamilyName());

            usersLastAccess.put(email, LocalDateTime.now());

            return "home";
        }

}
