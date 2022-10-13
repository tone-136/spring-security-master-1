package com.example.springsecuritymaster.security.annotaion.customers;

import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static com.example.springsecuritymaster.security.SecurityRoles.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Secured(ROLES_PREFIX+CUSTOMERS_ADMIN)
public @interface IsCustomerAdmin {
}
