import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DataStructure{

	public static void main(String args[]){

		Fifo fifo = new Fifo(10);

		BufferedReader br = null;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));

			while(true){

				System.out.println("****FIFO****");

				System.out.println("Informe o que deseja fazer:\n 0 - Sair\n 1- Inserir\n 2- Remover\n 3- Exibir itens da fila\n");

				System.out.print("Digite: ");

        String input = br.readLine();

				switch(input){
					case "0" :

						System.out.println("Programa encerrado com sucesso!\n");

						System.exit(0);

					break;
					case "1" :

						if (fifo.full()){
								System.out.println("\nFila cheia\n\n");
						}
						else {

							System.out.println("\nValor do elemento a ser inserido? \n");

							System.out.print("Digite: ");

							String valor = br.readLine();

							fifo.insert(valor);

						}

						System.out.println("Item inserido\n\n");

					break;
					case "2" :
						if (fifo.free()){
							System.out.println("\nFila vazia\n\n");
						}
						else {

							valor = remover(&umaFila);
							System.out.println("\n"+ valor +", removido com sucesso\n\n") ;

						}
					break;
					case "3" :

						String[] itens = fifo.GetItens();

						System.out.println("Itens:\n");

						for (int i=0; i< itens.length; i++){

							if (itens[i] == null || itens[i] == "")
								break;

							System.out.println((i+1) + " - " + itens[i] + "\n");

						}

						System.out.println("\n\n");
					break;
					default:
						System.out.println("Informe uma opção válida\n");
					break;
				}
				System.out.println("************");
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

}
