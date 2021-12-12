public class ComputerFacade {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    public void start(){
        cpu.freeze();
        memory.load(123, hardDrive.Read(321, 4096));
        cpu.jump(123);
        cpu.execute();
    }
    public static void main(String[] args){
            ComputerFacade computer = new ComputerFacade();
            computer.start();
    }
}
