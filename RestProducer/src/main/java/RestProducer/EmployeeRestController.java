package RestProducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestProducer.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	
	Logger logger=LoggerFactory.getLogger(EmployeeRestController.class);
	
	
	@PutMapping("/modify/{id}")
	public ResponseEntity<String> modifydata(@PathVariable Integer id,@RequestBody Employee employee){
		
		logger.info("put method is called",id,employee);
		return ResponseEntity.ok("Employee id"+id+" Employee name"+employee);
	}
	
	
	//Example :::: 1
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteop(@PathVariable Integer id){
	return ResponseEntity.ok("Deleted===>"+id);
	}
	
	//Example :::: 2
	@DeleteMapping("/delete/{id}/{name}")
	public ResponseEntity<String> deleteDynamic(@PathVariable Integer id,@PathVariable String name){
	return ResponseEntity.ok("Deleted===>"+id+"-"+name);
	}
}
