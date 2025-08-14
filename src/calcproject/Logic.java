
package calcproject;


public class Logic {
    private UI_JFrame uif;
    
    public Logic(UI_JFrame uif){
        this.uif = uif;
        initListeners();
    }
    public void initListeners(){
        uif.getroundButton5().addActionListener(e -> AC());
    }
    public void AC(){
        uif.getjTextField2().setText("0");
    }
    
}
