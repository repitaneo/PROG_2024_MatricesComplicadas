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
				
				if(datos[i][j]<10) {
					System.out.print("0");
				}
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
	
	
	
	public void rellenarZigZag() {
		
		int numero = 1;
		for(int j=0;j<orden;j++) {
			
			int fila = 0;
			int columna = j;
			while(columna>=0) {
				datos[fila++][columna--] = numero++;
			}
		}
		
		for(int i=1;i<orden;i++) {
			
			int fila = i;
			int columna = orden-1;
			while(fila<orden) {
				datos[fila++][columna--] = numero++;
			}
		}
	}
	
	
	public void rellenarCaracol() {
		
		int fila = orden/2;
		int columna = orden/2;
		int numero = 1;
		
		datos[fila][columna] = numero++;
		
		int vuelta = 1;
		while((numero-1)!=orden*orden) {
			
			fila--;
			columna--;
			
			for(int j=0;j<vuelta*2;j++) {
				
				columna++;
				datos[fila][columna] = numero++;
			}
			
			for(int i=0;i<vuelta*2;i++) {
				
				fila++;
				datos[fila][columna] = numero++;
			}
			
			for(int j=0;j<vuelta*2;j++) {
				
				columna--;
				datos[fila][columna] = numero++;
			}
			
			for(int i=0;i<vuelta*2;i++) {
				
				fila--;
				datos[fila][columna] = numero++;
			}
			
			vuelta++;
		}
	}
	
	
}
