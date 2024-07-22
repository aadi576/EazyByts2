package com.example.trading.security;

import java.util.List;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.trading.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfig implements SecurityFilterChain {

    private final UserService userService;

    public SecurityConfig(UserService userService) {
        this.userService = userService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /*
     * ~~(Migrate manually based on
     * https://spring.io/blog/2022/02/21/spring-security-without-the-
     * websecurityconfigureradapter)~~>
     *//*
        * ~~(Migrate manually based on
        * https://spring.io/blog/2022/02/21/spring-security-without-the-
        * websecurityconfigureradapter)~~>
        *//*
           * ~~(Migrate manually based on
           * https://spring.io/blog/2022/02/21/spring-security-without-the-
           * websecurityconfigureradapter)~~>
           *//*
              * ~~(Migrate manually based on
              * https://spring.io/blog/2022/02/21/spring-security-without-the-
              * websecurityconfigureradapter)~~>
              */ protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .authorizeRequests(requests -> requests
                        .antMatchers("/api/auth/**").permitAll()
                        .anyRequest().authenticated())
                .sessionManagement(management -> management
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    }

    /*
     * ~~(Migrate manually based on
     * https://spring.io/blog/2022/02/21/spring-security-without-the-
     * websecurityconfigureradapter)~~>
     *//*
        * ~~(Migrate manually based on
        * https://spring.io/blog/2022/02/21/spring-security-without-the-
        * websecurityconfigureradapter)~~>
        *//*
           * ~~(Migrate manually based on
           * https://spring.io/blog/2022/02/21/spring-security-without-the-
           * websecurityconfigureradapter)~~>
           *//*
              * ~~(Migrate manually based on
              * https://spring.io/blog/2022/02/21/spring-security-without-the-
              * websecurityconfigureradapter)~~>
              *//**
                 * @return
                 * @throws Exception
                 */
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return null;

    }

    @Override
    public boolean matches(HttpServletRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'matches'");
    }

    @Override
    public List<Filter> getFilters() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFilters'");
    }
}
