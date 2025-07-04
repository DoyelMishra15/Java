package lec3;
public class longetsubarray {
    public static void main(String[] args) {
        int[] a={2,3,5,1,9};
        int k = 10;
        int n = a.length;

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n) sum += a[right];
        }

        System.out.println(maxLen);
    }
}
