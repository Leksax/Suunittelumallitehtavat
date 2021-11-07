public class Color {
    private static Color cObject;

    private Color(){
    }

    public static Color getInstance(){
        if(cObject == null){
            cObject = new Color();
        }
        return cObject;
    }

    public void getBlue(){
        System.out.println("Color is blue");
    }
    public void getGreen(){
        System.out.println("Color is green");
    }
    public void getRed(){
        System.out.println("Color is red");
    }
}
