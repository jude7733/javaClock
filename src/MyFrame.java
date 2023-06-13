import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame{

    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;

    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;

    String currentTime, Day, Date;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(380,210);
        this.setResizable(true);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new java.awt.Font("Verdana", Font.BOLD, 50));
        timeLabel.setForeground(new java.awt.Color(144, 238, 144));
        timeLabel.setBackground(new java.awt.Color(2, 48, 32));
        timeLabel.setOpaque(true);
        this.add(timeLabel);

        dayLabel = new JLabel();
        dayLabel.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 40));
        dayLabel.setForeground(new java.awt.Color(144, 238, 144));
        dayLabel.setBackground(new java.awt.Color(2, 48, 32));
        dayLabel.setOpaque(true);
        this.add(dayLabel);

        dateLabel = new JLabel();
        dateLabel.setFont(new java.awt.Font("Helvetica", Font.ITALIC, 30));
        dateLabel.setForeground(new java.awt.Color(144, 238, 144));
        dateLabel.setBackground(new java.awt.Color(2, 48, 32));
        dateLabel.setOpaque(true);
        this.add(dateLabel);

        this.setVisible(true);
        setTime();
    }
    public void setTime(){
        while(true){

            currentTime = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(currentTime);
            Day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(Day);
            Date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(Date);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
