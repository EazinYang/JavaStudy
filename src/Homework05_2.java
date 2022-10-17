public class Homework05_2 {
    public static void main(String[] args) {
        int[] arr = {2,8,4,6,0,10};
        sort(arr);
    }

    public static int binarySearch(int[] arr, int value) {
        int x=0;
        if (arr[arr.length - 1] > arr[0]) {
            if (value <= arr[arr.length-1]/2) {
                for (int i = 0; i < arr.length / 2; i++) {
                    if (arr[i] == value) {
                        x=i;
                    } else {
                        x=-1;
                    }
                }
            } else {
                for (int i = arr.length - 1; i >= arr.length / 2; i--) {
                    if (arr[i] == value) {
                        x=i;
                    } else {
                        x=-1;
                    }
                }
            }
        } else {
            if (value <= arr[arr.length-1]/2) {
                for (int i = arr.length - 1; i >= arr.length / 2; i--) {
                    if (arr[i] == value) {
                        x=i;
                    } else {
                        x=-1;
                    }
                }
            } else {
                for (int i = 0; i < arr.length / 2; i++) {
                    if (arr[i] == value) {
                        x=i;
                    } else {
                        x=-1;
                    }
                }
            }
        }
        return x;
    }

    public static int binarySearch(char[] arr, char value) {
        int x=0;
        if (arr[arr.length - 1] > arr[0]) {
            if (value <= arr[arr.length-1]/2) {
                for (int i = 0; i < arr.length / 2; i++) {
                    if (arr[i] == value) {
                        x=i;
                    } else {
                        x=-1;
                    }
                }
            } else {
                for (int i = arr.length - 1; i >= arr.length / 2; i--) {
                    if (arr[i] == value) {
                        x=i;
                    } else {
                        x=-1;
                    }
                }
            }
        } else {
            if (value <= arr[arr.length-1]/2) {
                for (int i = arr.length - 1; i >= arr.length / 2; i--) {
                    if (arr[i] == value) {
                        x=i;
                    } else {
                        x=-1;
                    }
                }
            } else {
                for (int i = 0; i < arr.length / 2; i++) {
                    if (arr[i] == value) {
                        x=i;
                    } else {
                        x=-1;
                    }
                }
            }
        }
        return x;
    }

    public static int binarySearch(double[] arr, double value) {
        int x=0;
        if (arr[arr.length - 1] > arr[0]) {
            if (value <= arr[arr.length-1]/2) {
                for (int i = 0; i < arr.length / 2; i++) {
                    if (arr[i] == value) {
                        x=i;
                    } else {
                        x=-1;
                    }
                }
            } else {
                for (int i = arr.length - 1; i >= arr.length / 2; i--) {
                    if (arr[i] == value) {
                        x=i;
                    } else {
                        x=-1;
                    }
                }
            }
        } else {
            if (value <= arr[arr.length-1]/2) {
                for (int i = arr.length - 1; i >= arr.length / 2; i--) {
                    if (arr[i] == value) {
                        x=i;
                    } else {
                        x=-1;
                    }
                }
            } else {
                for (int i = 0; i < arr.length / 2; i++) {
                    if (arr[i] == value) {
                        x=i;
                    } else {
                        x=-1;
                    }
                }
            }
        }
        return x;
    }

    public static int copy(int[] arr,int length){
        int[] newArr=new int[length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        return newArr.length;
    }

    public static int copy(double[] arr,int length){
        double[] newArr=new double[length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        return newArr.length;
    }

    public static int copy(char[] arr,int length){
        char[] newArr=new char[length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        return newArr.length;
    }

    public static void sort(int[] arr){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                int insta=0;
                if(arr[i]>arr[j]){
                    insta=arr[i];
                    arr[i]=arr[j];
                    arr[j]=insta;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void sort(char[] arr){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                char insta;
                if(arr[i]>arr[j]){
                    insta=arr[i];
                    arr[i]=arr[j];
                    arr[j]=insta;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void sort(double[] arr){
        for(int i=0;i<arr.length-2;i++){

            for(int j=i+1;j<arr.length-1;j++){
                double insta;
                if(arr[i]>arr[j]){
                    insta=arr[i];
                    arr[i]=arr[j];
                    arr[j]=insta;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}