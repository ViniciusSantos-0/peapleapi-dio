package one.digitalino.personapi.service;

import one.digitalino.personapi.dto.MessageResponseDTO;
import one.digitalino.personapi.entity.Person;
import one.digitalino.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(Person person){
        Person savePerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID "+savePerson.getId())
                .build();
    }

}
