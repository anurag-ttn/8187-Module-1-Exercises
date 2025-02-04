
public class Q4{
public static void main(String[] args){


int arr[][] = {{1,2,3,4},{1,4,6,8},{4,6,3,5},{9,8,4,1}};

int n = arr.length;
int m = n;


for(int i=0;i<n;i++){
int rowTotal = 0;
for(int j=0;j<m;j++){
rowTotal+=arr[i][j];
}
System.out.println("total of "+i+"th row is :"+rowTotal);
}


System.out.println();

for(int i=0;i<m;i++){
int colTotal = 0;
for(int j=0;j<n;j++){
colTotal+=arr[j][i];
}
System.out.println("total of "+i+"th col is :"+colTotal);
}


}
}
