import org.junit.Test;

/**
 * @desc:
 * @author: 江承良
 * @date: 2017/9/26 11:11
 */
public class MyTest {
    public void test1(String[] strs1,String[] strs2){
        for(int i=0;i<strs1.length;i++){
            for(int j=0;j<strs1.length;j++){
                if(strs1[i]==strs1[j]){
                    strs1[j]="";
                    strs2[j]="";
                }
            }
        }
    }

    @Test
    public void test2(){
        String[] strs1 = {"110001","10201","60121","60005","30104","10201"};
        String[] strs2 = {"暂无","暂无","暂无","暂无","暂无","常见"};
        test1(strs1,strs2);
        for (int i=0;i<strs1.length;i++){
            System.out.println(strs1[i]);
            System.out.println(strs2[i]);
        }
    }
}
