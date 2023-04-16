package com.jaisoft.datarest;




import org.springframework.data.repository.CrudRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRestRepository extends CrudRepository<WebsiteUser, Integer> {
}



