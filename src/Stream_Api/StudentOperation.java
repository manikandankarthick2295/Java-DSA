package Stream_Api;

import java.util.*;
import java.util.stream.Collectors;

public class StudentOperation {
    public static void main(String[] args) {
        Student[] students = {
                new Student("John", 65),
                new Student("Michael", 80),
                new Student("David", 92),
                new Student("Joseph", 88),
                new Student("Paul", 32),
                new Student("Peter", 90),
                new Student("Daniel", 35),
                new Student("Matthew", 84),
                new Student("Thomas", 89),
                new Student("Andrew", 73)
        };

//        printAllStudentName(students);//1
//        printAllStudentMark(students);//2
//        int totalStudents = findTotalStudents(students);//3
//        System.out.println(totalStudents);

//        double avgMarks = findAvgMarks(students);//4
//        System.out.println("Avg marks "+avgMarks);

//        double maxMarksScored = maxMarksScored(students);//5
//        System.out.println("max marks score: "+maxMarksScored);

//        double minMarksScored = minMarksScored(students);//6
//        System.out.println("min marks score: "+minMarksScored);

//        List<Student> studentsSCoreMoreThan60 = findStudentsSCoreMoreThan60(students);//7
//        System.out.println(studentsSCoreMoreThan60);

//        findStudentsWhoPass(students);//8
//        findStudentsWhoFail(students);//9

//        Map<String, Double> stringDoubleMap = ConvertStudentsToMap(students);//10
//        System.out.println(stringDoubleMap);

//          long l = studentsCountScoreAboveAvg(students);//11
//          System.out.println("no of students above avg "+l);

//         studentsNameScoreAboveAvg(students);//12

//        Student student = topperStudent(students);//13
//        System.out.println("the topper student "+ student);

//        Student student1 = secondHighestStudent(students);//14
//        System.out.println(student1);

//        Student[] students1 = StudentScoredBetween60To70(students);//15
//        System.out.println(Arrays.toString(students1));

//        boolean fullPass = checkStudentsAllPass(students);//16
//        System.out.println("is all the students pass "+ fullPass);

//        boolean fullMark = checkStudentsAny100(students);//17
//        System.out.println("is any one got 100 marks "+ fullMark);

//        Student student = FirstStudentGot80(students1);//18
//        System.out.println("The First STudent got 80 "+student);

//        List<Student> studentsSCoreMoreThan75 = findStudentsSCoreMoreThan75(students);//19
//        System.out.println("The Students got 75 "+studentsSCoreMoreThan75);

//        Student[] students1 = sortedDist(students);//20
//        System.out.println(Arrays.toString(students1));

    }

    public static void printAllStudentName(Student[] stu){

        Arrays.stream(stu).map(Student::getName).forEach(System.out::println);

    }

    public static void printAllStudentMark(Student[] stu){

        Arrays.stream(stu).map(Student::getMark).forEach(System.out::println);

    }

    public static int findTotalStudents(Student[] stu){

        return stu.length;

    }

    public static double findAvgMarks(Student[] stu){
        OptionalDouble average = Arrays.stream(stu).mapToDouble(Student::getMark).average();

        if(average.isPresent()){
            return average.getAsDouble();
        } else {
            return 0.0;
        }

    }

    public static double maxMarksScored(Student[] stu){
        OptionalDouble max = Arrays.stream(stu).mapToDouble(Student::getMark).max();
        if(max.isPresent()){
            return max.getAsDouble();
        } else {
            return 0.0;
        }

    }

    public static double minMarksScored(Student[] stu){
        OptionalDouble min = Arrays.stream(stu).mapToDouble(Student::getMark).min();
        if(min.isPresent()){
            return min.getAsDouble();
        } else {
            return 0.0;
        }

    }

    public static List<Student> findStudentsSCoreMoreThan60(Student[] student){
        List<Student> collect = Arrays.stream(student).filter(stu -> stu.getMark() > 60).collect(Collectors.toList());
       return collect;
    }

    public static List<Student> findStudentsWhoPass(Student[] student){
        return Arrays.stream(student).filter(stu -> stu.getMark() >= 40)
                .collect(Collectors.toList());

    }

    public static void findStudentsWhoFail(Student[] student){
        Arrays.stream(student).filter(stu -> stu.getMark() < 40)
                .forEach(student1 -> System.out.println("Student name : "+student1.getName()+" Student name : "+student1.getMark()));

    }

    public static Map<String, Double> ConvertStudentsToMap(Student[] student){
        Map<String, Double> collect = Arrays.stream(student).collect(Collectors.toMap(Student::getName, Student::getMark));

        return collect;
    }

    public static long studentsCountScoreAboveAvg(Student[] student){
        OptionalDouble average = Arrays.stream(student).mapToDouble(Student::getMark).average();
        System.out.println("avg: "+average);
        if(average.isPresent()){
            return Arrays.stream(student).filter(stu -> stu.getMark() > average.getAsDouble()).count();
        }else {
            return 0;
        }

    }

    public static void studentsNameScoreAboveAvg(Student[] student){
        OptionalDouble average = Arrays.stream(student).mapToDouble(Student::getMark).average();
        System.out.println("avg: "+average);
        if(average.isPresent()){
            Arrays.stream(student)
                    .filter(stu -> stu.getMark() > average.getAsDouble())
                    .map(Student::getName).forEach(System.out::println);
        }

    }

    public static Student topperStudent(Student[] stu) {

        Student student = Arrays.stream(stu)
                .max(Comparator.comparing(value -> value.getMark()))
                .orElse(null);// or throw exception

        return student;
    }


    public static Student secondHighestStudent(Student[] stu) {

        Student student = Arrays.stream(stu).sorted(Comparator.comparing(Student::getMark)
                        .reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        return student;
    }

    public static Student[] StudentScoredBetween60To70(Student[] stu) {

        Student[] array = Arrays.stream(stu).filter(student -> student.getMark() >= 70 && student.getMark() <= 85)
                .toArray(Student[]::new);


        return array;
    }

    public static boolean checkStudentsAllPass(Student[] stu) {//stu.length > 0  = safe check for all match

        boolean fullPass = stu.length > 0 && Arrays.stream(stu).allMatch(student -> student.getMark() > 40);

        return fullPass;
    }

    public static boolean checkStudentsAny100(Student[] stu) {

        boolean fullMark = Arrays.stream(stu).anyMatch(student -> student.getMark() == 100);

        return fullMark;
    }


    public static Student FirstStudentGot80(Student[] stu) {

        Student student1 = Arrays.stream(stu)
                .filter(student -> student.getMark() >= 80)
                .findFirst().orElse(null);

        return student1;
    }


    public static List<Student> findStudentsSCoreMoreThan75(Student[] student){
        List<Student> collect = Arrays.stream(student).filter(stu -> stu.getMark() > 75).collect(Collectors.toList());
        return collect;
    }

    public static Student[] sortedDist(Student[] stu) {

        Student[] array = Arrays.stream(stu)
                .filter(student -> student.getMark() >= 75)
                .sorted(Comparator.comparingDouble(Student::getMark).reversed()).toArray(Student[]::new);

        return array;
    }
}
