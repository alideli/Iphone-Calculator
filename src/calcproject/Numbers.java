
package calcproject;


public class Numbers {
    private UI_JFrame uif;
    
    public Numbers(UI_JFrame uif){
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
    private void number_dot(){
        String currentText = uif.getjTextField2().getText();
        if(! currentText.contains(".")){
            uif.getjTextField2().setText(uif.getjTextField2().getText() + ".");
        }
    }
    
    
}
