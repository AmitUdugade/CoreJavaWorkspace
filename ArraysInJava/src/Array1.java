public class Array1 {
    public void arrayMethod(){
        int a[]=new int[6];   //declaration and instantiation
        a[0]=10;     //initialization
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        String nameArray[] = {"Amit","Ameet","Amiet"};
        for(int j=0; j<nameArray.length; j++){
            System.out.println(nameArray[j]);
        }

        for (String name:nameArray) {
            System.out.println(name);
        }
    }
}
