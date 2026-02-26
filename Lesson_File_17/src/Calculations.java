public class Calculations {
    int [] A = new int[10];

    public int[] editArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            A[i] = array[i] * 2;
        }
        return A;
    }
}
