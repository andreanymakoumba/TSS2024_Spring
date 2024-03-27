package collezioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProvaCollezioni {

	public static void main(String[] args) {

		String[] note = {"do","re","mi","do","re","mi","do","re","mi"};
		
		Arrays.asList(note);
		
		List<String> parole =new ArrayList<String>();
		parole.addAll(List.of("do","re","do"));
		
		Set<String> paroleSet = new HashSet<String>(parole);
		Set<String> paroleTreeSet = new TreeSet<String>(parole);
	
		paroleSet.forEach(s -> System.out.println(s));
		paroleTreeSet.forEach(System.out::println);
	}

}
