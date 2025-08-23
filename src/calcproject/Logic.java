package calcproject;


public class Logic {
    private final UI_JFrame uif;
    private boolean isTypingNewNumber = true;

    
    public Logic(UI_JFrame uif){
        this.uif = uif;
        initListeners();
    }
    private void initListeners(){
        uif.getroundButton22().addActionListener(e -> appendNumber("0"));
        uif.getroundButton6().addActionListener(e -> appendNumber("1"));
        uif.getroundButton21().addActionListener(e -> appendNumber("2"));
        uif.getroundButton16().addActionListener(e -> appendNumber("3"));
        uif.getroundButton4().addActionListener(e -> appendNumber("4"));
        uif.getroundButton19().addActionListener(e -> appendNumber("5"));
        uif.getroundButton14().addActionListener(e -> appendNumber("6"));
        uif.getroundButton8().addActionListener(e -> appendNumber("7"));
        uif.getroundButton23().addActionListener(e -> appendNumber("8"));
        uif.getroundButton18().addActionListener(e -> appendNumber("9"));
        uif.getroundButton17().addActionListener(e -> appendDot());
        uif.getroundButton5().addActionListener(e -> AC());
        uif.getroundButton10().addActionListener(e -> setOperator("/"));
        uif.getroundButton11().addActionListener(e -> setOperator("*"));
        uif.getroundButton12().addActionListener(e -> setOperator("+"));
        uif.getroundButton9().addActionListener(e -> setOperator("-"));
        uif.getroundButton15().addActionListener(e -> setOperator("%"));
        uif.getroundButton20().addActionListener(e -> sign());
        uif.getroundButton13().addActionListener(e -> result());
    }
    
    private void appendNumber(String num) {
        String text = uif.getjTextField3().getText();
        if (isTypingNewNumber || text.equals("0")) {
            uif.getjTextField3().setText(num);
            isTypingNewNumber = false;
        }else {
            uif.getjTextField3().setText(text + num);
        }
    }

    private void appendDot() {
        String text = uif.getjTextField3().getText();
        if (!text.contains(".")) {
            uif.getjTextField3().setText(text + ".");
            isTypingNewNumber = false;
        }
    }

    private void setOperator(String op) {
        String text = uif.getjTextField3().getText();
        char lastChar = text.charAt(text.length() - 1);
        if("+-*/%".indexOf(lastChar) >= 0){
            text = text.substring(0, text.length() - 1) + op;
            uif.getjTextField3().setText(text);
        }else{
            uif.getjTextField3().setText(text + op);
        }
    }

    private void AC() {
        uif.getjTextField3().setText("0");
        uif.getjTextField2().setText("");
        isTypingNewNumber = true;
    }

//    private void sign() {
//        String text = uif.getjTextField3().getText();
//        if(text.equals("0")){
//            return;
//        }
//        int lastOpIndex = -1;
//        for(int i = text.length() - 1; i >= 0; i--) {
//            if("+-*/%".indexOf(text.charAt(i)) >= 0) {
//                lastOpIndex = i;
//                break;
//            }
//        }
//
//        String prefix;
//        String lastNumber;
//        if(lastOpIndex >= 0){
//            prefix = text.substring(0, lastOpIndex + 1);
//            lastNumber = text.substring(lastOpIndex + 1);
//        }else{
//            prefix = "";
//            lastNumber = text;
//        }
//
//        if(!lastNumber.isEmpty()){
//            if(lastNumber.startsWith("(-") && lastNumber.endsWith(")")) {
//                lastNumber = lastNumber.substring(2, lastNumber.length() - 1);
//            }else{
//                lastNumber = "(-" + lastNumber + ")";
//            }
//        }
//
//        uif.getjTextField3().setText(prefix + lastNumber);
//    }
    
    private void sign() {
        String text = uif.getjTextField3().getText();
        if (text.equals("0")) return;

        int lastOpIndex = -1;
        for (int i = text.length() - 1; i >= 0; i--) {
            if ("+-*/%".indexOf(text.charAt(i)) >= 0) {
                lastOpIndex = i;
                break;
            }
        }
        String prefix;
        String lastNumber;
        if(lastOpIndex >= 0){
            prefix = text.substring(0, lastOpIndex + 1);
        }else{
            prefix = "";
        }
        if(lastOpIndex >= 0){
            lastNumber = text.substring(lastOpIndex + 1);
        }else{
            lastNumber = text;
        }

        if (!lastNumber.isEmpty()) {
            double num;
            boolean wasP = false;

            if(lastNumber.startsWith("(-") && lastNumber.endsWith(")")) {
                lastNumber = lastNumber.substring(2, lastNumber.length() - 1);
                wasP= true;
            }

            try{
                num = Double.parseDouble(lastNumber);
            }catch (NumberFormatException e) {
                return;
            }
            
            num = -num;

            if(num < 0) {
                lastNumber = "(-" + (-num) + ")";
            }else{
                lastNumber = String.valueOf(num);
            }
        }

    uif.getjTextField3().setText(prefix + lastNumber);
}

   
    private void result() {
    String expr = uif.getjTextField3().getText();

    try {
        double total = 0;
        char lastAddSub = '+';
        double lastMulDiv = 0;
        char lastOp = ' ';
        StringBuilder number = new StringBuilder();

        int i = 0;
        if(expr.charAt(0) == '-') {
            number.append('-');
            i = 1;
        }

        while (i < expr.length()) {
            char c = expr.charAt(i);

            if(Character.isDigit(c) || c == '.'){
                number.append(c);
                i++;
                continue;
            }

            if(c == '(' && i + 1 < expr.length() && expr.charAt(i + 1) == '-') {
                int end = expr.indexOf(')', i);
                if (end != -1) {
                    number.append('-').append(expr, i + 2, end);
                    i = end + 1;
                    continue;
                }
            }

            if(c == '-' && i > 0 && "+-*/%".indexOf(expr.charAt(i - 1)) >= 0) {
                number.append('-');
                i++;
                continue;
            }

//            if (number.length() == 0) {
//                i++;
//                continue;
//            }

            double num = Double.parseDouble(number.toString());
            number.setLength(0);

            switch (lastOp) {
                case '*':
                    num = lastMulDiv * num;
                    lastOp = ' ';
                    break;
                case '/':
                    num = lastMulDiv / num;
                    lastOp = ' ';
                    break;
                case '%':
                    num = lastMulDiv * num / 100;
                    lastOp = ' ';
                    break;
            }

            switch (c) {
                case '*':
                case '/':
                case '%':
                    lastOp = c;
                    lastMulDiv = num;
                    break;
                case '+':
                case '-':
                    switch (lastAddSub) {
                        case '+':
                            total += num;
                            break;
                        case '-':
                            total -= num;
                            break;
                    }
                    lastAddSub = c;
                    break;
            }
            i++;
        }

        if (number.length() > 0) {
            String numStr = number.toString();
            double num = Double.parseDouble(numStr);

            switch (lastOp) {
                case '*':
                    num = lastMulDiv * num;
                    break;
                case '/':
                    num = lastMulDiv / num;
                    break;
                case '%':
                    num = lastMulDiv * num / 100;
                    break;
            }

            switch (lastAddSub) {
                case '+':
                    total += num;
                    break;
                case '-':
                    total -= num;
                    break;
            }
        }

        uif.getjTextField2().setText(expr);
        uif.getjTextField3().setText(String.valueOf(total));
        isTypingNewNumber = true;

    } catch (Exception e) {
        uif.getjTextField3().setText("Error!");
        isTypingNewNumber = true;
    }
}    
}
    
