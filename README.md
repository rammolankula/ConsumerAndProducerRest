# ConsumerAndProducerRest
ConsumerAndProducerRest


### Consumer Rest:
#### Consumer Rest is process of accepting the request from postman client or another application by using RestTemplate.
### Producer Rest
#### Producer Rest is process of requesting the data or operation to the consumer application by using RestTemplate.
# RestTemplate
# ============
#### This class is used to make HTTP Calls, that can communicate with another any REST proceducer application.
##### By using this class we can define consumer code in our project.

##### RestTemplate (c) object is never auto-configured by springboot
##### it must be configured by debeloper only

##### @Configuration
##### public class AppConfg{
  
#####  @Bean
#####  public RestTemplate rt(){
#####   return new RestTemplate();
#####  }

##### }

##### Autowire this RestTemplate(C) to make HTTP call from any class file.

##### Basic Consumer workFlow Steps:

##### a.configure RestTemplate
##### b.Autowire RestTemplate
##### c.Define URL of producer application
##### d.Make HTTP call using Template method
##### e.Get Response as ResponseEntity<T> or direct Type
##### f.print/use details.

##### =>Consumer application it needs only api EndPoint Details ,,,ie URL , Http method Header Params,Body inputs,outputs   details... etc
