

public class Main
{
    private String name;
    private int day;
    private String month;
    
    public Main (String N, int D, String M)
    {
        name=N;
        day=D;
        month=M;
    }
    public String getN()
    {
        return name;
    }
    public int getD()
    {
        return day;
    }
    public String getM()
    {
        return month;
    }
    public boolean inSameMonth(Main H1, Main H2)
    {
       if(H1.getM()=H2.getM())
       {
           return true;
        }
        else
        {
            return false;
        }
    }
    public static double AvgDate(Main Hol[])
    {
        int avgsum=0;
        for(int i=0;i<Hol.length;i++)
        {
            avgsum=avgsum+Hol[i].day;
        }
        return 
        
            ((double)avgsum)/Hol.length;
        
    }
    public static void main(String args[])
{
	Main H = new Main("Independence Day",15,"August");
	System.out.println("\n Holiday Name:"+H.getN());
	System.out.println("\n Holiday Day:"+H.getD());
	System.out.println("\n Holiday Month:"+H.getM());
	Main Hol[] = new Main[5];
		for(int i=0; i<5; i++)
		{
			Hol[i] = H;
		}
	System.out.println("\n Average date:"+ H.avgDate(Hol));
	System.out.println("\n Is same month:"+ H.inSameMonth(Hol[0],Hol[1]));
	
}
}

        
    
   