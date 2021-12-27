
package deneme;

public class Deneme {

    
    public static void main(String[] args) {
       java.util.Scanner input = new java.util.Scanner(System.in);
       double myList[]= new double[5];
for (int i = 0; i < myList.length; i++) {
  myList[i] = Math.random() * 50;
}
for(int i=0;i<myList.length;i++)
{
    System.out.println(myList[i]);
}
double max=myList[0];
for(int i=0;i<myList.length;i++){
    if(myList[i]>max)
    {
        max=myList[i];
    }
}
        System.out.println("max: "+ max);
    }
}
