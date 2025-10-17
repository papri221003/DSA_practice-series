public class MaxGuest_presentAtParty {
    public static int maxGuests(int[] E, int[] L) {
        int currguest=0;
        int maxguest=0;
        for(int i=0;i<E.length;i++)
        {
            currguest+=E[i];
            currguest-=L[i];
            maxguest=Math.max(maxguest,currguest);
        }
        return maxguest;

    }
    public static void main(String[] args) {
        int entry[]={7,0,5,1,3};
        int exit[]={ 1,2,1,3,4};
        System.out.println(maxGuests(entry,exit));

    }
}