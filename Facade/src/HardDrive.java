public class HardDrive {
    char Read(long lba, int size){
        System.out.println("hard drive size : " + size);
        System.out.println("boot sector : " + lba);
        return (char) lba;
    }
}
