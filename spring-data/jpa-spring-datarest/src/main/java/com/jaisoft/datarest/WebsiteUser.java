package com.jaisoft.datarest;
import org.springframework.data.rest.core.annotation.RestResource;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Entity
@Setter
@Getter
@NoArgsConstructor
@RestResource(rel="users", path="users")
public class WebsiteUser implements  Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String name;
    public String email;

    public WebsiteUser(String name, String email) {
        this.name = name;
        this.email = email;
        
    }



    @Override
    public boolean supports(Class<?> clazz) {
        return WebsiteUser.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {

        WebsiteUser user = (WebsiteUser) obj;
        if (checkInputString(user.getName())) {
            errors.rejectValue("name", "name.empty");
        }

        if (checkInputString(user.getEmail())) {
            errors.rejectValue("email", "email.empty");
        }
    }

    private boolean checkInputString(String input) {
        return (input == null || input.trim().length() == 0);
    }

    



   
    
    
}