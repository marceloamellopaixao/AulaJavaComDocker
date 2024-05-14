package br.com.fiap.Aula08revisao.repositories;

import br.com.fiap.Aula08revisao.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
