package RestConsumer.TestConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class TestConsumer implements CommandLineRunner {
	
	
	Logger logger=LoggerFactory.getLogger(TestConsumer.class);
	
	@Autowired
	RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	    System.out.println("Consumer Started");	
	//Producer App URL
    String uri="http://localhost:8080/employee/data";	
    //Make HTTop Call
    ResponseEntity<String> response =template.getForEntity(uri, String.class);
    logger.info("code is",response.getStatusCodeValue());
    logger.info(response.getStatusCode().name());
    logger.info(response.getBody());
    logger.info("Consumer Ended");	
    System.exit(0);

}
}