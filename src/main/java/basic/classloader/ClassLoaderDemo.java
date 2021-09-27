package basic.classloader;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author yangjie
 * @date 2019-11-21
 * @time 17:38
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoaderDemo classLoaderDemo = new ClassLoaderDemo();
        System.out.println(classLoaderDemo.getClass().getClassLoader());

        // sun.misc.Launcher$AppClassLoader@2a139a55 ，应用程序类加载器
        System.out.println("ClassLoaderDemo---" + ClassLoaderDemo.class.getClassLoader());
        // sun.misc.Launcher$ExtClassLoader@7852e922， 扩展类加载器
        System.out.println("ClassLoaderDemo---parent:" + ClassLoaderDemo.class.getClassLoader().getParent());
        // null,实际是BootstrapClassLoader，启动类加载器
        System.out.println("ClassLoaderDemo---parent---parent:" + ClassLoaderDemo.class.getClassLoader().getParent().getParent());

        System.out.println("java.util.ArrayList---" + ArrayList.class.getClassLoader());
        System.out.println("java.lang.String---" + String.class.getClassLoader());

    }

    @Test
    public void testClassForName() {
        try {
            Class clazz = Class.forName("basic.classloader.ClassLoaderDemo");
            System.out.println(clazz.getClassLoader());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
