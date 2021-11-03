package EjerciciosJavaU2;

import javax.swing.JProgressBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HiloProgress implements Runnable {

	private JProgressBar barra;
	private JPanel contentPane;
	
	
	public HiloProgress (JProgressBar BarraVentana)
	{
		this.barra = BarraVentana;
	}
	
	@Override
	public void run()
	{
		while (!Hilo.terminado)
		{
			//System.out.println("ProgresoHilo.Java");
			
			barra.setValue(Hilo.progreso);
			barra.repaint();
			
			if (Hilo.terminado)
			{
				barra.setValue(100);
				JOptionPane.showMessageDialog(contentPane, "La carga ha finalizado exitosamente");;
				//System.out.println("ProgesoHilo.Java");
				
				break;
			}
		}
	}
		
		
	
	
}
