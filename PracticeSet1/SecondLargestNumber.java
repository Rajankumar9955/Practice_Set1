public class SecondLargestNumber{
    public static void main(String[] args)
    {
        int[] arr= {1,2,5,4,5};
        int first=0, second=0;
        for(int num:arr)
        {
            if(num>first)
            {
                second=first;
                first=num;
              
            }
            else if(num>second&&num!=first)
            {
                second=num;
            }
        }
        System.out.println(first); //first FirstLargest Number
        System.out.println(second); //SecondLargestNumber
    }
}