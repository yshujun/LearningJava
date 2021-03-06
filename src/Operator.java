/**
 * 运算符
 * */
public class Operator {
    public static void main() throws Exception{
        System.out.println("Operator运行了(运算符)");
        String[] str = {
            "关于java编程中运算符之: 算术运算符",
            "   + 求和",
            "   - 相减",
            "   * 乘积",
            "   / 商",
            "   % 求余数(取模)",
            "   ++ 自加1",
            "   -- 自减1",
            "   注意: 一个表达式当中有多个运算符, 运算符有优先级, 不确定的加小括号, 优先级得到提升。没必要去专门记忆运算符的优先级",
            "关于java编程中运算符之: 关系运算符",
            "   >       大于",
            "   >=      大于等于",
            "   <       小于",
            "   <=      小于等于",
            "   ==      等于",
            "   !=      不等于",
            "   关系运算符的运算结果一定是布尔类型: true/false",
            "关于java编程中运算符之: 逻辑运算符",
            "   &       逻辑与         (两边的算子都是true, 结果才是true)",
            "   |       逻辑或         (两边的算子只要有一个是true, 结果就是true)",
            "   !       逻辑非         (取反, !false就是true, !true就是false, 这是一个单目运算符)",
            "   ^       逻辑异或        (两边的算子结果不一样, 结果才是true)",
            "   &&      短路与         (两边的算子都是true, 结果才是true)",
            "   ||      短路或",
            "1、逻辑运算符要求两边的算子都是Boolean类型, 而且运算结果也是Boolean类型",
            "2、短路与和逻辑与最终的结果是一样的, 只不过短路与存在短路现象",
            "3、短路或和逻辑或最终的结果是一样的, 只不过短路存或在短路现象",
            "关于java编程中运算符之: 赋值运算符",
            "   基本的赋值运算符",
            "       =",
            "   扩展的赋值运算符",
            "       +=、-=、*=、/=、%=",
            "   1、赋值类的运算符优先级: 先执行等号右边的表达式, 将执行结果赋值给左边的变量",
            "   2、扩展类的赋值运算符不改变运算结果类型, 假设最初这个变量的类型是byte, 无论怎么进行追加或者追减, 最终变量的数据类型还是byte类型",
            "关于java中的“+”运算符:",
            "   1、+运算符在java语言当中有两个作用:",
            "       * 加法运算, 求和",
            "       * 字符串的连接运算",
            "   2、当“+”运算符两边的数据都是数字的话, 一定是进行加法运算。",
            "   3、当“+”运算符两边的数据只要有一个数据是字符串, 一定会进行字符串连接运算。并且连接运算后的结果还是一个字符串类型。",
            "关于java中的三目运算符:",
            "   1、语法规则",
            "       布尔表达式 ? 表达式1 : 表达式2",
        };
        for (String i: str) System.out.println(i);
        int a = 0;
        for (int b = 1;b <= 100; b++) {
            a += b;
        }
        int c = 10, d = 20;
        System.out.println(a);
        System.out.println(c + "+" + d + "=" + (c + d));
    }
}