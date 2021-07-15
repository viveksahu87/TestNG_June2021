public class java {

    public static void main (String[] args){
        int a[] ={1,2,3,4};
        int t=1;
        for(int i=0;i<4;i++){

            for(int j=0;j<4;j++){

                if(i!=j){
                    t=t*a[j];
                }

            }
            System.out.println("multiplication value is : " + t);
            t=1;
        }

    }



}
