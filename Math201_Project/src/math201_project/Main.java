package math201_project;


public class Main {
    String[] name=new String[]{"Tamim", "Sakib", "Musfiqur","Mahmudullah","Soumya","Imrul Kayes","Liton","Mithun","Mosaddek","Sabbir"};
    double[] CV=new double[10];
    int j=0,index=0;
    
    void Calculation(int []data, int N){
        int A = 0;
        double sum_d=0, sum_d2=0;
        double[] d=new double[15];
        double[] d2=new double[15];
        if(( N%2)!=0){
            A = data[N/2];
        }
        else{
            if((data[N/2]-1) > (data[N/2])){
            A = data[N/2-1];
            }
            else
                A=data[N/2];
        }
        //System.out.println("Value of A is: "+A);
        
        System.out.print("15 match's run of "+name[j]+":");
        for(int i=0;i<15;i++){
            System.out.print(" "+data[i]);
            d[i]=data[i]-A;
            //System.out.println(" Value of d:"+d[i]);
            sum_d=sum_d+d[i];
            d2[i]=d[i]*d[i];
            sum_d2=sum_d2+d2[i];
        }
        //System.out.println(" Sumation of d:"+sum_d+"  "+"Sumation of d2:"+sum_d2);
        double sigma=Math.sqrt(((sum_d2/N)-((sum_d/N)*(sum_d/N))));
        //System.out.println("Sigma "+String.format("%.3f", sigma));
        double mean=A+(sum_d/N);
        //System.out.println("Mean "+String.format("%.3f", mean));
        double cv=(sigma/mean)*100;
        //System.out.println("cv "+String.format("%.3f", cv)+"%");
        
        CV[j]=cv;
        System.out.println(" ");
        System.out.println("CV of "+name[j]+" is "+String.format("%.3f",CV[j])+"%\n");
        j++;
    }
    void compare(){
        double best=CV[0];
        for(int d=1;d<10-1;d++){
            if(best>CV[d]){
                best=CV[d];
                index=d;
            }
        }
        
        System.out.println("\nSo, the best player is "+name[index]+" and his C0-efficient of Variance is "+String.format("%.3f",CV[index])+"%\n");
    }
    
    public static void main(String[] args) {

        int[] array1=new int[]{24, 158,128,44,40,64,13,78,1,52,13,17,0,20,112};
        int[] array2=new int[]{124,41,51,66,64,41,19,43,51,15,0,4,19,96,30};
        int[] array3=new int[]{16,67,98,10,19,55,19,9,64,23,34,21,84,125,28};
        int[] array4=new int[]{9,32,41,3,9,64,27,16,76,54,41,53,33,26,0};
        int[] array5=new int[]{42,25,2,29,10,3,33,22,15,11,69,7,0,32,1};
        int[] array6=new int[]{59, 44,19,6,31,68,1,72,9,2,144,90,115,4,0};
        int[] array7=new int[]{32,126,9,176,14,22,0,19,0,21,0,25,102,21,32};
        int[] array8=new int[]{21,26,0,10,12,4,50,32,9,73,6,0,19,2,30};
        int[] array9=new int[]{12,14,52,26,11,26,35,3,16,12,13,10,51,5,5};
        int[] array10=new int[]{2,3,12,12,13,43,102,0,7,0,0,36,60,11,7};
        
        Main obj=new Main();
        obj.Calculation(array1, array1.length);
        obj.Calculation(array2, array2.length);
        obj.Calculation(array3, array3.length);
        obj.Calculation(array4, array4.length);
        obj.Calculation(array5, array5.length);
        obj.Calculation(array6, array6.length);
        obj.Calculation(array7, array7.length);
        obj.Calculation(array8, array8.length);
        obj.Calculation(array9, array9.length);
        obj.Calculation(array10, array10.length);
        obj.compare();
    }
    
}
