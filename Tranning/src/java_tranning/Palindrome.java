package java_tranning;


class Palindrome {
	  public static void main(String[] args) {

	    String str = "Akshat", revStr = "";
	    
	    int len = str.length();

	    for (int i = (len - 1); i >=0; --i) {
	      revStr = revStr + str.charAt(i);
	    }

	    if (str.equals(revStr)) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	  }
	}