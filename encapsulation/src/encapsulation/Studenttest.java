package encapsulation;

public class Studenttest {
public static void main(String[] args) {
	Studenttt s=new Studenttt ();
	s.setId(123);
s.setName("shambhu");
s.setCollage("pccoer");
s.setFee(15000);
System.out.println(s.getName()+"  "+s.getId()+"  "+s.getCollage()+"  "+s.getFee());
}
}