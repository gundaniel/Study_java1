package exam_object_stream;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {
	public static void main(String[]args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(Integer.valueOf(10));
		oos.writeObject(Double.valueOf(3.14));
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new String("홍길동"));
		
		oos.flush();
		oos.close();
		fos.close();

		//FileOutputStream fis = new FileOutputStream("object.dat");
		//ObjectOutputStream ois = new ObjectOutputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"));

		Integer obj1 = (Integer) ois.readObject(); //반환값이  object 이기에 형변환을 해야함
		Double obj2 = (Double) ois.readObject();
		int [] obj3 = (int []) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close();
		//fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);

	}
}
