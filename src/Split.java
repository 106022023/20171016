public class Split {
    public static void main(String[] args){
     //顯示訊息
        java.util.Scanner sc =new java.util.Scanner(System.in);

        String str = sc.next();
        char symbol = sc.next().charAt(0);

        String newStr = str.replace(symbol,'a');
        System.out.println(newStr);
    }
}
