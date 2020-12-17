package WithoutWB;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Quiz {

	int index = 0;
	char userChoice = ' ';
	int correct_answer = 0;

	String[] questions = { "Which Company created Java?", "Which year was Java created?",
			"What was Java originally Called?", "Who is credited with creating Java?" };

	String[][] quizOptions = { { "Sun Microsystems", "StarBucks", "Microsoft", "Alphabet" },
			{ "1989", "1996", "1972", "1492" }, { "Apples", "Latte", "Oak", "Coffee" },
			{ "Steve Jobs", "Bill Gates", "James Gosling", "Mark Zuckerburg" } };

	char[] answers = { 'A', 'B', 'C', 'C' };

	int TIMER = 10;

	private JFrame frame = new JFrame();

	private JLabel headerLabel = new JLabel();
	private JLabel questionLabel = new JLabel();

	private JButton buttonA = new JButton("A");
	private JButton buttonB = new JButton("B");
	private JButton buttonC = new JButton("C");
	private JButton buttonD = new JButton("D");

	private JLabel labelA = new JLabel();
	private JLabel labelB = new JLabel();
	private JLabel labelC = new JLabel();
	private JLabel labelD = new JLabel();

	private JLabel timerTxt = new JLabel("T I M E R");
	private JLabel timerCounter = new JLabel(String.valueOf(TIMER));

	private JTextField resultTField = new JTextField();
	private JTextField percentageTField = new JTextField();
	
	
	Timer timer = new Timer(1000 , new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			TIMER--;
			timerCounter.setText(String.valueOf(TIMER));
			
			if(TIMER <= 0){
				displayAnswer();
			}
			
		}
	});

	public Quiz() {

		/* elements */
		headerLabel.setText("Header Label");
		headerLabel.setBounds(0, 0, 480, 75);
		headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		headerLabel.setFont(new Font("Ink Free", Font.BOLD, 30));

		questionLabel.setText("Question Label");
		questionLabel.setBounds(20, 75, 460, 45);
		questionLabel.setFont(new Font("Ink Free", Font.BOLD, 24));

		buttonA.setBounds(20, 150, 100, 50);
		buttonB.setBounds(20, 210, 100, 50);
		buttonC.setBounds(20, 270, 100, 50);
		buttonD.setBounds(20, 330, 100, 50);

		buttonA.setFocusPainted(false);
		buttonB.setFocusPainted(false);
		buttonC.setFocusPainted(false);
		buttonD.setFocusPainted(false);

		buttonA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clickBtn(e);

			}
		});
		buttonB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clickBtn(e);

			}
		});
		buttonC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clickBtn(e);

			}
		});
		buttonD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clickBtn(e);

			}
		});

		labelA.setBounds(150, 150, 300, 50);
		labelB.setBounds(150, 210, 300, 50);
		labelC.setBounds(150, 270, 300, 50);
		labelD.setBounds(150, 330, 300, 50);

		labelA.setForeground(Color.GREEN);
		labelB.setForeground(Color.GREEN);
		labelC.setForeground(Color.GREEN);
		labelD.setForeground(Color.GREEN);

		labelA.setFont(new Font("Arial", Font.PLAIN, 18));
		labelB.setFont(new Font("Arial", Font.PLAIN, 18));
		labelC.setFont(new Font("Arial", Font.PLAIN, 18));
		labelD.setFont(new Font("Arial", Font.PLAIN, 18));

		timerTxt.setBounds(350, 370, 150, 30);
		timerTxt.setFont(new Font("MV Boli", Font.BOLD, 20));

		timerCounter.setFont(new Font("Ink Free", Font.BOLD, 20));
		timerCounter.setBounds(400, 400, 100, 50);

		resultTField.setText("ResultTField");
		resultTField.setBounds(130, 110, 200, 90);
		resultTField.setEditable(false);
		resultTField.setFont(new Font("Ink Free", Font.BOLD, 30));
		resultTField.setForeground(Color.GRAY);
		resultTField.setHorizontalAlignment(SwingConstants.CENTER);

		
		percentageTField.setHorizontalAlignment(SwingConstants.CENTER);
		percentageTField.setForeground(Color.GRAY);
		percentageTField.setFont(new Font("Ink Free", Font.BOLD, 30));
		percentageTField.setEditable(false);
		percentageTField.setBounds(130, 200, 200, 90);
		percentageTField.setText("Percentage");

		/* adding elements to frame */

		frame.add(headerLabel);
		frame.add(questionLabel);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(labelA);
		frame.add(labelB);
		frame.add(labelC);
		frame.add(labelD);
		frame.add(timerTxt);
		frame.add(timerCounter);

		displayNextQuestion();

		/* frame configuration */
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	private void displayNextQuestion() {
		
		

		if (index >= questions.length) {
			showResult();
		} else {
			headerLabel.setText(" Questions " + (index + 1));
			questionLabel.setText(questions[index]);
			labelA.setText(quizOptions[index][0]);
			labelB.setText(quizOptions[index][1]);
			labelC.setText(quizOptions[index][2]);
			labelD.setText(quizOptions[index][3]);
			timer.start();
		}

	}

	protected void clickBtn(ActionEvent e) {

		// System.out.println(e.getSource());

		buttonEnable(false);

		if (e.getSource() == buttonA) {
			userChoice = 'A';
			if (userChoice == answers[index])
				correct_answer++;
		}
		if (e.getSource() == buttonB) {
			userChoice = 'B';
			if (userChoice == answers[index])
				correct_answer++;
		}
		if (e.getSource() == buttonC) {
			userChoice = 'C';
			if (userChoice == answers[index])
				correct_answer++;
		}
		if (e.getSource() == buttonD) {
			userChoice = 'D';
			if (userChoice == answers[index])
				correct_answer++;
		}

		displayAnswer();

	}

	private void displayAnswer() {
		
		timer.stop();
		
		if (answers[index] != 'A')
			labelA.setForeground(Color.RED);
		if (answers[index] != 'B')
			labelB.setForeground(Color.RED);
		if (answers[index] != 'C')
			labelC.setForeground(Color.RED);
		if (answers[index] != 'D')
			labelD.setForeground(Color.RED);

		Timer pause = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				labelA.setForeground(Color.GREEN);
				labelB.setForeground(Color.GREEN);
				labelC.setForeground(Color.GREEN);
				labelD.setForeground(Color.GREEN);
				buttonEnable(true);
				
				TIMER = 10;
				timerCounter.setText(String.valueOf(TIMER));

				index++;
				displayNextQuestion();

			}
		});

		pause.start();
		pause.setRepeats(false);

	}

	private void showResult() {

		headerLabel.setText("RESULT !!!");
		headerLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
		questionLabel.setText("");

		labelA.setText("");
		labelB.setText("");
		labelC.setText("");
		labelD.setText("");

		frame.add(resultTField);
		frame.add(percentageTField);
		frame.remove(buttonA);
		frame.remove(buttonB);
		frame.remove(buttonC);
		frame.remove(buttonD);
		frame.repaint();
		frame.revalidate();

		int percentage;
		percentage = (int) (((double) correct_answer / questions.length) * 100);

		// 3/4 = 0.75 => 75.0 => 75
		resultTField.setText("(" + correct_answer + " / " + questions.length + ")");

		percentageTField.setText(String.valueOf(percentage) + "%");

	}

	/* util function */

	private void buttonEnable(boolean b) {
		buttonA.setEnabled(b);
		buttonB.setEnabled(b);
		buttonC.setEnabled(b);
		buttonD.setEnabled(b);
	}

}
