package inbox;

public class InvalidAgeException extends RuntimeException{
		public String getMessage() {
			return "you are not eligible";
		}
}
