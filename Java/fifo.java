import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fifo{

	public static void main(String args[]){
		int[] fifo = new int[10];

		BufferedReader br = null;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));

			while(true){

				System.out.println("****FIFO****");

				System.out.println("Informe o que deseja fazer:\n 0 - Sair\n 1- Inserir");

				System.out.print("Digite: ");

		                String input = br.readLine();

				switch(input){
					case "0" :
						System.out.println("Programa encerrado com sucesso!\n");
						System.exit(0);
					break;
					case "1" :
						System.out.println("Item inserido\n");
					break;
					default:
						System.out.println("Informe uma opção válida\n");
					break;
				}
			}
		}catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    if (br != null) {
		        try {
		            br.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}

	}

	public static void insert(){
		
	}

	public static void remove(){
		
	}

	public static void show(){
		
	}

}
