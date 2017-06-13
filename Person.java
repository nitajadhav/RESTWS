
public class Person {

    private String NAME;
    private String LOCATION;
    private Exam[] EXAM;

    @Override
    public String toString() {
       String str= NAME + " - " + LOCATION + "\tEXAMS: ";
        for(int i=0;i<EXAM.length;i++){
        	str=str+EXAM[i]+"\t";
        	
        }
        return str;
    }
}
