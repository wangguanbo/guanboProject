package com.guanbo;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class Main {

    public static void main(String[] args) throws Exception {

        /*int num = 8388608;
        System.out.println(calculationNumRideN(num));*/

        JaxWsDynamicClientFactory jaxWsDynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = jaxWsDynamicClientFactory.createClient("http://localhost:8081/test/user?wsdl");
        Object[] invoke = client.invoke("getUserByUserName", "张三");
        for (Object o : invoke) {
            System.out.println(o.toString());
        }
    }

    /**
     *  根据 2^n 值 求 n
     * @param num   2^n后的值
     * @return
     */
    private static int calculationNumRideN(int num){
        int n = 1;
        int num_=2;
        while(num_ < num ){
            num_ = num_ << 1;
            n++;
            System.out.println(num_);
        }
        return n;
    }

}
