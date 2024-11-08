package med.voll.clinica.dto.pacientes;

import med.voll.clinica.dto.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, int telefone, int cpf, DadosEndereco endereco) {

}
