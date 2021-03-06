package tutorial6;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import tutorial6.signal.ComplexOscillator;
import tutorial6.plot.FFTPanel;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {

	FFTPanel rfFftPanel;
	FFTPanel rfFftPanel2;
	FFTPanel audioFftPanel;

	public MainWindow(String title, int sampleRate, int samples) {
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		JPanel bottomPanel = new JPanel();
		add(bottomPanel, BorderLayout.SOUTH);
		JLabel lblSampleRate = new JLabel("Sample Rate: " +sampleRate);
		bottomPanel.add(lblSampleRate);
		
		rfFftPanel = new FFTPanel("RF", sampleRate, 7200000, samples, FFTPanel.COMPLEX);
		rfFftPanel.setPreferredSize(new Dimension(1200,300));
		add(rfFftPanel, BorderLayout.NORTH);
		
		rfFftPanel2 = new FFTPanel("IF", sampleRate, 7200000, samples, FFTPanel.COMPLEX);
		rfFftPanel2.setPreferredSize(new Dimension(600, 200));
		add(rfFftPanel2, BorderLayout.CENTER);
		
		audioFftPanel = new FFTPanel("Audio", sampleRate, 0, samples/2, FFTPanel.REAL);
		audioFftPanel.setPreferredSize(new Dimension(300, 200));
		add(audioFftPanel, BorderLayout.EAST);
		
	}

	public void setRfData(double[] data) {
		rfFftPanel.setData(data);
	}
	public void setRfData2(double[] data) {
		rfFftPanel2.setData(data);
	}
	public void setAudioData(double[] data) {
		audioFftPanel.setData(data);
	}
	public void setNco(ComplexOscillator localOsc) {
		rfFftPanel.setNco(localOsc);
	}
}
