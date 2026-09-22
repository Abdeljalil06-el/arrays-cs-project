package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int newCourse=2000;
        int[] upatedCourses=new int[registeredCourses.length+1];

        for (int i=0;i<registeredCourses.length;i++) {
            upatedCourses[i]=registeredCourses[i];
        }
        upatedCourses[registeredCourses.length]=newCourse;
        
        System.out.println("the updated courses are : ");
        for (int i=0;i<upatedCourses.length;i++) {
                System.out.println(upatedCourses[i]);
        }

        int scourse=3000;
        boolean flag=false;
        for (int course : upatedCourses) {
            if (course==scourse){
                flag=true;
            break;
            }
        }
        if (flag) System.out.println("the course was found.");
        else System.out.println("the course was not found.");
            
    }
}
