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
	int altoPiramide=numLadrillosBase*altoLadrillo;
	int basePiramide=numLadrillosBase*anchoLadrillo;
	int desplazamientoVertical=getHeight()-altoPiramide;
	
	for (int j=0;j<numLadrillosBase;j++){
		
	for(int i=0;i<numLadrillosBase-j;i++){
		GRect ladrillo=new GRect(anchoLadrillo, altoLadrillo);
		
		add(ladrillo,getWidth()/2-basePiramide/2+anchoLadrillo*j/2+getHeight()-altoLadrillo - altoLadrillo*j, eventMask);
		
		pause(20);
										}
							}
					}


}
