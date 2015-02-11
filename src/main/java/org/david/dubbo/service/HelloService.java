
package org.david.dubbo.service;

/**
 * @author david
 * @date 2015.2.10
 */
public interface HelloService {

    /**
     * 暴露的接口
     *
     * @param name
     * @return
     */
    public String sayHello(String name);

}
