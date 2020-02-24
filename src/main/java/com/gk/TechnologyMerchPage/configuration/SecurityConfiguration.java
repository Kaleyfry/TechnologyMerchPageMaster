package com.gk.TechnologyMerchPage.configuration;

import java.util.Collection;

import javax.persistence.Transient;

//import org.springframework.security.core.GrantedAuthority;

public class SecurityConfiguration { //extends UserDetails{

	 @Transient
	  private boolean accountNonExpired = true;
	  @Transient
	  private boolean accountNonLocked = true;
	  @Transient
	  private boolean credentialsNonExpired = true;
	  @Transient
	  private boolean enabled = true;
//	  @Transient
//	  private Collection<GrantedAuthority> authorities = null;
	
}
