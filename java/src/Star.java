import java.util.Scanner;

/*
 �� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�.
��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.
 ���� ����
- n�� m�� ���� 1000 ������ �ڿ����Դϴ�.
 * */
public class Star {

	
	public static void main(String[] args) { // ���簢�� �����
		 Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        for( int i = 0; i<b; i++) {            
	                for(int j=0; j<a; j++) {
	                    System.out.print("*");
	                }
	            System.out.println();
	        } 
	}

}
