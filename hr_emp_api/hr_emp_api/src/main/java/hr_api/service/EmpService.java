package hr_api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr_api.entity.EmpEntity;
import hr_api.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	EmpRepository refRepo;
	
	public Collection<EmpEntity> getAllEmp(){
		Collection<EmpEntity> allEmp = refRepo.findAll();
		return allEmp;
	}
}
