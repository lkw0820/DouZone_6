package kosa.api;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class CalendarGUI extends JFrame {
    private JLabel monthLabel;
    private JButton prevButton;
    private JButton nextButton;
    private JPanel calendarPanel;

    private YearMonth currentYearMonth;
    private List<JButton> dateButtons;

    public CalendarGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calendar");
        setSize(500, 500);
        setLayout(new BorderLayout());

        // 상단 패널 생성
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        // 이전 달 버튼 생성
        prevButton = new JButton("Previous");
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentYearMonth = currentYearMonth.minusMonths(1);
                updateCalendar();
            }
        });
        topPanel.add(prevButton);

        // 월 표시 레이블 생성
        monthLabel = new JLabel();
        topPanel.add(monthLabel);

        // 다음 달 버튼 생성
        nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentYearMonth = currentYearMonth.plusMonths(1);
                updateCalendar();
            }
        });
        topPanel.add(nextButton);

        add(topPanel, BorderLayout.NORTH);

        // 캘린더 패널 생성
        calendarPanel = new JPanel();
        calendarPanel.setLayout(new GridLayout(7, 7));

        add(calendarPanel, BorderLayout.CENTER);

        // 현재 날짜 기준으로 캘린더 초기화
        currentYearMonth = YearMonth.now();
        dateButtons = new ArrayList<>();
        updateCalendar();
    }

    private void updateCalendar() {
        // 월 표시 업데이트
        monthLabel.setText(currentYearMonth.toString());

        // 캘린더 패널 초기화
        calendarPanel.removeAll();

        // 요일 표시
        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : daysOfWeek) {
            JLabel label = new JLabel(day, SwingConstants.CENTER);
            calendarPanel.add(label);
        }

        // 해당 월의 첫 날과 마지막 날 구하기
        LocalDate firstDayOfMonth = currentYearMonth.atDay(1);
        int startDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();
        int lastDayOfMonth = currentYearMonth.lengthOfMonth();

        // 첫 날 이전의 빈 칸 생성
        for (int i = 1; i < startDayOfWeek; i++) {
            calendarPanel.add(new JLabel(""));
        }

        // 날짜 버튼 생성
        dateButtons.clear();
        for (int i = 1; i <= lastDayOfMonth; i++) {
            JButton button = new JButton(Integer.toString(i));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String selectedDate = button.getText();
                    JOptionPane.showMessageDialog(CalendarGUI.this, "Selected Date: " + selectedDate);
                }
            });
            calendarPanel.add(button);
            dateButtons.add(button);
        }

        calendarPanel.revalidate();
        calendarPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalendarGUI().setVisible(true);
            }
        });
    }
}