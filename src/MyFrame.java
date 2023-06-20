import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    SimpleDateFormat timelineFormat;

    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    JLabel timelineLabel;

    String currentTime, Day, Date, timeline;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setMinimumSize(new Dimension(530, 200));
        this.setResizable(true);
        this.setTitle("Clock");

        timeFormat = new SimpleDateFormat("     hh:mm:ss a    ");
        dayFormat = new SimpleDateFormat("   EEEE   ");
        dateFormat = new SimpleDateFormat("   MMMMM dd, yyyy   ");
        timelineFormat = new SimpleDateFormat("  zzzz  ");

        timeLabel = new JLabel();
        timeLabel.setFont(new java.awt.Font("Verdana", Font.BOLD, 50));
        timeLabel.setForeground(new java.awt.Color(144, 238, 144));
        timeLabel.setBackground(new java.awt.Color(2, 48, 32));
        timeLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        timeLabel.setVerticalAlignment(JLabel.CENTER);
        timeLabel.setOpaque(true);
        this.add(timeLabel);

        dayLabel = new JLabel();
        dayLabel.setFont(new java.awt.Font("SansSerif", Font.ITALIC, 40));
        dayLabel.setForeground(new java.awt.Color(144, 238, 144));
        dayLabel.setBackground(new java.awt.Color(2, 48, 32));
        dayLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dayLabel.setHorizontalAlignment(JLabel.CENTER);
        dayLabel.setVerticalAlignment(JLabel.CENTER);
        dayLabel.setOpaque(true);
        this.add(dayLabel);

        dateLabel = new JLabel();
        dateLabel.setFont(new java.awt.Font("Helvetica", Font.ITALIC, 40));
        dateLabel.setForeground(new java.awt.Color(144, 238, 144));
        dateLabel.setBackground(new java.awt.Color(2, 48, 32));
        dateLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dateLabel.setHorizontalAlignment(JLabel.CENTER);
        dateLabel.setVerticalAlignment(JLabel.CENTER);
        dateLabel.setOpaque(true);
        this.add(dateLabel);

        timelineLabel = new JLabel();
        timelineLabel.setFont(new java.awt.Font("Helvetica", Font.PLAIN, 20));
        timelineLabel.setForeground(new java.awt.Color(144, 238, 144));
        timelineLabel.setBackground(new java.awt.Color(2, 48, 32));
        timelineLabel.setHorizontalAlignment(JLabel.RIGHT);
        timelineLabel.setVerticalAlignment(JLabel.BOTTOM);
        timelineLabel.setOpaque(true);
        this.add(timelineLabel);

        this.setVisible(true);
        setTime();
    }

    public void setTime() {
        while (true) {

            currentTime = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(currentTime);
            Day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(Day);
            Date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(Date);
            timeline = timelineFormat.format(Calendar.getInstance().getTime());
            timelineLabel.setText(timeline);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
