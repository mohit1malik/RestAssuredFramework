package JavaCode.practicePrograms;

public class PalingdromeString {
    public static void main(String[] args){

        String st = "galag";
        String st1 = st.toLowerCase();
        boolean flag = true;

        for(int i = 0 ; i< st1.length()/2; i++){
            if(st1.charAt(i) != st1.charAt(st1.length()-i-1)){
                flag = false;
            }
        }

        if(flag){
            System.out.println("String is palingdrome");
        }else{
            System.out.println("String is not palingdrome");
        }
    }
}
