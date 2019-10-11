package com.yain;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * TODO
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/11 0:25
 */
public class Main {

    public static void main(String[] args) {
        // 从工厂中获得KieServices实例
        KieServices ks = KieServices.Factory.get();
        // 从KieServices中获得KieContainer实例，其会加载kmodule.xml文件并load规则文件
        KieContainer kc = ks.getKieClasspathContainer();
        // 建立KieSession到规则文件的通信管道
        KieSession kSession = kc.newKieSession("kSession1");

        Grade stu1 = new Grade("学生01", 95);
        Grade stu2 = new Grade("学生02", 88);
        Grade stu3 = new Grade("学生03", 83);
        Grade stu4 = new Grade("学生04", 78);
        Grade stu5 = new Grade("学生05", 73);
        Grade stu6 = new Grade("学生06", 68);
        Grade stu7 = new Grade("学生07", 63);
        Grade stu8 = new Grade("学生08", 59);
        Grade stu9 = new Grade("学生09", 0);

        // 将实体类插入执行规则
        kSession.insert(stu1);
        kSession.insert(stu2);
        kSession.insert(stu3);
        kSession.insert(stu4);
        kSession.insert(stu5);
        kSession.insert(stu6);
        kSession.insert(stu7);
        kSession.insert(stu8);
        kSession.insert(stu9);
        kSession.fireAllRules();
        kSession.dispose();
    }


}
