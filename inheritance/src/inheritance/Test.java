package inheritance;

public class Test {
	public static void main(String[] args) {
		TestEncapsulation t =new TestEncapsulation();
		t.setId(11);
		t.setName("Shital");
		t.setCollage("AIT");
		t.setFee(15000);
		
		System.out.println(t.getId()+" "+t.getName()+" "+t.getCollage()+" "+t.getFee());
		
	}

}
