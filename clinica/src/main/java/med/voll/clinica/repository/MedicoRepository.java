package med.voll.clinica.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import med.voll.clinica.model.MedicoModel;

public interface MedicoRepository extends JpaRepository<MedicoModel, UUID> {

}
