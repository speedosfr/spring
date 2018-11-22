package org.ss.demospringdata.del;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.ss.demospringdata.domaine.Contact;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class IContactRepositoryTest {
    @Autowired
    IContactRepository repository;
    @Test

    public void findByName(){

        Contact contact = repository.save( new Contact( "Laurent", new Date()));
        assertThat(contact.getName(), is(repository.findByName("Laurent").getName()));

    }

}