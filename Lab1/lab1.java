public class lab1 {
public static void main(String args[]) {
 System.out.println("Hello world!");

 String languages[] = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

 int n = (int) (Math.random() * 1_000_000);

n=n*3;
n=n+Integer.parseInt("1010",2);
n=n+Integer.parseInt("FF",16);
n=n*6;

int sum=0;

while(true){
    

    while(n>0){
        sum=sum+n%10;
        n=n/10;
        
    }

    
    if(sum >=10)
    {n=sum;
     sum=0;
    }
    else break;
}
    

System.out.println("Willy-nilly, this semester I will learn " + languages[n] );
System.out.println(n);

}
}

