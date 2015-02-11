package org.david.dubbo.service;


/**
 * @author david
 * @date 2015.2.10
 */
public class HelloServiceConsumer {

    private HelloService helloService;

    public String helloFjx() {
        return helloService.sayHello("david");
    }


    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
