public class Q5 {

	public static void main(String[] args) {
		if (args.length == 1) {
			int count = 0;
			try {
				count = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.out.println("Sorry but it is not a number...");
				System.exit();
			}
			for (int i = count; i > 0; i--)
        		System.out.println("x".repeat(i));
		} else {
			throw new IllegalArgumentException();
		}
	}
}
