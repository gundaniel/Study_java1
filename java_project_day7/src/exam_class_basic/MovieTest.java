package exam_class_basic;

public class MovieTest {
		public static void main(String[]args) {
			
			/*
			Movie movie1 = new Movie();
			
			movie1.movieData("범죄도시4","허명행" , 109);
			
			System.out.println(movie1.toString());
			movie1.printData();
			*/
			//----------------------------------------------------------
			

			Movie movie2 = new Movie();
			
			movie2.movieName = "베테랑2";
			movie2.mDirector = "류승완";
			movie2.runningTime = 118;
			
			System.out.println(movie2.toString());
			movie2.printData();
			//---------------------------------------------------------- 대입하여 출력
		}
		
	}

