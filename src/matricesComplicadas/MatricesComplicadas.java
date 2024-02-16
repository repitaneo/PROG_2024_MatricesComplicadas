package matricesComplicadas;

public class MatricesComplicadas {
	
	private int datos[][];
	private int orden;
	
	
	
	public MatricesComplicadas(int orden) {
		
		if(orden%2!=0) {
			datos = new int[orden][orden];
			this.orden = orden;
		}
		else {
			datos = new int[5][5];
			this.orden = 5;
		}
	}
	
	
	
	public void imprimir() {

		for(int i=0;i<orden;i++) {
			for(int j=0;j<orden;j++) {
				
				System.out.print(datos[i][j]+" ");
			}
			System.out.println();
		}		
	}	
	
	
	
	public void rellenarExtremos(int x) {
		
		for(int j=0;j<orden;j++) {
			
			datos[0][j] = x;
			datos[orden-1][j] = x;
			datos[j][0] = x;
			datos[j][orden-1] = x;
		}
	}
	
	
	
	public void rellenarMariposa() {
		
		int cuantasBorro = 0;
		for(int j=0;j<(orden/2)+1;j++) {
			for(int i=cuantasBorro;i<orden-cuantasBorro;i++) {
				
				datos[i][j] = orden;
			}
			cuantasBorro++;
		}
		
		cuantasBorro--;
		for(int j=orden/2;j<orden;j++) {
			for(int i=cuantasBorro;i<orden-cuantasBorro;i++) {
				
				datos[i][j] = orden;
			}
			cuantasBorro--;
		}
	}
	
	
	
	public void rellenarMariposa2() {
		
		int cuantasBorro = 0;
		for(int j=0;j<orden;j++) {
			for(int i=cuantasBorro;i<orden-cuantasBorro;i++) {
				
				datos[i][j] = orden;
			}
			if(j<(orden/2)) {
				cuantasBorro++;
			}
			else cuantasBorro--;
		}
	}
	
	
	
}
