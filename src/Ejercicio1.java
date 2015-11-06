import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Ejercicio1 extends acm.program.GraphicsProgram{
	
public void run(){
	//cambio el tamaño de la ventana
	setSize(800, 600);
	//llamo al metodo que dibuja la piramide
	pintaPiramide();
}
public void pintaPiramide(){
	int numLadrillosBase=14;
	int anchoLadrillo=30;
	int altoLadrillo=12;
	for (int j=0;j<numLadrillosBase;j++){
		
	for(int i=0;i<numLadrillosBase-j;i++){
		GRect ladrillo=new GRect(anchoLadrillo, altoLadrillo);
		add(ladrillo,anchoLadrillo*j/2+ anchoLadrillo*i, altoLadrillo*j);
										}
							}
					}
}
