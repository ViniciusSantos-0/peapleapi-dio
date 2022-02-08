package one.digitalino.personapi.controller;

import lombok.AllArgsConstructor;
import one.digitalino.personapi.dto.request.PersonDTO;
import one.digitalino.personapi.dto.response.MessageResponseDTO;
import one.digitalino.personapi.entity.Person;
import one.digitalino.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.createPerson(personDTO);
    }
}
