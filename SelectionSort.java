/**
Adam Epstein
2/21/19
This programs sorts an array using Selection Sort
 */
public class SelectionSort implements SortingAlgorithm 
{
    public void sort(int[] a)
    {
       int small = start;
       for (int i = start + 1; i < a.length; i ++)
       {
            if (a[i] < a[small])
            {
                small = i; 
            }
        return small;
        }
    }

    private void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
