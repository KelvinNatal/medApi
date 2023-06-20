package med.voll.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import med.voll.api.entities.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long>{
    
}
