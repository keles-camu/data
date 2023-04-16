package com.jaisoft.datarest;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRestRepository extends JpaRepository<WebsiteUser, Long> {
}



