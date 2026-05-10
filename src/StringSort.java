public class StringSort {
    public static void main (String [] args)
    {
        String Name[]={"Delhi","Mumbai","Kolkata","Ranchi","Jharkhand"};
        int n=Name.length;
        String temp="";
        //Bubble Sort
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                if(Name[j].compareTo(Name[j+1])>0)
                {   //Swapping Takes Place
                    temp=Name[j];
                    Name[j]=Name[j+1];
                    Name[j+1]=temp;

                }
            }
        }
        System.out.println("Sorted String In Ascending Order Will Be:-");
        for(int k=0;k<n;k++)
            System.out.println(Name[k]);
    }
}
