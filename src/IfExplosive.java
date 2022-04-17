//将会判定此次攻击是否为爆伤   true为爆伤，false为非爆伤

import java.util.Random;
public class IfExplosive
{
    public double a;
    public IfExplosive(double explosivepercent)
    {
        a=explosivepercent;
    }

    public boolean IfExplosive()
    {
        Random ra =new Random();
        double linshi= ra.nextInt(100);
        if(linshi<a)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }
}
