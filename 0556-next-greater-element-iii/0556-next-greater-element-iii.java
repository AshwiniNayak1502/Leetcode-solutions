class Solution {
    public int nextGreaterElement(int n) {

        int len = 0;
        int temp = n;
        while (temp != 0) {
            len++;
            temp = temp / 10;
        }

        int[] ans = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            ans[i] = n % 10;
            n = n / 10;
        }

        int pivot = -1;
        int j = len - 2;
        while (j >= 0) {
            if (ans[j + 1] > ans[j]) {
                pivot = j;
                break;
            }
            j--;
        }
        if (pivot == -1) {
            return -1;
        }

        j = len - 1;

        while (j > pivot) {
            if (ans[j] > ans[pivot]) {
                break;
            }
            j--;
        }

        temp = ans[pivot];
        ans[pivot] = ans[j];
        ans[j] = temp;

        int left = pivot + 1;
        int right = len - 1;
        while (left < right) {
            temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;

            left++;
            right--;
        }

        long a = 0;
        for (int i = 0; i < len; i++) {
            a = a * 10 + ans[i];
        }
        if (a > Integer.MAX_VALUE) {
            return -1;
        }

        return (int) a;
    }
}