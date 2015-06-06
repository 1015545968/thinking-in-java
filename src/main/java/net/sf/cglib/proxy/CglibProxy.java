package net.sf.cglib.proxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: JSH
 * Date: 2014/12/1
 * Time: 15:04
 */
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class clazz) {
        //设置需要创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        //通过字节码技术动态创建子类实例
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("前置代理");
        //通过代理类调用父类中的方法
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("后置代理");
        return result;
    }
}
