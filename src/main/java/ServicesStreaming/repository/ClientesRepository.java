package ServicesStreaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ServicesStreaming.Entity.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

}
