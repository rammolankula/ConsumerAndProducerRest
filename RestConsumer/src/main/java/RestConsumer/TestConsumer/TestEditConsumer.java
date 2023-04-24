package RestConsumer.TestConsumer;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestEditConsumer implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(TestEditConsumer.class);

	@Autowired
	RestTemplate templates;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		String url = "http//localhost:8080/employee/modify/{id}";

		// making requset
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);

		// xml data
		String body = "<Employee><empId>10</empId></Employee>";

		HttpEntity<String> requestEntity = new HttpEntity<String>(body, headers);

		ResponseEntity<String> response = templates.exchange(url, HttpMethod.PUT, requestEntity, String.class,10);

		logger.info("response is ::{}", response.getBody());
		logger.info("Data is{}, value:: {}", response.getStatusCode(), response.getStatusCodeValue());

	}

}
