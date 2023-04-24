package sixthlesson.spring5;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/03 8:39
 **/

public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
