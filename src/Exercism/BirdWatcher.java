package Exercism;

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] r=new int[]{0,2,5,3,7,8,4};
        return r;
    }

    public int getToday() {
        if(birdsPerDay.length!=0) return birdsPerDay[birdsPerDay.length-1];
        else return 0;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]+=1;
    }

    public boolean hasDayWithoutBirds() {
        int x=0;
        for(int i:birdsPerDay){
            if(i==0)x=1;
        }
        if(x==1)return true;
        else return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int r=0;
        int count=0;
        for(int i:birdsPerDay){
            if(count==numberOfDays)break;
            r+=i;
            count++;
        }
        return r;
    }

    public int getBusyDays() {
        int r=0;
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]>=5)r++;
        }
        return r;
    }
    public static void main(String[] args) {

    }
}
