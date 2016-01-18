package student.exm;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int studentmarks = Integer.parseInt(args[0]);

		
		   switch(studentmarks){
		 case 10:
		     System.out.println("Excellent");
		     break;
		 case 9:
		     System.out.println("Very Good");
		     break;
		 case 8:
		     System.out.println("Good");
		     break;
		 case 5:
		     System.out.println("You can do better");
		     break;
		 case 1:
		     System.out.println("Is that even a mark");
		     break;
		 default:
		     System.out.println("Invalid value Entered");
		   }
	}
}

