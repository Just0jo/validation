package ie.atu.validation;


import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 25, message = "Name cannot be less than 2 or greateer than 2 characters")
    private String name;


    @Email(message = "Must be a valid email address")
    private String email;


    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 25, message = "title cannot be less than 2 or greateer than 2 characters")
    private String title;

    @Positive(message = "Any number entered must be greater than zero")
    @Min(value = 18, message = "age must be no less than 18 ")
    private String age;

    @NotNull(message = "Name cannot be null")
    private String position;


     @Size(min = 2, max = 25, message = "Name cannot be less than 2 or greateer than 2 characters")
     @Max(value = 8, message = "id cannot be greater than 8 ")
    private String employeeId;

    @NotBlank(message = "department cannot be blank")
    private String department;




}
