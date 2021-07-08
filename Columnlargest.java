import java.util.*;

class Columnlargest

{

public static void main(String args[ ])

{

Scanner sc=new Scanner(System.in);

System.out.println("Enter number of rows : ");

int r=sc.nextInt();

System.out.println("Enter number of columns : ");

int c=sc.nextInt();

int a[][]=new int[r][c];

System.out.println("Enter elements in array : ");

for(int i=0;i<r;i++)

{

for(int j=0;j<c;j++)

{

a[i][j]=sc.nextInt();

}

}

for(int j=0;j<c;j++)

{

int l;

l=a[0][j];

for(int i=1;i<r;i++)

{

if(l<a[i][j])

{

l=a[i][j];

}

}

System.out.println("Largest element in "+(j+1)+"column : "+l);

}
}

}