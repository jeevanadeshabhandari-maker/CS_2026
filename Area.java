// public class Area {
//     Area(int r){
//         System.out.println("Area of Circle is :"+ (3.142*r*r));
//     }

class Area{
    Area(int r){
        System.out.println("Area of Circle is: "+(3.14*r*r));
    }
    Area(int b,int h){
        System.out.println("Area of rectangular: "+(0.5*b*h));}
    
        public static void main(String[]args){
            Area s1=new Area(33);
            Area s2=new Area(20, 50);
        }
}

