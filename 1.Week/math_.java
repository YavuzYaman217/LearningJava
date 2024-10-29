import  javax.swing.JOptionPane;
 class math_ {

    public  void Calculation(){
        double x = 3.14;
        double y = -10;
        double z = Math.max(x,y);
        double t = Math.abs(y);
        System.out.println(z);
        System.out.println(t);
    }
    public void Hypotenuse(){
        double a = Math.abs(Double.parseDouble(JOptionPane.showInputDialog("Enter a side")));
        double b = Math.abs(Double.parseDouble(JOptionPane.showInputDialog("Enter a side")));
        double z = Math.sqrt(a*a + b*b);
        JOptionPane.showMessageDialog(null,"Hypotenuse is "+z);
    }
}
