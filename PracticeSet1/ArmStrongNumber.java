

public class ArmStrongNumber{
    public static void main(String[] args)
    {
        int num=153, sum=0, temp=num;
        while(num!=0)
        {
            int digit=temp%10;
            sum+=Math.pow(digit,3);
            temp/=10;
        }
        System.out.println(num==sum);
    }
}