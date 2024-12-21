
public class w7q2 {
    public static void main(String[] args) {
          int a[]= { 4,8,2,9,5};
         int len= a.length;
//         bubble sort
         for(int i=0;i<len-1;i++){
             for(int j=0;j<len-1;j++){
                 if(a[j]>a[j+1]){
                     int temp=a[j];
                     a[j]=a[j+1];
                      a[j+1]= temp;
                 }  
             }     
         }
         for(int element : a){
        System.out.println(element);
    }
  }

}
