package br.com.withdraw.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.withdraw.dto.WithdrawDto;
import br.com.withdraw.entities.Withdraw;
import br.com.withdraw.factories.WithdrawFactory;
import br.com.withdraw.forms.WithdrawForm;
import br.com.withdraw.repositories.WithdrawRepository;

@Service
public class WithdrawService {
	
	@Autowired
	private WithdrawRepository repository;
	
	public List<WithdrawDto> findAll(){
		return repository.findAll().stream().map(WithdrawFactory::Create).collect(Collectors.toList());
	}

	public WithdrawDto add(WithdrawForm form) {
		Withdraw withdraw = WithdrawFactory.Create(form);
		repository.save(withdraw);
		return WithdrawFactory.Create(withdraw);
	};
	
}
