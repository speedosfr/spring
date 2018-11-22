package org.ss.demospringdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.ss.demospringdata.del.IContactRepository;
import org.ss.demospringdata.domaine.Contact;

public class ContactService extends GenericService<IContactRepository, Contact> {

    public Contact findByName(String name){
        return repository.findByName( name );
    }

    public int getContactBirthYear( Contact contact ) {
        //TODO recupération de la date et extraction de l'année de naissance
        return 0;
    }

}
