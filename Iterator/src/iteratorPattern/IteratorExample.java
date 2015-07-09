package iteratorPattern;

public class IteratorExample {

	public static void main(String[] args){
		NameRepository nameRepository = new NameRepository();
		
		for (IIterator iterator = nameRepository.getIterator(); iterator.hasNext();){
			String name = (String) iterator.next();
			System.out.println("Name:" + name);
		}
	}
}
