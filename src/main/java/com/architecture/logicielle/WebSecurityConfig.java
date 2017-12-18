package com.architecture.logicielle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.LdapShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	// parametres de connexion LDAP
	
	@Value("${ldap.urls}")
	private String ldapUrls;
	
//	@Value("${ldap.base.dn}")
//	private String ldapBaseDn;
	
	@Value("${ldap.group}")
	private String ldapGroup;
	
	@Value("${ldap.user.dn.pattern}")
	private String ldapUserDnPattern;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http
        .authorizeRequests()
            .antMatchers("/inscription").permitAll()
            .anyRequest().authenticated()
            .and()
        .formLogin()
            .loginPage("/login")
            .failureUrl("/login?error")
            .permitAll()
            .and()
        .logout().logoutUrl("/logout").logoutSuccessUrl("/login?logout");
    }
	
	@Override
	public void configure(WebSecurity web) throws Exception {
	    web
	       .ignoring()
	       .antMatchers("/static/**","/bootstrap/**","/EditProfile/bootstrap/**");
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		// authentification LDAP
		auth
		.ldapAuthentication()
			.userDnPatterns(ldapUserDnPattern)
			.groupSearchBase(ldapGroup)
			.contextSource()
				.url(ldapUrls)
				.and()
			.passwordCompare()
				.passwordEncoder(new LdapShaPasswordEncoder())
				.passwordAttribute("userPassword");	
	}
	
}
