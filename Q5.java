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
			for (int i = 0; i < count; i++)
        		System.out.println("*".repeat(i + 1));
		} else {
			throw new IllegalArgumentException();
		}
	}
}
