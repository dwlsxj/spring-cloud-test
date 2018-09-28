package com.jtech.microservice.springcloudmonitor;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbineStream
@EnableAdminServer
public class SpringCloudMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMonitorApplication.class, args);
    }

    @Configuration
    public static class SecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            // 具有登录表单的页面作为/login.html提供，并在/ login上执行POST。
            http.formLogin().loginPage("/login.html").loginProcessingUrl("/login").permitAll();
            // 设置登出页面地址。
            http.logout().logoutUrl("/logout");
            // 设置目前不支持csrf。
            http.csrf().disable();

            // 允许静态页面，静态数据的访问。
            http.authorizeRequests()
                    .antMatchers("/login.html", "/**/*.css", "/img/**", "/third-party/**")
                    .permitAll();
            // 除了授权的页面所有内容都要进行授权访问。
            http.authorizeRequests().antMatchers("/**").authenticated();

            // 启用安全认证，以便客户端可以通过HTTP basic进行身份验证以进行注册。
            http.httpBasic();
        }
    }
}
