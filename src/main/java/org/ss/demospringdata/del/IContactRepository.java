package org.ss.demospringdata.del;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.ss.demospringdata.domaine.Contact;

@RepositoryRestResource(path = "lolo-list")
public interface IContactRepository  extends CrudRepository<Contact, Long> {

public Contact findByName(String name);
}
