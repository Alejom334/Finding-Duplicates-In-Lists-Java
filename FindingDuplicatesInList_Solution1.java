
package assignment.pkg1;
//Here the comparable interface is not needed. However, Just for the sake 
//of copying the same problem
public class FindingDuplicatesInList_Solution1 
{    
    public void findingIntersection(int[] L1, int[] L2) 
    {
        int j = 0, i = 0, high = L1.length, high2 = L2.length;

        //If the arrays are not empty. Then organize as follows.
        while (i !=high && j != high2) 
        {

            //The following if statments will allow me to go through the loop.
            //Here I am making 2 comparisions everytime I go through the loop.
            //I go by each item of each array. If either of these 2 are not
            //equal then we move forward. 
            if (L1[i] < L2[j]) 
            {
                i++;
            } 
            else if (L2[j] < L1[i]) 
            {
                j++;
            } 
            //If items are equal then the following must happen.
            else 
            {
                System.out.println((L1[i]));
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] L1 = {1,2,3,4,5,6,7};
        int[] L2 = {4,5,6,7,8,9,10};
        FindingDuplicatesInList_Solution1 ex1 = new FindingDuplicatesInList_Solution1();
        ex1.findingIntersection(L1,L2);
    }

}
