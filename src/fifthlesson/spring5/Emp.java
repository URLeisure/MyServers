package fifthlesson.spring5;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/03/27 9:04
 **/

public class Emp {

    private String ename;
    private String gender;

    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
