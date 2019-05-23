package es.eoi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.eoi.redsocial.entity.Assistance;

@Repository
public interface AssistanceRepository extends JpaRepository<Assistance, Integer>{

}
