package ie.atu.validation;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public void savePerson(Person person) {
        System.out.println("Person saved:" + person);

    }

    public Person getPersonEmployeeId(String EmployeeId) {
        return new Person();

    }

}

