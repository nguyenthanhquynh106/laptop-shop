package com.laptopshop.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;

@Component
public class SimpleAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private final RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        // Nếu có vai trò admin, chuyển đến trang "/admin" nếu login thành công
        if (roles.contains("ROLE_ADMIN")) {
            try {
                redirectStrategy.sendRedirect(request, response, "/admin");
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (roles.contains("ROLE_MEMBER")) {
            try {
                redirectStrategy.sendRedirect(request, response, "/");
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (roles.contains("ROLE_SHIPPER")) {
            try {
                redirectStrategy.sendRedirect(request, response, "/shipper");
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalStateException();
        }

    }

}
