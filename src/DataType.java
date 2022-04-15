/**
 * 数据类型
 * */
public class DataType{
    public static void main() throws Exception{
        System.out.println("DataType类执行了 (数据类型)");
        String[] arr = {
                "关于java中的数据类型",
                "1.数据类型的作用是什么?",
                "程序当中有很多数据,每个数据都是有相关的数据类型,不同的数据类型的数据占用的空间大小不同,数据类型的作用是指导JVM在运行程序的时候给改数据分配多大的内存空间。"
        };
        for (String i: arr) System.out.println(i);
    }
}