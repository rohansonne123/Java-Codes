public class Constructor {
    public static void main(String args[]){
      student s1=new student();
      student s2=new student(233,"rohan");
      s2.password="sgdgh";
      int matrix[]=new int[3];
      s2.matrix[0]=100;
      s2.matrix[1]=80;
      s2.matrix[2]=100;


      student s3=new student( s2);
      s2.matrix[2]=90;
      System.out.println(s2.name);
      System.out.println(s2.roll);
      for(int i=0;i<matrix.length;i++){
        System.out.println(s3.matrix[i]);
      }
    }
}

class student{
    int roll;
    String name;
    String password;
    int matrix[];
    student(){

    }
    student(int roll,String name){
        this.roll=roll;
        this.name=name;
        this.password=password;
        this.matrix=new int[3];
    }
    //making a deep constructor
    student(student s2){
        matrix=new int[3];
        this.roll=roll;
        this.name=name;
        this.password=password;
        for(int i=0;i<3;i++){
        this.matrix[i]=s2.matrix[i];
        }
        
    }
}
