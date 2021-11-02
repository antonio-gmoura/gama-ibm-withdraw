package br.com.withdraw.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.withdraw.dto.WithdrawDto;
import br.com.withdraw.forms.WithdrawForm;
import br.com.withdraw.services.WithdrawService;

@RestController
@RequestMapping("/withdraw")
public class WithdrawController {
	
	@Autowired
	private WithdrawService service;
	
	@GetMapping
	public ResponseEntity<List<WithdrawDto>> findAll(){
		return  ResponseEntity.ok(service.findAll());
	}
	
	@PostMapping
	public ResponseEntity<WithdrawDto> add(@RequestBody WithdrawForm form, UriComponentsBuilder uriBuilder) {
		var dto = service.add(form); 
		URI uri = uriBuilder.path("/withdraw/{id}").buildAndExpand(dto.Id).toUri();
		return ResponseEntity.created(uri).body(dto);    
	}

}
