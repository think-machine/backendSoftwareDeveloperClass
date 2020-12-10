//
//				public class Quiz {
//				
//					public static void main(String[] args) {
//						System.out.println(sayThisAgain("Hello", 1));
//						System.out.println(sayThisRecursively("Hello", 4));
//					}	
//					
//					public static String sayThisAgain(String text, int repetitions) {
//						String result = "";
//						for(int i = 0; i < repetitions; i++) {
//							result += text;
//						}
//						//
//					    return result;
//				
//					}
//					
//					public static String sayThisRecursively(String text, int repeats) {
//						String words = null;
//						if(repeats > 0) {
//							sayThisRecursively(words, repeats - 1);
//							words+=text;
//						}
//						return words;
//					}
//				}
