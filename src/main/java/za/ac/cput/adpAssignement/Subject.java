package za.ac.cput.adpAssignement;
/*
 * Author: Robin White
 * Student Number: 218034555
 * Description: Subject Class
 */
public class Subject {
    private String name, code;

    public Subject(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
