package telusko;
    
    // class computer{
    //     public void playMusic (){
    //         System.out.println("music is playing");
    //     }
    //     public String getMePen(int cost){
    //         return "pen";
    //     }
    // }
    class Calculator{
        public int add(int n1, int n2) {
            // System.out.println("in add");
            return n1 + n2;
        }

    }


    public class methods {
        public static void main(String[] args) {
            // computer comp = new computer();
            // comp.playMusic();
            // String str = comp.getMePen(20);
            // System.out.println(str);
            Calculator obj = new Calculator();
            obj.add(5, 9);
            

        }
        
    }
