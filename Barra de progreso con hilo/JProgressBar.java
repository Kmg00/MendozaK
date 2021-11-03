package EjerciciosJavaU2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JProgressBar extends JFrame {
	private javax.swing.JProgressBar progressBar;
	private JButton btnSalir;
	private JButton btnIniciar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JProgressBar frame = new JProgressBar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JProgressBar() {
		setTitle("Barra de Progreso Con Hilo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				System.exit(0);
			
				
			}
		});
		btnSalir.setBackground(new Color(255, 0, 255));
		btnSalir.setBounds(30, 157, 89, 23);
		contentPane.add(btnSalir);
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{

				Hilo objHilo1 = new Hilo("miHilo");
				Thread varHilo1 = new Thread (objHilo1);
				
				HiloProgress objHilo2 = new HiloProgress (progressBar);
				Thread 		 varHilo2 = new Thread (objHilo2);
				
				varHilo1.start();
				varHilo2.start();
				
				progressBar.setStringPainted(true);
				
			}
		});
		btnIniciar.setBackground(new Color(255, 0, 255));
		btnIniciar.setBounds(30, 43, 89, 23);
		contentPane.add(btnIniciar);
		
		progressBar = new javax.swing.JProgressBar();
		progressBar.setBounds(145, 23, 279, 210);
		contentPane.add(progressBar);
	}
}
