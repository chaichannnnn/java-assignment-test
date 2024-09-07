import java.util.Scanner;
public class Q2CompareVersion {
    public static int CompareVersion(String v1, String v2){
        String[] version1 = v1.split("\\.");
        String[] version2 = v2.split("\\.");

        int maxLength = version1.length > version2.length ? version1.length : version2.length;
        
        for(int i = 0; i < maxLength; i++){
            int number1 = version1.length > i ? Integer.parseInt(version1[i]) : 0;
            int number2 = version2.length > i ? Integer.parseInt(version2[i]) : 0;

            if(number1 < number2){
                return -1;
            }else if(number1 > number2){
                return 1;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("version 1: ");
        String version1 = sc.next();

        System.out.print("version 2: ");
        String version2 = sc.next();
        
        sc.close();

        System.out.println("Output : " + CompareVersion(version1, version2));
    }
}
