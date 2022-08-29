package p05.restricted_generic;

import java.util.Arrays;

public class RestrictedGenericEx {

	public static void main(String[] args) {
		

	}
	
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}


}
