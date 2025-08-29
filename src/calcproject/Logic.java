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
    
    private String handleMulP(String text) {
        if(text.endsWith(")")){
            return text + "*";
        }else{
            return text;
        }
    }
    
    private String lastNumber(String text) {
        int lastOpIndex = -1;
        for(int i = text.length() - 1; i >= 0; i--) {
            if("+-*/%".indexOf(text.charAt(i)) >= 0) {
                lastOpIndex = i;
                break;
            }
        }
        if(lastOpIndex >= 0){
            return text.substring(lastOpIndex + 1);
        }else{
            return text;
        }
    }
    
    private void appendNumber(String num) {
        String text = handleMulP(uif.getjTextField3().getText());
        if(isTypingNewNumber){
            if(!text.isEmpty() && "+-*/%".indexOf(text.charAt(text.length() - 1)) >= 0) {
                uif.getjTextField3().setText(text + num);
            }else{
                uif.getjTextField3().setText(num);
            }
            isTypingNewNumber = false;
            return;
        }

        if(text.equals("0")) {
            uif.getjTextField3().setText(num);
            isTypingNewNumber = false;
        }else{
            uif.getjTextField3().setText(text + num);
        }
    }
    
    private void appendDot() {
        String text = handleMulP(uif.getjTextField3().getText());
        String lastNumber = lastNumber(text);

        if(isTypingNewNumber) {
            if(!text.isEmpty() && "+-*/%".indexOf(text.charAt(text.length() - 1)) >= 0) {
                uif.getjTextField3().setText(text + "0.");
            }else {
                uif.getjTextField3().setText("0.");
            }
            isTypingNewNumber = false;
            return;
        }

        if(lastNumber.isEmpty()) {
            uif.getjTextField3().setText(text + "0.");
            isTypingNewNumber = false;
            return;
        }

        if(!lastNumber.contains(".")) {
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
        isTypingNewNumber = true;
    }

    private void AC() {
        uif.getjTextField3().setText("0");
        uif.getjTextField2().setText("");
        isTypingNewNumber = true;
    }

    private void sign() {
        String text = uif.getjTextField3().getText();
        if(text.equals("0")){
            return;
        }

        int depth = 0;
        int start = 0;
        for(int i = text.length() - 1; i >= 0; i--){
            char ch = text.charAt(i);
            if(ch == ')'){
                depth++;
            }else if(ch == '('){
                depth--;
            }else if(depth == 0 && "+-*/%".indexOf(ch) >= 0){
                start = i + 1;
                break;
            }
        }


        String prefix = text.substring(0, start);
        String lastNumber = text.substring(start);

        if(lastNumber.isEmpty()){
            return;
        }

        if(lastNumber.startsWith("(-") && lastNumber.endsWith(")")){
            String inner = lastNumber.substring(2, lastNumber.length() - 1);
            lastNumber = inner; 
        }else{
            lastNumber = "(-" + lastNumber + ")"; 
        }

        uif.getjTextField3().setText(prefix + lastNumber);
    }

    private void result() {
        String expr = uif.getjTextField3().getText();

        try{
            double total = 0;
            char lastAddSub = '+';
            double lastMulDiv = 0;
            char lastOp = ' ';
            StringBuilder number = new StringBuilder();

            int i = 0;
            while(i < expr.length()){
                char c = expr.charAt(i);

                if(Character.isDigit(c) || c == '.'){
                    number.append(c);
                    i++;
                    continue;
                }

                if(c == '%'){
                    if(number.length() > 0){
                        double num = Double.parseDouble(number.toString());
                        number.setLength(0);

                        int j = i + 1;
                        StringBuilder nextNum = new StringBuilder();
                        while(j < expr.length() && (Character.isDigit(expr.charAt(j)) || expr.charAt(j) == '.')){
                            nextNum.append(expr.charAt(j));
                            j++;
                        }

                        if(nextNum.length() > 0){
                            double y = Double.parseDouble(nextNum.toString());
                            num = (num / 100.0) * y;
                            i = j;
                        }else{
                            num = num / 100.0;
                            i++;
                        }

                        number.append(num);
                        continue;
                    }
                }

                if(c == '(' && i + 1 < expr.length() && expr.charAt(i + 1) == '-'){
                    int end = expr.indexOf(')', i);
                    if(end != -1){
                        number.append('-').append(expr, i + 2, end);
                        i = end + 1;
                        continue;
                    }
                }

                double num = Double.parseDouble(number.toString());
                number.setLength(0);

                switch (lastOp){
                    case '*':
                        num = lastMulDiv * num;
                        lastOp = ' ';
                        break;
                    case '/':
                        num = lastMulDiv / num;
                        lastOp = ' ';
                        break;
                }

                switch (c){
                    case '*':
                    case '/':
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

            if(number.length() > 0){
                double num = Double.parseDouble(number.toString());

                switch (lastOp){
                    case '*':
                        num = lastMulDiv * num;
                        break;
                    case '/':
                        num = lastMulDiv / num;
                        break;
                }

                switch (lastAddSub){
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

        }catch (Exception e){
            uif.getjTextField3().setText("Error!");
            isTypingNewNumber = true;
        }
    }

}
    
