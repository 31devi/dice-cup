import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner kbd= new Scanner(System.in);
     int temp=0;
      int p=kbd.nextInt(); 
      int q=kbd.nextInt();
          if(q < p){
       temp = p;
     p = q;
     q = temp;
          }
for(int i = p + 1; i < q + 2; i++) {
       System.out.print(i+"\n");
    }
}
}