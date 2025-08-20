package calcproject;


public class Logic {
    private UI_JFrame uif;
    private boolean isNewOperation = true;

    
    public Logic(UI_JFrame uif){
        this.uif = uif;
        initListeners();
    }
    private void initListeners(){
        uif.getroundButton22().addActionListener(e -> number_0());
        uif.getroundButton6().addActionListener(e -> number_1());
        uif.getroundButton21().addActionListener(e -> number_2());
        uif.getroundButton16().addActionListener(e -> number_3());
        uif.getroundButton4().addActionListener(e -> number_4());
        uif.getroundButton19().addActionListener(e -> number_5());
        uif.getroundButton14().addActionListener(e -> number_6());
        uif.getroundButton8().addActionListener(e -> number_7());
        uif.getroundButton23().addActionListener(e -> number_8());
        uif.getroundButton18().addActionListener(e -> number_9());
        uif.getroundButton17().addActionListener(e -> appendDot());
        
        uif.getroundButton5().addActionListener(e -> AC());
        
        uif.getroundButton10().addActionListener(e -> division());
        uif.getroundButton11().addActionListener(e -> multiply());
        uif.getroundButton12().addActionListener(e -> summation());
        uif.getroundButton9().addActionListener(e -> substract());
        uif.getroundButton15().addActionListener(e -> percent());
        uif.getroundButton20().addActionListener(e -> sign());
        uif.getroundButton13().addActionListener(e -> result());
    }
    

    private void number_0(){
        appendNumber("0");
    }
    private void number_1(){
        appendNumber("1");
    }
    private void number_2(){
        appendNumber("2");
    }
    private void number_3(){
        appendNumber("3");
    }
    private void number_4(){
        appendNumber("4");
    }
    private void number_5(){
        appendNumber("5");
    }
    private void number_6(){
        appendNumber("6");
    }
    private void number_7(){
        appendNumber("7");
    }
    private void number_8(){
        appendNumber("8");
    }
    private void number_9(){
        appendNumber("9");
    }
    private void division(){
        setOperator("/");
    }
    private void multiply(){
        setOperator("*");
    }
    private void summation(){
        setOperator("+");
    }
    private void substract(){
        setOperator("-");
    }
    private void percent(){
        setOperator("%");
    }
    

    private void appendNumber(String num) {
        String text = uif.getjTextField3().getText();
        if (isNewOperation || text.equals("0")) {
            uif.getjTextField3().setText(num);
            isNewOperation = false;
        } else {
            uif.getjTextField3().setText(text + num);
        }
    }

    private void appendDot() {
        String text = uif.getjTextField3().getText();
        if (!text.contains(".")) {
            uif.getjTextField3().setText(text + ".");
            isNewOperation = false;
        }
    }

    private void setOperator(String op) {
        String text = uif.getjTextField3().getText();
        if (!text.isEmpty() && !"+-*/%".contains("" + text.charAt(text.length() - 1))) {
            uif.getjTextField3().setText(text + op);
            isNewOperation = false;
        }
    }

    private void AC() {
        uif.getjTextField3().setText("0");
        uif.getjTextField2().setText("");
        isNewOperation = true;
    }

    private void sign() {
        String text = uif.getjTextField3().getText();
        if (!text.isEmpty() && !text.equals("0")) {
            double val = Double.parseDouble(text);
            val = -val;
            uif.getjTextField3().setText(String.valueOf(val));
        }
    }

    private void result() {
        String expr = uif.getjTextField3().getText();
        if (expr.isEmpty()) return;

        try {
            double total = 0;
            char lastAddSub = '+';
            String number = "";
            double lastMulDiv = 0;
            char lastOp = ' ';

            for (int i = 0; i < expr.length(); i++) {
                char c = expr.charAt(i);
                if ((c >= '0' && c <= '9') || c == '.') {
                    number += c;
                } else {
                    double num = Double.parseDouble(number);
                    number = "";

                    switch (lastOp) {
                        case '*': num = lastMulDiv * num; lastOp = ' '; break;
                        case '/': num = lastMulDiv / num; lastOp = ' '; break;
                        case '%': num = lastMulDiv * num / 100; lastOp = ' '; break;
                    }

                    if (c == '*' || c == '/' || c == '%') {
                        lastOp = c;
                        lastMulDiv = num;
                    } else {
                        switch (lastAddSub) {
                            case '+': total += num; break;
                            case '-': total -= num; break;
                        }
                        lastAddSub = c;
                    }
                }
            }

            if (!number.isEmpty()) {
                double num = Double.parseDouble(number);
                switch (lastOp) {
                    case '*': num = lastMulDiv * num; break;
                    case '/': num = lastMulDiv / num; break;
                    case '%': num = lastMulDiv * num / 100; break;
                }
                switch (lastAddSub) {
                    case '+': total += num; break;
                    case '-': total -= num; break;
                }
            }

            uif.getjTextField2().setText(expr);
            uif.getjTextField3().setText(String.valueOf(total));
            isNewOperation = true;
        } catch (Exception e) {
            uif.getjTextField3().setText("Error!");
            isNewOperation = true;
        }
    }
    
}
    
