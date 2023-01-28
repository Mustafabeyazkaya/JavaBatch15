package class15;

public class HmExam {
    /*
    Create a method createEmail().
     Based on values of users name,
     lastName and email type,
      your method should return complete email Address.
       Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */
    String createEmail(String firstName,String lastName,String mailType){
        return firstName+lastName+"@"+mailType+".com";
    }

    public static void main(String[] args) {
        HmExam inp=new HmExam();
        System.out.println(inp.createEmail("Mustafa","beyazkaya","gmail"));
    }
}
