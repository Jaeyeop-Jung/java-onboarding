package onboarding.problem7;

import java.util.Map;
import java.util.stream.Collectors;

public class Recommender {
	public static final Integer NUMBER_OF_RECOMMEND_FRIEND = 5;

	private static Map<String, Integer> createScoreBoard(String userName) {
		Map<String, Integer> scores = Sns.registeredUsers.keySet()
			.stream()
			.collect(Collectors.toMap(name -> name, score -> 0));

		Sns.registeredUsers.get(userName).getFriends().stream()
			.forEach(friend -> scores.remove(friend.getName()));

		scores.remove(userName);
		return scores;
	}
	
}
