
public class Math {
	static int addNumbers(int x, int y) {
		int z = x + y;
		return z;
	}

	int previousNum;

	int addSpecial(int num1) {
		int answer;
		answer = previousNum + num1;
		previousNum = answer;
		return answer;
	}
}
