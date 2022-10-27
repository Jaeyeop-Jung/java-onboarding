package onboarding.problem4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseConverter {
	public static final List<Character> dict = IntStream.rangeClosed('A', 'Z')
		.mapToObj(c -> (char)c)
		.collect(Collectors.toList());
	public static final List<Character> reverseDict = dict.stream()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
	
}
