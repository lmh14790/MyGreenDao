package com.yztc;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * 生成表的的代码
 */
public class MyClass {
    public static void main(String[] args){
        Schema schema=new Schema(1,"com.yztc.dao");
        Entity student=schema.addEntity("Student");
        student.addIdProperty();
        student.addStringProperty("name").notNull();
        student.addStringProperty("sex").notNull();
        student.addStringProperty("age").notNull();
        try {
            new DaoGenerator().generateAll(schema, "D:\\work_space\\work\\MyGreenDao\\app\\src\\main\\java-gen");
        } catch (Exception e) {
            e.printStackTrace();
             System.out.println("===========失败==============");
        }

        System.out.println("==========成功=========");

    }
}
