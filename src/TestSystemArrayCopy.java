import java.util.Arrays;

public class TestSystemArrayCopy {
    public static void main(String[] args){
        String[] arr1={"hello","world","java",null,null};
        //实现删除arr[0]元素
        System.arraycopy(arr1,1,arr1,0,2);
        arr1[2]=null;
        System.out.println(Arrays.toString(arr1));

        String[] arr2={"hello","world","java",null,null};
        //实现在hello和world中间插入"atguigu"
        System.arraycopy(arr2,1,arr2,2,2);
        arr2[1]="atguigu";
        System.out.println(Arrays.toString(arr2));
    }
}
