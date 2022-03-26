package br.com.carlosjunior.registrationlogin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.carlosjunior.registrationlogin.entities.Restaurents;

@Repository
public interface RestaurentsRepository extends JpaRepository<Restaurents,Long> {

	
}
