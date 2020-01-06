package mypackage;

import java.lang.reflect.Field;

public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {

        MyClass class1 = new MyClass();
        Class myClassRef = class1.getClass();
        
        Field[] myClassFields = myClassRef.getFields();
        
        for (Field field : myClassFields){
            if(field.getType().equals(String.class)){
                field.set(class1, "String value");
                
            }
            else if(field.getType().equals(int.class))
            {
                field.set(class1, 13);
            }
        }
        System.out.println(class1.field1);
        System.out.println(class1.field2);
    }

}
