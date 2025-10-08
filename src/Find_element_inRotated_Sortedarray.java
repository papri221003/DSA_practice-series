public class Find_element_inRotated_Sortedarray {

        public static int search(int[] nums, int target) {
            int pivot = findPivot(nums);

            // If pivot not found, array is not rotated
            if (pivot == -1) {
                return binarySearch(nums, target, 0, nums.length - 1);
            }

            // If pivot element is target
            if (nums[pivot] == target) {
                return pivot;
            }

            // If target is greater than or equal to first element,
            // search in the left (ascending) side
            if (target >= nums[0]) {
                return binarySearch(nums, target, 0, pivot - 1);
            }

            // Otherwise, search in the right side
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }

        // Normal binary search
        public static int binarySearch(int arr[], int target, int begin, int end) {
            while (begin <= end) {
                int mid = begin + (end - begin) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (target > arr[mid]) {
                    begin = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }

        // Find pivot index (index of largest element)
        public static int findPivot(int arr[]) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Case 1: pivot found (mid > next)
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                // Case 2: pivot found (mid < previous)
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }

                // Case 3: move search range
                if (arr[mid] >= arr[start]) {
                    start = mid + 1; // pivot is on right side
                } else {
                    end = mid - 1;   // pivot is on left side
                }
            }

            return -1; // no pivot found → array not rotated
        }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=2;
        System.out.println(search(arr,target));

    }
}
