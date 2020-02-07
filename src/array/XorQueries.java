package array;

public class XorQueries {
    public int[] xorQueriesOld(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int v = 0;
            for (int s = query[0]; s <= query[1]; s++) {
                v ^= arr[s];
            }
            result[i] = v;
        }
        return result;
    }

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] arrX = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arrX[i] =arr[i];
            } else {
                arrX[i] = arrX[i-1] ^ arr[i];
            }
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int a = query[0];
            int b = query[1];
            if (a == 0) {
                result[i] = arrX[b];
            } else {
                result[i] = arrX[a-1] ^ arrX[b];
            }
        }
        return result;
    }
}
