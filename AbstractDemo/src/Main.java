
public class Main {

	public static void main(String[] args) {
		CustemerManager custemerManager = new CustemerManager();
		
		custemerManager.baseDatabaseManager= new MySqlDatebaseManager();
		custemerManager.getCostumer();

	}

}
