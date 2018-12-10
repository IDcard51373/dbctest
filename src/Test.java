public class Test {
    public static void main(String[] args){
        String[] arg=new String[6];
        arg[0]="ldq";
        arg[1]="123456";
        arg[2]="idcard";
        arg[3]="男";
        arg[4]="cs";
        arg[5]="1998-05-26";
        DBControl dbc=new DBControl();
        dbc.DB_Signin(arg);
    }
}
