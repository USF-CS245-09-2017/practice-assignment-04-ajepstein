/**
Adam Epstein
2/21/19
This programs sorts an array using Bubble Sort
 */
public class BubbleSort implements SortingAlgorithm 
{
    public int findSmallest(int[] a, int start)
    {
        int small = start; 
        for (int i = start + 1; i < a.length; i++)
        {
            if (a[i] < a[small]) 
            {
                small = i; 
            }
        }
        return small; 
    }

    private void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void sort(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = 0; j < a.length - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    swap(a, j, j + 1);
                }
            }
        }
    }
}

