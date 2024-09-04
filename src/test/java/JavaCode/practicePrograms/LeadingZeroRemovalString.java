package JavaCode.practicePrograms;

public class LeadingZeroRemovalString {
    public static void main(String[] args){

        String st = "000001234";
        int index =0;
        for(int i =0 ; i< st.length(); i++){
            char p = st.charAt(i);
            if(p != '0'){
                index = i;
                break;
            }
        }

        String str = st.substring(index , st.length());
        System.out.println(str);
    }
}
