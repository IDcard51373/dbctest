import   java.util.Scanner;

public class Test {
    public static void main(String[] args){
        DBControl dbc=new DBControl();
        Scanner  input= new Scanner(System.in);
        System.out.println("测试什么？");
        while(true) {
            String test = input.nextLine();
            switch (test) {
                case "注册":
//                    注册：
//                    String[] arg=new String[6];
//                    arg[0]="lzy";
//                    arg[1]="654321";
//                    arg[2]="luo";
//                    arg[3]="男";
//                    arg[4]="cs";
//                    arg[5]="1997-12-14";
//                    dbc.DB_Signin(arg);
                    break;
                case "登陆":
                    String[] argin=new String[2];
                    for(int i=100;i>0;i--){
                        System.out.println("用户名:");
                        argin[0]=input.nextLine();
                        System.out.println("密码：");
                        argin[1]=input.nextLine();
                        String userid=dbc.DB_Login(argin);
                        if(userid == null ||"".equals(userid)){
                            System.out.println("用户名不存在");
                        }
                        else if(userid.equals("0")){
                            System.out.println("密码错误");
                        }
                        System.out.println("userid="+userid);
                    }
                    break;
                case "主页":{
                    String[][] mainpage=dbc.DB_GetMainPage();
                    for (int j = 4;j>=0; j--) {
                        System.out.println("post_id:"+mainpage[j][0]+"title:"+mainpage[j][1]+"content:"+mainpage[j][2]);
                    }
                }
                    break;
                default:
                    System.out.println("请重新输入:");
            }
        }


//        登陆：



    }
}
