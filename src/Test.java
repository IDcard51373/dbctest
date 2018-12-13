import   java.util.Scanner;

public class Test {
    public static void main(String[] args){

        DBControl dbc=new DBControl();
//        注册：
//        String[] arg=new String[6];
//        arg[0]="lzy";
//        arg[1]="654321";
//        arg[2]="luo";
//        arg[3]="男";
//        arg[4]="cs";
//        arg[5]="1997-12-14";
//        dbc.DB_Signin(arg);

//        登陆：
        Scanner  input= new Scanner(System.in);
        String[] argin=new String[2];
        while(true){
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

    }
}
