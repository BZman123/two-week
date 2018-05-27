/**
 * <a href="http://www.runoob.com/java/java-documentation.html">多行注释／**／</a>
 * @see Integer
 */
public class Main {

    /**
     * public(private、protected、default)
     *  <a href="http://www.runoob.com/java/java-modifier-types.html">修饰符</a>
     * static：
     *  <a href="https://www.cnblogs.com/starhu/p/5150241.html">static</a>
     * final:
     *  <a href="https://blog.csdn.net/roofalison/article/details/2087749">final</a>
     * 变量(命名规范：maxValue )
     *  <a href="https://baike.baidu.com/item/%E9%A9%BC%E5%B3%B0%E5%BC%8F%E5%A4%A7%E5%B0%8F%E5%86%99/3976226?fr=aladdin">驼峰形式命名变量名称</a>
     *  全局变量：MAX_VALUE(static final 就需要下划线分割单词 MAX_VALUE)
     *  局部变量： maxValue、minValue(maxValue)
     *  0x7fffffff:
     *
     */
     public static final int  MAX_VALUE = 0x7fffffff;

    public static void main(String[] args) {

        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        //int变量
        System.out.println(Integer.toBinaryString(Main.MAX_VALUE));
        //String.length():
        System.out.println(Integer.toBinaryString(Main.MAX_VALUE).length());
    }
}
