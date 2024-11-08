package med.voll.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import med.voll.clinica.dto.pacientes.DadosCadastroPaciente;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {
	
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
		System.out.println(dados);
	}

}
