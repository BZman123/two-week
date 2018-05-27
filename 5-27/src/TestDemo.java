public class TestDemo {

     public static void main (String args[]){
         int max =Integer.MAX_VALUE;                //取出最大值
         int min =Integer.MIN_VALUE;                //取出最小值
         //int变量 +long型常量 =long型数据
         System.out.println(max+1L);             //最大值加1:2147483648
         System.out.println(min-(long)1);        //最小值减1：-2147483649
         //long变量 +int型常量 =long型数据
         System.out.println((long)min-2);          //最小值减2：-2147483650
     }

}