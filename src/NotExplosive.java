public class NotExplosive
{
    int attackpower;
    double element,resistance;
    double commonpercent;

    public NotExplosive(int attackpower, double element, double resistance,double commonpercent)
    {
        this.attackpower=attackpower;
        this.element=element;
        this.resistance=resistance;
        this.commonpercent=commonpercent;
    }
    public int print()
    {
        double shuchu=attackpower*(1+0.01*element)*(1-0.01*resistance)*(0.01*commonpercent);
        int total=(int)shuchu;
        return total;
    }
}
