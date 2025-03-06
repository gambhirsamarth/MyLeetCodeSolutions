/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // To find the peak index using binary search
        int l = 0, h = mountainArr.length() - 1, mid;
        while (l < h) {
            mid = l + (h - l) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1))
                l = mid + 1;
            else
                h = mid;

        }
        // Search the left part of peak index since the first priority goes to minimum
        // index
        int t = binarySearchAscending(0, h, target, mountainArr);
        // If found return the index
        if (t != -1)
            return t;
        // Since it's not found on left part then search for right part of peak index
        t = binarySearchDescending(h, mountainArr.length() - 1, target, mountainArr);
        // If found it returns the index else -1
        return t;

    }

    // Binary search from 0 to peak index
    public int binarySearchAscending(int start, int end, int t, MountainArray mountainArr) {
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > t)
                end = mid - 1;
            else if (mountainArr.get(mid) < t)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    // Binary search from peak index to length of the mountain array
    public int binarySearchDescending(int start, int end, int t, MountainArray mountainArr) {
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > t)
                start = mid + 1;
            else if (mountainArr.get(mid) < t)
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }

}
