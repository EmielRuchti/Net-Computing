package org.netcomputing.webservices.services;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(serviceName="GreetingService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public class GreetingService {

 @WebMethod
 public String sayHello() {
  return "Hello from Greeting Service";
 }
 
}
