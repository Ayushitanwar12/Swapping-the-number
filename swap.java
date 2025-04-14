public class swap {
    public static void main(String args[]){
        int a=20;
        int b=10;
        int temp=0;
        //swap using temp
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        //swap without using 3rd variable
        int a1=5;
        int b1=8;
        a1=a1+b1;
        b1=a1-b1;
        a1=a1-b1;
        System.out.println(a1);
        //swap without using xOR
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("by XOR"+a);
        //swap using multiply and divide
        a=a*b;
        b=b/a;
        a=a/b;
        System.out.println("by m and d"+a);

    }
    
}
