package sixthlesson.spring5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/03/27 9:26
 **/

public class Stu {
    private String[] strs;
    private List<String> list;
    private Map<String, String> map;
    private Set<String> set;

    private List<Course> courses;

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "strs=" + Arrays.toString(strs) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", courses=" + courses +
                '}';
    }

    public void show(){
        System.out.println(Arrays.toString(strs));
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}
