import java.util.*;

public final class Main {
	private static String factorial(int num) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1));
		for(int i = 2; i <= num; i++) {
			for(int j = 0; j < list.size(); j++) list.set(j,list.get(j)*i);
			for(int j = 0; j < list.size(); j++) {
				if(list.get(j) > 9) {
					if(j+1 == list.size()) list.add(list.get(j)/10);
					else list.set(j+1,list.get(j+1)+list.get(j)/10); 
					list.set(j,list.get(j)%10);
				}
			}
		}
		StringBuilder builder = new StringBuilder();
		for(int i = list.size()-1; i >= 0; i--) builder.append(list.get(i));
		return builder.toString();
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println(factorial(scanner.nextInt()));
		} finally {
			scanner.close();
		}
	}
}