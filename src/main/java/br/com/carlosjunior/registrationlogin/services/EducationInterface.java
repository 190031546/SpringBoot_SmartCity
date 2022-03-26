package br.com.carlosjunior.registrationlogin.services;

import java.util.List;

import br.com.carlosjunior.registrationlogin.entities.Education;
public interface EducationInterface 
{
  List<Education>getAlleducates();
  Education saveStudent(Education std);
}