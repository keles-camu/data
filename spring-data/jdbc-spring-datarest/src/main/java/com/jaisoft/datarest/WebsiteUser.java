package com.jaisoft.datarest;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@NoArgsConstructor
@RestResource(rel="users", path="users")
@Table("WEBSITE_USER")
public class WebsiteUser{
    @Id
    @Column("ID")
    public long id;
    @Column("NAME")
    public String name;
    @Column("EMAIL")
    public String email;
    //@PersistenceCreator
    public WebsiteUser(long id, String name, String email ) {
        this.name = name;
        this.email = email;
        this.id = id;
        
    }


}