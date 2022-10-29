package com.demo.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Autowired
	public void ConfigureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery("SELECT username, password, active FROM Users WHERE username=?")
				.authoritiesByUsernameQuery("SELECT username, role FROM UsersRoles WHERE username=?");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/login", "/").permitAll();
		http.authorizeRequests().antMatchers("/B*/**", "/A*/**").access("hasRole('USER')");
		http.authorizeRequests().antMatchers("/test").access("hasRole('ADMIN')");

		http.formLogin().loginPage("/login");
	}

}
