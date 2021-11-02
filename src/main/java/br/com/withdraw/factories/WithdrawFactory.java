package br.com.withdraw.factories;

import br.com.withdraw.dto.WithdrawDto;
import br.com.withdraw.entities.Withdraw;
import br.com.withdraw.forms.WithdrawForm;

public class WithdrawFactory {

	public static Withdraw Create(WithdrawForm form) {
		
		return new Withdraw (form.value);
		
	}
	
	public static WithdrawDto Create(Withdraw withdraw) {
	
		var dto = new WithdrawDto(); 
		
		dto.Id = withdraw.getId();
		dto.value = withdraw.getValue();
		
		return dto;
		
	}

}
