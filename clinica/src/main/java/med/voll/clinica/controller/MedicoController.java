package med.voll.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import med.voll.clinica.dto.medicos.DadosCadastroMedico;
import med.voll.clinica.repository.MedicoRepository;

@Controller
@RequestMapping("/medicos")
public class MedicoController {
	@Autowired
	private MedicoRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroMedico dados) {
	System.out.println(dados);
	}
}
