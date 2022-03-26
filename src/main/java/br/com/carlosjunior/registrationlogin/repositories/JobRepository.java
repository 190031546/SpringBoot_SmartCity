package br.com.carlosjunior.registrationlogin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlosjunior.registrationlogin.entities.Job;

public interface JobRepository extends JpaRepository<Job,Long> {

}
