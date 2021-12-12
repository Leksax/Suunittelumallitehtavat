public class CPU {
    void freeze() {
        System.out.println("Freeze");
    }
    void jump(long position){
        System.out.println("Jump : " + position);
    }

    public void execute() {
        System.out.println("Execute");
    }

}
