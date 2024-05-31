package Session15_MultiFileDalamPackage;

public class Player {
		private String name;
		
		Player(String name){
			this.name = name;
		}

		public String getName() {
			return name;
		}

		void setName(String name) {
			this.name = name;
		}
		
		void show() {
			System.out.println("Player name = " + this.name);
		}
	
}
