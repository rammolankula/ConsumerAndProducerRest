package RestConsumer.TestConsumer;

import java.lang.management.MemoryType;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



//@Component
public class TestDeleteConsumer implements CommandLineRunner {
	
	
	
	Logger logger=LoggerFactory.getLogger(TestDeleteConsumer.class);
	
	@Autowired
	RestTemplate templates;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*	
	 * 
	 * 
	 * EXAMPLE ONE
	String URl="http://localhost:8080/employee/delete/{id}";
	
	
	//templates.delete(URl);
	//url,methodType,RequestType,ResponseType
	
	
	//Exchange not required request data
//    ResponseEntity<String> response=templates.exchange(URl,HttpMethod.DELETE, null,String.class);
    
    //we can pass the request param dynamically also like below line
    ResponseEntity<String> response=templates.exchange(URl,HttpMethod.DELETE, null,String.class,20);
	
	logger.info("response is ::{}",response.getBody());
	logger.info("Data is{}, value:: {}",response.getStatusCode(),response.getStatusCodeValue());
	*/
		
		
		
    // Example 2
	String URl="http://localhost:8080/employee/delete/{id}/{name}";
		
		
   
	
	
	ResponseEntity<String> response=templates.exchange(URl, HttpMethod.DELETE,null,String.class,10,"Ram");
	
	logger.info("response is ::{}",response.getBody());
	logger.info("Data is{}, value:: {}",response.getStatusCode(),response.getStatusCodeValue());

	logger.info("DELETE SUCCESS");
	System.exit(0);
		
	}

}
