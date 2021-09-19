package basic.programs;

public class Patern {

		void patern1() {
			System.out.println("--------------------------------------------------------------------");
			for (int cal = 1; cal <= 5; cal++) {
				for (int row = 1; row <= cal; row++) {
					System.out.print("* ");
				}
				System.out.println();

			}
		}

		void patern2() {
			int cal, j, row = 6;
			System.out.println("--------------------------------------------------------------------");

			for (cal = 1; cal <= row - 1; cal++) {
				for (j = row - 1; j >= cal; j--) {
					System.out.print(" ");
				}
				for (j = 1; j <= cal; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		void patern3() {
			int cal, j, row = 6;
			System.out.println("--------------------------------------------------------------------");

			for (cal = 1; cal <= row - 1; cal++) {
				for (j = row - 1; j >= cal; j--) {
					System.out.print(" ");
				}
				for (j = 0; j < cal + cal; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		void number() {
			System.out.println("--------------------------------------------------------------------");
			for (int cal = 1; cal <= 5; cal++) {
				for (int row = 1; row <= cal; row++) {
					System.out.print(row);
				}
				System.out.println();

			}
		}

		public static void main(String[] args) {
			Patern ob = new Patern();
			ob.number();
			ob.patern1();
			ob.patern2();
			ob.patern3();
		}
	}


