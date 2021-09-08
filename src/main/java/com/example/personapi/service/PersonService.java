package com.example.personapi.service;

import com.example.personapi.dto.request.PersonDTO;
import com.example.personapi.dto.response.MessageResponseDTO;
import com.example.personapi.entity.Person;
import com.example.personapi.mapper.PersonMapper;
import com.example.personapi.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private PersonRepository personRepository;
    public final PersonMapper personMapper = PersonMapper.INSTANCE;

    public MessageResponseDTO createPerson(PersonDTO personDTO){

        Person personToSave = this.personMapper.toModel(personDTO);

        Person savedPerson = this.personRepository.save(personToSave);

        return MessageResponseDTO.builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
