package com.raktkosh.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NewPasswordDTO {
	@NotBlank
	private String username;
	@NotBlank
	private String newpassword;
	@NotBlank
	private String confirmpassword;
	@NotBlank
	private String otp;

}
