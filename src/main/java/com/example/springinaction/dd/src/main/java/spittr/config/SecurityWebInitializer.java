package spittr.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

// 拦截发往应用的请求 委托给ID是springSecurityFilterChain 的bean
//import org.springframework.security.web.context.;
public class SecurityWebInitializer extends AbstractSecurityWebApplicationInitializer {

}
