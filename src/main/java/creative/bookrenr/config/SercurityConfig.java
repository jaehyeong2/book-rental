package creative.bookrenr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SercurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder encode(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().
//                antMatchers("/user/**", "/image/**", "/subscribe/**", "/comment/**", "/api/**").authenticated()
                antMatchers("/user/**", "/image/**", "/subscribe/**", "/comment/**").authenticated()
                .anyRequest().permitAll()
                .and().formLogin().loginPage("/auth/signin")
                .loginProcessingUrl("/auth/signin")
                .defaultSuccessUrl("/");
    }
}
