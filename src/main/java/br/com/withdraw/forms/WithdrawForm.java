package br.com.withdraw.forms;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class WithdrawForm {

	@NotNull @NotEmpty @NotBlank
	public Double value;
}
