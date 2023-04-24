package RestProducer;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestProducer.model.Employee;

@RestController
@RequestMapping("/employee")
public class RestProducerController {

	Logger logger = LoggerFactory.getLogger(RestProducerController.class);

	@GetMapping("/data")
	public ResponseEntity<String> showData() {
		System.out.println("Producer Started");
		return ResponseEntity.ok("Hii Ram");
	}

	@PostMapping("/save")
	public ResponseEntity<String> SaveData(@RequestBody Employee emp) {
		System.out.println("Producer Started");
		return ResponseEntity.ok("Hii Ram" + emp);
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<Employee> getOne(@PathVariable Integer id) {
		System.out.println("From Producer");
		return ResponseEntity.ok(new Employee(id, "AA", 40.0));
	}

	@GetMapping("/all")
	public ResponseEntity<String> listStudent() {
		logger.info("From Producer");
		List<Employee> emp = Arrays.asList(new Employee(101, "Ram", 1.0),
				                           new Employee(101, "Ram", 1.0),
				                           new Employee(101, "Ram", 1.0), 
				                           new Employee(101, "Ram", 1.0));
		return ResponseEntity.ok("Hii Ram"+emp);

	}
}
