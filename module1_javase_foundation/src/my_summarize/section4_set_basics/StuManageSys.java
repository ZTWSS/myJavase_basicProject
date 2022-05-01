package my_summarize.section4_set_basics;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManageSys {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("---欢迎使用学生信息管理系统---");
        do {
            System.out.println("-- 1、添加学生 2、删除学生 3、修改信息 4、查找学生 5、遍历学生 --");
            System.out.print("请输入您要进行的操作：");
            int index = sc.nextInt();
            switch (index) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    addStudent(students);
                    break;
                case 2:
                    deleteStudent(students);
                    break;
                case 3:
                    setStudent(students);
                    break;
                case 4:
                    findStudent(students);
                    break;
                case 5:
                    traverseStudents(students);
                    break;
                default:
                    System.out.println("输入错误！");
            }
            System.out.println("===================================");
        } while (true);
    }

    private static void traverseStudents(ArrayList<Student> students) {
        if(students.size() == 0){
            System.out.println("暂无学生信息！");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    private static void setStudent(ArrayList<Student> students) {
        System.out.print("请输入修改学生学号：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int index = findStudentIndex(students, id);
        if (index != -1) {
            System.out.print("请输入该学生修改后的姓名：");
            String name = sc.next();
            System.out.print("请输入该学生修改后的年龄：");
            int age = sc.nextInt();
            Student student = new Student(name, age, id);
            students.set(index, student);
            System.out.println("修改成功！");
        } else {
            System.out.println("该学生不存在！修改失败！");
        }
    }

    private static void deleteStudent(ArrayList<Student> students) {
        System.out.print("请输入删除学生学号：");
        int index = findStudentIndex(students, new Scanner(System.in).nextInt());
        if (index != -1) {
            System.out.println("删除成功！"+students.remove(index));
        } else {
            System.out.println("该学生不存在！删除失败！");
        }
    }

    private static void findStudent(ArrayList<Student> students) {
        System.out.print("请输入查找学生学号：");
        int index = findStudentIndex(students, new Scanner(System.in).nextInt());
        if (index != -1) {
            System.out.println("查找到："+students.get(index));
        } else {
            System.out.println("该学生不存在！");
        }
    }

    private static int findStudentIndex(ArrayList<Student> students, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    private static boolean ignoreRepeat(ArrayList<Student> students,int id){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }

    private static void addStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入添加学生姓名：");
        String name = sc.nextLine();
        System.out.print("请输入添加学生年龄：");
        int age = sc.nextInt();
        System.out.print("请输入添加学生学号：");
        int id = sc.nextInt();
        if(ignoreRepeat(students,id)){
            System.out.println("该学号已存在！添加失败！");
            return;
        }
        Student student = new Student(name, age, id);
        students.add(student);
        System.out.println("添加成功！");
    }
}
