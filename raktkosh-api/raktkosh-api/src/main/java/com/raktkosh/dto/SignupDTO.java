package com.raktkosh.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SignupDTO extends SigninDTO{
  @NotBlank(message = "name is required.")
  private String name;
  private String regID;
  @NotBlank(message = "Valid email is required.")
  @Email(message = "Enter Valid Mail")
  private String email;
  
  //@Pattern(regexp = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$")
  private LocalDate dob;
  private String role;
}
