package seventhcourse.spring5;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/10 8:54
 **/

public class EMP {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EMP{" +
                "dept=" + dept +
                '}';
    }
}
