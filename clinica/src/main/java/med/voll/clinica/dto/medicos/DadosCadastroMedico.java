package med.voll.clinica.dto.medicos;

import med.voll.clinica.dto.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidades especialidades, DadosEndereco endereco ) {

}
