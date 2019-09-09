/*
package algorithm;

public class Sort {

    long executionTime = 0;
    */
/*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     *//*



    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 1; i < list.length; i++) {
            int j = i - 1;
            int point = list[i];
            while (j >= 0 && list[j] > point) {
                System.out.println(j);
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = point;

            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }

        public int[] bubbleSort(int[] array) {
            final long startTime = System.currentTimeMillis();
            int[] list = array;
            int temp;

            for (int i = 0; i < array.length; i++) {

                for (int j = 1; j < array.length - i; j++) {

                    if (array[j - 1] > array[j]) {

                        temp = array[j - 1];

                        array[j - 1] = array[j];

                        array[j] = temp;

                    }

                }

            }
            return list;
        }

        public int[] mergeSort ( int[] array){
            int[] list = array;
            //implement here
            if(low < high) {

                int middle = (low + high)/2;

                mergeSort(array, low, middle);

                mergeSort(array, middle+1, high);

                mergeHalves(array, low, middle, high);

            }
            final long endTime = System.currentTimeMillis();

            final long executionTime = endTime - startTime;

            this.executionTime = executionTime;

            return list;

        }

            final long startTime = System.currentTimeMillis();
            int[] list = array;
//implement here
            int mid = n / 2;
            int[] l = new int[mid];
            int[] r = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                l[i] = array[i];
            }
            for (int i = mid; i < n; i++) {
                r[i - mid] = array[i];
            }
            mergeSort(l, mid);
            mergeSort(r, n - mid);
            merge(array, l, r, mid, n - mid);

        }

        public void merge ( int[] a, int[] l, int[] r, int left, int right){

            int i = 0, j = 0, k = 0;
            while (i < left && j < right) {
                if (l[i] <= r[j]) {
                    a[k++] = l[i++];
                } else {
                    a[k++] = r[j++];
                }
            }
            while (i < left) {
                a[k++] = l[i++];
            }
            while (j < right) {
                a[k++] = r[j++];
            }
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }


        public int[] quickSort ( int[] array){
            final long startTime = System.currentTimeMillis();
            int[] list = array;
//implement here


            return list;
        }

        return list;
    }


    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public int[] heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        void heapSort(int array[], int size)
        {
            int i;
            for (i = size / 2 - 1; i >= 0; i--)
                heapify(arr, size, i);
            for (i=size-1; i>=0; i--)
            {
                temp = arr[0];
                arr[0]= arr[i];
                arr[i] = temp;
                heapify(arr, i, 0);
            }
        }
    }
        }

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here

        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
*/
