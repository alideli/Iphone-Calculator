
package calcproject;


public class Logic {
    private UI_JFrame uif;
    private double result = 0;
    private String operator = "";
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
        uif.getroundButton17().addActionListener(e -> number_dot());
        
        uif.getroundButton5().addActionListener(e -> AC());
        
        uif.getroundButton10().addActionListener(e -> division());
        uif.getroundButton11().addActionListener(e -> multiply());
        uif.getroundButton12().addActionListener(e -> summation());
        uif.getroundButton9().addActionListener(e -> substract());
        uif.getroundButton15().addActionListener(e -> percent());
        uif.getroundButton20().addActionListener(e -> sign());
        uif.getroundButton13().addActionListener(e -> result());
    }
    
    private void appendNumber(String num){
        String currentText = uif.getjTextField2().getText();
        if(isNewOperation || currentText.equals("0")){
            uif.getjTextField2().setText(num);
            isNewOperation = false;
        }else{
            uif.getjTextField2().setText(currentText + num);
        }
    }
    
    private void number_0(){
        String currentText = uif.getjTextField2().getText();
        if(currentText.equals("0")){
            uif.getjTextField2().setText("0");
        }else{
            uif.getjTextField2().setText(uif.getjTextField2().getText() + "0");
        }
    }
    private void number_1(){
        String currentText = uif.getjTextField2().getText();
        if(currentText.equals("0")){
            uif.getjTextField2().setText("1");
        }else{
            uif.getjTextField2().setText(uif.getjTextField2().getText() + "1");
        }
    }
    private void number_2(){
        String currentText = uif.getjTextField2().getText();
        if(currentText.equals("0")){
            uif.getjTextField2().setText("2");
        }else{
            uif.getjTextField2().setText(uif.getjTextField2().getText() + "2");
        }
    }
    private void number_3(){
        String currentText = uif.getjTextField2().getText();
        if(currentText.equals("0")){
            uif.getjTextField2().setText("3");
        }else{
            uif.getjTextField2().setText(uif.getjTextField2().getText() + "3");
        }
    }
    private void number_4(){
        String currentText = uif.getjTextField2().getText();
        if(currentText.equals("0")){
            uif.getjTextField2().setText("4");
        }else{
            uif.getjTextField2().setText(uif.getjTextField2().getText() + "4");
        }
    }
    private void number_5(){
        String currentText = uif.getjTextField2().getText();
        if(currentText.equals("0")){
            uif.getjTextField2().setText("5");
        }else{
            uif.getjTextField2().setText(uif.getjTextField2().getText() + "5");
        }
    }
    private void number_6(){
        String currentText = uif.getjTextField2().getText();
        if(currentText.equals("0")){
            uif.getjTextField2().setText("6");
        }else{
            uif.getjTextField2().setText(uif.getjTextField2().getText() + "6");
        }
    }
    private void number_7(){
        String currentText = uif.getjTextField2().getText();
        if(currentText.equals("0")){
            uif.getjTextField2().setText("7");
        }else{
            uif.getjTextField2().setText(uif.getjTextField2().getText() + "7");
        }
    }
    private void number_8(){
        String currentText = uif.getjTextField2().getText();
        if(currentText.equals("0")){
            uif.getjTextField2().setText("8");
        }else{
            uif.getjTextField2().setText(uif.getjTextField2().getText() + "8");
        }
    }
    private void number_9(){
        String currentText = uif.getjTextField2().getText();
        if(currentText.equals("0")){
            uif.getjTextField2().setText("9");
        }else{
            uif.getjTextField2().setText(uif.getjTextField2().getText() + "9");
        }
    } 
    private void AC(){
        uif.getjTextField2().setText("0");
        uif.getjTextField3().setText("0");
        result = 0;
        operator = "";
        isNewOperation = true;
    }
    private void number_dot(){
        String currentText = uif.getjTextField2().getText();
        if(! currentText.contains(".")){
            uif.getjTextField2().setText(uif.getjTextField2().getText() + ".");
        }
    }
    private void sign(){
        String text = uif.getjTextField2().getText();
        if(!text.isEmpty() && !text.equals("0")){
            double val = Double.parseDouble(text);
            val = -val;
            uif.getjTextField2().setText(String.valueOf(val));
        }
    }
    private void setOperator(String op){
        double current = Double.parseDouble(uif.getjTextField2().getText());
        if(!operator.isEmpty()){
            calculateIntermediate(current);
            uif.getjTextField3().setText(String.valueOf(result));
        }else{
            result = current;
        }
        operator = op;
        uif.getjTextField2().setText("");
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
    private void calculateIntermediate(double num){
        switch (operator){
            case "+":
                result += num;
                break;
            case "-":
                result -= num;
                break;
            case "*":
                result *= num;
                break;
            case "/":
                if(num != 0){
                    result /= num;
                }
                else{
                    uif.getjTextField2().setText("Error!");
                    isNewOperation = true;
                    return;
                }
                break;
            case "%":
                result %= num;
                break;
        }
    }
    private void result(){
        double current = Double.parseDouble(uif.getjTextField2().getText());
        calculateIntermediate(current);
        uif.getjTextField3().setText(String.valueOf(result));
        isNewOperation = true;
        operator = "";
    }
    
}
