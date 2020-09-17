void setup() {  
  printEmptyLine();    
  
  printInput("Task one");    
  
  printPersonalInfo("Mathias", 22);
  }


void draw() {  

}  

// 1.a 
void printEmptyLine() {  
  println();    
}  
// 1.b  
void printInput(String text) {  
  println(text);  
}  
//1.c
void printPersonalInfo(String name, int age) {  
  println("My name is " + name + ", I am " + age + " years old");    
}
