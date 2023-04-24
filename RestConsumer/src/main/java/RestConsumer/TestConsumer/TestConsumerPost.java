package RestConsumer.TestConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import RestConsumer.consumer.Employee;


//@Component
public class TestConsumerPost implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(TestConsumerPost.class);

	@Autowired
	RestTemplate template;

	@Override
	public void run(String... args) throws Exception {

		String uri = "http://localhost:8080/employee/one/101";
		
		
		//# [[[[[1]]]]]
		/*  Json data reading from consumer to producer by using below method
		String body = "{\"empId\":101,\"empName\":\"A\",\"empSal\":500.0}";
		
		
		//Header Param
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		//Request Object (Head and body
		HttpEntity<String> requestEntity=new HttpEntity<String>(body,headers);
		
		
		//PostEntity (url and request details
		ResponseEntity<String> response = template.postForEntity(uri, requestEntity, String.class);
		
		*/
		
		//below line is recommandable because without any convsersion internally its happening
		ResponseEntity<Employee> response=template.getForEntity(uri,Employee.class);
		/* Conversion Json to Object by using employee class
		String json=null;
		try {
			json=response.getBody();
			ObjectMapper om=new ObjectMapper();
			
			//Json to Object
			
			Employee emp=om.readValue(json,Employee.class);
			System.out.println("DATA IN OBJ format==="+emp);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/
		logger.info("code is", response.getStatusCodeValue());
		logger.info(response.getStatusCode().name());
		logger.info("Data is {}:",response.getBody());
		logger.info("Consumer Ended");
		System.exit(0); //Stop server
	}

}
