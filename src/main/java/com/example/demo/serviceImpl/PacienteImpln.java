package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Paciente;
import com.example.demo.repository.PacienteRepository;
import com.example.demo.service.PacienteService;

@Service
public class PacienteImpln implements PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;
	@Override
	public Paciente create(Paciente paciente) {
		// TODO Auto-generated method stub
		return pacienteRepository.save(paciente);
	}

	@Override
	public List<Paciente> readAll() {
		// TODO Auto-generated method stub
		return pacienteRepository.findAll();
	}

	@Override
	public Paciente read(Long id) {
		// TODO Auto-generated method stub
		return pacienteRepository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		pacienteRepository.deleteById(id);
	}

	@Override
	public Paciente update(Paciente pct) {
		// TODO Auto-generated method stub
		return pacienteRepository.save(pct);
	}


}
