package com.javaDesign.designModel.creational.Singleton;

import java.io.*;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-04 14:07
 **/
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("测试");

//        //破坏单例模式，破坏的原理在下方
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        //ObjectInputStream中的readObject方法，会根据实例类中的是否存在readResolve方法，来返回最终的实例是原来的，还是创建新的
//        /*
//        readObject:
//            try {
//                Object obj = readObject0(false);
//                handles.markDependency(outerHandle, passHandle);
//            }
//
//        readObject0:
//            case TC_OBJECT:
//                    return checkResolve(readOrdinaryObject(unshared));
//
//        readOrdinaryObject:
//            Object obj;
//            try {
//                //判断实例类是不是序列化的
//                obj = desc.isInstantiable() ? desc.newInstance() : null;
//            }
//            //如果是序列化的，在判断是否有readResolve方法
//            if (obj != null &&
//                handles.lookupException(passHandle) == null &&
//                desc.hasReadResolveMethod())
//            {
//                Object rep = desc.invokeReadResolve(obj);}
//
//        hasReadResolveMethod：
//            /**
//             * Returns true if represented class is serializable or externalizable and
//             * defines a conformant readResolve method.  Otherwise, returns false.
//             * 这个注释就是表达了，是否存在这个readResolve方法
//            boolean hasReadResolveMethod() {
//                return (readResolveMethod != null);
//            }
//
//        invokeReadResolve:
//            if (readResolveMethod != null) {
//            try {
//                //利用反射的invoke，来调用实例中的readResolve方法，返回实例
//                return readResolveMethod.invoke(obj, (Object[]) null);
//            }
//         */
//        HungrySingleton newInstance = (HungrySingleton)ois.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);
    }
}