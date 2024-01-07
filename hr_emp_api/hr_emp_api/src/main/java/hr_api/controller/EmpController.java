package hr_api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hr_api.entity.EmpEntity;
import hr_api.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	EmpService refServ;
	
	@GetMapping("/emps")
	public Collection<EmpEntity> getAllEmp(){
		Collection<EmpEntity> obj = refServ.getAllEmp();
		return obj;
	}
	
}
