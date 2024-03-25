package concorrenza;

public class ProvaLettoreSiti {

	public static void main(String[] args) {

		String[] siti = {
				"https://immaginazioneelavoro.it/",
				"https://www.lastampa.it/",
				"https://github.com/maboglia/CorsoJava/blob/master/appunti/038_FileIO.md",
				"https://github.com/maboglia/CorsoJava/blob/master/esempi/13_concurrency/MioThread.java"
		};
		
		int i = 0;
		for (String sito : siti) {
			String[] split = sito.split("i/");
			String path = "C:\\Users\\angel\\Documents\\TSS2024\\TSS2024_Spring\\LaboratorioAvanzato\\src\\concorrenza\\siti\\";
			LettoreSitiWeb lsw = new LettoreSitiWeb(sito, path + "file" + (i++) +".html");
			
			lsw.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
