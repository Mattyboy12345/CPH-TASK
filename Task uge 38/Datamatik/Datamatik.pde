void setup() {
  Teacher teacher = new Teacher("Thorbjørn", 40, false);
  ArrayList<Student> students = new ArrayList<Student>();
  students.add(new Student("Mathias", 22, false, 'a'));
  students.add(new Student("Maja", 21, true, 'a'));
  
  println(teacher.name());
  
  for (int i = 0; i < students.size(); i++) {
    Student tmpStudent = students.get(i);
    println(tmpStudent.nameAndTeam());
  }
}
