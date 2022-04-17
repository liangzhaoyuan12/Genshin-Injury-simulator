//duan为段数；attackpower为攻击力；element为元素加成；resistance为怪对该元素的抗性；explosivepercent为暴击率；explosivehurt为暴击伤害

import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("有几段伤害");
        int duan= sc.nextInt();//输入伤害段数
        System.out.println("倍率分别是多少（请填写带着百分号的数字）  eg：135%就填写135");
        double[] commonpercent=new double[duan];
        for(int a=0;a<duan;a++ )
        {

            double shuru= sc.nextDouble();//输入每段伤害的倍率
            commonpercent[a]=shuru;//将每段伤害的倍率形成数组
        }
        System.out.println("攻击力是多少");
        int attackpower= sc.nextInt();//输入攻击力
        System.out.println("攻击时所使用的元素伤害加成为多少   填写百分比");
        double element = sc.nextDouble();//输入元素伤害加成
        System.out.println("怪对该元素的抗性为多少，大部分怪为15");
        double resistance= sc.nextDouble();//输入怪物对该元素的元素抗性
        System.out.println("暴击率是多少");
        double explosivepercent=sc.nextDouble();//输入暴击率
        System.out.println("暴击伤害是多少");
        double explosivehurt= sc.nextDouble();//输入暴击伤害
        System.out.println("以下为伤害输出");
        for(int a=0;a<duan;a++)
        {
            IfExplosive panduan=new IfExplosive(explosivepercent);
            boolean Ifexplosive= panduan.IfExplosive();//每段伤害都会重新运行一次该语句，判断该段伤害是否为爆伤
            if(Ifexplosive)
            {
                IsExplosive abc=new IsExplosive(attackpower,explosivehurt,element,resistance,commonpercent[a]);
                System.out.println(abc.print());
                System.out.println("此次是爆伤");
            }
            else
            {
                NotExplosive abc=new NotExplosive(attackpower,element,resistance,commonpercent[a]);
                System.out.println(abc.print());
                System.out.println("此次是非爆伤");
            }
        }


    }
}
