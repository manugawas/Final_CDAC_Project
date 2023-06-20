package com.raktkosh.dto;

import java.time.LocalTime;

import org.hibernate.validator.constraints.Length;

//import com.raktkosh.pojos.BankAddress;
import com.raktkosh.pojos.BloodBank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BloodBankDTO extends SignupDTO {

	@Length(min = 10, max = 10)
	private String mobile;
	private LocalTime openAt;
	private LocalTime closeAt;

	private String state;
	private String district;
	private String city;
	@Length(min = 6, max = 6)
	private String zip;
	private String locality;

}
