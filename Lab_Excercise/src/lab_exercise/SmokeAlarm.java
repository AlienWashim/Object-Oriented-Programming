package lab_exercise;

public class SmokeAlarm {
    public static void main(String[] args) {
        Object myArray[];
        myArray=new Object[10];
        
        Object obj=new SmokeAlarm();
        myArray[0]=obj;
        Object obj2=new SmokeAlarm();
        myArray[1]=obj2;
        Object obj3=new FireEmergency();
        myArray[2]=obj3;
        Object obj4=new FireEmergency();
        myArray[3]=obj4;
        
        for(Object i:myArray){
            if(i instanceof isEmergency){
                ((isEmergency) i).soundSiren();
            }
        }
    }
}
