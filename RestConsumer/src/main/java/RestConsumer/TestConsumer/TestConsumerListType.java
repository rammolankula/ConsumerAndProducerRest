package RestConsumer.TestConsumer;

import java.util.Arrays;

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
public class TestConsumerListType implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(TestConsumerPost.class);
	
	
	@Autowired
	RestTemplate  template;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		String url="http://localhost:8080/employee/all";
		
		//ResponseEntity<String> response=template.getForEntity(url, String.class);
	
	/*	String json=null;
		try {
			json=response.getBody();
			ObjectMapper om=new ObjectMapper();
			
			//Json to Object
			
			Employee emp[]=om.readValue(json,Employee[].class);
			System.out.println("DATA IN OBJ format==="+Arrays.asList(emp));
			
			
			logger.info("code is", response.getStatusCodeValue());
			logger.info(response.getStatusCode().name());
			logger.info("Data is {}:",response.getBody());
			logger.info("Consumer Ended");
			System.exit(0); //Stop server
		}catch (Exception e) {
			e.printStackTrace();
		}
	*/
		
		
		ResponseEntity<String> response=template.getForEntity(url, String.class);

		logger.info("code is", response.getStatusCodeValue());
		logger.info(response.getStatusCode().name());
		logger.info("Data is {}:",Arrays.asList(response.getBody()));
		logger.info("Consumer Ended");
		System.exit(0); //Stop server
		
	}

}
