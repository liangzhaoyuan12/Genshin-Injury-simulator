public class IsExplosive
{
    int attackpower;
    double explosivehurt,element,resistance;
    double commonpercent;

    public IsExplosive(int attackpower, double explosivehurt, double element, double resistance,double commonpercent)
    {
        this.attackpower=attackpower;
        this.explosivehurt=explosivehurt;
        this.element=element;
        this.resistance=resistance;
        this.commonpercent=commonpercent;
    }
    public int print()
    {
        double shuchu=attackpower*(1+0.01*explosivehurt)*(1+0.01*element)*(1-0.01*resistance)*(0.01*commonpercent);
        int total=(int)shuchu;
        return total;
    }
}
