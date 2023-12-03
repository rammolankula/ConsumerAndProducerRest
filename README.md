# ConsumerAndProducerRest
ConsumerAndProducerRest


### Consumer Rest:
#### Consumer Rest is process of accepting the request from postman client or another application by using RestTemplate.
### Producer Rest
#### Producer Rest is process of requesting the data or operation to the consumer application by using RestTemplate.
### RestTemplate
### ============
<pre>
&#8594; This class is used to make HTTP Calls, that can communicate with another any REST proceducer application.
&#8594; By using this class we can define consumer code in our project.
&#8594; RestTemplate (c) object is never auto-configured by springboot
&#8594; it must be configured by debeloper only
&#8594; @Configuration
&#8594; public class AppConfg{
&#8594;  @Bean
&#8594;  public RestTemplate rt(){
&#8594;   return new RestTemplate();
&#8594;  }
&#8594; }
</pre>
##### Autowire this RestTemplate(C) to make HTTP call from any class file.
##### Basic Consumer workFlow Steps:
<pre>
&#8594; a.configure RestTemplate
&#8594; b.Autowire RestTemplate
&#8594; c.Define URL of producer application
&#8594; d.Make HTTP call using Template method
&#8594; e.Get Response as ResponseEntity<T> or direct Type
&#8594; f.print/use details
</pre>
##### =>Consumer application it needs only api EndPoint Details ,,,ie URL , Http method Header Params,Body inputs,outputs   details... etc
