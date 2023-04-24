package fifthlesson.spring5;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/03/27 9:03
 **/

public class Dept {

    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
