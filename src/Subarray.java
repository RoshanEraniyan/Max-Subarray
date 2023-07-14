import java.util.*;

class Solution
{
    public void maxsubarray(int[] array,int a,int b)
    {
        int solution=0;
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<a-1;i++)
        {

            int sum=array[i];
            if(sum<=b)
            {
                l.add(sum);
            }
            for(int j=i+1;j<a;j++)
            {
                sum+=array[j];
                if(sum<=b)
                {
                    l.add(sum);
                }
                else
                {
                    l.add(0);
                }
            }
        }
        solution=Collections.max(l);
        if(solution>b)
        {
            solution=0;
        }
        System.out.println(solution);

    }
}

class SubArray
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int[] array=new int[a];
        for(int i=0;i<a;i++)
        {
            array[i]=scanner.nextInt();
        }
        Solution solution =new Solution();
        solution.maxsubarray(array,a,b);
    }
}
