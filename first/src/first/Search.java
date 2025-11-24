package first;
public class Search {
	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50};
	        int searchElement = 30;
	        boolean found = false;
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == searchElement) {
	                System.out.println(searchElement + " found at index " + i);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println(searchElement + " not found in the array.");
	        }
	    }
	}

