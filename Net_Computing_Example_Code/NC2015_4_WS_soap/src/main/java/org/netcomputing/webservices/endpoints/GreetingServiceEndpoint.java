package org.netcomputing.webservices.endpoints;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.netcomputing.webservices.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("greetingServiceEndpoint")
@WebService(serviceName="GreetingService")
public class GreetingServiceEndpoint {

 @Autowired
 private GreetingService greetingService;
 
 @WebMethod
 public String sayHello() {
  return greetingService.sayHello();
 }
 
}