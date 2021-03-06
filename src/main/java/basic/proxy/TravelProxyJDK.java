package basic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created 2017/6/7
 *
 * @author yangjie
 */
public class TravelProxyJDK implements InvocationHandler {

    private Object target;

    public Object blind(Object target) {
        this.target = target;
        for (Class clazz : target.getClass().getInterfaces()) {
            System.out.println("target interface:" + clazz);
        }
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        System.out.println("jdk动态代理开始...");
        result = method.invoke(target, args);
        System.out.println("jdk动态代理结束...");
        return result;
    }
}
