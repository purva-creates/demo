package demo;

public  class index{
   
    int time;
    String place;
    //constructor
    index(int t, String p){
        this.time=t;
        this.place=p;
    }
     public static void main(String[] args){
    index c=new index(45,"USA");

    System.out.println(c);
    
}
} 

