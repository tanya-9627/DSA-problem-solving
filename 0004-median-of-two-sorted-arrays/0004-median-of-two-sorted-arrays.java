class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

        // Step 1: Dono sorted arrays ko merge karein
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Bache hue elements copy karein (agar koi ho)
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        // Step 2 & 3: Total length check karke Median return karein
        int total = m + n;
        if (total % 2 == 1) {
            // Odd length: beech wala ek element
            return merged[total / 2];
        } else {
            // Even length: beech ke do elements ka average
            return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        }
    }
}
