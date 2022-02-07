package one.digitalino.personapi.controller;

import one.digitalino.personapi.dto.MessageResponseDTO;
import one.digitalino.personapi.entity.Person;
import one.digitalino.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);

    }
}
