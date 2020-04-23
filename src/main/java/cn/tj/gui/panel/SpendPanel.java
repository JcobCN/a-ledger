package cn.tj.gui.panel;

import javax.swing.*;

public class SpendPanel {
    private static SpendPanel instance = new SpendPanel();

    JLabel lMonthSpend = new JLabel("Month Spend");
    JLabel lTodaySpend = new JLabel("Day Spend");
    JLabel lAvgSpendPreDay = new JLabel("AvgSpenPreDay");
    JLabel lMonthLeft = new JLabel("MonthLeft");
    JLabel lDayAvgAvailable = new JLabel("DayAvgAvailable");
    JLabel lDayUntilEndOfMonth = new JLabel("DayAvgAvailable");

    JLabel vMonthSpend = new JLabel("1000");
    JLabel vTodaySpend = new JLabel("10");
    JLabel vAvgSpendPreDay = new JLabel("1");
    JLabel vMonthLeft = new JLabel("200");
    JLabel vDayAvgAvailable = new JLabel("3");
    JLabel vDayUntilEndOfMonth = new JLabel("21");



    public static SpendPanel getInstance() {
        return instance;
    }

    private SpendPanel(){

    }
}
