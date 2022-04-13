public class app {
//    Context: Nathan loves cycling. Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
//            Task: You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.

    public static void main (String[] args){
//      declaring an integer called litres and initializing it to 2.
        int litres =2;
//      assigns the value of litres to the variable ans.
        int ans = litres(litres);
        System.out.println(ans);
    }

    public static int litres (int time){
        int ans = (int) (time * 0.5);
        return ans;
    }
}
